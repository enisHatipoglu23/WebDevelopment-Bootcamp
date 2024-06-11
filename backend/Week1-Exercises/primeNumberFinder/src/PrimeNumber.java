public class PrimeNumber {
    void func(){

        boolean asal;
        // belirlenen aralıktaki sayılar burada bastırılır.
        for (int i = 2; i <= 100; i++) {
            asal = true;
            // sayılar burada kontrol edilir.
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                    // sayı asal değilse false döndürülür ve aşağıdaki if'e girilmeden döngü devam eder.
                }
            }
            // sayı asal ise burada bastırılır.
            if (asal) {
                System.out.print(i + " ");
            }
        }
    }
}
