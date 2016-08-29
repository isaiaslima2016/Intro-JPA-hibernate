package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.modelo.Cliente;

public class ConsultandoPrimeiroObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		// consultando
		// usando o Find(mais simples)
		Cliente cliente = em.find(Cliente.class, 1l); // passo a entidade
														// primeiro, depois a
														// PK(codigo, id,
														// referencia) que
														// defini na classe.

	System.out.println("Código do cliente: "+cliente.getCodigo()+ "  Nome :"+cliente.getNome() );
	}

}
