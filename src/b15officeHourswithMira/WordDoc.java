package b15officeHourswithMira;

public class WordDoc extends MicrosoftDocument {
    final static String  EXTENSION = ".doc"; //TODO check if we can use super
    public WordDoc(String name){
        super.name = name+EXTENSION;
        System.out.println("WordDoc constructor is executed");
    }
    @Override
    public void objective() {
        System.out.println("The purpose of Word doc is to create text doc");
    }
}
