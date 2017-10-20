/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernate;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Master
 */
@Entity
@Table(name=  "denemeX")
public class DbOlustur extends Main{
    private String ad;
    private String soyad;
    private int id;
    private String deneme;
    private Date tarih;
    private String zaman;
    @Column(name =  "adkolonu",length = 30)
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    @Column(name =  "soyadkolonu",length = 30)
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
   @Id
   @SequenceGenerator(name =  "seq_dbolusdur",sequenceName =  "seq_dbolusdur",allocationSize = 1)
   @GeneratedValue(generator =  "seq_dbolusdur",strategy = GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
@Column(name =  "deneme")
    public String getDeneme() {
        return deneme;
    }

    public void setDeneme(String deneme) {
        this.deneme = deneme;
    }
     @Column(name = "date")
    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }
     @Column(name = "dates")
    public String getZaman() {
        return zaman;
    }

    public void setZaman(String zaman) {
        DateFormat dateFormat=new SimpleDateFormat( "dd/MM/yyyy HH:mm:ss");
       
      
            this.zaman = zaman;
    }

    @Override
    public String toString() {
        return id+ " "+deneme+ " "+soyad + " "+ad+ " "+tarih+ " "+zaman;
    }
    
    
}
