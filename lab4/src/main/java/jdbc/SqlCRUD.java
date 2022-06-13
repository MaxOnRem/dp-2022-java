package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import servlet.CRUDInterface;
import laptops.Laptops;

public class SqlCRUD implements CRUDInterface<Laptops> {

	Connection connection;
	
	public SqlCRUD() {
		this.connection = new Connect().getCon();
		System.out.println(connection);
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(Laptops t) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection.prepareStatement("INSERT INTO laptops (title,img,description) " + "VALUES (?,?,?)")) {
			st.setString(1, t.getTitle());
			st.setString(2, t.getImg());
			st.setString(3, t.getDescription());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Laptops> read() {
		// TODO Auto-generated method stub
		List<Laptops> list = new ArrayList<>();

		try (Statement st = connection.createStatement(); ResultSet rs = st.executeQuery("SELECT * FROM laptops;");) {
			while (rs.next()) {
				list.add(new Laptops(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void update(int id, Laptops t) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection
			.prepareStatement("UPDATE laptops " + "SET \"title\"=?, \"img\"=?, \"description\"=? WHERE id=?;")) {
			st.setString(1, t.getTitle());
			st.setString(2, t.getImg());
			st.setString(3, t.getDescription());
			st.setInt(4, id);
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection
			.prepareStatement("DELETE FROM laptops WHERE id=?;")) {
			st.setInt(1, id);			
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
