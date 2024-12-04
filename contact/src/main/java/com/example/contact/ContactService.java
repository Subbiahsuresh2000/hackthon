package com.example.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    // Create or Update Contact
    public Contact saveOrUpdateContact(Contact contact) {
        return contactRepository.save(contact);
    }

    // Get All Contacts
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    // Get Contact by ID
    public Optional<Contact> getContactById(String contactId) {
        return contactRepository.findById(contactId);
    }

    // Delete Contact by ID
    public void deleteContact(String contactId) {
        contactRepository.deleteById(contactId);
    }
}
