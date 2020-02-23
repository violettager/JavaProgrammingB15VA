package day53_review_poly_intro;

public class MacPro extends AppleDevice implements Codeable {
    String model;
    @Override
    public void use() {
        System.out.println("Using "+name +""+model+ " to learn java, code and search...");
    }

    @Override
    public void code() {
        System.out.println(name+""+model+ " is able to code Java in Intellij...");
    }
    public void useServer(){
        System.out.println(name+""+model+ " using as application server ...");
    }
}
