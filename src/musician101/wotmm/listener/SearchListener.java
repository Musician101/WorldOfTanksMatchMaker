package musician101.wotmm.listener;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import musician101.wotmm.WoTMM;
import musician101.wotmm.util.MMUtil;

public class SearchListener implements DocumentListener
{
	WoTMM wotmm;
	
	public SearchListener(WoTMM wotmm)
	{
		this.wotmm = wotmm;
	}

	@Override
	public void changedUpdate(DocumentEvent e)
	{
		wotmm.tankModel.replace(MMUtil.getTanks(wotmm.country.getSelectedItem().toString(), wotmm.type.getSelectedItem().toString(), wotmm.tier.getSelectedItem().toString(), wotmm.battleTier.getSelectedItem().toString(), wotmm.search.getText(), wotmm.premium.getSelectedItem().toString()));
		wotmm.adjuster.adjustColumns();
	}

	@Override
	public void insertUpdate(DocumentEvent e)
	{
		wotmm.tankModel.replace(MMUtil.getTanks(wotmm.country.getSelectedItem().toString(), wotmm.type.getSelectedItem().toString(), wotmm.tier.getSelectedItem().toString(), wotmm.battleTier.getSelectedItem().toString(), wotmm.search.getText(), wotmm.premium.getSelectedItem().toString()));
		wotmm.adjuster.adjustColumns();
	}

	@Override
	public void removeUpdate(DocumentEvent e)
	{
		wotmm.tankModel.replace(MMUtil.getTanks(wotmm.country.getSelectedItem().toString(), wotmm.type.getSelectedItem().toString(), wotmm.tier.getSelectedItem().toString(), wotmm.battleTier.getSelectedItem().toString(), wotmm.search.getText(), wotmm.premium.getSelectedItem().toString()));
		wotmm.adjuster.adjustColumns();
	}
}
