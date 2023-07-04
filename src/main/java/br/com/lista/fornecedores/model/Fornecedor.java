package br.com.lista.fornecedores.model;

import lombok.Data;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.math.BigDecimal;

@Data
@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private BigDecimal areaPlantadaMetroQuadrado;
    private BigDecimal areaTotalMetroQuadrado;
    private BigDecimal numeroArvores;
    private BigDecimal producaoMensalFrutos;
    private BigDecimal longitude;
    private BigDecimal latitude;
}
