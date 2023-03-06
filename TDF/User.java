/**
 * Diego Enrique da Silva Lima - 202003556
 * Léia Santos Costa - 202003585
 * Pedro Paulo Pereira Souza - 202103770
 * Gilberto dos Reis Alves - 202000179
 * Jarlilson Guajajara Santos - 202003579
 */

package TDF;

public class User implements Listener {
    private String servico;
    
    public User(String servico) { //Para criar usuários de teste
    	this.servico = servico;
    }

    public String getServico() {
    	return this.servico;
    }
    
    public void setServico(String servico) {
    	this.servico = servico;
    }

    @Override
    public void update(int edicao) {
        System.out.println("Para " + this.servico + ": A edicao " + edicao + " ja chegou!!!\n");
    }

	@Override
	public void inscrito() {
		 System.out.println( "Para "+ this.servico + ": Voce esta inscrito na nossa newsletters. Bem Vindo!!!\n");
	}

	@Override
	public void desinscrito() {
		System.out.println( "Para "+ this.servico + ": Uma pena nao ter mais voce conosco :( \n");
	}
}