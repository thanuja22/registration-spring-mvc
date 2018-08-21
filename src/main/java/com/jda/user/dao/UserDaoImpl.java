package com.jda.user.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.jda.user.model.Login;
import com.jda.user.model.User;


public class UserDaoImpl implements UserDao {
	@Autowired
	  DataSource datasource;
	  @Autowired
	  JdbcTemplate jdbcTemplate;
	  PasswordEncoder passwordEncoder;
	  public void register(User user) {
	    String sql = "insert into myusers (username,password,firstname,lastname,email,address,phone) values(?,?,?,?,?,?,?);";
	    
	    user.setPassword( passwordEncoder.encode(user.getPassword())   );
	    
	    jdbcTemplate.update(sql, new Object[] { user.getUsername(),user.getPassword(),user.getFirstname(),
	    user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() });
	    }
	    public User validateUser(Login login) {
			
	   String sql = "select * from myusers where username='" + login.getUsername() + "' and password='" + login.getPassword()
	    + "'";
	    List<User> myusers = jdbcTemplate.query(sql, new UserMapper());
	    return myusers.size() > 0 ? myusers.get(0) : null;
	    }
		@Override
		public User findByEmail(String email) {
			// TODO Auto-generated method stub
			return null;
		}
	  }
	  class UserMapper implements RowMapper<User> {
	  public User mapRow(ResultSet rs, int arg1) throws SQLException {
	    User user = new User();
	    user.setUsername(rs.getString("username"));
	    user.setPassword(rs.getString("password"));
	    user.setFirstname(rs.getString("firstname"));
	    user.setLastname(rs.getString("lastname"));
	    user.setEmail(rs.getString("email"));
	    user.setAddress(rs.getString("address"));
	    user.setPhone(rs.getInt("phone"));
	    return user;
	  }
}
