import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Pemain {
    int tinggi;
    int berat;

    Pemain(int tinggi, int berat) {
        this.tinggi = tinggi;
        this.berat = berat;
    }

    @Override
    public String toString() {
        return "Tinggi: " + tinggi + " cm, Berat: " + berat + " kg";
    }
}

public class PraktikumBab11 {

    public static void tampilkanData(String judul, ArrayList<Pemain> tim) {
        System.out.println("\n" + judul);
        for (Pemain p : tim) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        System.out.println("Fardhan Haikal Taufik - 255150707111008");

        // TIM A
        ArrayList<Pemain> timA = new ArrayList<>();

        timA.add(new Pemain(168, 50));
        timA.add(new Pemain(170, 60));
        timA.add(new Pemain(165, 56));
        timA.add(new Pemain(168, 55));
        timA.add(new Pemain(172, 60));
        timA.add(new Pemain(170, 70));
        timA.add(new Pemain(169, 66));
        timA.add(new Pemain(165, 56));
        timA.add(new Pemain(171, 72));
        timA.add(new Pemain(166, 56));



        //TIM B
        ArrayList<Pemain> timB = new ArrayList<>();

        timB.add(new Pemain(170, 66));
        timB.add(new Pemain(167, 60));
        timB.add(new Pemain(165, 59));
        timB.add(new Pemain(166, 58));
        timB.add(new Pemain(168, 58));
        timB.add(new Pemain(175, 71));
        timB.add(new Pemain(172, 68));
        timB.add(new Pemain(171, 68));
        timB.add(new Pemain(168, 65));
        timB.add(new Pemain(169, 60));

        Collections.sort(timA, Comparator.comparingInt(p -> p.tinggi));
        tampilkanData("Tim A - Tinggi Ascending", timA);

        Collections.sort(timB, Comparator.comparingInt(p -> p.tinggi));
        tampilkanData("Tim B - Tinggi Ascending", timB);

        Collections.sort(timA, (a, b) -> b.tinggi - a.tinggi);
        tampilkanData("Tim A - Tinggi Descending", timA);

        Collections.sort(timB, (a, b) -> b.tinggi - a.tinggi);
        tampilkanData("Tim B - Tinggi Descending", timB);

        Collections.sort(timA, Comparator.comparingInt(p -> p.berat));
        tampilkanData("Tim A - Berat Ascending", timA);

        Collections.sort(timB, Comparator.comparingInt(p -> p.berat));
        tampilkanData("Tim B - Berat Ascending", timB);

        Collections.sort(timA, (a, b) -> b.berat - a.berat);
        tampilkanData("Tim A - Berat Descending", timA);

        Collections.sort(timB, (a, b) -> b.berat - a.berat);
        tampilkanData("Tim B - Berat Descending", timB);

        int maxTinggiA = timA.stream().mapToInt(p -> p.tinggi).max().getAsInt();
        int minTinggiA = timA.stream().mapToInt(p -> p.tinggi).min().getAsInt();
        int maxBeratA = timA.stream().mapToInt(p -> p.berat).max().getAsInt();
        int minBeratA = timA.stream().mapToInt(p -> p.berat).min().getAsInt();

        int maxTinggiB = timB.stream().mapToInt(p -> p.tinggi).max().getAsInt();
        int minTinggiB = timB.stream().mapToInt(p -> p.tinggi).min().getAsInt();
        int maxBeratB = timB.stream().mapToInt(p -> p.berat).max().getAsInt();
        int minBeratB = timB.stream().mapToInt(p -> p.berat).min().getAsInt();

        System.out.println("\n===== NILAI TIM A =====");
        System.out.println("Tinggi Maksimum : " + maxTinggiA);
        System.out.println("Tinggi Minimum  : " + minTinggiA);
        System.out.println("Berat Maksimum  : " + maxBeratA);
        System.out.println("Berat Minimum   : " + minBeratA);

        System.out.println("\n===== NILAI TIM B =====");
        System.out.println("Tinggi Maksimum : " + maxTinggiB);
        System.out.println("Tinggi Minimum  : " + minTinggiB);
        System.out.println("Berat Maksimum  : " + maxBeratB);
        System.out.println("Berat Minimum   : " + minBeratB);

        ArrayList<Pemain> timC = new ArrayList<>(timB);

        tampilkanData("Tim C (Copy dari Tim B)", timC);

        int jumlah168 = 0;
        int jumlah160 = 0;

        for (Pemain p : timB) {
            if (p.tinggi == 168) {
                jumlah168++;
            }
            if (p.tinggi == 160) {
                jumlah160++;
            }
        }
        System.out.println("Fardhan Haikal Taufik - 255150707111008");
        System.out.println("\nJumlah pemain Tim B dengan tinggi 168 cm : " + jumlah168);
        System.out.println("Jumlah pemain Tim B dengan tinggi 160 cm : " + jumlah160);

        int jumlah56 = 0;

        for (Pemain p : timA) {
            if (p.berat == 56) {
                jumlah56++;
            }
        }

        System.out.println("\nJumlah pemain Tim A dengan berat 56 kg : " + jumlah56);

        boolean adaSama = false;

        for (Pemain a : timA) {
            for (Pemain b : timB) {

                if (a.tinggi == b.tinggi || a.berat == b.berat) {
                    adaSama = true;

                    System.out.println("\nData yang sama ditemukan:");
                    System.out.println("Tim A -> " + a);
                    System.out.println("Tim B -> " + b);
                }
            }
        }

        if (!adaSama) {
            System.out.println("\nTidak ada data yang sama.");
        }
    }
}