package br.com.gabrielkaue.estoque.services;

import br.com.gabrielkaue.estoque.model.Categoria;
import br.com.gabrielkaue.estoque.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria salvar(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}
