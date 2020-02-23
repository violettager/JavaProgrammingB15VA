package day53_review_poly_intro;

public class AppleStore {
    public static void main(String[] args) {
        AppleWatch iwatch  = new AppleWatch();

        iwatch.name = "AppleWatch";
        iwatch.use();
        iwatch.series = 5;
        iwatch.wear();
        iwatch.countSteps();
        System.out.println("--------------------------");
        Iphone phone = new Iphone();
        phone.name = "Iphone ";
        phone.model = "11 Pro";
        phone.use();
        phone.code();
        phone.wear();
        phone.navigate();
        System.out.println("---------------------------");
        MacPro mac = new MacPro();
        mac.name = "MacBook ";
        mac.model = "Pro";
        mac.use();
        mac.code();
        mac.useServer();
        System.out.println(mac.hashCode());



    }
}
