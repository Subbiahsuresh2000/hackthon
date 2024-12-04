package com.example.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    // Create or Update Event
    public Event saveOrUpdateEvent(Event event) {
        return eventRepository.save(event);
    }

    // Get All Events
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    // Get Event by ID
    public Optional<Event> getEventById(String eventId) {
        return eventRepository.findById(eventId);
    }

    // Delete Event by ID
    public void deleteEvent(String eventId) {
        eventRepository.deleteById(eventId);
    }
}
