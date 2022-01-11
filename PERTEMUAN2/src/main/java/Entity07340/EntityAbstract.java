package Entity07340;

public abstract class EntityAbstract {
     protected String nama;
     
     public EntityAbstract(){}
     
     public EntityAbstract (String nama){
         this.nama = nama;
     }
     public String getNama(){
         return nama;
     }
}