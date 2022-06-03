import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static class Lingkaran extends Main {
        double j;

        public void setLingkaran(double jari){
            this.j = jari;
        }

        public double luasLingkaran(){
            double luas;
            luas = 3.14 * this.j * this.j;
            return luas;
        }

        public double kllLingkaran(){
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
    public static class Persegi extends Main{
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
    public static class Persegi_Panjang extends Main{
        double p,l;

        public void setPersegi_Panjang(double panjang,double lebar){
            this.p = panjang;
            this.l = lebar;
        }

        public double luasPersegi_Panjang(){
            double luas;
            luas = this.p * this.l;
            return luas;
        }
        public double kllPersegi_Panjang(){
            double kll;
            kll = 2*(this.p+this.l);
            return kll;
        }
    }
    public static class Segitiga extends Main{
        double a,t,s1,s2,s3;

        public void setSegitiga(double alas,double tinggi){
            this.a = alas;
            this.t = tinggi;
        }

        public double luasSegitiga(){
            double luas;
            luas = (this.a*this.t)/2;
            return luas;
        }

        public double kllSegitiga(){
            double kll;
            double sr = Math.sqrt(Math.pow(this.a,2) + Math.pow(this.t,2));
            kll = sr + this.a + this.t;
            return kll;
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Pilih Menu: ");
        System.out.println("1.Lingkaran; ");
        System.out.println("2.Persegi; ");
        System.out.println("3.Persegi Panjang; ");
        System.out.println("4.Segitiga; ");

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
                System.out.print("Hasil Luas Lingkaran : ");
                System.out.println(L.luasLingkaran());
                System.out.print("Hasil Keliling Lingkaran : ");
                System.out.println(L.kllLingkaran());
                break;
            case 2:
                double s;
                System.out.println("Isikan nilai Sisinya : ");
                String nilais= myObj.nextLine();
                s = Double.parseDouble(nilais);

                Persegi P = new Persegi();
                P.setPersegi(s);

                System.out.print("Hasil Luas Persegi : ");
                System.out.println(P.luasPersegi());
                System.out.print("Hasil Keliling Persegi : ");
                System.out.println(P.kllPersegi());
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

                System.out.print("Hasil Luas Persegi Panjang : ");
                System.out.println(PP.luasPersegi_Panjang());
                System.out.print("Hasil Keliling Persegi Panjang : ");
                System.out.println(PP.kllPersegi_Panjang());
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

                System.out.print("Hasil Luas Segitiga : ");
                System.out.println(S.luasSegitiga());
                System.out.print("Hasil Keliling Segitiga : ");
                System.out.println(S.kllSegitiga());
                break;

        }
    }
}
