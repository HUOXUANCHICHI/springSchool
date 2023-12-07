package com.spring.dao.impl;

import com.spring.dao.MedDAO;
import com.spring.entity.Med;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MedDAOImpl implements MedDAO{

	public JdbcTemplate jdbcTemplate;


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int addMed(Med med) {
		String sql = "insert into scott.usert(userName, password) values(?, ?)";
		Object[] objects = {med.getMname(), med.getMtype()};
		return jdbcTemplate.update(sql, objects);
	}

	@Override
	public int updateMed(Med med) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delMed(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Med findMedById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Med> findAllMed() {
		// TODO Auto-generated method stub
		return null;
	}

}
