import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        String userName = "admin", password = "java123", kuser, kpass;
        for (int i = 0; i < 6; i++) {
            out.print("Lütfen kullanıcı adınızı giriniz : ");
            kuser = input.nextLine();                           // Kullanıcı adı ve şifresini istiyoruz.
            out.print("Lütfen şifrenizi giriniz : ");
            kpass = input.nextLine();

            if ((kuser.equals(userName)) && (kpass.equals(password))) {     //Doğruluğunu kontrol ediyoruz
                out.println("Sistme giriş yaptınız.");
                break;
            } else {
                out.println("Kullanıcı adını veya şifreniz yanlış.Lütfen tekrar deneyiniz.");
            }
            if (i == 5) out.print("Sisteme çok fazla giriş yaptınız atılıyorsunuz..!"); //5 defa yanlış giriş yaparsa sonlanıyor.
        }
    }
}