import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // FlightTicket flightTicket = new FlightTicket();
       // flightTicket.ticketCalc();


        double normalFiyat, indirimliFiyat =0.00,mesafe;
        int yas, yolculukTip;

        Scanner input =new Scanner(System.in);

        System.out.println("Gideceğiniz mesafeyi(Gidiş-Dönüş ise 2 katı) giriniz:");
        mesafe= input.nextDouble();

        System.out.println("Yaşınızı giriniz:");
        yas= input.nextInt();

        System.out.println("Yolculuk Tipinizi Seçiniz.\n1-Tek-yön\n2-Gidiş-Dönüş");
        yolculukTip= input.nextInt();

        normalFiyat= mesafe*0.10;

        if (mesafe<0 ){ // Mesafe negatif olmamalı
            System.out.println("Hatalı Veri Girdiniz!");
        }

        if (yas<12 && yas >0){ // Yaş koşulları kontrolü
            indirimliFiyat =normalFiyat*0.5;
        } else if (yas<24 && yas>=12) {
            indirimliFiyat =normalFiyat*0.9;
        } else if (yas<65 && yas>=24) {
            indirimliFiyat = normalFiyat * 1;
        }else if (yas>=65) {
            indirimliFiyat =normalFiyat*0.7;
        }else{
            System.out.println("Hatalı Veri Girdiniz!");
        }

        if (yolculukTip==2){ //Yolculuk Tipi Kontrolü
            indirimliFiyat *= 0.8;
        }else if (yolculukTip==1) {
        }   else {
            System.out.println("Hatalı Veri Girdiniz!");
        }

        System.out.println("Normal Tutar:" + normalFiyat);
        System.out.println("İndirimli Tutar:" + indirimliFiyat);

    }
}