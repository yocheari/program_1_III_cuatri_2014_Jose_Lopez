/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase6;

/**
 *
 * @author Jose David
 */
public class Ejercicio1 {

    Ejercicio1(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean ValidarCorrreo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class ejercicio1 {
    
    private String email;
        
    public ejercicio1(String pEmail)
    {
        this.email=pEmail;
    }
    
    public String ValidarCorrreo()
    {
        String mensaje="El correo no contiene @";
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)=='@')
            {
                mensaje="El correo si contiene @";
            }            
        }
        return mensaje;         
    }    
}
    
    
}
