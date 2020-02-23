package day16_memory_string_While_loop_intro;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [John dua], From Number<2024331234>, Message:{Hey, what's up! Let's code some java:)}";
        String sender = "";
        String FromNumber = "";
        String text = "";


        System.out.println(message.substring(message.indexOf("[")+1,message.indexOf("]")));
       // sender = message.substring(message.indexOf("[")+1,message.indexOf("]"));
        System.out.println("sender = " + sender);
        FromNumber = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("from number = "+ FromNumber);
        message = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("message = " + message);


    }
}
