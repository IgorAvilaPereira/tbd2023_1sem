/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package apresentacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import negocio.PessoaFisica;
import negocio.PessoaJuridica;


/**
 *
 * @author iapereira
 */
public class Main {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MeuPU");
    

    public static void main(String[] args) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        PessoaFisica igor = new PessoaFisica();
        igor.setNome("Igor");
        igor.setCpf("000.000.000-00");
        em.persist(igor);
        
        PessoaJuridica ifinance = new PessoaJuridica();
        ifinance.setNome("ifinance ltda corp.");
        ifinance.setCnpj("0001.889798/00001");
        em.persist(ifinance);
        em.getTransaction().commit();
        
        
        
    }
}
