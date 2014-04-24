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
			if (tank.getCountry().equals(country) || country.equals("All"))
			{
				if (tank.getType().equals(type) || type.equals("All"))
				{
					if (tank.getTier().toString().equals(tier) || tier.equals("All"))
					{
						if (tank.getName().toLowerCase().contains(name) || tank.getName().toUpperCase().contains(name) || name == "")
						{
							if (tank.isPremium().equals(premium) || premium.equals("All"))
							{
								int lower = 0;
								int higher = 0;
								int precise = 0;
								
								if (tank.getBattleTier().contains("-"))
								{
									lower = Integer.parseInt(tank.getBattleTier().split("-")[0]);
									higher = Integer.parseInt(tank.getBattleTier().split("-")[1]);
								}
								
								if (battleTier != "All")
									precise = Integer.parseInt(battleTier);
								
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
