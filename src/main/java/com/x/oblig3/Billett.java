package com.x.oblig3;

public class Billett {

    private String film;
    private String antall;
    private String fornavn;
    private String etternavn;
    private String telefonNr;
    private String epost;

    public Billett(String film, String antall, String fornavn, String etternavn, String telefonNr, String epost) {
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonNr = telefonNr;
        this.epost = epost;
    }
    public Billett(){}

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


    @Override
    public String toString() {
        return "Billett{" +
                "film='" + film + '\'' +
                ", antall=" + antall +
                ", fornavn='" + fornavn + '\'' +
                ", etternavn='" + etternavn + '\'' +
                ", telefonNr='" + telefonNr + '\'' +
                ", epost='" + epost + '\'' +
                '}';
    }
}
