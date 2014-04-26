package musician101.wotmm;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;

import org.json.simple.parser.ParseException;

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
	public CustomTableModel tankModel;
	public ComboBox country = new ComboBox(Constants.Countries, 10, 10, 100, 20);
	public ComboBox type = new ComboBox(Constants.ALL_TYPES, 115, 10, 100, 20);
	public ComboBox tier = new ComboBox(Constants.ALL_TIERS, 220, 10, 45, 20);
	public ComboBox battleTier = new ComboBox(Constants.ALL_BATTLE_TIERS, 270, 10, 45, 20);
	public ComboBox premium = new ComboBox(Constants.PREMIUM, 320, 10, 110, 20);
	public Table tank;
	public TextField search = new TextField(435, 10, 100, 20);
	public ScrollPane tankScroll;
	private Panel panel = new Panel(545, 500);
	public static JFrame mainFrame;
	public TableColumnAdjuster adjuster;
	public Tanks tanks;
	
	public WoTMM()
	{
		try
		{
			tanks = new Tanks();
		}
		catch (IOException | ParseException e)
		{
			JOptionPane.showMessageDialog(null, "Error connecting/retrieving information from World of Tanks.", "Connection Error!", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		tankModel = new CustomTableModel(Constants.COLUMNS, MMUtil.getTanks(this, "All", "All", "All", "All", "", "All"));
		tank = new Table(tankModel);
		adjuster = new TableColumnAdjuster(tank);
		tankScroll = new ScrollPane(tank, 37, 35, 470, 455);
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
