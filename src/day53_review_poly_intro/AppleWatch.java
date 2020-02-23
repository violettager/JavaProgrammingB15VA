package day53_review_poly_intro;

public class AppleWatch extends AppleDevice implements Wearable {

    public int series;
    @Override
    public void use() {
        System.out.println("Apple Watch  - using to check time, heart rate , exercise, applePay... ");
    }

    @Override
    public void wear() {
        System.out.println("AppleWatch - wear on wrist, neck...");
    }

    public void countSteps(){
        System.out.println("AppleWatch  - counting steps...");
    }
}
