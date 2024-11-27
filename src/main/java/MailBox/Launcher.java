package MailBox;

public class Launcher {
    public static void main(String[] args) {
        MailBox mb = new MailBox(); // MailBox compartido entre todos los hilos

        // Crear arrays para los productores y consumidores
        ProducerMail[] producers = new ProducerMail[5];
        ConsumerMail[] consumers = new ConsumerMail[5];
        Thread[] producerThreads = new Thread[5];
        Thread[] consumerThreads = new Thread[5];

        // Inicializar y arrancar los hilos productores
        for (int i = 0; i < 5; i++) {
            producers[i] = new ProducerMail(mb); // Crear un productor asociado al MailBox
            producerThreads[i] = new Thread(producers[i]); // Asociarlo a un hilo
            producerThreads[i].start(); // Iniciar el hilo
        }

        // Inicializar y arrancar los hilos consumidores
        for (int i = 0; i < 5; i++) {
            consumers[i] = new ConsumerMail(mb); // Crear un consumidor asociado al MailBox
            consumerThreads[i] = new Thread(consumers[i]); // Asociarlo a un hilo
            consumerThreads[i].start(); // Iniciar el hilo
        }

        // Esperar a que todos los hilos terminen
        try {
            for (int i = 0; i < 5; i++) {
                producerThreads[i].join(); // Esperar al hilo productor
                consumerThreads[i].join(); // Esperar al hilo consumidor
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e); // Manejo de excepciones en caso de interrupción
        }
    }
}