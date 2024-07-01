package MyDatabse;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDb {

	public static void insertData() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/subi";
		String username = "root";
		String password = "Subi@0909";

		Connection con = DriverManager.getConnection(url, username, password);

		String createTable = "CREATE TABLE EmpDetails (empcode INT PRIMARY KEY, empname VARCHAR(50), empage INT, empsalary INT(10))";

		String insertData = "INSERT INTO EmpDetails (empcode, empname, empage, empsalary) VALUES "
				+ "(101, 'Jenny', 25, 10000)," + "(102, 'Jacky', 30, 20000)," + "(103, 'Joe', 20, 40000),"
				+ "(104, 'John', 40, 80000)," + "(105, 'Shameer', 25, 90000)";

		Statement createStatement = con.createStatement();

		createStatement.executeUpdate(createTable);
		createStatement.executeUpdate(insertData);

		System.out.println("Table created and data inserted successfully!");

		createStatement.close();
		con.close();

	}

	public static void main(String[] args) throws SQLException {
		insertData();
	}
}
