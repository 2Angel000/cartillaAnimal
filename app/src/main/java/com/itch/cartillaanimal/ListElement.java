package com.itch.cartillaanimal;

import android.widget.ImageView;

public class ListElement {

    public String nombreMascota;
    public String tipoMascota;
    public String edadMascota;
    public String pesoMascota;
    public ImageView imgMascota;

    public ListElement(String nombreMascota, String tipoMascota, String edadMascota, String pesoMascota) {
        this.nombreMascota = nombreMascota;
        this.tipoMascota = tipoMascota;
        this.edadMascota = edadMascota;
        this.pesoMascota = pesoMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(String edadMascota) {
        this.edadMascota = edadMascota;
    }

    public String getPesoMascota() {
        return pesoMascota;
    }

    public void setPesoMascota(String pesoMascota) {
        this.pesoMascota = pesoMascota;
    }

    public void setImgMascota(ImageView imgMascota) {
        this.imgMascota = imgMascota;
    }

}
