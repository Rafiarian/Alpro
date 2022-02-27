import java.util.Scanner;

public class TestClass5026211177 {
    public static void main (String[] args){
        ComputeMethods5026211177 ComMet = new ComputeMethods5026211177();
        Scanner Wow = new Scanner(System.in);

        //Fahrenheit converter
        System.out.println("***FAHRENHEIT CALCULATOR***");
        System.out.print("Berapa suhu yang ada? (dalam fahrenheit) ==>");
        double x = Wow.nextDouble();
        double celcius = ComMet.fToC(x);
       System.out.println("Suhu yang didapat adalah "+ celcius+" Celcius");

       //Panjang Sisi Segitiga
        System.out.println(" ");
        System.out.println("**************************************");
      System.out.println("Ini adalah kalkulator pythagoras");
      System.out.print("Masukan panjang sisi yang pertama =>");
      int Sisi1 = Wow.nextInt();
      System.out.print("Masukan panjang sisi yang kedua =>");
      int Sisi2 = Wow.nextInt();
      double Panjang = ComMet.hypothenuse(Sisi1,Sisi2);
      System.out.println("Panjang Sisi segitiga adalah " + Panjang);

      //Dadu Acak acak
        System.out.println("**************************************");
        System.out.println(" ");
        System.out.println("Berapa nomor beruntung anda pada hari ini?");
        System.out.println("akan saya putarkan dua buah dadu untuk anda");
        int Dadu = ComMet.roll();
        System.out.println(Dadu+" Ini adalah nomor keberuntungan anda hari ini ");
    }
}
