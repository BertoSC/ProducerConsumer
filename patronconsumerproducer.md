## PATRON PRODUCER-CONSUMER

hay un obj compartido

un productor añade un elemento y el consumidor lo consume

el productor tiene que estar bloqueado hasta que el consumidor consuma, y se comunican a través de la memoria compartida


si no hay "algo", puede producir

Si hay "algo", puede consumir

que interesa? si no pueden actuar no interesa que molesten o si consulten todo el rato si hay algo, es decir, no interesa una espera activa, sino lo contrario

en estado wait y, cuando llega recurso, notificar

CONSUMIDOR
while number=null{
wait();
}

PRODUCTOR
while number!=null{
wait();
}


cómo notifica el consumidor?

notify()
notifyAll()

Cuando ya cogió el "algo", puede dejar el compartido a null y llamar a notify






