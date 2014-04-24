package musician101.wotmm.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import musician101.wotmm.WoTMM;
import musician101.wotmm.lib.Constants;

public class CountryListener implements ActionListener
{
	WoTMM wotmm;
	
	public CountryListener(WoTMM wotmm)
	{
		this.wotmm = wotmm;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		wotmm.type.removeAllItems();
		switch(wotmm.country.getSelectedItem().toString())
		{
			case "China":
				wotmm.type.addAll(Constants.CHINA_TYPES);
				break;
			case "Japan":
				wotmm.type.addAll(Constants.JAPAN_TYPES);
				break;
			default:
				wotmm.type.addAll(Constants.ALL_TYPES);
				break;
		}
	}
}
