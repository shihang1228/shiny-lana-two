package com.baldurtech.contact;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {
    public List<Contact> getAllContacts() {
        List<Contact> contactList = new ArrayList<Contact>();
        Contact contact = new Contact();       
        contact.setName("shihang");
        contact.setMobile("15235432994");
        contact.setHomeAddress("shanxi");
        contact.setVpmn("652994");
         
        Contact contact2 = new Contact();
        contact2.setName("xiaobai");
        contact2.setMobile("18235433333");
        contact2.setHomeAddress("taiyuan");
        contact2.setVpmn("655555");
         
        contactList.add(contact);
        contactList.add(contact2);
        return contactList;
    } 
}