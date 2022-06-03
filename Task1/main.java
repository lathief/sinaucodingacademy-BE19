//Buatlah aplikasi untuk menampilkan angka 1-50, ketika angka n habis dibagi 3 maka keluar tulisan
//"n habis dibagi 3", dan jika n habis dibagi 5 maka keluar tulisan "n habis dibagi 5"
public class Task1 {
    public static void main(String args[]) {
        for (int angka = 1; angka <51; angka++) {
            if (angka % 3 == 0) {
                System.out.println(angka + " habis dibagi 3");
            }
            else if (angka % 5 == 0) {
                System.out.println(angka + " habis dibagi 5");
            }
        }
    }
}
