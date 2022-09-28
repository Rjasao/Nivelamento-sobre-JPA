package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();//inicial p savar no Bco de dados
		
		Pessoa p = em.find(Pessoa.class, 5);//acessa dados
		
		em.remove(p);
		
		em.getTransaction().commit();//concluir salvamento
		
		System.out.println("Pronto");
		emf.close();
		em.close();
	}

}
