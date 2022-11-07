/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gaji;

/**
 *
 * @author Asus
 */
public class ProjectGaji {
    public static void main(String[] args) {
        Gaji Pegawai = new Gaji();
        Pegawai.setNIP(123456);
        Pegawai.setNama("Joni");
        Pegawai.setAlamat("Purwokerto");
        Pegawai.setJumlah(10);
        Pegawai.setGajiPokok(1000000);
        Pegawai.HitungTotalGaji();
        Pegawai.display();
        
        Gaji Gubernur = new Gaji();
        Pegawai.setNIP(123456);
        Pegawai.setNama("Joni");
        Pegawai.setAlamat("Purwokerto");
        Pegawai.setJumlah(10);
        Pegawai.setGajiPokok(1000000);
        Pegawai.HitungTotalGaji(0.05f);
        Pegawai.display();
    }
    
}
