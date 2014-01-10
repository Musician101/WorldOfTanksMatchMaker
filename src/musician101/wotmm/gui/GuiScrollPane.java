package musician101.wotmm.gui;

import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class GuiScrollPane extends JScrollPane
{
	public GuiScrollPane(GuiTable table, int x, int y)
	{
		super(table);
		this.setBounds(x, y, 470, 490 - y);
	}
}
