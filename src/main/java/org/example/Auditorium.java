package org.example;

import org.springframework.stereotype.Component;

@Component
public class Auditorium {
    public void turnOnLights() {
        System.out.println("turnOnLights()");
    }
    public void turnOffLights() {
        System.out.println("turnOffLights");
    }
}
