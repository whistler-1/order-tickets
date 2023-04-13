package com.x.oblig3;

public class Ticket {

    private int id;
    private String film;
    private String antall;
    private String fornavn;
    private String etternavn;
    private String telefonNr;
    private String epost;

    public Ticket(int id, String film, String antall, String fornavn, String etternavn, String telefonNr, String epost) {
        this.id = id;
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonNr = telefonNr;
        this.epost = epost;
    }

    public Ticket(){}


    public int getId() {
        return id;
    }

    public String getFilm() {
        return film;
    }

    public String getAntall() {
        return antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getTelefonNr() {
        return telefonNr;
    }

    public String getEpost() {
        return epost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public void setAntall(String antall) {
        this.antall = antall;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setTelefonNr(String telefonNr) {
        this.telefonNr = telefonNr;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", film='" + film + '\'' +
                ", antall='" + antall + '\'' +
                ", fornavn='" + fornavn + '\'' +
                ", etternavn='" + etternavn + '\'' +
                ", telefonNr='" + telefonNr + '\'' +
                ", epost='" + epost + '\'' +
                '}';
    }
}
