/**
 * Diego Enrique da Silva Lima - 202003556
 * Léia Santos Costa - 202003585
 * Pedro Paulo Pereira Souza - 202103770
 * Gilberto dos Reis Alves - 202000179
 * Jarlilson Guajajara Santos - 202003579
 */

package TDF;

public class Blog {
    public GerenciadorEvento events;
    static int edicao = 1;

    public Blog() {
        this.events = new GerenciadorEvento();
    }
    
    public void atualizarEdicao() {
    	Blog.edicao += 1;
        events.notificar(Blog.edicao);
    }
}
