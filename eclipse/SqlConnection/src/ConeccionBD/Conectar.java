package ConeccionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conectar {
	
	public static void main (String [] args) {
		try {
			//1. Conetamos con la base de datos
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://192.168.98.10:3306/entornos", "daw1", "Nohay2sin3");
			
			//2. Crear el objeto statement
			Statement miStatement = miConexion.createStatement();
			
			//3. Ejecutar SQL
			ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM productos");
			
			//4.Recorrer el resultset
			while(miResultSet.next()) {
				System.out.println(miResultSet.getString("descripcion"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No conecta!");
			e.printStackTrace();
		}
	}
}

