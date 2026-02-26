/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectproddigital.model;

public class Ebook extends ProductoDigital implements IDescargable {

    private int numeroPaginas;
    private String formato;

    public Ebook(int id, String nombre, double precioBase, double tamanoMB, int numeroPaginas, String formato) {
        super(id, nombre, precioBase, tamanoMB);
        this.numeroPaginas = numeroPaginas;
        this.formato = formato;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase + (numeroPaginas * 100);
    }

    @Override
    public void descargar() {
        System.out.println("Descargando Ebook...");
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getFormato() {
        return formato;
    }
    
}
