import java.util.Scanner;

public  class Tckimlik {
    String name;
    String tclastThree;
    boolean situation=false;
    String[][] arr = {
            {"enis", "123456789101"},
            {"yağmur", "987654321123"}
    };
    String tc;
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
    void calc(){
        while(loop){
            System.out.println("isim giriniz: (çıkmak istiyosan q/Q bas)");
            name = scanner.nextLine();
            if(name.equalsIgnoreCase("q")){
                System.out.println("güle güle");
                loop = false;
            }
            for(String[] names:arr){
                if (name.equalsIgnoreCase(names[0])) {
//                    System.out.println("giriş doğru");
                    tc = names[1];
                    System.out.println(tc.substring(0,8) + "***\nTc'nizin son 3 hanesini giriniz: ");

                    int count = 3;
                    while(count > 0){
                        tclastThree = scanner.nextLine();
                        if(tclastThree.equals(tc.substring(8))){
                            situation = true;
                            System.out.println("Doğru giriş yaptınız.");
                            break;
                        }else{
                            count--;
                            System.out.println("Son "+ count + " hakkınız...");
                            if(count == 0){
                                System.out.println("Hakkınız bitti...");
                                break;
                            }
                        }
                    }

                }
            }
        }
    }
}
