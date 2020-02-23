package day41_encapsulation;

public class Elevator {
    /*
     currentFloor
 0,1,2,3,4,5,6
     Method:
     gotoFloor(newFloor)
     test if within range
     currentFloor -> 2
     newFloor -> 5
     going up to floor 3
     going up to floor 4
     going up to floor 5
     currentFloor -> 3
     newFloor -> 0
     going down to floor 2
     going down to floor 1
     going down to floor 0
     currentFloor -> 3
     newFloor -> 3
     you are already in floor 3 */
    int currentFloor; //0 is default
    //newFloor -> 3
    public void gotoFloor(int newFloor){
        //check if newFloor is out of range
        if (newFloor < 0 || newFloor > 6){
            System.out.println("ERROR: Wrong floor selected : " + newFloor);
            return; //exit method
        }

        if(newFloor > currentFloor){
            for (int i = currentFloor+1; i <= newFloor; i++) {
                System.out.println("going up to floor " + i);
            }
        }else if (newFloor < currentFloor){
            for (int i = currentFloor - 1; i >= newFloor ; i--) {
                System.out.println("going down to floor " + i);
            }
        }else if(currentFloor == newFloor){
            System.out.println("WARNING: You are already in floor " + newFloor);
        }
        currentFloor=newFloor;

    }
}
