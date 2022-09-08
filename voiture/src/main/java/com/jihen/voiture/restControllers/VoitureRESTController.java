package com.jihen.voiture.restControllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.jihen.voiture.entities.Voiture;
import com.jihen.voiture.service.VoitureService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VoitureRESTController {
@Autowired
VoitureService voitureService;


@RequestMapping(path = "all",method = RequestMethod.GET)

//@RequestMapping(method = RequestMethod.GET)
public List<Voiture> getAllVoiture() {
	
	return voitureService.getAllVoiture();

}

@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Voiture getVoitureById(@PathVariable("id") Long id) {

	return voitureService.getVoiture(id);

}
@RequestMapping(method = RequestMethod.GET)
List<Voiture> getAllVoiture1() {
return voitureService.getAllVoiture();
}
@RequestMapping(method = RequestMethod.POST)
public Voiture createVoiture(@RequestBody Voiture voiture) {
return voitureService.saveVoiture(voiture);
}

@RequestMapping(method = RequestMethod.PUT)
public Voiture updateVoiture(@RequestBody Voiture voiture) {
return voitureService.updateVoiture(voiture);
}
@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteVoiture(@PathVariable("id") Long id)
{
voitureService.deleteVoitureById(id);
}
@RequestMapping(value="/voitmarq/{idMarq}",method = RequestMethod.GET)
public List<Voiture> getVoitureByMarqId(@PathVariable("idMarq") Long idMarq) {
return voitureService.findByMarqueIdMarq(idMarq);
}


}