package com.example.event;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "events")
public class Event {

    @Id
    private String eventId;
    private String subject;
    private String category;
    private String status;
    private String startTime;
    private String duration;
    private String ticket;
    private String contactName;
    private String priority;
    private String eventOwner;
    private String setReminder;
    private String description;

    // Constructors
    public Event() {}

    public Event(String eventId, String subject, String category, String status, String startTime,
                 String duration, String ticket, String contactName, String priority, String eventOwner,
                 String setReminder, String description) {
        this.eventId = eventId;
        this.subject = subject;
        this.category = category;
        this.status = status;
        this.startTime = startTime;
        this.duration = duration;
        this.ticket = ticket;
        this.contactName = contactName;
        this.priority = priority;
        this.eventOwner = eventOwner;
        this.setReminder = setReminder;
        this.description = description;
    }

    // Getters and Setters
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getEventOwner() {
        return eventOwner;
    }

    public void setEventOwner(String eventOwner) {
        this.eventOwner = eventOwner;
    }

    public String getSetReminder() {
        return setReminder;
    }

    public void setSetReminder(String setReminder) {
        this.setReminder = setReminder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
