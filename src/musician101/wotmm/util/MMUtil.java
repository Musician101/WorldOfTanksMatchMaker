package musician101.wotmm.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import musician101.wotmm.lib.Tank;

public class MMUtil
{
	public static List<List<Object>> getTanks(String country, String type, String tier, String battleTier, String name, String premium)
	{
		List<List<Object>> list = new ArrayList<List<Object>>();
		for (Tank tank : Tank.values())
		{
			if (tank.getCountry() == country || country == "All")
			{
				if (tank.getType() == type || type == "All")
				{
					if (tank.getTier().toString() == tier || tier == "All")
					{
						if (tank.getName().toLowerCase().contains(name) || tank.getName().toUpperCase().contains(name) || name == "")
						{
							if (tank.isPremium() == premium || premium == "All")
							{
								int lower = Integer.parseInt(tank.getBattleTier().split("-")[0]);;
								int higher = 0;
								int precise = 0;
								
								if (tank.getBattleTier().contains("-"))
									higher = Integer.parseInt(tank.getBattleTier().split("-")[1]);
								
								if (battleTier != "All")
									precise = Integer.parseInt(battleTier);
								
								//TODO finish implementing battletier search
								if (battleTier == "All" || lower == precise || higher == precise || (lower < precise && higher > precise))
									list.add(new ArrayList<Object>(Arrays.asList(tank.getCountry(), tank.getType(), tank.getTier(), tank.getName(), tank.getBattleTier())));
							}
						}
					}
				}
			}
		}
		return list;
	}
}
