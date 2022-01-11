package Entity07340;

public class GudangEntity07340 extends EntityAbstract{
    protected String ukuran,warna;
    
    public GudangEntity07340(String nama, String ukuran, String warna){
        super(nama);
        this.ukuran = ukuran;
        this.warna = warna;
    }
    @Override
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getUkuran(){
        return ukuran;
    }
    public void setUkuran(String ukuran){
        this.ukuran = ukuran;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }   
}