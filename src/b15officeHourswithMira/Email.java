package b15officeHourswithMira;

public class Email {
    String receiver;
    String cc;
    String subject;
    String body;
    String signature = ""; //null by default
    String date;
    String folderName;
    boolean attachment;

    public void setReceiver(String email) {
        folderName = "Draft";

            if (email.contains("@")) {//first.last@domain.com
                if (email.substring(email.indexOf("@")).contains(".")) {
                    receiver = email;
                } else {
                    System.out.println("Invalid domain extention. Please enter valid email");
                }
            } else {
                System.out.println("email is not valid. please enter valid email");
            }



    }

    public void setCc(String email) {
        do {
            if (email.contains("@")) {//first.last@domain.com
                if (email.substring(email.indexOf("@")).contains(".")) {
                    receiver = email;
                } else {
                    System.out.println("Invalid domain extention. Please enter valid email");
                }
            } else {
                System.out.println("email is not valid. please enter valid email");
            }

        } while (cc == null);

    }

    public void setSubject(String subject_value) {
        subject = subject_value;
    }

    public void setBody(String body_value) {
        body = body_value + "\n" + signature;

    }

    public void setSignature(String signature_value) {
        signature = signature_value;

    }

    public void setDate(String date_value) {
        date = date_value;
    }

    public void setAttachment(boolean attachment_value) {
        attachment = attachment_value;
    }

}
