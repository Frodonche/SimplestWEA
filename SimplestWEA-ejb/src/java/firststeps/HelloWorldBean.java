/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firststeps;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author guillaume
 */
@Stateless
@LocalBean
public class HelloWorldBean implements HelloWorld{

    @Override
    public String sayHello(String s) {
        System.out.println("Bonjour "+s);
        return ("Bonjour "+s);
    }
    
    @Override
    public String sayHello(String l, String s){
        String toReturn = "l = "+l+" ";
        
        if(l.equals("fr"))
            toReturn += "Bonjour "+s;
        else if(l.equals("de"))
            toReturn += "Guten Tag "+s;
        else
            toReturn += "Hello "+s;
        
        System.out.println(toReturn);
        return toReturn;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
