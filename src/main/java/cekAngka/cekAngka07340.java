package cekAngka;
import java.util.Scanner;

public class cekAngka07340 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka;
        
        System.out.println("Masukan Angka:" );
        angka = scan.nextInt();
        
        while (angka > 0){
            angka = angka - 2;
        }
        System.out.println(angka);
        
        if (angka == 0){
            System.out.println("GENAP");
        }else {
            System.out.println("GANJIL");
        }
        
        System.out.println("tes mecel");
    }
    
}
