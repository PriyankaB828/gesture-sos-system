package com.sos;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class GestureController {

    @PostMapping("/gesture")
    public Map<String, String> detect(@RequestBody Map<String, String> body) {

        String gesture = body.get("gesture");
        Map<String, String> response = new HashMap<>();

        if (gesture == null || gesture.trim().isEmpty()) {
            response.put("validation", "No gesture received");
            response.put("status", "Please send a gesture");
            return response;
        }

        switch (gesture.toLowerCase()) {
            case "wave":
                response.put("validation", "Gesture valid");
                response.put("pattern", "SOS pattern detected");
                response.put("alert", "Emergency alert triggered");
                response.put("status", "DANGER - Help is on the way!");
                break;

            case "thumbsup":
                response.put("validation", "Gesture recognised");
                response.put("pattern", "Safe pattern detected");
                response.put("alert", "No alert needed");
                response.put("status", "SAFE - Person is okay");
                break;

            case "fist":
                response.put("validation", "Gesture recognised");
                response.put("pattern", "Warning pattern detected");
                response.put("alert", "Caution alert sent");
                response.put("status", "WARNING - Needs attention");
                break;

            case "peace":
                response.put("validation", "Gesture recognised");
                response.put("pattern", "All clear pattern");
                response.put("alert", "No alert needed");
                response.put("status", "SAFE - All clear");
                break;

            default:
                response.put("validation", "Invalid gesture");
                response.put("pattern", "No pattern matched");
                response.put("alert", "No alert triggered");
                response.put("status", "NOT RECOGNISED - Try wave, thumbsup, fist or peace");
                break;
        }

        return response;
    }
}