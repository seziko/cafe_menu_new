package com.cafe_menu.tanim.entity;

public class Kullanici {

    Kimlik kimlik = new Kimlik();

    Integer id;
    String kullaniciAdi;
    String kullaniciSifre;
    Integer kimlik_id;


    public Kimlik getKimlik() {
        return kimlik;
    }

    public void setKimlik(Kimlik kimlik) {
        this.kimlik = kimlik;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciSifre() {
        return kullaniciSifre;
    }

    public void setKullaniciSifre(String kullaniciSifre) {
        this.kullaniciSifre = kullaniciSifre;
    }

    public Integer getKimlik_id() {
        return kimlik_id;
    }

    public void setKimlik_id(Integer kimlik_id) {
        this.kimlik_id = kimlik_id;
    }
}
