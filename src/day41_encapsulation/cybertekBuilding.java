package day41_encapsulation;

public class cybertekBuilding {
        public static void main(String[] args) {
            Elevator elevator1= new Elevator();
            elevator1.gotoFloor(3);
            System.out.println("-----------------------");
            elevator1.gotoFloor(6);
            System.out.println("-----------------------");
            elevator1.gotoFloor(2);
            System.out.println("-----------------------");
            elevator1.gotoFloor(2);
            System.out.println("-----------------------");
            elevator1.gotoFloor(7);
        }
    }

