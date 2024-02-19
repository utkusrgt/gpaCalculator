import java.util.Scanner;

public class gpaCalculator {
    public static void main(String[] args) {
        // Create variables
        int mat, fizik, kimya, muzik, tarih, turkce;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        System.out.print("Matematik Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        int toplam = (mat + fizik + kimya + muzik + tarih + turkce);
        double ortalama = toplam / 6;
        System.out.println("Ortalamanız " + ortalama);

        String result = (ortalama > 60.0) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(result);


    }
}
