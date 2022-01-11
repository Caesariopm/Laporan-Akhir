package Entity;

import java.util.Date;

public class MuridEntity extends UserEntityAbstract{
   private String kelas;
    
    public MuridEntity(){};
    public String getKelas() {   
        return kelas; 
    }
    public void setKelas(String kelas) {  
        this.kelas = kelas;    
    } 
}