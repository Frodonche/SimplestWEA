/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coucou;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author guillaume
 */
@Stateless
@LocalBean
public class ComplimentBean implements Compliment {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    /**
     * @param s
     * @return
     */
    @Override
    public String sayCompliment(String s){
        return("You're the best, "+s);
    }
}
