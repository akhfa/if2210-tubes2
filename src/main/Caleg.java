/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author akhfa
 */
public class Caleg {
    private final String NIK;
    private final String Nama;
    private final String NamaPartai;
    private final String History;
    private final int NoDapil;
    private final String Lingkup;//DPR, DPD, DPRDProv, DPRDKab
    
    public Caleg(String _NIK, String nama, String _Partai, String _History, int _NoDapil, String lingkup){
        NIK = _NIK;
        Nama = nama;
        NamaPartai = _Partai;
        History = _History;
        NoDapil = _NoDapil;
        Lingkup = lingkup;
    }
    
    public String GetNIK(){
        return NIK;        
    }
    
    public String GetPartai(){
        return NamaPartai;
    }
    
    public String GetHistory(){
        return History;
    }
    
    public int GetDapil(){
        return NoDapil;
    }
    
    public String getLingkup()
    {
        return Lingkup;
    }
    
}
