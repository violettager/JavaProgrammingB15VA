package day47_inheritance02;

public class SlackAdminUser extends SlackUser {
    int admin;

    public void sendChannelMessage(String msg){
        System.out.println("SlackAdmin "+status+" ["+name+"] sending @channel message "+msg);
    }
    public void deleteMessage(){
        System.out.println("SlackAdmin "+status+" ["+name+"] deleting message...");
    }
}
