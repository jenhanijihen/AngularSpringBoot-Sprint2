package com.jihen.voiture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jihen.voiture.entities.Marque;
import com.jihen.voiture.repos.MarqueRepository;

@Service

public class MarqueServiceImpl implements  MarqueService{
	
	@Autowired
	MarqueRepository marqueRepository;
	
	@Override
	public Marque saveMarque(Marque m) {
		return this.marqueRepository.save(m);
	}

	@Override
	public Marque updateMarque(Marque m) {
		return this.marqueRepository.save(m);
	}

	@Override
	public void deleteMarque(Marque m) {
		 this.marqueRepository.delete(m);
		
	}

	@Override
	public void deleteMarqueById(Long id) {
		 this.marqueRepository.deleteById(id);
		
	}

	@Override
	public Marque getMarque(Long id) {
		return this.marqueRepository.getById(id);
	}

	@Override
	public List<Marque> getAllMarques() {
		return this.marqueRepository.findAll();

	}

}