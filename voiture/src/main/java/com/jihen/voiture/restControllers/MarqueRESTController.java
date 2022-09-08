package com.jihen.voiture.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jihen.voiture.entities.Marque;
import com.jihen.voiture.service.MarqueService;



@RestController
@RequestMapping("/api/marques")
@CrossOrigin(origins="*")
public class MarqueRESTController {
	@Autowired
	MarqueService marqueService;
	@RequestMapping(path="/all" ,method = RequestMethod.GET)
	public List<Marque> getAllMarques1() {
		return marqueService.getAllMarques();
		
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Marque getMarqueById(@PathVariable("id") Long id) {
		return marqueService.getMarque(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Marque> getAllMarques() {
	return marqueService.getAllMarques();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Marque createMarque(@RequestBody Marque marque) {
		return marqueService.saveMarque(marque);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Marque updateMarque(@RequestBody Marque marque) {
	return marqueService.updateMarque(marque);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteMarque(@PathVariable("id") Long id)
	{
		marqueService.deleteMarqueById(id);
	}
}