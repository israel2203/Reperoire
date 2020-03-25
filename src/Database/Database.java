/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Contact;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author israel
 */

public class Database {
    List<Contact> contacts;
    public Database(){
        contacts= new ArrayList<>();
        
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
    public Contact getContactByName(String name){
        Contact contact= new Contact();
        for(int i=0;i<contacts.size();i++){
            if(name.equals(contacts.get(i).getNom())){
             contact= contacts.get(i);
            }
        }
        return contact;    
    }
    public void DeleteContact(String name){
        for(int i=0;i<contacts.size();i++){
            if(name.equals(contacts.get(i).getNom())){
                contacts.remove(i);
            }
            else{
                System.out.println("le nom entre n'existe pas dans le repertoire");
            }
        }
}
}