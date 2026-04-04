package com.sos;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class GestureController {

    @PostMapping("/gesture")
    public Map<String,String> detect(@RequestBody Map<String,String> body){

        String gesture = body.get("gesture");

        Map<String,String> response = new HashMap<>();

        if(gesture.equalsIgnoreCase("wave")){
            response.put("validation","Gesture valid");
            response.put("pattern","SOS pattern detected");
            response.put("alert","Emergency alert triggered");
        }else{
            response.put("validation","Invalid gesture");
        }

        return response;
    }
}