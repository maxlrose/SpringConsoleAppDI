package com.example.springconsoleappdi.services;

import com.example.springconsoleappdi.model.User;
import com.example.springconsoleappdi.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class UserService implements MyService<User> {
//	private final static String URL = "jdbc:mysql://localhost:3306/db1";
//	private final static String USERNAME = "root";
//	private final static String PWD = "q12345";
//	private static Connection conn;

	@Autowired
	private UserRepository userRepository;


////	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
////	static final String JDBC_DB_URL = "jdbc:mysql://localhost:3306/tutorialDb";
////
////	// JDBC Database Credentials
////	static final String JDBC_USER = "root";
////	static final String JDBC_PASS = "admin@123";
//
//	//private static GenericObjectPool gPool = null;
//
//	{
////		try {
////			// The newInstance() call is a work around for some
////			// broken Java implementations
////			Class.forName("com.mysql.jdbc.Driver").newInstance();
////		} catch (Exception ex) {
////			ex.printStackTrace();
////		}
//
////		new BasicDataSource();
////		PoolableConnectionFactory pcf = new PoolableConnectionFactory(cf, gPool, null, null, false, true);
////		gPool = new GenericObjectPool();
//
//
//		try {
//			conn = DriverManager.getConnection(URL +
//							"?user=" + USERNAME +
//							"&password=" + PWD);
//
//		} catch (SQLException ex) {
//			System.out.println("SQLException: " + ex.getMessage());
//			System.out.println("SQLState: " + ex.getSQLState());
//			System.out.println("VendorError: " + ex.getErrorCode());
//		}
//	}


//	public Page<User> getPage(Pageable page) {
//		return userRepository.findAll(page);
////		try {
////			Statement statement = conn.createStatement();
////			ResultSet rset = statement.executeQuery("SELECT * FROM users");
////
////			while (rset.next()) {
////				User user = new User();
////				user.setId(rset.getInt("id"));
////				user.setName(rset.getString("name"));
////				list.add(user);
////			}
////		} catch (SQLException e) {
////			e.printStackTrace();
////		}
////		return list;
//	}


	public Iterable<User> getAll() {
		return userRepository.findAll();
//		try {
//			Statement statement = conn.createStatement();
//			ResultSet rset = statement.executeQuery("SELECT * FROM users");
//
//			while (rset.next()) {
//				User user = new User();
//				user.setId(rset.getInt("id"));
//				user.setName(rset.getString("name"));
//				list.add(user);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return list;
	}


	public Optional<User> show(long id) {
//		Optional<User> u = Optional.ofNullable(null);
//		u.filter()

		return userRepository.findById(id);

//		ResultSet set;
//		try {
//			PreparedStatement statement = conn.prepareStatement(
//					"SELECT * FROM users WHERE id = ?");
//			statement.setInt(1, id);
//			set = statement.executeQuery();
//			set.next();
//			User newUser = new User();
//			newUser.setId(id);
//			newUser.setName(set.getString("name"));
//			return Optional.of(newUser);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return Optional.of(null);
	}



//	public Optional<User> findByName(String name) {
//		return userRepository.findByUsername(name);
//	}


	public User save(User user) {
		return userRepository.save(user);
//		try {
//			PreparedStatement statement = conn.prepareStatement(
//					"INSERT INTO users (name) VALUES (?)");
//			statement.setString(1, user.getName());
//			statement.executeUpdate();
//			return true;
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return false; //users.add(user);
	}


//	@Deprecated
//	public boolean update(User user) {
////		try {
////			PreparedStatement statement = conn.prepareStatement(
////					"UPDATE users SET name = ? WHERE id = ?");
////			statement.setString(1, user.getName());
////			statement.setInt(2, user.getId());
////			statement.executeUpdate();
////			return true;
////		} catch (SQLException e) {
////			e.printStackTrace();
////		}
//		return false;
//	}


	public void delete(long id) {
		userRepository.deleteById(id);
//		try {
//			PreparedStatement statement = conn.prepareStatement(
//					"DELETE FROM users WHERE id = ?");
//			statement.setInt(1, id);
//			statement.executeUpdate();
//			return true;
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return false;
	}

}


//
//@Component
//public class UsersDAO {
//	private static int userid = 0;
//
//	ArrayList<User> users;
//
//	{
//		users = new ArrayList<>();
//
//		users.add(new User(++userid, "Vasya"));
//		users.add(new User(++userid, "Rosa"));
//		users.add(new User(++userid, "Luna))"));
//	}
//
//	public List<User> index() {
//		return users;
//	}
//
//
//	public Optional<User> show(int id) {
//		return users.stream().filter(u -> u.getId() == id).findAny();//.orElse(null);
//	}
//
//
//	public boolean save(User user) {
//		user.setId(++userid);
//		return users.add(user);
//	}
//
//
//	public boolean update(User user) {
//		User userToBeUpdated = show(user.getId()).get();
//		if (user == null)
//			return false;
//		return userToBeUpdated.setName(user.getName());
//	}
//
//
//	public boolean delete(int id) {
//		return users.removeIf(e -> e.getId() == id);
//	}
//
//}
