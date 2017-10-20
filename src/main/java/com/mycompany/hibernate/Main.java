/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernate;
import com.mycompany.hibernate.service.DbOlusturService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Master
 */
public class Main extends Date{
    
      @Override
    public String toString() {
        
        DateFormat dateFormat=new SimpleDateFormat( "dd/MM/yyyy HH:mm:ss");
        return dateFormat.format(this);
      
    }
    public static void main(String[] args) {
         DateFormat dateFormat=new SimpleDateFormat( "dd/MM/yyyy HH:mm:ss");
         Date today = Calendar.getInstance().getTime();
         String reportDate = dateFormat.format(today);
        DbOlusturService dbOlusturService=new DbOlusturService();
        DbOlustur dbOlustur=new DbOlustur();
        List<DbOlustur> list=new ArrayList<>();
        dbOlustur.setAd( "furkan");
        dbOlustur.setSoyad( "unallll");
        dbOlustur.setDeneme( "oldu devamıda olur inş");
        dbOlustur.setTarih(Date.from(Instant.now()));
        dbOlustur.setZaman(reportDate);
        list.add(dbOlustur);
         dbOlusturService.save(dbOlustur);

         
         List<DbOlustur>listo=dbOlusturService.getAll(dbOlustur.getClass());
         for (DbOlustur listo1 : listo) {
             System.out.println(listo1.toString());
        }
        
        
//              Main m=new Main();                                                 
//            dbOlustur.setTarih(m);      
//        System.out.println( dbOlustur.getTarih() );
         //burasının date yazma seklı tr ye uygun yapıldı date clası exdent edılıp tostrıngı override edildi dbolustur
         // clasıda bu clasdan turetıldı ve sorun halledıldı.
         //Data Basede yapabılmen ıcın Databasenın tarıh ayarıylada oynaman lazım.
         //2. yol ıse dateyı strınge fortmatını deısdırerek parse edıp dbolusdura zaman dıye bır strıng acdık oda aynı ısı yapıo.
       
    }
}
