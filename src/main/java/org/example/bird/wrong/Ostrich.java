package org.example.bird.wrong;

public class Ostrich extends Bird{

    @Override
    public String fly() {
        try {
            throw new Exception("Ostrich don't fly");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String chirp() {
        return super.chirp();
    }

}
