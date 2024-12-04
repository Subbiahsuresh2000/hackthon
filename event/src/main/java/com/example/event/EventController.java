package com.example.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    // Create or Update Event
    @PostMapping
    public ResponseEntity<Event> createOrUpdateEvent(@RequestBody Event event) {
        Event savedEvent = eventService.saveOrUpdateEvent(event);
        return new ResponseEntity<>(savedEvent, HttpStatus.CREATED);
    }

    // Get All Events
    @GetMapping
    public ResponseEntity<List<Event>> getAllEvents() {
        List<Event> events = eventService.getAllEvents();
        return new ResponseEntity<>(events, HttpStatus.OK);
    }

    // Get Event by ID
    @GetMapping("/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable("id") String id) {
        Optional<Event> event = eventService.getEventById(id);
        return event.map(e -> new ResponseEntity<>(e, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Delete Event by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable("id") String id) {
        eventService.deleteEvent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Update Event by ID
    @PutMapping("/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable("id") String id, @RequestBody Event event) {
        Optional<Event> existingEvent = eventService.getEventById(id);
        if (existingEvent.isPresent()) {
            event.setEventId(id);
            Event updatedEvent = eventService.saveOrUpdateEvent(event);
            return new ResponseEntity<>(updatedEvent, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
