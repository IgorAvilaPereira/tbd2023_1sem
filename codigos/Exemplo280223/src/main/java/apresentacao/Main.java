/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package apresentacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import negocio.Dependente;
import negocio.Endereco;
import negocio.Pessoa;
import negocio.Trabalho;

/**
 *
 * @author iapereira
 */
public class Main {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MeuPU");
    

    public static void main(String[] args) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        Pessoa igor = new Pessoa();
        Endereco e = new Endereco();
        e.setBairro("BGV");
        e.setRua("Alfredo huch");
        e.setNumero("678");
        e.setComplemento("sala dos professores da d.c");
        igor.setNome("Igor");
        igor.setEndereco(e);
        Dependente marcio = new Dependente();
        marcio.setNome("Marcio");
        Dependente vinicius = new Dependente();
        vinicius.setNome("Vinicius");
        em.persist(e);
        igor.getDependentes().add(marcio);
        marcio.setPessoa(igor);
        igor.getDependentes().add(vinicius);
        vinicius.setPessoa(igor);       
        em.persist(igor);
        em.persist(marcio);
        em.persist(vinicius);        
        em.getTransaction().commit();
        
        em.getTransaction().begin();
        Pessoa igorPessoa = em.find(Pessoa.class, igor.getId());
        Trabalho trabalho = new Trabalho();
        trabalho.setNome("trabalho");
        trabalho.getPessoas().add(igorPessoa);
        igorPessoa.getTrabalhos().add(trabalho);
        em.persist(trabalho);
        em.merge(igorPessoa);
        em.getTransaction().commit();
        em.close();
        
        
        
    }
}
