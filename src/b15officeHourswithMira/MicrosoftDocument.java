package b15officeHourswithMira;

public abstract class MicrosoftDocument {
    /*
    Create 3 subclasses
WordDoc
ExcelDoc
PowerPointDoc
declare instance var: final String extention
in each of them add constractor which will take
String name and assign it to instance name including the file extension ex: FileName.doc
override objective method and just print
the purpose of the Document
Create another class Student
 create a method sendFile which will take
 2 args (email, document to be send)
 inside the method print the name of the doc,
 objective of the doc,
  and where are we sending it.
     */
    String name;
    public MicrosoftDocument(){
        System.out.println("MicrosoftDocument constructor is executed...");
    }


    public abstract void objective();

}

