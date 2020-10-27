package com.zup.estoquepecas.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer idProduto;
	private Long codBarra;
	private String nome;
	private Double precoCusto;
	private Double precoVenda;
	private Integer qtdeEstoque;
	private String fabricante;
	private String descricao;
	
	public Produto() {
		super();
	}
	
	public Produto(Integer idProduto, Long codBarra, String nome, Double precoCusto, Double precoVenda,
			Integer qtdeEstoque, String fabricante, String descricao) {
		super();
		this.idProduto = idProduto;
		this.codBarra = codBarra;
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.qtdeEstoque = qtdeEstoque;
		this.fabricante = fabricante;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Produto [codBarra=" + codBarra + ", nome=" + nome + ", precoCusto=" + precoCusto + ", precoVenda="
				+ precoVenda + ", qtdeEstoque=" + qtdeEstoque + ", fabricante=" + fabricante + ", descricao="
				+ descricao + "]";
	}
	
	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public Long getCodBarra() {
		return codBarra;
	}
	public void setCodBarra(Long codBarra) {
		this.codBarra = codBarra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(Double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public Double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public Integer getQtdeEstoque() {
		return qtdeEstoque;
	}
	public void setQtdeEstoque(Integer qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
