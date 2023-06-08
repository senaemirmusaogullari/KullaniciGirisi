import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {

		String userName, password, answer, newPassword;

		Scanner inp = new Scanner(System.in);

		System.out.print("Kullanıcı Adını Giriniz :");
		userName = inp.nextLine();

		System.out.print("Şifrenizi Giriniz :");
		password = inp.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriş yaptınız!");

		} else {
			System.out.println(
					"Kullanıcı adı veya şifre hatalı!\nYeni şifre belirlemek ister misiniz? (1 => Evet, 2 => Hayır)");
			answer = inp.nextLine();

			if (answer.equals("1")) {
				System.out.println("Yeni şifreyi giriniz : ");
				newPassword = inp.nextLine();

				if (newPassword.equals(password) || newPassword.equals("java123")) {
					System.out.print("Şifre Oluşturulamadı, Lütfen Başka Şifre Giriniz!");

				} else {
					System.out.println("Şifre Oluşturuldu!");
				}

			} else {
				System.out.println("Şifre Oluşturma İşlemi İptal Edildi!");
			}

		}
	}
}
