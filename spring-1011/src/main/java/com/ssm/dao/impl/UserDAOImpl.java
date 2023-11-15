package com.ssm.dao.impl;

import com.ssm.dao.UserDAO;
import com.ssm.entity.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author CHICHI
 */
@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {
    private JdbcTemplate jdbcTempLate;

    public void setJdbcTempLate(JdbcTemplate jdbcTempLate) {
        this.jdbcTempLate = jdbcTempLate;
    }


    @Override
    public boolean login(String loginName, String loginPwd) {

        if ("admin".equals(loginName) && "123456".equals(loginPwd)) {
            return true;
        }
        return false;
    }

    @Override
    public int addUser(User user) {
        String sql = "insert into scott.usert(userName, password) values(?, ?)";
        Object[] objects = {user.getUserName(), user.getPassword()};
        return jdbcTempLate.update(sql, objects);
    }

    @Override
    public int updateUser(User user) {
        String sql = "update scott.usert set userName = ?,password = ? where id = ?";
        Object[] object = new Object[]{user.getUserName(), user.getPassword(), user.getId()};
        int result = jdbcTempLate.update(sql, object);
        return result;
    }

    @Override
    public int deleteUser(int id) {
        String sql = "delete from scott.usert where id = ?";
        int result = jdbcTempLate.update(sql, id);
        return result;
    }

    @Override
    public User findUserById(int id) {
        String sql = "select * from scott.usert where id = ?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return this.jdbcTempLate.queryForObject(sql, rowMapper, id);
    }

    @Override
    public List<User> findAllUser() {
        String sql = "select * from scott.usert";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return this.jdbcTempLate.query(sql, rowMapper);
    }
}
