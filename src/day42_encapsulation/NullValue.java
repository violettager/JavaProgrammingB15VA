package day42_encapsulation;

public class NullValue {
    //instance variables
    private String name;


    public String getName() {
        return name;

    }

    public void setName(String name) {//violetta

        this.name = name;
    }

    public static void main(String[] args) {
        //local variables

        NullValue nAME= new NullValue();
        nAME.setName("violetta");
        System.out.println(nAME.getName());
        String name = nAME.getName();
        System.out.println("name = " + name);


    }
}
