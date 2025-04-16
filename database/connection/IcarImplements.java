package database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.InputMismatchException;

public class IcarImplements implements Icar {

	private static Connection con;

	public static String query = "insert into car(carname,model,charecter,engine,topverent,baseverent)values(?,?,?,?,?,?)";

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/impaqx", "root", "Hemanth@123");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private PreparedStatement pstmt;

	@Override
	public int insert(CarModelClass m) {
		int result = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, m.getCarname());
			stmt.setInt(2, m.getModel());
			stmt.setString(3, m.getCherecter());
			stmt.setString(4, m.getEngine());
			stmt.setString(5, m.getTopverent());
			stmt.setString(6, m.getBaseverent());
			result = stmt.executeUpdate();

		}

		catch (SQLDataException data) {
			System.out.println("data is invalid");
		} catch (SQLSyntaxErrorException sy) {
			System.out.println("sql syntax error");
		} catch (SQLException l) {
			System.out.println("place holder not currect");
		} catch (InputMismatchException in) {
			System.out.println("the input is mismatch");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

}
