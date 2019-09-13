package com.charlison.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charlison.cursomc.domain.Cliente;
import com.charlison.cursomc.repositories.ClienteRepository;
import com.charlison.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteServices {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {

		Optional<Cliente> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! " + id + ", tipo: " + Cliente.class.getName()));
	}
}
