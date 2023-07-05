package br.com.lista.fornecedores;

import java.util.List;

import br.com.lista.fornecedores.database.RepositorioFornecedores;
import br.com.lista.fornecedores.model.Fornecedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorREST {
    @Autowired
    private RepositorioFornecedores repositorio;

    @GetMapping
    public List<Fornecedor> listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Fornecedor fornecedor ){
        repositorio.save(fornecedor);
    }

    @PutMapping
    public void alterar(@RequestBody Fornecedor fornecedor){
        if(fornecedor.getId() > 0)
            repositorio.save(fornecedor);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repositorio.deleteById(id);
    }
}
