import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void reader(String file){
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String data;
            int sum=0;
            while((data = bufferedReader.readLine()) != null){
                System.out.println(data);
                sum += Integer.parseInt(data);
            }
            System.out.println("Sum => " + sum);
            fileReader.close();
            bufferedReader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        reader("src/numbers.txt");
    }
}