package b15officeHourswithMira;

public class PowerPointDoc extends MicrosoftDocument {
    final static String  EXTENSION = ".ppt";
    public PowerPointDoc(String name){
        super.name = name+EXTENSION;
        System.out.println("PowerPoint constructor is executed");
    }
    @Override
    public void objective() {
        System.out.println("The purpose of power point is to create presentation");
    }
}
