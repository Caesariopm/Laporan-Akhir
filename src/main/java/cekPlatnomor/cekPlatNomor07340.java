package cekPlatnomor;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class cekPlatNomor07340 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char platcaesar;
        System.out.println("Masukan Kode Plat: ");
        platcaesar =  scan.next().charAt(0);

        switch (platcaesar) {
            case 'L': 
                System.out.println("Plat Surabaya");
                break;
            case 'B':
                System.out.println("Plat Jakarta");
                break;
            case 'N':
                System.out.println("Plat Malang");
                break;
            case 'W':
                System.out.println("Plat Sidoarjo");
                break;
            default:
                System.out.println("Plat Tidak Dikenali oleh System");
        }
    }
}

