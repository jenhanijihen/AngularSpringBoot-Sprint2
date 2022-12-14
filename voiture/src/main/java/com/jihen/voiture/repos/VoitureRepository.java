package com.jihen.voiture.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jihen.voiture.entities.Marque;
import com.jihen.voiture.entities.Voiture;
@RepositoryRestResource(path = "rest")
public interface VoitureRepository extends JpaRepository<Voiture, Long> {
	List<Voiture> findByNomVoiture(String nom);
	 List<Voiture> findByNomVoitureContains(String nom); 
	 
	 @Query("select v from Voiture v where v.nomVoiture like %?1 and v.prixVoiture > ?2")
	 List<Voiture> findByNomPrix (String nom, Double prix);
	 
	 @Query("select v from Voiture v where v.marque = ?1")
	 List<Voiture> findByMarque (Marque marque);

	 List<Voiture> findByMarqueIdMarq(Long id);
     
	 List<Voiture> findByOrderByNomVoitureAsc();
	 
	 @Query("select v from Voiture v order by v.nomVoiture ASC, v.prixVoiture ASC")
	 List<Voiture> trierVoitureNomsPrix ();

}
