import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        String userName = "admin", password = "java123", kuser, kpass, kod = "1234";
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
            if (i == 5) {
                out.println("Sisteme çok fazla giriş yaptınız." +
                        "Kullanıcı adınızı ve şifresinizi sıfırlamak için Evet yoksa atılacaksınız.");
                String sfrlama = input.nextLine();
                if (sfrlama.equals("Evet")) {
                    out.print("Sıfırlama kodunuzu giriniz : ");
                    String kod1 = input.nextLine();
                    if (kod1.equals(kod)) {
                        out.print("Yeni kullanıcı adınızı giriniz : ");
                        userName = input.nextLine();
                        out.print("Yeni şifrenizi adınızı giriniz : ");
                        password = input.nextLine();
                        out.print("Sisteme tekardan giriş yapınız.");
                    } else {
                        out.print("Yanlış!! Sistemden atılıyorunuz...!");
                    }
                }
            }
        }
    }
}