/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Dhan
 */
public class CursoOnline extends ProductoDigital{
    
    private int duracionHoras;
    private String certificado;

    public CursoOnline(int id, String nombre, double precioBase, double tamanoMB,
                       int duracionHoras, String certificado) {
        super(id, nombre, precioBase, tamanoMB);
        this.duracionHoras = duracionHoras;
        this.certificado = certificado;
    }

    public CursoOnline(int duracionHoras, String certificado, int id, String nombre, double precioBase, double tamanoMB) {
        super(id, nombre, precioBase, tamanoMB);
        this.duracionHoras = duracionHoras;
        this.certificado = certificado;
    }
    
    
    public int getDuracionHoras() {
        return duracionHoras;
    }

    public String isCertificado() {
        return certificado;
    }

    public String getCertificado() {
        return certificado;
    }

   
    @Override
    public double calcularPrecioFinal() {
        double adicional = duracionHoras * 2000;
        if (certificado.equalsIgnoreCase("SI"))
        {
            adicional += 10000;
        }
        return precioBase + adicional;
    }
     
}
