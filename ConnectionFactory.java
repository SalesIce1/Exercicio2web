package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory 
{
	static 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) 
		{
			throw new RuntimeException(e);
		}
	}
	// Faz a conex�o
		public static Connection obtemConexao() throws SQLException 
		{
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/Paises?useTimezone=true&serverTimezone=UTC&useSSL=false", "root", "");
		}
}