package com.example.call;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "calls")
public class Call {

    @Id
    private String callId;
    private String subject;
    private String direction;
    private String callStatus;
    private String startTime;
    private String duration;
    private String ticket;
    private String contactName;
    private String priority;
    private String callOwner;
    private String description;

    // Constructors
    public Call() {}

    public Call(String callId, String subject, String direction, String callStatus, String startTime, 
                String duration, String ticket, String contactName, String priority, String callOwner, 
                String description) {
        this.callId = callId;
        this.subject = subject;
        this.direction = direction;
        this.callStatus = callStatus;
        this.startTime = startTime;
        this.duration = duration;
        this.ticket = ticket;
        this.contactName = contactName;
        this.priority = priority;
        this.callOwner = callOwner;
        this.description = description;
    }

    // Getters and Setters
    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(String callStatus) {
        this.callStatus = callStatus;
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

    public String getCallOwner() {
        return callOwner;
    }

    public void setCallOwner(String callOwner) {
        this.callOwner = callOwner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
