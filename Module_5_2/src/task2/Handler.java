package task2;

public class Handler implements Runnable {
    private Class list;
    public Handler(Class list) {
        this.list = list;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            this.list.add("Hello");
            this.list.add("World");
            this.list.remove("Hello");
        }

    }

    public static void main(String[] args) {
        Class list = new Class();
        Thread[] handlers = new Thread[3];
        for (int i = 0; i < 3; i++) {
            handlers[i] = new Thread(new Handler(list));
            handlers[i].start();
        }
        try {
            handlers[0].join();
            handlers[1].join();
            handlers[2].join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("list size after handling " + list.size());

    }
}
