package Entity07340;

public class SepatuEntity07340 extends GudangEntity07340{
    private String tipe;

    public SepatuEntity07340(String nama, String ukuran,
            String warna , String tipe){
        super(nama, ukuran, warna);
        this.tipe = tipe;
    }
    public String getTipe(){
        return tipe;
    }
    public void setTipe(String tipe){
        this.tipe = tipe;
    }   
}