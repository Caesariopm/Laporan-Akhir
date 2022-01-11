package Entity07340;

public class PegawaiEntity07340 extends EntityAbstract{
     protected String umur,password;
    
    public PegawaiEntity07340( String nama, String umur, String password){
        super(nama);
        this.umur = umur;
        this.password = password;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getUmur(){
        return umur;
    }
    public void setUmur(String umur){
        this.umur = umur;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    } 
}