package com.cafe_menu.tanim.entity;

import java.util.Date;

public class Kimlik {

    Integer id;
    Integer tcKimlikNo;
    String ad_soyad;
    Date dogumTarihi;
    String anneAdi;
    String babaAdi;
    Integer telefon;
    String mail;
    String adres;

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(Integer tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAd_soyad() {
        return ad_soyad;
    }

    public void setAd_soyad(String ad_soyad) {
        this.ad_soyad = ad_soyad;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getAnneAdi() {
        return anneAdi;
    }

    public void setAnneAdi(String anneAdi) {
        this.anneAdi = anneAdi;
    }

    public String getBabaAdi() {
        return babaAdi;
    }

    public void setBabaAdi(String babaAdi) {
        this.babaAdi = babaAdi;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
