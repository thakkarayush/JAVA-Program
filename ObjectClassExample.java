package classes;

class SharedResource {
    private String name;
    private int value;

    public SharedResource(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "SharedResource{name='" + name + "', value=" + value + "}";
    }

    public synchronized void waitForChange() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting for change");
            wait();
            System.out.println(Thread.currentThread().getName() + " detected a change");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void notifyChange() {
        System.out.println(Thread.currentThread().getName() + " is notifying one thread");
        notify();
    }

    public synchronized void notifyAllChange() {
        System.out.println(Thread.currentThread().getName() + " is notifying all threads");
        notifyAll();
    }
}

public class ObjectClassExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource("Resource1", 100);

        System.out.println("Initial state: " + resource.toString());

        Thread thread1 = new Thread(() -> {
            resource.waitForChange();
            System.out.println(Thread.currentThread().getName() + " resumed execution with state: " + resource.toString());
        }, "Thread 1");

        Thread thread2 = new Thread(() -> {
            resource.waitForChange();
            System.out.println(Thread.currentThread().getName() + " resumed execution with state: " + resource.toString());
        }, "Thread 2");

        thread1.start();
        thread2.start();

        new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate some work
                resource.notifyChange();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Notifier 1").start();

        new Thread(() -> {
            try {
                Thread.sleep(4000); // Simulate some work
                resource.notifyAllChange();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Notifier 2").start();
    }
}
