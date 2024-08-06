package br.com.gabrielkaue.estoque.services;


import br.com.gabrielkaue.estoque.model.Produto;
import br.com.gabrielkaue.estoque.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private static ProdutoRepository produtoRepository;

    public static Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }


}
