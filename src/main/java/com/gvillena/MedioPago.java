/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;
import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

/**
 *
 * @author WEB
 */
public class MedioPago implements JSONStreamAware{
    private String nombreTitular;
    private String numTarjeta;
    private String codSeguridad;
    private String caducidadMes;
    private String caducidadAnio;

    MedioPago(String _nombreTitular, String _numTarjeta, String _codSeguridad, String _caducidadMes, String _caducidadAnio) {
        nombreTitular = _nombreTitular;
        numTarjeta = _numTarjeta;
        codSeguridad = _codSeguridad;
        caducidadMes = _caducidadMes;
        caducidadAnio = _caducidadAnio;
    }

    /**
     * @return the nombreTitular
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * @param nombreTitular the nombreTitular to set
     */
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    /**
     * @return the numTarjeta
     */
    public String getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * @param numTarjeta the numTarjeta to set
     */
    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    /**
     * @return the codSeguridad
     */
    public String getCodSeguridad() {
        return codSeguridad;
    }

    /**
     * @param codSeguridad the codSeguridad to set
     */
    public void setCodSeguridad(String codSeguridad) {
        this.codSeguridad = codSeguridad;
    }

    /**
     * @return the caducidadMes
     */
    public String getCaducidadMes() {
        return caducidadMes;
    }

    /**
     * @param caducidadMes the caducidadMes to set
     */
    public void setCaducidadMes(String caducidadMes) {
        this.caducidadMes = caducidadMes;
    }

    /**
     * @return the caducidadAnio
     */
    public String getCaducidadAnio() {
        return caducidadAnio;
    }

    /**
     * @param caducidadAnio the caducidadAnio to set
     */
    public void setCaducidadAnio(String caducidadAnio) {
        this.caducidadAnio = caducidadAnio;
    }

    @Override
    public void writeJSONString(Writer out) throws IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        LinkedHashMap obj = new LinkedHashMap();
        obj.put("nombreTitular", nombreTitular);
        obj.put("numTarjeta", numTarjeta);
        obj.put("codSeguridad", codSeguridad);
        obj.put("caducidadMes", caducidadMes);
        obj.put("caducidadAnio", caducidadAnio);
        JSONValue.writeJSONString(obj, out);
    }
    
    
}
