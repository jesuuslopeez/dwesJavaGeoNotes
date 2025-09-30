package com.example.geonotesteaching;

import java.util.Objects;


//Usar record genera automáticamente equals, hashCode y toString.
//Sin embargo, en casos de lógica compleja o herencia es recomendable usar una clase tradicional que no tenga record.
public class LegacyPoint { 
    double lat;
    double lon;
    public LegacyPoint(double lat, double lon) {
        if (lat < -90 || lat > 90) throw new IllegalArgumentException("Latitud inválida: " + lat);
        if (lon < -180 || lon > 180) throw new IllegalArgumentException("Longitud inválida: " + lon);
        this.lat = lat;
        this.lon = lon;
    }

    @Override
    public boolean equals(Object objeto){
        boolean igualdad = true;
        if (this == objeto){
            igualdad = true;
        } else {
            igualdad = false;
        }
        return igualdad;
    }

    @Override
    public int hashCode(){
        return Objects.hash(lat, lon);
    }

    @Override
    public String toString(){
        return "Latitud: " + lat + ", Longitud: " + lon + "}";
    }
    
}
