package deretKelipatan4;
import java.util.Scanner;

public class deretKelipatan407340 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int banyak;
        
        System.out.println("Banyak Deret: ");
        banyak = scan.nextInt();
        
        int [] deret = new int [banyak];
        
        for(int i = 0; i < banyak; i++){
            deret[i] = i*4+2;
        }
        
        for(int i : deret){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
    
}
    
