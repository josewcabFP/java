
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion_oracle {
	
	public static void main(String[] args) {
        try {
        	
        	
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","clase","clase");
            
            Statement miStatement = conexion.createStatement();
            
            ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM employees");
            
            while(miResultSet.next()) {
				System.out.println(miResultSet.getObject("ename"));
			}
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error en la conexión de la base de datos");
        }
         
    }

}
