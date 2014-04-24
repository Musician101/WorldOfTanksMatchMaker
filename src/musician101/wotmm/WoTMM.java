package musician101.wotmm;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableCellRenderer;

import musician101.luc.gui.Gui;
import musician101.luc.gui.Gui.ComboBox;
import musician101.luc.gui.Gui.Panel;
import musician101.luc.gui.Gui.ScrollPane;
import musician101.luc.gui.Gui.Table;
import musician101.luc.gui.Gui.TextField;
import musician101.wotmm.lib.Constants;
import musician101.wotmm.listener.CountryListener;
import musician101.wotmm.listener.MultiListener;
import musician101.wotmm.listener.SearchListener;
import musician101.wotmm.util.CustomTableModel;
import musician101.wotmm.util.MMUtil;
import musician101.wotmm.util.TableColumnAdjuster;

@SuppressWarnings("serial")
public class WoTMM extends JFrame
{
	DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
	public CustomTableModel tankModel = new CustomTableModel(Constants.COLUMNS, MMUtil.getTanks("All", "All", "All", "All", "", "All"));
	public ComboBox country = new Gui.ComboBox(Constants.Countries, 10, 10, 100, 20);
	public ComboBox type = new ComboBox(Constants.ALL_TYPES, 115, 10, 100, 20);
	public ComboBox tier = new ComboBox(Constants.ALL_TIERS, 220, 10, 45, 20);
	public ComboBox battleTier = new ComboBox(Constants.ALL_BATTLE_TIERS, 270, 10, 45, 20);
	public ComboBox premium = new ComboBox(Constants.PREMIUM, 320, 10, 110, 20);
	public Table tank = new Table(tankModel);
	public TextField search = new TextField(435, 10, 100, 20);
	public ScrollPane tankScroll = new ScrollPane(tank, 37, 35, 470, 455);
	private Panel panel = new Panel(545, 500);
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
		country.addActionListener(new CountryListener(this));
		type.addActionListener(new MultiListener(this));
		tier.addActionListener(new MultiListener(this));
		battleTier.addActionListener(new MultiListener(this));
		premium.addActionListener(new MultiListener(this));
		search.getDocument().addDocumentListener(new SearchListener(this));
		
		// Add visual elements
		getContentPane().add(country);
		getContentPane().add(type);
		getContentPane().add(tier);
		getContentPane().add(battleTier);
		getContentPane().add(premium);
		getContentPane().add(search);
		getContentPane().add(tankScroll);
		getContentPane().add(panel);
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
