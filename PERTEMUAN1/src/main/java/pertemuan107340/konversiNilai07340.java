package pertemuan107340;
import java.util.Scanner;

public class konversiNilai07340 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
         System.out.println("Masukan Jumlah Data: ");
         int totalData = scan.nextInt();
         String[] nama = new String [totalData];
         int [] nilai = new int [totalData];
         
         for (int i=0; i<totalData; i++){
            System.out.println("Masukan Nama: ");
            nama[i] = scan.next();
            System.out.println("Masukan Nilai: ");
            nilai [i] = scan.nextInt();
         }
        
         for(int i=0; i<totalData; i++){
            System.out.println("Nama : "+nama[i]);
            System.out.println("Nilai : "+nilai[i]);
            
            if (nilai[i]>=91 && nilai[i]<=100){
                System.out.println("Mendapatkan Nilai A");
            }
            else if (nilai[i]<=90 && nilai[i]>=81){
                System.out.println("Mendapatkan Nilai B");
            }
            else if (nilai[i]<=80 && nilai[i]>=71){
                System.out.println("Mendapatkan Nilai C");
            }
            else if (nilai[i] <= 70 && nilai[i]>=61){
                System.out.println("Mendapatkan Nilai D"); 
            }
            else if (nilai[i]<=60 && nilai[i]>=0){
                System.out.println("Mendapatkan Nilai E");
            }
            
            switch(nilai[i]){
                case 
                   75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,
                   90,91,92,93,94,95,96,97,98,99,100-> System.out.println("LULUS");
                
                default ->
                    System.out.println("TIDAK LULUS");
            }
            System.out.println(" ");
        }
    }     
    
}