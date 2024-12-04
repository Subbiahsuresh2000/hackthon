package com.example.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    // Create or Update Contact
    @PostMapping
    public ResponseEntity<Contact> createOrUpdateContact(@RequestBody Contact contact) {
        Contact savedContact = contactService.saveOrUpdateContact(contact);
        return new ResponseEntity<>(savedContact, HttpStatus.CREATED);
    }

    // Get All Contacts
    @GetMapping
    public ResponseEntity<List<Contact>> getAllContacts() {
        List<Contact> contacts = contactService.getAllContacts();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    // Get Contact by ID
    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable("id") String id) {
        Optional<Contact> contact = contactService.getContactById(id);
        return contact.map(c -> new ResponseEntity<>(c, HttpStatus.OK))
                      .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Delete Contact by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable("id") String id) {
        contactService.deleteContact(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Update Contact by ID
    @PutMapping("/{id}")
    public ResponseEntity<Contact> updateContact(@PathVariable("id") String id, @RequestBody Contact contact) {
        Optional<Contact> existingContact = contactService.getContactById(id);
        if (existingContact.isPresent()) {
            contact.setContactId(id);
            Contact updatedContact = contactService.saveOrUpdateContact(contact);
            return new ResponseEntity<>(updatedContact, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
