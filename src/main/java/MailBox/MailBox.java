package MailBox;

public class MailBox {
    String message;
    Boolean avaliable=false;


    public synchronized void putMsn(String message){
        while (avaliable){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.message=message;
        avaliable=true;
        notifyAll();

    }

    public synchronized String getMsn(){
        while (!avaliable){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        avaliable=false;
        notifyAll();
        return this.message;
    }
}
