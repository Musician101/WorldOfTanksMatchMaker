package musician101.wotmm.gui;

import javax.swing.JTable;

import musician101.wotmm.util.CustomTableModel;

@SuppressWarnings("serial")
public class GuiTable extends JTable
{
	public GuiTable(CustomTableModel model)
	{
		super(model);
		this.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	}
}
