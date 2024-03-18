import java.util.Scanner;
public class Main {

        static boolean isAnagram(String a, String b) {
            // Complete the function
            int res = 0;
            char[] aChar = a.toLowerCase().toCharArray();
            char[] bChar = b.toLowerCase().toCharArray();

            if(a.length() == b.length()){
                for (int i = 0; i < a.length(); i++) {
                    for (int j = 0; j < b.length(); j++) {
                        if (aChar[i] == bChar[j]) {
                            res++;
                            aChar[i] = ' ';
                            bChar[j] = ' ';
                            break;
                        }
                    }
                }
                if(res == a.length()){
                    System.out.println("Anagrams");
                    return true;
                }
            }
            System.out.println("Not Anagrams");
            return false;
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println((ret) ? "Anagrams" : "Not Anagrams");
        }
    }
