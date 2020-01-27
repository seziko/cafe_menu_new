package com.cafe_menu.tanim.entity;
import com.cafe_menu.baseEntity.BaseEntity;
public class Adres {


    BaseEntity baseEntity = new BaseEntity();


    String id;
    String il;
    String ilce;
    String ulke;
    String beyan_adres;
    String ekul;
    String etar;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getBeyan_adres() {
        return beyan_adres;
    }

    public void setBeyan_adres(String beyan_adres) {
        this.beyan_adres = beyan_adres;
    }

    public String getEkul() {
        return ekul;
    }

    public void setEkul(String ekul) {
        this.ekul = ekul;
    }

    public String getEtar() {
        return etar;
    }

    public void setEtar(String etar) {
        this.etar = etar;
    }
}
