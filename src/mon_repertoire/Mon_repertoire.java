/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mon_repertoire;

import Controller.Controlleur;
import View.Repertoire;


/**
 *
 * @author israel
 */  
public class Mon_repertoire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Repertoire fenetre= new Repertoire();
            Controlleur Controler = new Controlleur(fenetre);
    }
    
}
