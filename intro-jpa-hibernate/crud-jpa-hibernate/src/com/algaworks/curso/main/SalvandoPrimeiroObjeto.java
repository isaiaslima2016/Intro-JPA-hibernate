package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.modelo.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) {

		//Fabrica de EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		
		//Gerenciador de entidades.
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Pedro Bial");
		cliente.setIdade(40);
		cliente.setProfissao("Jornalista");
		cliente.setSexo("M");
		
		em.getTransaction().begin(); // começando a atualizar o banco.
		em.persist(cliente);
		em.getTransaction().commit(); // salvando.
		System.out.println("Cliente Salvo com sucesso");
		//em.close();
		
	}

}
