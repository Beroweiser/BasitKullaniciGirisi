/**
 * BasitKullaniciGirisi
 */
import java.util.Scanner;
public class BasitKullaniciGirisi {

    public static void main(String[] args) {
        String userName,password,passwordReset,newpassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = inp.nextLine();

        System.out.print("Sifreniz: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giris Yaptınız ! ");

        } else {
            System.out.print("Bilgileriniz Yanlis !!\nYeni sifre olusturmak isterseniz \"yes\" istemiyorsanız \"no\" giriniz: ");
            passwordReset = inp.nextLine();
            if (passwordReset.equals("no")){
                System.out.println("Giris Sonlandirilmistir.");

            }else if (passwordReset.equals("yes")){
                System.out.print("Yeni sifrenizi giriniz : ");
                newpassword = inp.nextLine();
                if (newpassword.equals(password) || newpassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu.");
                }
                
            } else{
                System.out.println("Yanlis giris yaptiniz.");
            }
        }


        inp.close();
    }
}