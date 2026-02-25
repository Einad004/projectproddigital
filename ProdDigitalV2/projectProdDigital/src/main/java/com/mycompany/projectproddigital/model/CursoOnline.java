/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectproddigital.model;

public class CursoOnline extends ProductoDigital {

    private int duracionHoras;
    private String certificado;
    private Proveedor proveedor; // ASOCIACIÓN

    public CursoOnline(int id, String nombre, double precioBase, double tamanoMB,
                       int duracionHoras, String certificado, Proveedor proveedor) {
        super(id, nombre, precioBase, tamanoMB);
        this.duracionHoras = duracionHoras;
        this.certificado = certificado;
        this.proveedor = proveedor;
    }

    public CursoOnline(int duracionHoras, String certificado, int id, String nombre, double precioBase, double tamanoMB) {
        super(id, nombre, precioBase, tamanoMB);
        this.duracionHoras = duracionHoras;
        this.certificado = certificado;
    }
    
    

    /*@Override
    public double calcularPrecioFinal() {
        double adicional = duracionHoras * 2000;
        if (certificado) {
            adicional += 10000;
        }
        return precioBase + adicional;
    }*/

    public Proveedor getProveedor() {
        return proveedor;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public String isCertificado() {
        return certificado;
    }

    @Override
    public double calcularPrecioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    
}
