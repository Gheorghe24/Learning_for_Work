package ds.queue;

public class App {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(100);
        queue.insert(90);
        queue.insert(80);
        queue.insert(12);
        queue.insert(12);
        queue.view();
    }
}
