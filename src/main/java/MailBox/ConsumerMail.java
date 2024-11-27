package MailBox;

import java.util.Random;

public class ConsumerMail implements Runnable{
    MailBox mailBox;

    public ConsumerMail(MailBox mailBox){
        this.mailBox=mailBox;
    }
    @Override
    public void run() {
        Random rm = new Random();
        while (true){
            String val= mailBox.getMsn();
            System.out.println("Soy "+Thread.currentThread().getName()+"y he recogido el mensaje: "+val);

            try {
                Thread.sleep(rm.nextInt(0,100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
