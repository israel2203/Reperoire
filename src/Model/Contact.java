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
public class Contact {
    private String nom;
    private long telnum;
    private String email;
    private String type;

    public Contact(String nom, long telnum, String email,String type) {
        this.nom = nom;
        this.telnum = telnum;
        this.email = email;
        this.type = type;
    }
    public Contact(){
        
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getTelnum() {
        return telnum;
    }

    public void setTelnum(long telnum) {
        this.telnum = telnum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
      //return "Nom: " + nom +"\n Tel: "+ telnum + "\n Email: "+ email +"\n Type: " + type;
       return "<html>Nom: " + nom +"<br/>Tel: "+ telnum + "<br/>Email: "+ email +"<br/> Type: " + type + "</html>";
    }
   
    
    
}
