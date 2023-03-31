/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;

/**
 *
 * @author LENOVO
 */
public class simpan {
    private static String username;
    private byte[] foto;
    private static String jenis;
    
    public byte[] getFoto() {
        return foto;
    }
 
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    public static String getUsername(){
        return username;
    }
    
    public static void setUsername(String user){
        simpan.username = user;
    }
    
    public static String getJenis(){
        return jenis;
    }
    
    public void setJenis(String jenis){
        simpan.jenis = jenis;
    }
}
