package br.com.lista.fornecedores.database;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lista.fornecedores.model.Fornecedor;

@Repository
public interface RepositorioFornecedores extends JpaRepository<Fornecedor,Long>{
    
}
