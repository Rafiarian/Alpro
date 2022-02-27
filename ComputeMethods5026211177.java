import java.util.Random;

public class ComputeMethods5026211177{

    public double fToC(double degreesF) {
        return 5/9.0*(degreesF-32);
    }
    public double hypothenuse (int a,int b){
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }
    public int roll (){
        Random Newran = new Random();

        int dice1 = Newran.nextInt(6)+1;
        int dice2 = Newran.nextInt(6)+2;

        return dice1+dice2;
    }
}
