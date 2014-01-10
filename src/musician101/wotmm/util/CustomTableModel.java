package musician101.wotmm.util;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class CustomTableModel extends AbstractTableModel
{
	private List<String> columnNames;
	private List<List<Object>> data = new ArrayList<List<Object>>();
	
	public CustomTableModel(List<String> columnNames, List<List<Object>> data)
	{
		this.columnNames = columnNames;
		this.data.addAll(data);
	}
	
	public void addRow(List<Object> row)
	{
		data.add(row);
		fireTableRowsInserted(data.size() - 1, data.size() - 1);
	}
	
	public void addAll(List<List<Object>> rows)
	{
		for (List<Object> row : rows)
			addRow(row);
	}
	
	public void removeRow(int row)
	{
		data.remove(row);
		fireTableRowsDeleted(data.size() - 1, data.size() - 1);
	}
	
	public void replace(List<List<Object>> rows)
	{
		data = rows;
		fireTableDataChanged();
	}
	
	public List<String> getColumnNames()
	{
		return columnNames;
	}
	
	@Override
	public int getColumnCount()
	{
		return columnNames.size();
	}
	
	@Override
	public int getRowCount()
	{
		return data.size();
	}
	
	@Override
	public String getColumnName(int col)
	{
		try
		{
			return columnNames.get(col);
		}
		catch (Exception e)
		{
			return null;
		}
	}
	
	@Override
	public Object getValueAt(int row, int col)
	{
		return data.get(row).get(col);
	}
	
	@Override
	public boolean isCellEditable(int row, int col)
	{
		return false;
	}
	
	@Override
	public Class<?> getColumnClass(int col)
	{
		return getValueAt(0, col).getClass();
	}
}
