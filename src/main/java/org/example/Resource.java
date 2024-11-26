package org.example;

public class Resource {
    private int content;
    private boolean avaliable=false;

    public synchronized void put(int content){
        // mientras esté algo disponible, no podemos meter nada y le decimos que espere
        while (avaliable){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // aquí llega si es false y seteamos el recurso
        this.content=content;
        avaliable=true;
        notifyAll(); // notificamos a los hilos que ya pueden recuperar
    }

    public synchronized int get(){
         while (!avaliable){
             try {
                 wait();
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
         // si está disponible seteamos el return,
         // decimos que y ano hay recurso y notificamos a los hilos para producir
         avaliable=false;
         notifyAll();
         return this.content;
    }

}
