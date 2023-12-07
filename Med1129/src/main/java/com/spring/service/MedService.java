package com.spring.service;

import com.spring.entity.Med;

import java.util.List;

public interface MedService {


	public int addMed(Med med);

	public int updateMed(Med med);

	public int delMed(int id);

	public Med findMedById(int id);

	public List<Med> findAllMed();

}
