import java.io.*;

public class Main {

    // write file and check if its exists. if it's not create new file.
    public static void writer(String name){
        try{
            File file = new File(name);
            FileWriter fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            if(!file.exists()){
                file.createNewFile();
            }
            bufferedWriter.write("5\n10\n20\n12\n33");
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    // read the file and use the data in it.
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
        String path = "src/numbers.txt";

        writer(path);

        reader(path);
    }
}