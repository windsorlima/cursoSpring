package com.windsorlima.cursoSpring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.windsorlima.cursoSpring.domain.Categoria;
import com.windsorlima.cursoSpring.repositories.CategoriaRepository;
import com.windsorlima.cursoSpring.services.exceptions.ObjectNotFoundExcception;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundExcception("Objeto não encontrado! Id: "+ id 
					+ ", Tipo: "+ Categoria.class.getName());
		}
		return obj;
	}
}
