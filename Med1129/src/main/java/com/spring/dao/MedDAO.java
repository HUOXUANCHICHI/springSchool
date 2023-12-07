package com.spring.dao;

import com.spring.entity.Med;

import java.util.List;

public interface MedDAO {

	public int addMed(Med med);

	public int updateMed(Med med);

	public int delMed(int id);

	public Med findMedById(int id);

	public List<Med> findAllMed();

}
