package com.sos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.redis.core.StringRedisTemplate;

@RestController
@RequestMapping("/gesture")
public class GestureController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @PostMapping
    public String receiveGesture(@RequestBody String gesture) {

        redisTemplate.opsForList().leftPush("gestures", gesture);

        return "Gesture saved";
    }
}