package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;

import com.algaworks.curso.modelo.Cliente;

public class AtualizandoPrimeiroObjeto{

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		Cliente cliente = em.find(Cliente.class, 1l);
		em.getTransaction().begin();
		cliente.setIdade(26);
		cliente.setNome("José da Silva Pereira");
		em.getTransaction().commit();
		
		System.out.println("Cliente atualizado com sucesso.");
	}

}
