package br.com.lista.fornecedores;

import java.util.List;

import br.com.lista.fornecedores.database.RepositorioFornecedores;
import br.com.lista.fornecedores.model.Fornecedor;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

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

    @Operation(description = "Lista todos os fornecedores")
    @GetMapping
    public List<Fornecedor> listar(){
        return repositorio.findAll();
    }

    @Operation(description = "Salvar um fornecedor")
    @PostMapping
    public void salvar(@RequestBody Fornecedor fornecedor ){
        repositorio.save(fornecedor);
    }

    @Operation(description = "alterar um fornecedor")
    @PutMapping
    public void alterar(@RequestBody Fornecedor fornecedor){
        if(fornecedor.getId() > 0)
            repositorio.save(fornecedor);
    }

    @Operation(description = "Excluir um fornecedor")
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repositorio.deleteById(id);
    }
}
