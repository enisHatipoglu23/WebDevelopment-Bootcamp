import java.util.Iterator;
import java.util.PriorityQueue;
//416
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Book> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Book("Effective Java", 900, "Joshua Bloch"));
        priorityQueue.add(new Book("Data Structures and Algorithms in Java", 800, "Robert Lafore"));

        Iterator<Book> itr = priorityQueue.iterator();
        int i = 1;
        while(itr.hasNext()){
            System.out.println(i + ". " + itr.next().toString());
            i++;
        }
    }
}