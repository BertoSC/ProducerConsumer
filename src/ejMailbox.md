## DU2- Exercise 10 - MailBox - wait() and notify()


Suppose we want to implement a synchronized application with a Mailbox class that allows one thread to deposit a message and another thread to pick it up. But, there can only be one message in the mailbox at a time. If a thread tries to deposit a message when there is already one, it must wait until it is collected. And if a thread tries to pick up a message when there is none, it must wait until one is deposited.

After depositing or collecting a message, each thread sleeps for a random time between 0 and 1sec to repeat the cycle again.

First, the application must work with one thread depositing messages and one thread collecting messages.

Finally, the application must run with five threads of each type.

--


Supongamos que queremos implementar una aplicación sincronizada con una clase Buzón que permita a un hilo depositar un mensaje y a otro hilo recogerlo. Pero en el buzón sólo puede haber un mensaje a la vez. Si un hilo intenta depositar un mensaje cuando ya hay uno, debe esperar hasta que se recoja. Y si un hilo intenta recoger un mensaje cuando no hay ninguno, debe esperar hasta que se deposite uno.

Después de depositar o recoger un mensaje, cada hilo duerme durante un tiempo aleatorio entre 0 y 1seg para volver a repetir el ciclo.

Primero, la aplicación debe funcionar con un hilo depositando mensajes y otro recogiendo mensajes.

Finalmente, la aplicación debe funcionar con cinco hilos de cada tipo.

