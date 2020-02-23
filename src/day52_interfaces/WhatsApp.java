package day52_interfaces;

public class WhatsApp extends MessagingApp implements VoiceCallable, VideoCallable{
    @Override
    public void sendMessage(String msg) {
        System.out.println("WhatsApp sending message - "+msg+" ...");

    }

    @Override
    public void videoCall() {
        System.out.println("WhatsApp is making video call with Nadir ...");

    }

    @Override
    public void call(String contact) {
        System.out.println("WhatsApp is calling  - "+contact+" ...");

    }
}
