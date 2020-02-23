package day51_abstraction.student;

public  class CalambaStudent extends ExchangeStudent {
    @Override
    public void getVisa() {
        System.out.println("CalambaStudent - go to US embassy for f1 visa...");
    }

    @Override
    public void attendClass() {
        System.out.println("CalambaStudent - attending classes in campus...");

    }
}
