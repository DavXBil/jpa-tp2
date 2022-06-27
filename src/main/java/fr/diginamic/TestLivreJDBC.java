package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestLivreJDBC {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
    static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {



        em.getTransaction().begin();

        Livre livre = getLivre(1);

        System.out.println(livre);

    }

    public static Livre getLivre(int id) {

        return em.find(Livre.class, id);
    }

}
