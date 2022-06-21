package com.mosa.gestion.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mosa.gestion.entities.SalleTP;

public interface SalleTPService {
	SalleTP saveSalleTP(SalleTP p);
	SalleTP updateSalleTP(SalleTP p);
	void deleteSalleTP(SalleTP p);
	void deleteSalleTPById(Long id);
	SalleTP getSalleTP(Long id);
	List<SalleTP> getAllSalleTPs();
	Page<SalleTP> getAllSalleTPsParPage(int page, int size);


}
