package com.jihen.voiture.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jihen.voiture.entities.Marque;
import com.jihen.voiture.entities.Voiture;
import com.jihen.voiture.repos.VoitureRepository;
@Service
public class VoitureServiceImpl implements VoitureService {
@Autowired
VoitureRepository voitureRepository;
@Override
public Voiture saveVoiture(Voiture v) {
return voitureRepository.save(v);
}
@Override
public Voiture updateVoiture(Voiture v) {
return voitureRepository.save(v);
}
@Override
public void deleteVoiture(Voiture v) {
voitureRepository.delete(v);
}
@Override
public void deleteVoitureById(Long id) {
voitureRepository.deleteById(id);
}
@Override
public Voiture getVoiture(Long id) {
return voitureRepository.findById(id).get();
}
@Override
public List<Voiture> getAllVoiture() {
return voitureRepository.findAll();
}
@Override
public List<Voiture> findByNomVoiture(String nom) {
	return voitureRepository.findByNomVoiture(nom);
}
@Override
public List<Voiture> findByNomVoitureContains(String nom) {

	return voitureRepository.findByNomVoitureContains(nom);
}
@Override
public List<Voiture> findByNomPrix(String nom, Double prix) {
	return voitureRepository.findByNomPrix(nom, prix);
}
@Override
public List<Voiture> findByMarque(Marque marque) {
	
	return voitureRepository.findByMarque(marque);
}
@Override
public List<Voiture> findByMarqueIdMarq(Long id) {
	
	return voitureRepository.findByMarqueIdMarq(id);
}
@Override
public List<Voiture> findByOrderByNomVoitureAsc() {
	return voitureRepository.findByOrderByNomVoitureAsc();
}
@Override
public List<Voiture> trierVoitureNomsPrix() {
	return voitureRepository.trierVoitureNomsPrix();
}
}