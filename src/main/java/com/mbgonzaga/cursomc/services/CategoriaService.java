package com.mbgonzaga.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbgonzaga.cursomc.domain.Categoria;
import com.mbgonzaga.cursomc.repositories.CategoriaRepository;
import com.mbgonzaga.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Optional<Categoria> buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto nao encontrado! Id: " + id
					+ ", Tipo: " + Categoria.class.getName());
		}
		return obj;
	}
	
}
