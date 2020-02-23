package day47_inheritance02.AnotherPackage;
import day47_inheritance02.App;
public class AppTestDifferentPackage_Non_ChildClass {
    public static void main(String[] args) {
        App app = new App();
        app.name = "Evernote";
       // app.developer = "Evernote LLC"; not visible to non-subclass in different package
       // app.system = "iOS, Android, Google"; visible only in same package
        //app.price = 22.99; private visible only in same class
    }

}
