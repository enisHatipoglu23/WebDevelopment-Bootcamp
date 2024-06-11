import java.io.*;
import java.util.Scanner;

public class Main {
    public static void createFile(String path){
        File file = new File(path);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void writeToFile(String path, String text){
        try {
            FileWriter fileWriter = new FileWriter(path,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile(String path){

        try{
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String data;
            while((data = bufferedReader.readLine()) != null){
                System.out.println("- " + data);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }

    public static void main(String[] args) {
        System.out.println("--NOTEPAD--\n");
        String path = "src/Notepad";
        createFile(path);
        File file = new File(path);

        if(!file.equals("")){
            System.out.println("my recent note's\n↓↓↓↓↓");
            readFile(path);
            System.out.println("↑↑↑↑↑");
        }

        System.out.println("\nWrite your notes here ↓");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        writeToFile(path,text);
        readFile(path);

    }
}