package Threads;

// THREADS


class SoftDrinks extends Thread {
    private String name;
    private int id;

    public String getNameOfSoftDrink() {
        return name;
    }

    public void setNameOfSoftDrink(String name) {
        this.name = name;
    }

    public int getIdOfSoftDrink() {
        return id;
    }

    public void setIdOfSoftDrink(int id) {
        this.id = id;
    }

    public void currentState(Thread trd) {
        System.out.println(String.format("The current state of thread is %s", trd.getState()));
    }
}

class Drinks extends SoftDrinks implements Runnable {
    private String name;

    public String getNamei() {
        return name;
    }

    public void setNamei(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Thread is running !");
    }
}
public class Threads {
    public static void main(String[] args) {
        SoftDrinks Coke = new SoftDrinks();
        Coke.setNameOfSoftDrink("Diet Coke");
        Coke.setIdOfSoftDrink(111);

        Coke.start();
        Coke.currentState(Coke);

        Coke.run();
        Coke.currentState(Coke);

//        Drinks beer = new Drinks();
//        beer.setName("Kingfisher");

        Thread beer = new Thread();
        Thread t1 = new Thread(beer, "Kingfisher");
        t1.start();


    }
}


/*

class Mobiles extends Thread {
//    private String name;
//    private String str;

    public void start() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
//            str = String.format("The current thread is %s and the value is %d", Thread.currentThread().getName(), i);

        }
    }
}
public class Threads {
    public static void main(String[] args) {
        Mobiles m1 = new Mobiles();
        Mobiles m2 = new Mobiles();
        m1.start();
        m2.start();
    }
}

 */
