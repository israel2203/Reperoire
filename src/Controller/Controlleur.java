/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import Model.Contact;
import View.Repertoire;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author israel
 */
public class Controlleur implements ActionListener {

    private Database database;
    private Repertoire fenetre;
    private AbstractListModel nouveauModel;
    private ListSelectionListener listSelectionListener;

    public Controlleur(Repertoire fenetre) {
        //TESTE//
        listSelectionListener = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                valueChangedList();
            }
        };
        //TESTE//
        
        this.fenetre = fenetre;
        this.fenetre.setVisible(true);
        this.database = new Database();
        this.fenetre.getButton_Nouveau().addActionListener(this);
        this.fenetre.getButton_Supprimer().addActionListener(this);
        //this.fenetre.getAffichage().addActionListener(this);
        this.fenetre.getListe().addListSelectionListener(listSelectionListener);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == fenetre.getButton_Nouveau()) {
            String nom;
            long tel_num;
            String email;
            String type;
            String[] Options = {"Famille", "Ecole", "Bussines",};
            nom = JOptionPane.showInputDialog("entrer le nom du nouveau contact ");
            tel_num = Long.parseLong(JOptionPane.showInputDialog("entrer le numero de telphone du nouveau contact "));
            email = JOptionPane.showInputDialog("entrer l'email du nouveau contact ");
            type = String.valueOf(JOptionPane.showInputDialog(fenetre, "Quel est le type du contact?", "Type", 0, null, Options, 0));
              
            Contact contact = new Contact(nom, tel_num, email, type);
            contact.setType(type);
            database.getContacts().add(contact);
            this.fenetre.getjLabel2().setText(contact.toString());
            //Actualiser la liste de contact
            String[] noms = new String[database.getContacts().size()];
            //Recuperer les noms de la liste de contact
            for (int i = 0; i < database.getContacts().size(); i++) {
                noms[i] = database.getContacts().get(i).getNom();

            }

            AbstractListModel nouveauModel = new AbstractListModel<String>() {
                String[] strings = noms;
                @Override
                public int getSize() {
                    return strings.length;
                }
                @Override
                public String getElementAt(int i) {
                    return strings[i];
                }
            };
            this.fenetre.getListe().setModel(nouveauModel);
            
        }
        if(e.getSource() == fenetre.getButton_Supprimer()){
            String Selectioner;
            Selectioner= JOptionPane.showInputDialog("entrer le nom que vous voulez supprimer");
            database.DeleteContact(Selectioner);
            
            
        }

}
    private void valueChangedList(){
            String nomSelectioner= fenetre.getListe().getSelectedValue();
            Contact contact= database.getContactByName(nomSelectioner);
            this.fenetre.getjLabel2().setText(contact.toString());
    }
}