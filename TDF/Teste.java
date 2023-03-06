/**
 * Diego Enrique da Silva Lima - 202003556
 * Léia Santos Costa - 202003585
 * Pedro Paulo Pereira Souza - 202103770
 * Gilberto dos Reis Alves - 202000179
 * Jarlilson Guajajara Santos - 202003579
 */

package TDF;

public class Teste {
    public static void main(String[] args) {
        Blog blog = new Blog();
        
        User user1 = new User(null);
        User user2 = new User(null);
        
        user1.setServico("email1@example.com");
        blog.events.inscrever(user1); 
        
        user2.setServico("email2@example.com");
        blog.events.inscrever(user2); 
        
        blog.atualizarEdicao();
        
        blog.events.desinscrever(user2);
        
    }
}