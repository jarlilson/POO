/**
 * Diego Enrique da Silva Lima - 202003556
 * Léia Santos Costa - 202003585
 * Pedro Paulo Pereira Souza - 202103770
 * Gilberto dos Reis Alves - 202000179
 * Jarlilson Guajajara Santos - 202003579
 */

package TDF;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEvento {
    List<User> users;

    public GerenciadorEvento() {
       this.users = new ArrayList<User>();
    }

    public void inscrever(User user) {
	    this.users.add(user);
    	user.inscrito();   		
    }

    public void desinscrever(User user) {
    	if (users.contains(user)){
    		this.users.remove(user);
    		user.desinscrito();
    	}
    	else {
	    System.err.println("Usuario "+ user.getServico()+ " inexistente.");
	    System.exit(-1);    
    	}
    }

    public void notificar(int edicao) {
        for (Listener listener : users) {
            listener.update(edicao);
        }
    }
}


