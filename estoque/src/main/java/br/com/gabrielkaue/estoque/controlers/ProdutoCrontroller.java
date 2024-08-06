package br.com.gabrielkaue.estoque.controlers;

import br.com.gabrielkaue.estoque.model.Produto;
import br.com.gabrielkaue.estoque.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoCrontroller {

    @Autowired
    private ProdutoService produtoService;

    public ResponseEntity<Produto>inserir(@RequestBody Produto produto){
        Produto produtoSalvo = ProdutoService.salvar(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvo);
    }
}
