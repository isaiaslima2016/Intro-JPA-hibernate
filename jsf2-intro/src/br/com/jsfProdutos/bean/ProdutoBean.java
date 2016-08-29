package br.com.jsfProdutos.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.jsfProdutos.model.Produto;

@ManagedBean(name = "produtoBean")
@ViewScoped
public class ProdutoBean implements Serializable {

	private Produto produto = new Produto();

	public void grava() {

		System.out.println("Gravando produto no banco de dados ... ");
		System.out.println("Nome: " + this.produto.getNome());
		System.out.println("Descrição: " + this.produto.getDescricao());
		System.out.println("Preço: " + this.produto.getPreco());

		this.produto = new Produto(); // limpando os campos

	}

	public Produto getProduto() {
		return this.produto;
	}
}
