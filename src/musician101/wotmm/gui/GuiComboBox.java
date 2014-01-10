package musician101.wotmm.gui;

import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class GuiComboBox extends JComboBox<String>
{
	public GuiComboBox(String[] items, int x, int y, int w, int h)
	{
		super(items);
		this.setBounds(x, y, w, h);
	}
	
	public void addAll(String[] items)
	{
		for (String item : items)
			this.addItem(item);
	}
}
