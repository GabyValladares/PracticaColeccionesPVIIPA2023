/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import DUI.Personas;

/**
 *
 * @author pablo
 */
public class Vehiculo extends Personas {
    private int anio ;
    private String color;
    private String marca;
    private String placa;
    private String tipoV;
    private int valorV;
    private double multas;
    
    public Vehiculo(){
        
    }
    public Vehiculo(int anio,String color,String marca,String placa,
            String tipoV,int valorV,double multas){
        this.anio=anio;
        this.color=color;
        this.marca=marca;
        this.placa=placa;
        this.tipoV=tipoV;
        this.valorV=valorV;
        this.multas=multas;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the tipoV
     */
    public String getTipoV() {
        return tipoV;
    }

    /**
     * @param tipoV the tipoV to set
     */
    public void setTipoV(String tipoV) {
        this.tipoV = tipoV;
    }

    /**
     * @return the valorV
     */
    public int getValorV() {
        return valorV;
    }

    /**
     * @param valorV the valorV to set
     */
    public void setValorV(int valorV) {
        this.valorV = valorV;
    }

    /**
     * @return the multas
     */
    public double getMultas() {
        return multas;
    }

    /**
     * @param multas the multas to set
     */
    public void setMultas(double multas) {
        this.multas = multas;
    }
    
}
