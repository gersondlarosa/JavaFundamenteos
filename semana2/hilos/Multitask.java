package semana2.hilos;

public class Multitask extends Thread{

    @Override
    public void run(){
        System.out.println("Tarea uno");
    }

    public static void main(String[] args) {

        Multitask t1 = new Multitask(),
                  t2 = new Multitask(),
                  t3 = new Multitask();

        t1.start();
        t2.start();
        t3.start();

    }

}

class Miltitasking implements Runnable{

    @Override
    public void run() {
        System.out.println("Tarea uno de Runnable");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Miltitasking());
        Thread t2 = new Thread(new Miltitasking());

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        t1.start();
        t2.start();

        task1.start();
        task2.start();
    }
}

class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea A ");
    }
}

class Task2 extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea B");
    }
}