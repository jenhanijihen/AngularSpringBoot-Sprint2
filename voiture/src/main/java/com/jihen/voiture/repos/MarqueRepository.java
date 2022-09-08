package com.jihen.voiture.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jihen.voiture.entities.Marque;
@RepositoryRestResource(path ="rest")
public interface MarqueRepository extends JpaRepository<Marque, Long> {
	//List<Marque> findByNomMarque(String nom);
	//List<Marque> findByIdMarque(Long id);

}