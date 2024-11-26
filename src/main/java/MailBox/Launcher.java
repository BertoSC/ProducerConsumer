package MailBox;

public class Launcher {
    public static void main(String[] args) {
        MailBox mb = new MailBox();

        ProducerMail pm = new ProducerMail(mb);
        ConsumerMail cm =  new ConsumerMail(mb);

        Thread thProd = new Thread(pm);
        Thread thCons = new Thread(cm);

        thProd.start();
        thCons.start();

        try {
            thProd.join();
            thCons.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
