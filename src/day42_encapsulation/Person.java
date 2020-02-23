package day42_encapsulation;

/*
name cannot be empty
age can only be 0-120
 */
public class Person {
    private String name; //null
    private int age;//0

    //getter/setter for name
    //read only
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        if (newAge > 0 && newAge < 120) {
            age = newAge;
        } else {
            System.out.println("ERROR: Invalid age: " + newAge);
        }

    }
    //setter - write only
    public void setName(String newName) {
        if (!newName.isEmpty()) {
            name = newName;
        } else {
            System.out.println("ERROR: name cannot be empty");
        }

    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
