package musician101.wotmm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import musician101.wotmm.lib.Constants;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Tanks
{
	int count;
	String status;
	Map<String, Tank> tanks = new HashMap<String, Tank>();
	
	private static final String API_HOST = "https://api.worldoftanks.com";
	private static final String API_KEY = "demo";//TODO replace with unique api key
	private static final String API_QUERY = "/wot/encyclopedia/tanks/?application_id=";
	
	public Tanks() throws IOException, ParseException
	{
		URL url = new URL(API_HOST + API_QUERY + API_KEY);
		URLConnection c = url.openConnection();
		final BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
		String r = br.readLine();
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(r);
		JSONObject info = (JSONObject) obj;
		status = info.get("status").toString();
		count = Integer.valueOf(info.get("count").toString());
		JSONObject ts = (JSONObject) info.get("data");
		for (Object o : ts.keySet())
		{
			JSONObject t = (JSONObject) ts.get(o.toString());
			String name = t.get("name_i18n").toString();
			String country = t.get("nation_i18n").toString();
			boolean premium = (Boolean) t.get("is_premium");
			int tier = Integer.valueOf(t.get("level").toString());
			String type = t.get("type").toString();
			tanks.put(t.get("name_i18n").toString(), new Tank(country, name, premium, tier, type));
		}
	}
	
	public int getCount()
	{
		return count;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public Map<String, Tank> getTanks()
	{
		return tanks;
	}
	
	public Tank getTank(String name)
	{
		return tanks.get(name);
	}
	
	public static class Tank
	{
		String battleTier;
		String country;
		boolean premium;
		int tier;
		String type;
		
		private Tank(String country, String name, boolean premium, int tier, String type)
		{
			this.country = country;
			this.premium = premium;
			this.tier = tier;
			this.type = setType(type);
			this.battleTier = setBattleTier(name, tier, this.type);
		}
		
		public String getBattleTier()
		{
			return battleTier;
		}
		
		public String getCountry()
		{
			return country;
		}
		
		public int getTier()
		{
			return tier;
		}
		
		public String getType()
		{
			return type;
		}
		
		public boolean isPremium()
		{
			return premium;
		}
		
		private String setBattleTier(String name, int tier, String type)
		{
			List<String> special = Arrays.asList("T2 Light Tank", "T7 Combat Car", "Light Mk. VIC", "Pz.Kpfw. I", "M3 Light", "LTP", "BT-SV", "Pz.Kpfw. II Ausf. J", "T-127", "Type 98 Ke-Ni Otsu", "Valentine II", "Pz.Kpfw. B2 740 (f)", "A-32", "AMX 40", "Valentine", "Covenanter", "T-80", "Type 5 Ke-Ho", "Pz.Kpfw. IV hydrostat.", "Churchill III", "SU-85I", "Matilda IV", "T14", "KV-220", "M4A2E4", "Excelsior", "Matilda Black Prince", "Crusader", "M24 Chaffee", "Pz.Kpfw. V/IV", "TOG II*", "Panther/M10", "E 25", "KV-5", "FCM 50 t", "T26E4 SuperPershing", "112", "T-34-3", "Type 59", "8,8 cm Pak 43 Jagdtiger");
			if (!special.contains(name))
			{
				if ((type.equals(Constants.LIGHT) || type.equals(Constants.MEDIUM)) && tier == 1)
					return "1-2";
				else if ((type.equals(Constants.LIGHT) || type.equals(Constants.MEDIUM) || type.equals(Constants.TD) || type.equals(Constants.SPG)) && (tier == 2 || tier == 3))
				{
					if (tier == 2)
						return "2-3";
					else if (tier == 3)
						return "3-5";
				}
				else if (type == Constants.LIGHT && (tier >= 4 && tier <= 8))
				{
					if (tier == 4)
						return "4-8";
					else if (tier == 5)
						return "6-9";
					else if (tier == 6)
						return "7-10";
					else if (tier == 7)
						return "8-11";
					else if (tier == 8)
						return "9-12";
				}
				else if ((type.equals(Constants.MEDIUM) || type.equals(Constants.TD) || type.equals(Constants.SPG)) && tier == 4)
					return "4-6";
				else if (type.equals(Constants.HEAVY) && tier == 4)
					return "4-5";
				else if ((type.equals(Constants.MEDIUM) || type.equals(Constants.HEAVY) || type.equals(Constants.TD) || type.equals(Constants.SPG) && (tier >= 5 && tier <= 10)))
				{
					if (tier == 5)
						return "5-7";
					else if (tier == 6)
						return "6-8";
					else if (tier == 7)
						return "7-9";
					else if (tier == 8)
						return "8-10";
					else if (tier == 9)
						return "9-11";
					else if (tier == 10)
						return "10-11";
				}
			}
			
			if (name.equals("T2 Light Tank"))
				return "2-4";
			else if (name.equals("T7 Combat Car") || name.equals("Light Mk. VIC") || name.equals("Pz.Kpfw. I"))
				return "2";
			else if (name.equals("M3 Light") || name.equals("LTP") || name.equals("BT-SV") || name.equals("Pz.Kpfw. II Ausf. J") || name.equals("T-127") || name.equals("Type 98 Ke-Ni Otsu"))
				return "3-4";
			else if (name.equals("Valentine II") || name.equals("Pz.Kfpw. B2 740 (f)"))
				return "4";
			else if (name.equals("A-32"))
				return "4-5";
			else if (name.equals("AMX 40") || name.equals("Valentine") || name.equals("Covenanter") || name.equals("T-80") || name.equals("Type 5 Ke-Ho"))
				return "4-6";
			else if (name.equals("Pz.Kpfw. IV hyrdrostat.") || name.equals("Churchill III") || name.equals("SU-85I") || name.equals("Matilda IV") || name.equals("T14") || name.equals("KV-220") || name.equals("M4A2E4") || name.equals("Excelsior") || name.equals("Matilda Black Prince"))
				return "5-6";
			else if (name.equals("Crusader"))
				return "5-7";
			else if (name.equals("M24 Chaffee"))
				return "8-11";
			else if (name.equals("Pz.Kpfw. V/IV") || name.equals("TOG II*"))
				return "6-7";
			else if (name.equals("Panther/M10"))
				return "7-8";
			else
				return "8-9";
		}
		
		private String setType(String type)
		{
			if (type.contains("Tank"))
				return type.substring(0, 1).toUpperCase() + type.substring(1).replace("Tank", "");
			
			if (type.contains("-"))
				return "TD";
			
			return type;
		}
	}
}
