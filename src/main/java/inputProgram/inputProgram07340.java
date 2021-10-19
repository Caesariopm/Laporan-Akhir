package inputProgram;
import java.util.Scanner;

public class inputProgram07340 {
  
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("INPUT");
        System.out.println("Masukan Nama: ");
        String namacaesar = scan.nextLine();
        System.out.println("Masukan Umuur: ");
        int umurcaesar  = scan.nextInt();

        System.out.println("\nOUTPUT");
        System.out.println("Nama :" + namacaesar);
        System.out.println("Umur :" + umurcaesar);
    }
}  
