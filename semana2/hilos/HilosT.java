package semana2.hilos;

public class HilosT extends Thread{

    @Override //Runable
    public void run(){

        System.out.println("El hilo se está ejecutando");
    }

    /*
    public void start(){
        Inicia la ejecucion de un hilo
        La JVM llamar al metodo run() del hilo

    }


    sleep - detiene de manera
    join() - Espera a que el hilo se muera
    getPriority - regresa la prioridad del hilo
    setPriority - Establecer la prioridad del hilo
    getName - Nombre del hilo
    currentThread - Referenca al hilo que se esta ejecutando
    getId - Regresa el id del hilo
    threadState getState -Regresaer el estado actual
    isAlive - si esta vivo
    */


    public static void main(String[] args) {

        HilosT hilo = new HilosT();//Entra al state new
        hilo.start();

    }
}

class HilosR implements Runnable{

    @Override
    public void run() {
        System.out.println("El hilo de runnable esta "+ " corriente");
    }

    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread(h);
        t.start();

    }
}