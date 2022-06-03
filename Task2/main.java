//Buatlah aplikasi untuk membadingan antara bilangan prima dan bukan prima menggunakan for loop
public class Tugas2 {
    public static void main(String args[]) {
        for (int angka = 1; angka <51; angka++) {
            boolean check = false;
            if (angka > 1) {
                for (int i = 2; i < angka; i++) {
                    if (angka % i == 0) {
                        check = true;
                        break;
                    }
                }
            }
            else if (angka == 1) {
                check = true;
            }

            if (check == true) {
                System.out.println(angka + " bukan bilangan prima");
            }
            else {
                System.out.println(angka + " bilangan prima");
            }
        }
    }
}
