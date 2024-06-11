import java.util.*;

public class Main {
    public static void counter(String text){
        String[] arrs = text.trim().split(" ");
        HashMap<String, Integer> counterMap = new HashMap<>();
        counterMap.put(arrs[0],1);
        // checking if key exists or not
        for(int i = 1; i < arrs.length; i++){
            if(counterMap.containsKey(arrs[i])){
                counterMap.put(arrs[i], counterMap.get(arrs[i])+1);
            }else{
                counterMap.put(arrs[i],1);
            }
        }
        int max = Integer.MIN_VALUE;
        String biggerKey = null;
        // calculating min, max values
        for (HashMap.Entry<String, Integer> entry : counterMap.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                biggerKey = entry.getKey();
            }
        }
        System.out.println("most common word in the sentence: " + biggerKey
                + " with " + max + " times.");
        System.out.println(counterMap);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write some sentence ↓");
        String text = scanner.nextLine();
        counter(text);
    }


}