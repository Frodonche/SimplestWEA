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
 * @author cirstea
 */
@Stateless
@LocalBean
public class Greeting {

    public String greet(String name) {
        return "Hello " + name;
    }

}