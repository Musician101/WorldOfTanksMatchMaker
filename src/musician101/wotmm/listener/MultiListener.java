package musician101.wotmm.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import musician101.wotmm.WoTMM;
import musician101.wotmm.util.MMUtil;

public class MultiListener implements ActionListener
{
	WoTMM wotmm;
	
	public MultiListener(WoTMM wotmm)
	{
		this.wotmm = wotmm;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (wotmm.type.getSelectedItem() != null)
		{
			wotmm.tankModel.replace(MMUtil.getTanks(wotmm.country.getSelectedItem().toString(), wotmm.type.getSelectedItem().toString(), wotmm.tier.getSelectedItem().toString(), wotmm.battleTier.getSelectedItem().toString(), wotmm.search.getText(), wotmm.premium.getSelectedItem().toString()));
			wotmm.adjuster.adjustColumns();
		}
	}
}
