package Model;

import Entity.MuridEntity;
import Helper.ConnectorDb;
import java.sql.*;
import java.util.ArrayList;
        
public class MuridModel {
    private String sql;
    Connection conn = ConnectorDb.getconnection();

    public ArrayList<MuridEntity>getMurid(){
        ArrayList<MuridEntity> arraylistMurid = new ArrayList<>();
        try {
            Statement stat = conn.createStatement();
            sql = "SELECT * FROM murid";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                MuridEntity muridEntity = new MuridEntity();
                muridEntity.setId(rs.getInt("id"));
                muridEntity.setNama(rs.getString("nama"));
                muridEntity.setKelas(rs.getString("kelas"));
                muridEntity.setPassword(rs.getString("password"));
                muridEntity.setNoTelp(rs.getString("noTelp"));
                arraylistMurid.add(muridEntity);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return arraylistMurid;
    }

    public void createData(MuridEntity MuridEntity) {
        try {
            sql = "INSERT INTO murid (nama, kelas, password, noTelp) Values(?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, MuridEntity.getNama());
            stat.setString(2, MuridEntity.getKelas());
            stat.setString(3, MuridEntity.getPassword());
            stat.setString(4, MuridEntity.getNoTelp());
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e) {
            System.out.println("Gagal Input Data!!!");
            e.printStackTrace();
        }
    }

    public void updateNama(String nama, int id) {
        try {
            sql = "update murid SET nama =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,nama);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e) {
            System.out.println("Gagal Update Nama!!!");
            e.printStackTrace();
        }
    }
    public void updateNpm(String kelas, int id) {
        try {
            sql = "update murid SET kelas =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,kelas);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e) {
            System.out.println("Gagal Update Kelas!!!");
            e.printStackTrace();
        }
    }
    public void updatePassword(String password, int id) {
        try {
            sql = "update murid SET password =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,password);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e) {
            System.out.println("Gagal Update Password!!!");
            e.printStackTrace();
        }
    }
    public void updateNoTelp(String noTelp, int id) {
        try {
            sql = "update murid SET noTelp =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,noTelp);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e) {
            System.out.println("Gagal Update NoTelp!!!");
            e.printStackTrace();
        }
    }
    public void deleteMurid(int id) {
        try {
            sql = "DELETE FROM murid WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e) {
            System.out.println("Gagal Hapus!!!");
            e.printStackTrace();
        }
    }
    public int cekFind(String nama) {
        int cek = 0;
        try {
            sql = "SELECT * FROM murid WHERE nama =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,nama);
            ResultSet rs = stat.executeQuery();
            if (rs.next()){
                cek = rs.getInt("id");
            }else{
                cek = 0;
            }
        } catch (SQLException e) {
            System.out.println("Gagal Update Nama!!!");
            e.printStackTrace();
        }
        return cek;
    }
}