package b15officeHourswithMira;

public class ExcelDoc extends MicrosoftDocument{
    final static String  EXTENSION = ".xls";
    public ExcelDoc(String name){
        super.name = name+EXTENSION;
        System.out.println("ExelDoc constructor is executed");
    }
    @Override
    public void objective() {
        System.out.println("The purpose of ExelDoc doc is to create tables");
    }
}
