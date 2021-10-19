package pengujianSegitiga;
import java.util.Scanner;

public class pengujianSegitiga07340 {
    public static void main(String[] args){
        int acaesar,bcaesar,ccaesar;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan ketiga panjang sisi segitiga : ");
        acaesar= scan.nextInt();
        bcaesar = scan.nextInt();
        ccaesar = scan.nextInt();
        if(Math.pow(ccaesar,2) < Math.pow(acaesar, 2) + Math.pow(bcaesar, 2)){
            System.out.println("SEGITIGA LANCIP");
        }else if(Math.pow(ccaesar,2)> Math.pow(acaesar, 2) + Math.pow(bcaesar, 2)){
            System.out.println("SEGITIGA TUMPUL");
        }else{
            System.out.println("SEGITIGA SIKU-SIKU");}
    }
}
