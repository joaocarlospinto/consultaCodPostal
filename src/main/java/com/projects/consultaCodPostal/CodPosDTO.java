package com.projects.consultaCodPostal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CodPosDTO  {

    private String morada;
    private String porta;
    private String localidade;
    private String freguesia;
    private String concelho;
    private String distrito;
    private String latitude;
    private String longitude;

    @JsonProperty("codigo-postal")
    private String codPostal;

    @JsonProperty("info-local")
    private String infoLocal;

    @JsonProperty("codigo-arteria")
    private String codArteria;

    @JsonProperty("concelho-codigo")
    private int codConcelho;

    @JsonProperty("distrito-codigo")
    private int codDistrito;

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getFreguesia() {
        return freguesia;
    }

    public void setFreguesia(String freguesia) {
        this.freguesia = freguesia;
    }

    public String getConcelho() {
        return concelho;
    }

    public void setConcelho(String concelho) {
        this.concelho = concelho;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


    @JsonProperty("codigo-postal")
    public String getCodPostal() {
        return codPostal;
    }

    @JsonProperty("codigo-postal")
    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    @JsonProperty("info-local")
    public String getInfoLocal() {
        return infoLocal;
    }

    @JsonProperty("info-local")
    public void setInfoLocal(String infoLocal) {
        this.infoLocal = infoLocal;
    }

    @JsonProperty("codigo-arteria")
    public String getCodArteria() {
        return codArteria;
    }

    @JsonProperty("codigo-arteria")
    public void setCodArteria(String codArteria) {
        this.codArteria = codArteria;
    }

    @JsonProperty("concelho-codigo")
    public int getCodConcelho() {
        return codConcelho;
    }

    @JsonProperty("concelho-codigo")
    public void setCodConcelho(int codConcelho) {
        this.codConcelho = codConcelho;
    }

    @JsonProperty("distrito-codigo")
    public int getCodDistrito() {
        return codDistrito;
    }
    @JsonProperty("distrito-codigo")
    public void setCodDistrito(int codDistrito) {
        this.codDistrito = codDistrito;
    }
}
