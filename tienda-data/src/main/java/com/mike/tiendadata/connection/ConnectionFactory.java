/**
 * 
 */
package com.mike.tiendadata.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 * @author Michael Escobar
 *
 */
public class ConnectionFactory {

	private static Connection connection;
	private static Statement statement;
	
	
	
	
	
	public static Connection conectar() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		String url = "jdbc:mysql://localhost:3306/restaurante";
		String user = "root";
		String password = "neo23*";
		
		connection = DriverManager.getConnection(url, user, password);
		
		statement = connection.createStatement();
		
		return connection;
		
	}
	
	/**
	 * Permite ejecutar sentencias INSERT, UPDATE y DELETE
	 * @param sql parametro con la sentencia a ejecutarse
	 * @return 1 en caso de ser exitoso, o 0 en caso de error
	 * @throws SQLException excepcion generada en caso de error al ejecutar la sentencia SQL.
	 */
	public static int ejecutarSQL(String sql) throws SQLException {
		System.out.println("Query: " + sql);
		 return statement.executeUpdate(sql);
	}
	
	
	/**
	 * Permite ejecutar sentencia SELECT
	 * @param sql parametro con la sentencia a ejecutarse
	 * @return objeto con la informacion obtenida de la sentencia select
	 * @throws SQLException excepcion generada en caso de error al ejecutar la sentencia SQL.
	 */
	public static ResultSet ejecutarSQLSelect(String sql) throws SQLException {
		
		System.out.println("Query: " + sql);
		return statement.executeQuery(sql);
	}
	
	
	
	
}
