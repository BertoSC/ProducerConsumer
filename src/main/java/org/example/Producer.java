package org.example;

import java.util.Random;

public class Producer implements Runnable{
    private Resource resource;

    public Producer(Resource resource){
        this.resource=resource;
    }

    @Override
    public void run() {
        Random rm = new Random();
        for (int i = 0; i < 20; i++) {
            int num = rm.nextInt(10);
            System.out.println("producer produced "+num);
            resource.put(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
