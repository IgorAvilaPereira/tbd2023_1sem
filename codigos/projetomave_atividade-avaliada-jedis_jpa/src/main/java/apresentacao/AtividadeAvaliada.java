/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package apresentacao;

import negocio.Pessoa;
import java.util.UUID;
import redis.clients.jedis.Jedis;

/**
 *
 * @author iapereira
 */
public class AtividadeAvaliada {

    public static void main(String[] args) {
        Jedis jedis = new Jedis();
//        jedis.set("renan", new Pessoa("Igor", "Pereira").toString());

        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());

        String vet[] = jedis.get("renan").split(";");
        Pessoa renan = new Pessoa(vet[0], vet[1]);
        System.out.println("nome:"+renan.getNome());
    }
}
