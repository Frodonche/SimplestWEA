/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import firststeps.Compliment;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author cirstea
 */
@Named(value = "best")
@RequestScoped
public class Best {

    @Inject 
    Compliment compliment;

    private String name;
   
    /**
     * Creates a new instance of Hello
     */
    public Best() {
        name = "Toto";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; 
    }

    public String sayBest() {
        System.out.println("Name = "+name);  
        return compliment.sayCompliment(name);  
    }
    
    public String greet() {
        return "best"; 
    }
}