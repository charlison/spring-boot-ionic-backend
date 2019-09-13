package com.charlison.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charlison.cursomc.domain.Categoria;
import com.charlison.cursomc.repositories.CategoriaRepository;
import com.charlison.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaServices {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {

		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! " + id + ", tipo: " + Categoria.class.getName()));
	}
	
	public Categoria insert(Categoria obj) {
		//obj.setId(null);
		return repo.save(obj);
	}
}
