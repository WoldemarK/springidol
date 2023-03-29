package org.example;

import org.springframework.stereotype.Component;

@Component
public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }

    public void setBeanBags(int beanBags) {
        this.beanBags = beanBags;
    }
}
