package com.windsorlima.cursoSpring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.windsorlima.cursoSpring.domain.Cliente;
import com.windsorlima.cursoSpring.repositories.ClienteRepository;
import com.windsorlima.cursoSpring.services.exceptions.ObjectNotFoundExcception;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundExcception("Objeto não encontrado! Id: "+ id 
					+ ", Tipo: "+ Cliente.class.getName());
		}
		return obj;
	}
}
