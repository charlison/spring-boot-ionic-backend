package com.charlison.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charlison.cursomc.domain.Pedido;
import com.charlison.cursomc.repositories.PedidoRepository;
import com.charlison.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoServices {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {

		Optional<Pedido> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! " + id + ", tipo: " + Pedido.class.getName()));
	}
}
