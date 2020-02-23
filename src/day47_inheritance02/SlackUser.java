package day47_inheritance02;

public class SlackUser {
    String name;
    String status;

    public void sendMessage(String msg){
        System.out.println("SlackUser "+status +" ["+name+"] is typing... "+ msg);
    }
    public void callSomeone(){
        System.out.println("SlackUser "+status +" ["+name+"] is calling...");
    }
    public void addEmoji(String emoji){
        System.out.println("SlackUser "+status +" ["+name+"] is adding emoji "+emoji);
    }


}
