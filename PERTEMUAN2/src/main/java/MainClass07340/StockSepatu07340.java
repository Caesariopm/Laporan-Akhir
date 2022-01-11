package MainClass07340;
import Entity07340.KategoriSepatuEntity07340;
import Entity07340.PegawaiEntity07340;
import Entity07340.SepatuEntity07340;
import Entity07340.SepatuTerdaftarEntity07340;
import java.util.Date;
import java.util.Scanner;


public class StockSepatu07340 {
    private static Scanner input = new Scanner(System.in);
    private static SepatuEntity07340[] sepatuEntity= new SepatuEntity07340[100];
    private static PegawaiEntity07340[] pegawaiEntity = new PegawaiEntity07340[100];
    private static SepatuTerdaftarEntity07340[] terdaftarEntity = new SepatuTerdaftarEntity07340 [100];
    private static int pilSepatu;
    private static int jumSepatu = 0;
    private static int cekPegawai;

    public static void main(String[] args) {
        dataPegawai();
        int pil;
        do{
            System.out.println("Jumlah Sepatu = " +  jumSepatu);
            System.out.println("1. Login Pegawai ");
            System.out.println("2. Lihat Sepatu Terdaftar ");
            System.out.println("3. Biodata Pegawai ");
            System.out.println("0. Log Out");
            
            System.out.println("Pilihan  = ");
            pil = input.nextInt();
            input.nextLine();
            switch (pil){
                case 1: loginPegawai();
                    break;
                case 2: viewSepatu();;
                    break;
                case 3: viewPegawai();
                    break;
            }
        }while(pil != 0);
    }

    static int dataPegawai(){
        String namaPegawai[] = {"Rio"};
        String passPegawai[] = {"07340"};
        String umurPegawai[] = {"19"};
        
        for(int i = 0;i < namaPegawai.length;i++){
            pegawaiEntity[i] = new PegawaiEntity07340(namaPegawai[i],
            umurPegawai[i], passPegawai[i]);
        }
        return namaPegawai.length;
    }

    static void loginPegawai(){
        System.out.println("Nama : ");
        String nama = input.next();
        System.out.println("Password : ");
        String password = input.next();
        cekPegawai = login(nama, password);
        System.out.println("Selamat Datang " + pegawaiEntity[cekPegawai].getNama());
        
        int pil;
        do{
            System.out.println("Jumlah Sepatu = " +  jumSepatu);
            System.out.println("1. Daftar Sepatu");
            System.out.println("2. Ubah Data Sepatu");
            System.out.println("3. Lihat Sepatu Terdaftar");
            System.out.println("4. Hapus Sepatu");
            
            System.out.println("Pilihan = ");
            pil = input.nextInt();
            input.nextLine();
            switch (pil){
                case 1: insertSepatu();
                    break;
                case 2: updateSepatu();
                    break;
                case 3: viewSepatu();
                    break;
                case 4: deleteSepatu();
                    break;
            }
        }while(pil != 0);
    }

    static int login(String nama,String password){
        int loop = 0;
        for(int i = 0;i <= dataPegawai();i++){
            if(pegawaiEntity[i].getNama().equals(nama) && pegawaiEntity[i].getPassword().equals(password)){
                break;
            }else{
                loop++;
            }
        }
        return loop;
    }

    static void insertSepatu(){

        System.out.println("Input Nama : ");
        String nama = input.next();
        System.out.println("Input Ukuran : ");
        String ukuran = input.next(); 
        System.out.println("Input Warna : ");
        String warna = input.next();
        System.out.println("Input Tipe : ");
        String tipe = input.next();
        sepatuEntity[jumSepatu] = new SepatuEntity07340(nama, ukuran, warna, tipe);
        insertJenisSepatu();
    }
    static void insertJenisSepatu(){

        System.out.println("Jenis Sepatu : ");
        for(int i = 0;i < KategoriSepatuEntity07340.kategorisepatu.length;i++){
            System.out.println(i + "." + KategoriSepatuEntity07340.kategorisepatu[i]);
        }
        System.out.println("Pilih Jenis Sepatu : ");
        pilSepatu = input.nextInt();
        System.out.println("Input Kode Sepatu :");
        String kodeSepatu = input.next();
        terdaftarEntity[jumSepatu] = new SepatuTerdaftarEntity07340(sepatuEntity[jumSepatu],pilSepatu, kodeSepatu);
        jumSepatu = jumSepatu + 1;
    }
    static void updateSepatu(){
        System.out.println("Masukan Kode Sepatu yang mau di EDIT : ");
        String search = input.next();
        int cari = 0;

        do {
            if (cari == jumSepatu) {
                System.err.println("Tidak Ada Data!!!");
                break;
            } else if (terdaftarEntity[cari].getKodeSepatu().equals(search)) {
                int pilEdit;
                do {
                    System.out.println("Pilih Data yang ingin Diubah");
                    System.out.println("1. Lihat Sepatu");
                    System.out.println("2. Nama");
                    System.out.println("3. Ukuran");
                    System.out.println("4. Warna");
                    System.out.println("5. Tipe");
                    System.out.println("6. Jenis Sepatu");
                    System.out.println("0. EXIT");

                    pilEdit = input.nextInt();
                    input.nextLine();
                    if(pilEdit == 1){
                        System.out.println("=================================================");
                        System.out.println("Kode Sepatu : "+ terdaftarEntity[cari].getKodeSepatu());
                        System.out.println("=================================================");
                        System.out.println("Nama : "+sepatuEntity[cari].getNama());
                        System.out.println("Ukuran : "+sepatuEntity[cari].getUkuran());
                        System.out.println("Warna : "+sepatuEntity[cari].getWarna());
                        System.out.println("Tipe : "+sepatuEntity[cari].getTipe());
                        System.out.println("Jenis Sepatu : "+KategoriSepatuEntity07340.kategorisepatu[terdaftarEntity[cari].getIndexSepatu()]);
                        System.out.println("=================================================");
                    }else if(pilEdit == 2){
                        System.out.println("Ubah Nama : ");
                        String editNama = input.nextLine();
                        sepatuEntity[cari].setNama(editNama);
                    }else if(pilEdit == 3){
                        System.out.println("Ubah Ukuran : ");
                        String editUkuran = input.nextLine();
                        sepatuEntity[cari].setUkuran(editUkuran);
                    }else if(pilEdit == 4){
                        System.out.println("Ubah Warna : ");
                        String editWarna = input.nextLine();
                        sepatuEntity[cari].setWarna(editWarna);
                    }else if(pilEdit == 5){
                        System.out.println("Ubah Tipe : ");
                        String editTipe = input.nextLine();
                        sepatuEntity[cari].setTipe(editTipe);
                    }else if(pilEdit == 6){
                        System.out.println("Pilihan Jenis Sepatu : ");
                        for(int i = 0; i < KategoriSepatuEntity07340.kategorisepatu.length;i++){
                            System.out.println(i + "." + KategoriSepatuEntity07340.kategorisepatu[i]);
                        }
                        System.out.println("Pilih Jenis Sepatu : ");
                        int editSepatu = input.nextInt();
                        terdaftarEntity[cari].setIndexSepatu(editSepatu);
                    }
                } while (pilEdit != 0);
                break;
            }else{
                cari = cari+1;
            }
        } while (true);
    }
    static void viewSepatu(){
        if (jumSepatu == 0){
            System.err.println("Tidak ada sepatu terdaftar");
        }else{
            for(int i = 0;i<jumSepatu;i++){
                System.out.println("=================================================");
                System.out.println("Kode Sepatu : "+ terdaftarEntity[i].getKodeSepatu());
                System.out.println("=================================================");
                System.out.println("Nama : "+sepatuEntity[i].getNama());
                System.out.println("Ukuran : "+sepatuEntity[i].getUkuran());
                System.out.println("Warna : "+sepatuEntity[i].getWarna());
                System.out.println("Tipe : "+sepatuEntity[i].getTipe());
                System.out.println("Jenis Sepatu : "+KategoriSepatuEntity07340.kategorisepatu[terdaftarEntity[i].getIndexSepatu()]);
                System.out.println("=================================================");
            }
        }
    }

    static void viewPegawai(){
        for(int i = 0;i<dataPegawai();i++){
            System.out.println("=================================================");
            System.out.println("Nama : "+pegawaiEntity[i].getNama());
            System.out.println("Passwprd : "+pegawaiEntity[i].getPassword());
            System.out.println("Umur : "+pegawaiEntity[i].getUmur());
            System.out.println("=================================================");
        }
    }

    static void deleteSepatu(){
        System.out.println("Masukan Kode Sepatu yang mau di  DELETE: ");
        String search = input.next();
        int cari = 0;

        do {
            if (cari == jumSepatu) {
                System.err.println("Tidak Ada Data!!!");
                break;
            } else if (terdaftarEntity[cari].getKodeSepatu().equals(search)) {
                if(cari == jumSepatu - 1){
                    jumSepatu = jumSepatu - 1;
                }else{
                    for(int i = cari;i < jumSepatu;i++){
                        terdaftarEntity[i] = terdaftarEntity [i + 1];
                        sepatuEntity[i] = sepatuEntity [i + 1];
                    }
                    jumSepatu = jumSepatu -1;
                    break;
                }
            } else {
                cari = cari + 1;
            }
        }while(true);
    }
}