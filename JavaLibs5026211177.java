import javax.swing.*;

public class Main {
    public static void main (String[] args){
        //NAMA1
        String nama = JOptionPane.showInputDialog("Siapa namanya?");
        JOptionPane.showMessageDialog(null, nama + ", nama yang bagus!");



        //Umur2
        String umur = JOptionPane.showInputDialog("Oke sekarang berapa umurmu!");
        int umurConvert=Integer.parseInt(umur);
        JOptionPane.showMessageDialog(null, "Nani?!?!? "+ umur+ "kamu terlihat sangat muda");

        //Gender3
        String[] acceptablevalues = {"Lelaki","Perempuan"};
        String gender = (String)JOptionPane.showInputDialog(null,"oke supaya aku tidak salah memanggil, apa gendermu?","jenis kelamin",2,null,acceptablevalues,acceptablevalues[1]);
        JOptionPane.showMessageDialog(null,"ternyata kamu " + gender + "!!");

        //Tinggi badan4
        String TB = JOptionPane.showInputDialog("Kamu terlihat sangat tinggi berapa tinggi mu!");
        int TBConvert=Integer.parseInt(TB);
        JOptionPane.showMessageDialog(null,"nAni?!?! " + TBConvert +"cm, Tinggi sekali!");

        //Lanjut5
        JOptionPane.showMessageDialog(null, "Karena kamu tinggi dan ganteng lihat aku punya kejutan");
        JOptionPane.showMessageDialog(null, "Sebentar");
        JOptionPane.showMessageDialog(null, "Dor");
        String[] Ngaget = {"Kaget","Kaget banget","b aja"};
        String Kaget = (String)JOptionPane.showInputDialog(null,"Kaget bgt khan","Kaget kan",3,null,Ngaget,Ngaget[1]);
        JOptionPane.showMessageDialog(null,"Kamu "+Kaget+" HAHAHA Maaf ya");

        //Angka Decimal 6
        JOptionPane.showMessageDialog(null,"Aku penasaran sesuatu nih");
        String Desimal = JOptionPane.showInputDialog("Berapa angka desimal kesukaan kamuw?");
        double DesimalConvert =Double.parseDouble(Desimal);
        JOptionPane.showMessageDialog(null,DesimalConvert+" Keren juga");

        //Calculator7
        JOptionPane.showMessageDialog(null, "Lihat aku punya calculator");
        String answer = JOptionPane.showInputDialog("Apakah kamu mau mencoba? Ketik y jika mau");

        if (answer.equalsIgnoreCase("y")){
            JOptionPane.showMessageDialog(null,"Lets Begin!");
        } else {
            JOptionPane.showMessageDialog(null,"kok gamau sih!");
        }

        //Calculator89
        String number1 = JOptionPane.showInputDialog("Ketik 1 nomor");
        int angkazz = Integer.parseInt(number1);
        String number2 = JOptionPane.showInputDialog("lalu ketik lagi");
        int angkaz = Integer.parseInt(number2);
        JOptionPane.showMessageDialog(null,"Aku akan mengkalikan angka ini!");
        int hasil = angkazz * angkaz;
        JOptionPane.showMessageDialog(null, "Hasilny adlah "+hasil);

        //Terimakasih 10
        JOptionPane.showMessageDialog(null,"Terimakasih " + nama+ " sudah menemani aku belajar ngoding <3 <3 <3");
        String[] nikmat = {"Nikmat!!","Tidak!!"};
        String mantap=(String)JOptionPane.showInputDialog(null,"Apakah anda menikmati perjalanan pembelajaran ini?","Apakah nikmat",3,null,nikmat,nikmat[1]);

        if (mantap.equals("Nikmat!!")) {
            JOptionPane.showMessageDialog(null, "Terimakasih terimakasih i love u " + nama+ " <3 <3 <3" );
        }else {
            JOptionPane.showMessageDialog(null,"Baik semoga lain kali lebih menyenangkan <3 <3");
        }
    }
}
