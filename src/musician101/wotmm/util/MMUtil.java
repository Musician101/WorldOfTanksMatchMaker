package musician101.wotmm.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;

import musician101.wotmm.Tanks.Tank;
import musician101.wotmm.WoTMM;

public class MMUtil
{
	public static List<List<Object>> getTanks(WoTMM wotmm, String country, String type, String tier, String battleTier, String name, String premium)
	{
		List<List<Object>> list = new ArrayList<List<Object>>();
		for (Entry<String, Tank> tank : wotmm.tanks.getTanks().entrySet())
		{
			Tank t = tank.getValue();
			if (tank.getKey().contains(name.toLowerCase()) || tank.getKey().contains(name.toUpperCase()) || name.equals(""))
			{
				if (t.getCountry().equals(country) || country.equals("All"))
				{
					if (t.getType().equals(type) || type.equals("All"))
					{
						if (tier.equals("All") || t.getTier() == Integer.valueOf(tier))
						{
							if (premium.equals("All") || t.isPremium() == (premium == "Premium" ? true : false))
							{
								int lower = Integer.valueOf(t.getBattleTier().split("-")[0]);
								int higher = 0;
								int precise = 0;
								
								if (!battleTier.equals("All"))
									precise = Integer.valueOf(battleTier);
								
								if (t.getBattleTier().contains("-"))
									higher = Integer.valueOf(t.getBattleTier().split("-")[1]);
								
								if (battleTier == "All" || lower == precise || higher == precise || (lower < precise && higher > precise))
									list.add(new ArrayList<Object>(Arrays.asList(t.getCountry(), t.getType(), t.getTier(), tank.getKey(), t.getBattleTier())));
							}
						}
					}
				}
			}
		}
		
		return list;
	}
	
	public static void refreshTable(WoTMM wotmm)
	{
		wotmm.tankModel.replace(getTanks(wotmm, wotmm.country.getSelectedItem().toString(), wotmm.type.getSelectedItem().toString(), wotmm.tier.getSelectedItem().toString(), wotmm.battleTier.getSelectedItem().toString(), wotmm.search.getText(), wotmm.premium.getSelectedItem().toString()));
		wotmm.adjuster.adjustColumns();
	}
}
