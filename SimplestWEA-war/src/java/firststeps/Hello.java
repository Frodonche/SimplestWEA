/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firststeps;

import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author cirstea
 */
@Named(value = "hello")
@RequestScoped
public class Hello {

    @Inject 
    Greeting greet;

    private String name;
   
    /**
     * Creates a new instance of Hello
     */
    public Hello() {
        name = "Toto";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; 
    }

    public String sayHello() {
        System.out.println("Name = "+name);  
        return greet.greet(name);  
    }
    
    public String greet() {
        return "hello"; 
    }
}
