package org.example;

import org.springframework.stereotype.Component;

@Component
public class PoeticJuggler extends Juggler {
    private final Poem poem;

    public PoeticJuggler(Poem poem) {
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public void perform() {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
