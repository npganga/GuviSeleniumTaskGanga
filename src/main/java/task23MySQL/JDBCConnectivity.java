package task23MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectivity {

	
	public static void main(String[] args) {
		
		//Step-1: Details of DB
		
		String DB_url ="jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "root";
		
		//Step-2: Establish Connection
		
		try {
			Connection connection =DriverManager.getConnection(DB_url, username, password);
			
		//Step-3: Verify the connection is done	
			if(connection != null) {
				
				System.out.println("Conection established");
			} else {
				
				System.out.println("Issue in connecting");
			}
			//Step-4: CRUD Operations
			
			//i) Create Statement
			
			Statement stmt = connection.createStatement();
			String createDB = "create database DetailsOfEmployee";
			String useDB = " use DetailsOfEmployee";
			String CreateTable = "Create table EmployeeDetails (empcode int, empname varchar(20), empage int, esalary int)";
			String insert = "insert into EmployeeDetails values (101, 'Jenny', 25, 10000),(102, 'Jacky', 30, 20000),(103, 'Joe', 20, 40000),(104, 'John', 40, 80000),(105, 'Shameer', 25, 90000)";
			String select ="Select * from EmployeeDetails";
			
			//ii) Execute Statement
			stmt.execute(createDB);
			stmt.execute(useDB);
			stmt.execute(CreateTable);
			stmt.executeUpdate(insert);
			
			//iii)Selecting the data
			ResultSet rs = stmt.executeQuery(select);
			
			//iv) Iterate the result
			while (rs.next()) {
				System.out.println(rs.getInt("empcode")+" "+rs.getString("empname")+ " "+rs.getInt("empage")+" "+rs.getInt("esalary"));
			}
			
			//Step-5: Close connections
			connection.close();
		}
		
		 catch (SQLException e) {
				e.printStackTrace();
			}		
	}
}