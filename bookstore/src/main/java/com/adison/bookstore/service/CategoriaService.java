package com.adison.bookstore.service;

import com.adison.bookstore.domain.Categoria;
import com.adison.bookstore.exceptions.ObjectNotFoundException;
import com.adison.bookstore.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! id:" + id + ", Tipo: "+Categoria.class.getName()));
    }
}


















