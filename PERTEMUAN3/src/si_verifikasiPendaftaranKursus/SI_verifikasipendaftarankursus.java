package si_verifikasiPendaftaranKursus;

import Controller.MuridController;
import Entity.MuridEntity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;


public class SI_verifikasipendaftarankursus {
        public static Scanner input = new Scanner(System.in);
        public static MuridController murid = new MuridController();
        public static void main(String[] args) {
        int pilih;
        do{
            
            System.out.println("SELAMAT DATANG DI PROGRAMM VERIFIKASI DATA MAHASISWA");
            System.out.println("1. Input Data");
            System.out.println("2. Show Data");
            System.out.println("3. Update Data");
            System.out.println("4. Delete Data");
            System.out.println("5. Keluar");
            
            System.out.println("Masukan Pilihan : ");
            pilih = input.nextInt();
            input.nextLine();
            switch(pilih){
                case 1 : insertData();break;
                case 2 : showData();break;
                case 3 : update();break;
                case 4 : deleteData();break;
                case 5 : System.out.println("Berhasil keluar");
            }

        }while(pilih <= 4);
    }
    static void showData(){
        for (MuridEntity muridEntity : murid.getDataMurid()){
            System.out.println("--------------------------------------------------");
            System.out.println("id = "+ muridEntity.getId());
            System.out.println("nama = "+ muridEntity.getNama());
            System.out.println("kelas = "+ muridEntity.getKelas());
            System.out.println("pass = "+ muridEntity.getPassword());
            System.out.println("no telp = "+ muridEntity.getNoTelp());
        }
    }
    
    static void insertData(){
        System.out.print("nama : ");
        String nama = input.nextLine();
        System.out.print("kelas : ");
        String kelas = input.nextLine();       
        System.out.print("password : ");
        String password = input.nextLine();
        System.out.print("no telp : ");
        String no_telp = input.nextLine();
        murid.insertData(nama, kelas, password, no_telp);
    }
    
    static void deleteData(){
        showData();
        System.out.println(" ");
        System.out.print("Hapus Id = ");
        int id = input.nextInt();
        murid.deleteData(id);
    }
    public static void update(){
        System.out.println("Nama Yang Mau Di Update : ");
        String nama = input.nextLine();
        
        int cek = murid.cekFind(nama);
        if(cek != 0){
            System.out.println("Berhasil Ditemukan");
            updateData(cek);
        }else{
            System.out.println("Tidak Ditemukan");
        }
    } 
    
    static void updateData(int id){
        int pil;
        do {
            System.out.println("Pilihan Data diubah");
            System.out.println("1.nama ");
            System.out.println("2.kelas");
            System.out.println("3.password");
            System.out.println("4.notelp");
            System.out.println("5.keluar");
            
            System.out.println("Masukan Pilihan : ");
            pil = input.nextInt();
            input.nextLine();
            switch (pil) {
                case 1:
                    System.out.print("nama : ");
                    String nama = input.nextLine();
                    murid.updateData(pil, nama, id);
                    break;
                case 2: 
                    System.out.print("kelas : ");
                    String kelas = input.nextLine();
                    murid.updateData(pil, kelas, id);
                    break;
                case 3: 
                    System.out.print("password : ");
                    String pass = input.nextLine();
                    murid.updateData(pil, pass, id);
                    break;
                case 4: 
                    System.out.print("noTelp : ");
                    String noTelp = input.nextLine();
                    murid.updateData(pil, noTelp, id);
                    break;
                default:
                    System.out.println("input salah");
                    break;
            }
        } while (pil < 5);
    }
}