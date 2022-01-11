package Core;
import Entity.BarangEntity;
import Entity.CustomerEntity;
import AllObject.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
//    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyy HH:mm:ss");
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyy HH:mm:ss");
    
    public static void main(String[] args){
        int pil;        
        do {
            System.out.println("1. Barang");
            System.out.println("2. Customer");
            System.out.println("0. Log Out");
            System.out.print("Pilih: ");
            pil = input.nextInt();
            input.nextLine();
            switch(pil) {
                case 1:
                    barang();
                    break;
                case 2:
                    customer();
                    break;
            }
        } while (pil != 0);
        
        
    }
    static void barang(){
    int pil;        
        do {
            System.out.println("1. Create Data Barang");
            System.out.println("2. Lihat Data Barang");
            System.out.println("3. Update Data Barang");
            System.out.println("4. Hapus Data Barang");
            System.out.println("0. Log Out");
            System.out.print("Pilih: ");
            pil = input.nextInt();
            input.nextLine();
            switch(pil) {
                case 1:
                    insertBarang();
                    break;
                case 2:
                    getBarang();
                    break;
                case 3:
                    updateBarang();
                    break;
                case 4:
                    deleteBarang();
                    break;
            }
        } while (pil != 0);
    }    
        
    
    
    static void insertBarang(){  
     System.out.print("Masukkan Nama = ");
     String nama = input.next();
     System.out.print("Masukkan Stok = ");
     int stok = input.nextInt();
     System.out.print("Masukkan Harga = ");
     double harga = input.nextDouble();
        System.out.println("");
    AllObjectController.barangController.insertBarang(0, new Date(), new Date(), nama, stok, harga);
     }
    
    static void getBarang(){
        
        System.out.println("");
        System.out.println("View:");
        for (int i=0;i<AllObjectController.barangController.getData().size();i++){
        //for (int i=0;i<x;i++){        
            System.out.println("Id = " + AllObjectController.barangController.getData().get(i).getId());
                System.out.println("Nama = " +AllObjectController.barangController.getData().get(i).getNama());
                System.out.println("Stok = " + AllObjectController.barangController.getData().get(i).getStok());
                System.out.println("Harga = " + AllObjectController.barangController.getData().get(i).getHarga());
                System.out.println("Created_at = " + AllObjectController.barangController.getData().get(i).getCreated_at());
                System.out.println("Update_at = " + dateFormat.format(AllObjectController.barangController.getData().get(i).getUpdated_at()));
                System.out.println("\n");
            }
            
    }
    
    
    
    static void updateBarang(){
    System.out.print("Ubah Id ke: ");
    int id = input.nextInt();
     System.out.print("Masukkan Nama = ");
     String nama = input.next();
     System.out.print("Masukkan Stok = ");
     int stok = input.nextInt();
     System.out.print("Masukkan Harga = ");
     double harga = input.nextDouble();
     System.out.println("");
     int row = AllObjectController.barangController.UpdateBarang(id, nama, stok, harga, new Date());
     if(row > 0){
         System.out.println(row + " updated");
     }else{
         System.out.println("gagal update");
     }
    }
    
    static void deleteBarang(){
        System.out.print("Input Nomor: ");
        int hapus = input.nextInt();
     AllObjectController.barangController.HapusBarang(hapus);
    }



//customer
    static void customer(){
    int pil;        
        do {
            System.out.println("1. Create Data Customer");
            System.out.println("2. Lihat Data Customer");
            System.out.println("3. Update Data Customer");
            System.out.println("4. Hapus Data Customer");
            System.out.println("0. Log Out");
            System.out.print("Pilih: ");
            pil = input.nextInt();
            input.nextLine();
            switch(pil) {
                case 1:
                    insertCustomer();
                    break;
                case 2:
                    getCustomer();
                    break;
                case 3:
                    updateCustomer();
                    break;
                case 4:
                    deleteCustomer();
                    break;
            }
        } while (pil != 0);
    }
    static void insertCustomer(){  
     System.out.print("Masukkan Nama = ");
     String nama = input.next();
     System.out.print("Masukkan Alamat = ");
     String alamat = input.next();
     System.out.print("Masukkan No Hp = ");
     String no_hp = input.next();
     System.out.print("Masukkan Username = ");
     String username = input.next();
     System.out.print("Masukkan Password = ");
     String password = input.next();
     
        System.out.println("");
    AllObjectController.customerController.insertCustomer(AllObjectController.customerController.getCustomer().size(), new Date(), new Date(), nama, alamat, no_hp, username, password);
     }
    
    static void getCustomer(){
        
        System.out.println("");
        System.out.println("View:");
        for (int i=0;i<AllObjectController.customerController.getData().size();i++){
        //for (int i=0;i<x;i++){        
            System.out.println("Id = " + AllObjectController.customerController.getData().get(i).getId());
                System.out.println("Nama = " + AllObjectController.customerController.getData().get(i).getNama());
                System.out.println("Alamat = " + AllObjectController.customerController.getData().get(i).getAlamat());
                System.out.println("No Hp = " + AllObjectController.customerController.getData().get(i).getNo_hp());
                System.out.println("Username = " + AllObjectController.customerController.getData().get(i).getUsername());
                System.out.println("Password = " + AllObjectController.customerController.getData().get(i).getPassword());
                System.out.println("Created_at = " + AllObjectController.customerController.getData().get(i).getCreated_at());
                System.out.println("Update_at = " + dateFormat.format(AllObjectController.customerController.getData().get(i).getUpdated_at()));
                System.out.println("\n");
            }
    }
    
    
    
    static void updateCustomer(){
    System.out.print("Ubah Id ke: ");
    int id = input.nextInt();
     System.out.print("Masukkan Nama = ");
     String nama = input.next();
     System.out.print("Masukkan Alamat = ");
     String alamat = input.next();
     System.out.print("Masukkan No Hp = ");
     String no_hp = input.next();
     System.out.print("Masukkan Username = ");
     String username = input.next();
     System.out.print("Masukkan Password = ");
     String password = input.next();
     AllObjectController.customerController.UpdateCustomer(id, nama, alamat, no_hp,username, password, new Date());
    }
    
    static void deleteCustomer(){
        System.out.print("Input Nomor: ");
        int hapus = input.nextInt();
     AllObjectController.customerController.HapusCustomer(hapus);
    }   
}