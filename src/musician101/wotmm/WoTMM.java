package musician101.wotmm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;

import musician101.wotmm.gui.GuiComboBox;
import musician101.wotmm.gui.GuiPanel;
import musician101.wotmm.gui.GuiScrollPane;
import musician101.wotmm.gui.GuiTable;
import musician101.wotmm.gui.GuiTextField;
import musician101.wotmm.lib.Constants;
import musician101.wotmm.util.CustomTableModel;
import musician101.wotmm.util.MMUtil;
import musician101.wotmm.util.TableColumnAdjuster;

@SuppressWarnings("serial")
public class WoTMM extends JFrame
{
	DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
	public CustomTableModel tankModel = new CustomTableModel(Constants.COLUMNS, MMUtil.getTanks("All", "All", "All", "All", "", "All"));
	public GuiComboBox country = new GuiComboBox(Constants.Countries, 10, 10, 100, 20);
	public GuiComboBox type = new GuiComboBox(Constants.ALL_TYPES, 115, 10, 100, 20);
	public GuiComboBox tier = new GuiComboBox(Constants.ALL_TIERS, 220, 10, 45, 20);
	public GuiComboBox battleTier = new GuiComboBox(Constants.ALL_BATTLE_TIERS, 270, 10, 45, 20);
	public GuiComboBox premium = new GuiComboBox(Constants.PREMIUM, 320, 10, 110, 20);
	public GuiTable tank = new GuiTable(tankModel);
	public GuiTextField search = new GuiTextField(435, 10, 100, 20);
	public GuiScrollPane tankScroll = new GuiScrollPane(tank, 37, 35);
	private GuiPanel panel = new GuiPanel(545, 500);
	public static JFrame mainFrame;
	public TableColumnAdjuster adjuster = new TableColumnAdjuster(tank);
	
	public WoTMM()
	{
		// Formatting
		renderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
		for (String col : tankModel.getColumnNames())
			tank.getColumn(col).setCellRenderer(renderer);
		
		adjuster.adjustColumns();
		
		// Listeners
		country.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				type.removeAllItems();
				switch(country.getSelectedItem().toString())
				{
					case "China":
						type.addAll(Constants.CHINA_TYPES);
						break;
					case "Japan":
						type.addAll(Constants.JAPAN_TYPES);
						break;
					default:
						type.addAll(Constants.ALL_TYPES);
						break;
				}
			}
		});
		
		type.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (type.getSelectedItem() != null)
				{
					tankModel.replace(MMUtil.getTanks(country.getSelectedItem().toString(), type.getSelectedItem().toString(), tier.getSelectedItem().toString(), battleTier.getSelectedItem().toString(), search.getText(), premium.getSelectedItem().toString()));
					adjuster.adjustColumns();
				}
			}
		});
		
		tier.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				tankModel.replace(MMUtil.getTanks(country.getSelectedItem().toString(), type.getSelectedItem().toString(), tier.getSelectedItem().toString(), battleTier.getSelectedItem().toString(), search.getText(), premium.getSelectedItem().toString()));
				adjuster.adjustColumns();
			}
		});
		
		battleTier.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				tankModel.replace(MMUtil.getTanks(country.getSelectedItem().toString(), type.getSelectedItem().toString(), tier.getSelectedItem().toString(), battleTier.getSelectedItem().toString(), search.getText(), premium.getSelectedItem().toString()));
				adjuster.adjustColumns();
			}
		});
		
		premium.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				tankModel.replace(MMUtil.getTanks(country.getSelectedItem().toString(), type.getSelectedItem().toString(), tier.getSelectedItem().toString(), battleTier.getSelectedItem().toString(), search.getText(), premium.getSelectedItem().toString()));
				adjuster.adjustColumns();
			}
		});
		
		search.getDocument().addDocumentListener(new DocumentListener()
		{

			@Override
			public void changedUpdate(DocumentEvent e)
			{
				tankModel.replace(MMUtil.getTanks(country.getSelectedItem().toString(), type.getSelectedItem().toString(), tier.getSelectedItem().toString(), battleTier.getSelectedItem().toString(), search.getText(), premium.getSelectedItem().toString()));
				adjuster.adjustColumns();
			}

			@Override
			public void insertUpdate(DocumentEvent e)
			{
				tankModel.replace(MMUtil.getTanks(country.getSelectedItem().toString(), type.getSelectedItem().toString(), tier.getSelectedItem().toString(), battleTier.getSelectedItem().toString(), search.getText(), premium.getSelectedItem().toString()));
				adjuster.adjustColumns();
			}

			@Override
			public void removeUpdate(DocumentEvent e)
			{
				tankModel.replace(MMUtil.getTanks(country.getSelectedItem().toString(), type.getSelectedItem().toString(), tier.getSelectedItem().toString(), battleTier.getSelectedItem().toString(), search.getText(), premium.getSelectedItem().toString()));
				adjuster.adjustColumns();
			}
			
		});
		
		// Add visual elements
		this.getContentPane().add(country);
		this.getContentPane().add(type);
		this.getContentPane().add(tier);
		this.getContentPane().add(battleTier);
		this.getContentPane().add(premium);
		this.getContentPane().add(search);
		this.getContentPane().add(tankScroll);
		this.getContentPane().add(panel);
	}
	
	public static void main(String[] args)
	{
		mainFrame = new WoTMM();
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainFrame.pack();
		mainFrame.setTitle("World of Tanks - Match Maker");
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
}
