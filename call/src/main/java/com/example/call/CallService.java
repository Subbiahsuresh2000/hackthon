package com.example.call;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CallService {

    @Autowired
    private CallRepository callRepository;

    // Create or Update Call
    public Call saveOrUpdateCall(Call call) {
        return callRepository.save(call);
    }

    // Get All Calls
    public List<Call> getAllCalls() {
        return callRepository.findAll();
    }

    // Get Call by ID
    public Optional<Call> getCallById(String callId) {
        return callRepository.findById(callId);
    }

    // Delete Call by ID
    public void deleteCall(String callId) {
        callRepository.deleteById(callId);
    }
}
