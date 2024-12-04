package com.example.call;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/calls")
public class CallController {

    @Autowired
    private CallService callService;

    // Create or Update Call
    @PostMapping
    public ResponseEntity<Call> createOrUpdateCall(@RequestBody Call call) {
        Call savedCall = callService.saveOrUpdateCall(call);
        return new ResponseEntity<>(savedCall, HttpStatus.CREATED);
    }

    // Get All Calls
    @GetMapping
    public ResponseEntity<List<Call>> getAllCalls() {
        List<Call> calls = callService.getAllCalls();
        return new ResponseEntity<>(calls, HttpStatus.OK);
    }

    // Get Call by ID
    @GetMapping("/{id}")
    public ResponseEntity<Call> getCallById(@PathVariable("id") String id) {
        Optional<Call> call = callService.getCallById(id);
        return call.map(c -> new ResponseEntity<>(c, HttpStatus.OK))
                  .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Delete Call by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCall(@PathVariable("id") String id) {
        callService.deleteCall(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Update Call by ID
    @PutMapping("/{id}")
    public ResponseEntity<Call> updateCall(@PathVariable("id") String id, @RequestBody Call call) {
        Optional<Call> existingCall = callService.getCallById(id);
        if (existingCall.isPresent()) {
            call.setCallId(id);
            Call updatedCall = callService.saveOrUpdateCall(call);
            return new ResponseEntity<>(updatedCall, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
