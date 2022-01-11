package Entity07340;

public class SepatuTerdaftarEntity07340 {
    private SepatuEntity07340 sepatuEntity;
    private int indexSepatu;
    private String kodeSepatu;
    
    public SepatuTerdaftarEntity07340(SepatuEntity07340 sepatuEntity,
            int indexSepatu, String kodeSepatu){
        this.sepatuEntity = sepatuEntity;
        this.indexSepatu = indexSepatu;
        this.kodeSepatu = kodeSepatu;
    }
    public SepatuEntity07340 getSepatuEntity(){
        return sepatuEntity;
    }
    public void setSepatuEntity(SepatuEntity07340 sepatuEntity){
        this.sepatuEntity = sepatuEntity;
    }
    public int getIndexSepatu(){
        return indexSepatu;
    }
    public void setIndexSepatu(int indexSepatu){
        this.indexSepatu = indexSepatu;
    }
    public String getKodeSepatu(){
        return kodeSepatu;
    }
    public void setKodeSepatu(String kodeSepatu){
        this.kodeSepatu = this.kodeSepatu;
    }
}