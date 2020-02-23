package day51_abstraction.student;

public class CampusStudent extends Student {
    @Override
    public void attendClass() {
        System.out.println("CampusStudent attending class in Campus...");
    }
    public void playPingPong(){
        System.out.println("CampusStudent plays PingPong in the campus...");
    }
}
