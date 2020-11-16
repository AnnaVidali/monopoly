/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package information;

import java.util.Hashtable;

/**
 *
 * @author anna
 */
public class Cards {
    private String name;
    private Hashtable<Integer,String> idDescription = new Hashtable<Integer,String>();

    public Cards(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, Hashtable idDescription) {
        this.name = name;
        this.idDescription = idDescription;
    }

    public Hashtable<Integer, String> getIdDescription() {
        return idDescription;
    }

    public void setIdDescription(Hashtable<Integer, String> idDescription) {
        this.idDescription = idDescription;
    }
    
    
    
}
