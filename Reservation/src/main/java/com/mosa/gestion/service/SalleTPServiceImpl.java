package com.mosa.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mosa.gestion.entities.SalleTP;
import com.mosa.gestion.repos.SalleTPRepository;

@Service
public class SalleTPServiceImpl implements SalleTPService {
	
	@Autowired
	SalleTPRepository salleTPRepository;

	@Override
	public SalleTP saveSalleTP(SalleTP p) {
		return salleTPRepository.save(p);
	}

	@Override
	public SalleTP updateSalleTP(SalleTP p) {
		return salleTPRepository.save(p);
	}

	@Override
	public void deleteSalleTP(SalleTP p) {
		salleTPRepository.delete(p);		
	}

	@Override
	public void deleteSalleTPById(Long id) {
		salleTPRepository.deleteById(id);		
	}

	@Override
	public SalleTP getSalleTP(Long id) {
		return salleTPRepository.findById(id).get();
	}

	@Override
	public List<SalleTP> getAllSalleTPs() {
		return salleTPRepository.findAll();
	}

	@Override
	public Page<SalleTP> getAllSalleTPsParPage(int page, int size) {
		return salleTPRepository.findAll(PageRequest.of(page, size));
	}

}
