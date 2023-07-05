package br.com.lista.fornecedores.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Fornecedor implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(nullable = false)
    private String nome;
    private BigDecimal areaPlantadaMetroQuadrado;
    private BigDecimal areaTotalMetroQuadrado;
    private BigDecimal numeroArvores;
    private BigDecimal producaoMensalFrutos;
    private BigDecimal longitude;
    private BigDecimal latitude;
      

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getAreaPlantadaMetroQuadrado() {
		return areaPlantadaMetroQuadrado;
	}
	public void setAreaPlantadaMetroQuadrado(BigDecimal areaPlantadaMetroQuadrado) {
		this.areaPlantadaMetroQuadrado = areaPlantadaMetroQuadrado;
	}
	public BigDecimal getAreaTotalMetroQuadrado() {
		return areaTotalMetroQuadrado;
	}
	public void setAreaTotalMetroQuadrado(BigDecimal areaTotalMetroQuadrado) {
		this.areaTotalMetroQuadrado = areaTotalMetroQuadrado;
	}
	public BigDecimal getNumeroArvores() {
		return numeroArvores;
	}
	public void setNumeroArvores(BigDecimal numeroArvores) {
		this.numeroArvores = numeroArvores;
	}
	public BigDecimal getProducaoMensalFrutos() {
		return producaoMensalFrutos;
	}
	public void setProducaoMensalFrutos(BigDecimal producaoMensalFrutos) {
		this.producaoMensalFrutos = producaoMensalFrutos;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
}