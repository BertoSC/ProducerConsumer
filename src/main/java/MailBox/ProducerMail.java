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
        int contador=1;
        while(true){
            String msn= "Mensaje random número: "+contador;
            System.out.println(msn);
            mailBox.putMsn(msn);
            contador++;
            try {
                Thread.sleep(rm.nextInt(0, 100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (contador == 51){
                break;
            }
        }
    }
}
