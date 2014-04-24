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
		MMUtil.refreshTable(wotmm);
	}

	@Override
	public void insertUpdate(DocumentEvent e)
	{
		MMUtil.refreshTable(wotmm);
	}

	@Override
	public void removeUpdate(DocumentEvent e)
	{
		MMUtil.refreshTable(wotmm);
	}
}
