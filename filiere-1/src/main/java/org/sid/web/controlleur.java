package org.sid.web;

import java.util.List;

import org.sid.dao.ClientRepository;
import org.sid.dao.EtudiantRepository;
import org.sid.dao.ProfesseurRepository;
import org.sid.model.Vf1;
import org.sid.model.Vf2;
import org.sid.model.Vf3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class controlleur {
	@Autowired
	EtudiantRepository etudi;
	@Autowired
	ClientRepository filiere;
	@Autowired
	ProfesseurRepository prof;

	@GetMapping("/filiere")
	public List<Vf2> getFiliere(){
		return  filiere
				.findAll();}

	@GetMapping("/prof")
	public List<Vf1> getProf(){
		return  prof.findAll();

		}

	@GetMapping("/etudiant")
	public List<Vf3> getetudiant(){
		return  etudi.findAll();

		}
}
