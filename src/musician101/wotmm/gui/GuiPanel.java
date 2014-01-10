package musician101.wotmm.gui;

import java.awt.Dimension;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GuiPanel extends JPanel
{
	public GuiPanel(int w, int h)
	{
		this.setPreferredSize(new Dimension(w, h));
	}
}
