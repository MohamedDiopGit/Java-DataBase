import javax.naming.InitialContext;
import javax.naming.NamingException;

import biblio.IGestionLivre;

public class Client {  // Client to communicate with the server
    
    public static void main(String[] args){
        try{
            InitialContext initContext = new InitialContext();
            IGestionLivre iGL = (IGestionLivre) initContext.lookup("biblio.IGestionLivre");
            // iGL.nouveauLivre("555","Adventure of You");
            iGL.supprimerLivre("444");
        }
        catch (NamingException e ){
            System.out.println(e.getMessage());
        }
    }
    
}


