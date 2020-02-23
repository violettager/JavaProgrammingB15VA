package b15officeHourswithMira;

public class TestPolymorphism {
    public static void main(String[] args) {
        ExcelDoc exl  = new ExcelDoc("recruiterCalls");
        Student st1 = new Student("Martha");
        st1.sendFile("accounting@gmail.com",exl);

    }
}
