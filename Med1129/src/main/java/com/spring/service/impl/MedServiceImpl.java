package com.spring.service.impl;

import com.spring.dao.MedDAO;
import com.spring.entity.Med;
import com.spring.service.MedService;

import java.util.List;

public class MedServiceImpl implements MedService{

	public MedDAO medDAO;

	public void setMedDAO(MedDAO medDAO) {
		this.medDAO = medDAO;
	}

	public MedServiceImpl() {

	}

	@Override
	public int addMed(Med med) {
		// TODO Auto-generated method stub
		return this.medDAO.addMed(med);
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
