package com.windsorlima.cursoSpring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.windsorlima.cursoSpring.domain.Categoria;
import com.windsorlima.cursoSpring.domain.Pedido;
import com.windsorlima.cursoSpring.repositories.PedidoRepository;
import com.windsorlima.cursoSpring.services.exceptions.ObjectNotFoundExcception;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundExcception("Objeto não encontrado! Id: "+ id 
					+ ", Tipo: "+ Categoria.class.getName());
		}
		return obj;
	}
}
