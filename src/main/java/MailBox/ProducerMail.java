package MailBox;

import java.util.Random;

public class ProducerMail implements Runnable{
    MailBox mailBox;

    public ProducerMail(MailBox mailBox){
        this.mailBox=mailBox;
    }

    @Override
    public void run() {
        Random rm = new Random();

        while(true){
            String msn= "Mensaje random número: "+rm.nextInt(1, 1000);
            System.out.println("Soy "+Thread.currentThread().getName()+"y he generado el "+msn);
            mailBox.putMsn(msn);

            try {
                Thread.sleep(rm.nextInt(0, 100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
