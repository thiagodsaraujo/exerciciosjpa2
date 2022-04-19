package teste.basic;

import model.basic.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.basic.Usuario;

public class NovoUsuario {

    public static void main(String[] args) {
        /**
         * O ententimanager é responsavel por
         * inserir, editar, excluir, consultar uma entidade
         * vai fazer o crud, a interação com o bd através
         * de comandos sql
         * Abaixo criamos uma fabrica de gerentes de entidades
         * e passamos as informações do bd onde ele fará as interações
         * se tiver mais um bd terá que ter um novo entmanager
         */

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("projeto-jpa");
        EntityManager em = emf.createEntityManager();


        // criar um método que vai persistir essa informação no bd

        Usuario novoUsuario = new Usuario("Thiago", "email@email.com");
        novoUsuario.setId(1L);
        em.persist(novoUsuario);

        em.close();
        emf.close();



    }
}
