package day51_abstraction.Interfaces;

public class PingPong implements Sport {
    @Override
    public void practice() {
        System.out.println("Ping Pong practice during class break...");
    }

    @Override
    public void compete(String type) {
        System.out.println();
    }
}
