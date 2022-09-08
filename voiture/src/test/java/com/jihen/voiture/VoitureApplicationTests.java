package com.jihen.voiture;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jihen.voiture.entities.Marque;
import com.jihen.voiture.entities.Voiture;
import com.jihen.voiture.repos.VoitureRepository;

@SpringBootTest
class VoitureApplicationTests {
@Autowired
private VoitureRepository voitureRepository;
@Test
public void testCreateVoiture() {
Voiture voit = new Voiture("BMW",150.000,new Date());
voitureRepository.save(voit);
}
@Test
public void testFindVoiture()
{
Voiture v = voitureRepository.findById(1L).get();

System.out.println(v);
}
@Test
public void testUpdateVoiture()
{
Voiture v = voitureRepository.findById(1L).get();
v.setPrixVoiture(120.000);
voitureRepository.save(v);
}
@Test
public void testDeleteVoiture()
{
voitureRepository.deleteById(1L);;
}
@Test
public void testListerTousVoiture()
{
List<Voiture> voit = voitureRepository.findAll();
for (Voiture v : voit)
{
System.out.println(v);
}

}
@Test
public void testFindByNomVoiture()
{
List<Voiture> voit = voitureRepository.findByNomVoiture("BMW");
for (Voiture v : voit)
{
System.out.println(v);
}
}

@Test
public void testFindByNomVoitureContains ()
{
List<Voiture> voit=voitureRepository.findByNomVoitureContains("I");
for (Voiture v : voit)
{
System.out.println(v);
} }

@Test
public void testfindByNomPrix()
{
List<Voiture> voit = voitureRepository.findByNomPrix("BMW", 120.000);
for (Voiture v : voit)
{
System.out.println(v);
}
}
@Test
public void testfindByMarque()
{
Marque marq = new Marque();
marq.setIdMarq(2L);
List<Voiture> voit = voitureRepository.findByMarque(marq);
for (Voiture v : voit)
{
System.out.println(v);
}
}
@Test
public void findByMarqueIdMarq()
{
List<Voiture> voit = voitureRepository.findByMarqueIdMarq(2L);
for (Voiture v : voit)
{
System.out.println(v);
}
}
@Test
public void testfindByOrderByNomVoitureAsc()
{
List<Voiture> voit = voitureRepository.findByOrderByNomVoitureAsc();
for (Voiture v : voit)
{
System.out.println(v);
}
}
@Test
public void testTrierVoitureNomsPrix()
{
List<Voiture> voit = voitureRepository.trierVoitureNomsPrix();
for (Voiture v : voit)
{
System.out.println(v);
}
}
 }
