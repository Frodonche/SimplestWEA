/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coucou;

import javax.ejb.Local;

/**
 *
 * @author guillaume
 */
@Local
public interface Compliment {
    public String sayCompliment(String s);
}
