import java.util.*;

//416
public class Main {
    public static void main(String[] args) {
        Set<Book> treeSet = new TreeSet<>();
        treeSet.add(new Book("Effective Java", 900, "Joshua Bloch"));
        treeSet.add(new Book("Data Structures and Algorithms in Java", 800, "Robert Lafore"));

        Iterator<Book> itr = treeSet.iterator();
        int i = 1;
        while(itr.hasNext()){
            System.out.println(i + ". " + itr.next().toString());
            i++;
        }
    }
}