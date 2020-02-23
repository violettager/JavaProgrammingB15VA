package day43_constructor;

public class pet {
    private String type;
    private String name;
    public pet(){
        type="nothing";
        name="nothing";
    }
    public pet(String type,String name){
        this.type=type;
        this.name=name;
    }
    //Getter for Type
    public String getType(){
        return type;
    }
    //setter for Type
    public void setType(String type){
        this.type=type;
    }
    //getter for Name
    public String getName(){
        return name;
    }
    //setter for Name
    public void setName(String name){
        this.name=name;
    }
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public void setPetInfo(String type, String name){
        this.type=type;
        this.name=name;
    }
    public void speak(){
        System.out.print(name+" is saying -->");
        switch (type){
            case"dog":
                System.out.println("jav jav");
                break;
            case"cat":
                System.out.println("meow meow");
                break;
            case"fish":
                System.out.println("...");
                break;
            case"bird":
                System.out.println("twit twit");
                break;
            case"lion":
                System.out.println("roar roar");
                break;
            default:
                System.out.println("java java");
        }
    }
}
