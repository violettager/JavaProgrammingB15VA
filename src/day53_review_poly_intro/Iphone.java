package day53_review_poly_intro;

public class Iphone extends AppleDevice implements Wearable, Codeable {
    String model;
    @Override
    public void use() {
        System.out.println("Using "+name +""+model+ " to call,text, play...");
    }

    @Override
    public void code() {
        System.out.println(name+ " is also is able to code...");
    }

    @Override
    public void wear() {
        System.out.println(" we  can wear "+name+""+model+" on our wrist while running...");
    }
    public void navigate(){
        System.out.println(" You can navigate through " + name+""+model);

    }
}
