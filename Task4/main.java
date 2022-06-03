import java.util.Scanner;  // Import the Scanner class

interface bangundatar {
    public double luas(); // interface method (does not have a body)
    public double keliling(); // interface method (does not have a body)
}
class Lingkaran implements bangundatar {
    double j;

    public void setLingkaran(double jari){
        this.j = jari;
    }

    @Override
    public double luas() {
        double luas;
        luas = 3.14 * this.j * this.j;
        return luas;
    }

    @Override
    public double keliling() {
        double kll;
        kll = 2 * 3.14 * this.j;
        return kll;
    }

    public class Persegi extends Main{
        double s;

        public void setPersegi(double sisi){
            this.s = sisi;
        }

        public double luasPersegi(){
            double luas;
            luas = this.s * this.s;
            return luas;
        }

        public double kllPersegi(){
            double kll;
            kll = this.s * 4;
            return kll;
        }
    }
}
class Persegi implements bangundatar{
    double s;

    public void setPersegi(double sisi){
        this.s = sisi;
    }

    @Override
    public double luas() {
        double luas;
        luas = this.s * this.s;
        return luas;
    }

    @Override
    public double keliling() {
        double kll;
        kll = this.s * 4;
        return kll;
    }
}
class Persegi_Panjang implements bangundatar{
    double p,l;

    public void setPersegi_Panjang(double panjang,double lebar){
        this.p = panjang;
        this.l = lebar;
    }

    @Override
    public double luas() {
        double luas;
        luas = this.p * this.l;
        return luas;
    }

    @Override
    public double keliling() {
        double kll;
        kll = 2*(this.p+this.l);
        return kll;
    }
}
class Segitiga implements bangundatar{
    double a,t,s1,s2,s3;

    public void setSegitiga(double alas,double tinggi){
        this.a = alas;
        this.t = tinggi;
    }

    @Override
    public double luas() {
        double luas;
        luas = (this.a*this.t)/2;
        return luas;
    }

    @Override
    public double keliling() {
        double kll;
        double sr = Math.sqrt(Math.pow(this.a,2) + Math.pow(this.t,2));
        kll = sr + this.a + this.t;
        return kll;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        boolean continues = true;

        while(continues){
            System.out.println("Pilih Menu: ");
            System.out.println("1.Lingkaran; ");
            System.out.println("2.Persegi; ");
            System.out.println("3.Persegi Panjang; ");
            System.out.println("4.Segitiga; ");

            System.out.println("Pilih [1/2/3/4] : ");
            String pilihan = myObj.nextLine();  // Read user input
            int pilihannya = Integer.parseInt(pilihan);
            switch(pilihannya){
                case 1:
                    double j ;
                    System.out.println("Isikan nilai jari jarinya : ");
                    String nilaij= myObj.nextLine();
                    j = Double.parseDouble(nilaij);

                    Lingkaran L = new Lingkaran();
                    L.setLingkaran(j);
                    System.out.println("Pilih mau 1.Luas atau 2.Keliling : ");
                    String LK1= myObj.nextLine();
                    if(LK1.equals("1")){
                        System.out.print("Hasil Luas Lingkaran : ");
                        System.out.println(L.luas());
                    }
                    else if(LK1.equals("2")){
                        System.out.print("Hasil Keliling Lingkaran : ");
                        System.out.println(L.keliling());
                    }
                    else{
                        System.out.print("Hasil Luas Lingkaran : ");
                        System.out.println(L.luas());
                        System.out.print("Hasil Keliling Lingkaran : ");
                        System.out.println(L.keliling());
                    }
                    break;
                case 2:
                    double s;
                    System.out.println("Isikan nilai Sisinya : ");
                    String nilais= myObj.nextLine();
                    s = Double.parseDouble(nilais);

                    Persegi P = new Persegi();
                    P.setPersegi(s);
                    System.out.println("Pilih mau 1.Luas atau 2.Keliling : ");
                    String LK2= myObj.nextLine();
                    if(LK2.equals("1")){
                        System.out.print("Hasil Luas Persegi : ");
                        System.out.println(P.luas());
                    } else if (LK2.equals("2")) {
                        System.out.print("Hasil Keliling Persegi : ");
                        System.out.println(P.keliling());
                    }
                    else {
                        System.out.print("Hasil Luas Persegi : ");
                        System.out.println(P.luas());
                        System.out.print("Hasil Keliling Persegi : ");
                        System.out.println(P.keliling());
                    }
                    break;

                case 3:
                    double p,l;
                    System.out.println("Isikan nilai Panjang : ");
                    String nilaip= myObj.nextLine();
                    p = Double.parseDouble(nilaip);
                    System.out.println("Isikan nilai Lebar : ");
                    String nilail= myObj.nextLine();
                    l = Double.parseDouble(nilail);

                    Persegi_Panjang PP = new Persegi_Panjang();
                    PP.setPersegi_Panjang(p, l);
                    System.out.println("Pilih mau 1.Luas atau 2.Keliling : ");
                    String LK3= myObj.nextLine();
                    if(LK3.equals("1")){
                        System.out.print("Hasil Luas Persegi Panjang : ");
                        System.out.println(PP.luas());
                    }
                    else if (LK3.equals("2")) {
                        System.out.print("Hasil Keliling Persegi Panjang : ");
                        System.out.println(PP.keliling());
                    }
                    else {
                        System.out.print("Hasil Luas Persegi Panjang : ");
                        System.out.println(PP.luas());
                        System.out.print("Hasil Keliling Persegi Panjang : ");
                        System.out.println(PP.keliling());
                    }
                    break;

                case 4:
                    double a,t,s1,s2,s3;
                    System.out.println("Isikan nilai Alas : ");
                    String nilaia= myObj.nextLine();
                    a = Double.parseDouble(nilaia);
                    System.out.println("Isikan nilai Tinggi : ");
                    String nilait= myObj.nextLine();
                    t = Double.parseDouble(nilait);

                    Segitiga S = new Segitiga();
                    S.setSegitiga(a, t);
                    System.out.println("Pilih mau 1.Luas atau 2.Keliling : ");
                    String LK4= myObj.nextLine();
                    if(LK4.equals("1")){
                        System.out.print("Hasil Luas Segitiga : ");
                        System.out.println(S.luas());
                    }
                    else if (LK4.equals("2")){
                        System.out.print("Hasil Keliling Segitiga : ");
                        System.out.println(S.keliling());
                    }
                    else {
                        System.out.print("Hasil Luas Segitiga : ");
                        System.out.println(S.luas());
                        System.out.print("Hasil Keliling Segitiga : ");
                        System.out.println(S.keliling());
                    }
                    break;


            }
            System.out.println("Ingin mengulangi langkah perhitungan [Y/N]? : ");
            String option= myObj.nextLine();
            if(option.equals("y") || option.equals("Y")){
                continues = true;
            }else{
                continues = false;
            }
        }

    }
}