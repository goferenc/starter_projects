import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyMain {
	
	public static void main(String[] args) {	
		select();
	}
	
	private static void connect() {
		
		String connectionUrl = "jdbc:sqlserver://localhost:49695;databaseName=gf_database;user=sa;password=123";
		//String connectionUrl = "jdbc:sqlserver://DESKTOP-DJ4F3E1 :49695;databaseName=gf_database;user=sa;password=123";

        try {
            System.out.print("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(connectionUrl)) {
                System.out.println("Done.");
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
        
	}
	
	private static void insert() {
		
		String connectionUrl = "jdbc:sqlserver://localhost:49695;databaseName=gf_database;user=sa;password=123";
		//String connectionUrl = "jdbc:sqlserver://DESKTOP-DJ4F3E1 :49695;databaseName=gf_database;user=sa;password=123";

        try {
            try (Connection connection = DriverManager.getConnection(connectionUrl)) {
            	Statement statement = connection.createStatement();
            	String sql = "INSERT INTO Employee " +
                        "VALUES (2, 'Emma', 18)";
            	statement.executeUpdate(sql);
            	System.out.println("Inserted.");
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
        
	}
	
	private static void select() {
		
		String connectionUrl = "jdbc:sqlserver://localhost:49695;databaseName=gf_database;user=sa;password=123";
		//String connectionUrl = "jdbc:sqlserver://DESKTOP-DJ4F3E1 :49695;databaseName=gf_database;user=sa;password=123";

        try {
            System.out.print("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(connectionUrl)) {
            	Statement statement = connection.createStatement();
            	String sql = "SELECT id, name, age FROM Employee";
                ResultSet resultSet = statement.executeQuery(sql);
                
                while(resultSet.next()){
                    int id  = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    
                    System.out.println(id + " , " + name + " , " + age);
                 }
                
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
        
	}

}
