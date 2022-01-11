package Controller;

import Entity.MuridEntity;
import java.util.ArrayList;
import java.util.Date;

public class MuridController {
   public void insertData(String nama, String kelas, String password, String no_telp){
        MuridEntity muridEntities = new MuridEntity();
        muridEntities.setNama(nama);
        muridEntities.setKelas(kelas);
        muridEntities.setPassword(password);
        muridEntities.setNoTelp(no_telp);
        AllObjectModel.muridModel.createData(muridEntities);
    }
    public ArrayList<MuridEntity> getDataMurid(){
        return AllObjectModel.muridModel.getMurid();
    }
    public int cekFind(String nama){
        int cek = AllObjectModel.muridModel.cekFind(nama);
        return cek;
    }
 
    public void updateData(int urut, String data, int id){
        switch(urut){
            case 1 : AllObjectModel.muridModel.updateNama(data, id);
                break;
            case 2 : AllObjectModel.muridModel.updateNpm(data, id);
                break;
            case 3 : AllObjectModel.muridModel.updatePassword(data, id);
                break;
            case 4 : AllObjectModel.muridModel.updateNoTelp(data, id);
                break;
        }
    }
    
    public void deleteData(int id){
        AllObjectModel.muridModel.deleteMurid(id);
    }
}