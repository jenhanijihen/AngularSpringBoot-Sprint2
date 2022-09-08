package com.jihen.voiture.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jihen.voiture.entities.Marque;
import com.jihen.voiture.entities.Voiture;
@Service
public interface VoitureService {
	Voiture saveVoiture(Voiture v);
	Voiture updateVoiture(Voiture v);
	void deleteVoiture(Voiture v);
	void deleteVoitureById(Long id);
	Voiture getVoiture(Long id);
	
	List<Voiture> getAllVoiture();
	List<Voiture> findByNomVoiture(String nom);
	List<Voiture> findByNomVoitureContains(String nom);
	List<Voiture> findByNomPrix (String nom, Double prix);
	List<Voiture> findByMarque (Marque marque);
	List<Voiture> findByMarqueIdMarq(Long id);
	List<Voiture> findByOrderByNomVoitureAsc();
	List<Voiture> trierVoitureNomsPrix();
}
