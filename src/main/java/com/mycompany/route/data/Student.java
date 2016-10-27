/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.route.data;

/**
 *
 * @author profesor
 */
public class Student {

    private String imeIPrezime;
    private Integer indeks;
    private Integer godina;

    public Student() {
    }

    public Student(String imeIPrezime, Integer indeks, Integer godina) {
        this.imeIPrezime = imeIPrezime;
        this.indeks = indeks;
        this.godina = godina;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public Integer getIndeks() {
        return indeks;
    }

    public void setIndeks(Integer indeks) {
        this.indeks = indeks;
    }

    public Integer getGodina() {
        return godina;
    }

    public void setGodina(Integer godina) {
        this.godina = godina;
    }
    
}
