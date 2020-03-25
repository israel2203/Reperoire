/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author israel
 */
public class Bussines extends Contact{

    public Bussines(String nom, long telnum, String email,String type) {
        super(nom, telnum, email,type);
        this.setType("Bussines");
    }
    
    
    
    
}
