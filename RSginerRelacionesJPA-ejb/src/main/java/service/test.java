/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Rubén
 */
@Stateless
@LocalBean
public class test {

    public void businessMethod() {
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public String test() {
        return "Hola mundo desde el EJB";
    }

}
