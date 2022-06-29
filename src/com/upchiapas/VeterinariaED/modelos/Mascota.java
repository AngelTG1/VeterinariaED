package com.upchiapas.VeterinariaED.modelos;

public class Mascota {
    private int id;
    private String nombre;
    private String tipoMoscota;

    public Mascota(int id, String nombre, String tipoMoscota) {
        this.id = id;
        this.nombre = nombre;
        this.tipoMoscota = tipoMoscota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoMoscota() {
        return tipoMoscota;
    }

    public void setTipoMoscota(String tipoMoscota) {
        this.tipoMoscota = tipoMoscota;
    }
}
