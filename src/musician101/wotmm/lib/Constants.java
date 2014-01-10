package musician101.wotmm.lib;

import java.util.Arrays;
import java.util.List;

public class Constants
{
	public static final String CHINA = "China";
	public static final String FRANCE = "France";
	public static final String GERMANY = "Germany";
	public static final String JAPAN = "Japan";
	public static final String UK = "U.K.";
	public static final String USA = "U.S.A.";
	public static final String USSR = "U.S.S.R.";
	
	public static final String LIGHT = "Light";
	public static final String MEDIUM = "Medium";
	public static final String HEAVY = "Heavy";
	public static final String TD = "TD";
	public static final String SPG = "SPG";
	
	/**
	 *  ComboBox Variables
	 *  List of Countries
	 */
	public static final String[] Countries = {"All", CHINA, FRANCE, GERMANY, JAPAN, UK, USA, USSR};
	
	/** 
	 * List of Tank Types
	 * Some Countries don't have full tech trees and need their own separate lists. 
	 */
	public static final String[] ALL_TYPES = {"All", LIGHT, MEDIUM, HEAVY, TD, SPG};
	public static final String[] CHINA_TYPES = {"All", LIGHT, MEDIUM, HEAVY};
	public static final String[] JAPAN_TYPES = {"All", LIGHT, MEDIUM};
	
	/**
	 * List of Tiers
	 */
	public static final String[] ALL_TIERS = {"All", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	
	/**
	 * List of Battle Tiers
	 */
	public static final String[] ALL_BATTLE_TIERS = {"All", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
	
	/**
	 * List of Premium options.
	 */
	public static final String[] PREMIUM = {"All", "Non-Premium", "Premium"};
	
	/**
	 * Column Headings
	 */
	public static final List<String> COLUMNS = Arrays.asList("Country", "Type", "Tier", "Name", "BattleTier");
}
