package learning.model;

import learning.entity.Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class ShopModel {
	
		public List<Menu> listMenu(DataSource dataSource) {
		// Step 1: Initialize connection object
				//***************************************************************************************
				Connection connect = null;
				Statement stmt = null;
				ResultSet rs = null;
				List<Menu> menu = new ArrayList<>();
				
				// Add connection to the database
				try {
					connect = dataSource.getConnection();
					
					// Step 2: Create SQL statements string
					//***************************************************************************************
					String query = "Select * from menu";
					stmt = connect.createStatement();
					
					// Step 3: Execute SQL query
					//***************************************************************************************
					rs = stmt.executeQuery(query);
					System.out.println(rs);
					
					// Step 4: Process the result set
					//***************************************************************************************
					while(rs.next()) {
						menu.add(new Menu(rs.getInt("item_id"), rs.getString("item_name"), rs.getString("category_name"), rs.getDouble("price")));
					}
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return menu;
	}
		
	public boolean addMenu(DataSource dataSource, Menu menuObj) {
		Connection connect = null;
		PreparedStatement stmt = null;
		
		try {
			connect = dataSource.getConnection();
			
			// Step 2: Create SQL statements string
			//***************************************************************************************
			String item = menuObj.getItem_name();
			String category = menuObj.getCategory_name();
			double price = menuObj.getPrice();
			
			String query = "insert into menu (item_name, category_name, price) values(?,?,?)";
			stmt = connect.prepareStatement(query);
			stmt.setString(1, item);
			stmt.setString(2, category);
			stmt.setDouble(3, price);
			
			return stmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		finally
		{
			try {
				connect.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
