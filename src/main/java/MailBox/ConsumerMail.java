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
        int contador=1;
        while (true){
            String val= mailBox.getMsn();
            System.out.println("He recogido el mensaje: "+val);
            contador++;
            try {
                Thread.sleep(rm.nextInt(0,100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (contador==51){
                break;
            }

        }

    }
}
