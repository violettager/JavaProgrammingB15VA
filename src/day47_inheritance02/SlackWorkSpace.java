package day47_inheritance02;

public class SlackWorkSpace {
    public static void main(String[] args) {
        SlackUser s1 = new SlackUser();
        s1.name = "Catalina";
        s1.status = "Student";
        s1.sendMessage("hello");
        s1.callSomeone();
        s1.addEmoji("^-^");
        System.out.println();
        System.out.println();
        SlackAdminUser a1 = new SlackAdminUser();
        a1.name = "Murodil";
        a1.status = "teacher";
        a1.sendMessage("java is fun");
        a1.callSomeone();
        a1.addEmoji(":)");
        a1.sendChannelMessage("delete Amir");
        a1.deleteMessage();

    }
}
