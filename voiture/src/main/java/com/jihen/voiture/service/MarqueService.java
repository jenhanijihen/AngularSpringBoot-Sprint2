package com.jihen.voiture.service;

import java.util.List;

import com.jihen.voiture.entities.Marque;

public interface MarqueService {
Marque saveMarque(Marque  m);
Marque updateMarque(Marque m);
void deleteMarque(Marque m);
void deleteMarqueById(Long id);
Marque getMarque(Long id);
List<Marque> getAllMarques();
}



