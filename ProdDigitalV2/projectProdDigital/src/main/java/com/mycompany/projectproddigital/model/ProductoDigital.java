/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectproddigital.model;

/**
 *
 * @author Dhan
 */
public abstract class ProductoDigital {

    protected int id;
    protected String nombre;
    protected double precioBase;
    protected double tamanoMB;

    public ProductoDigital(int id, String nombre, double precioBase, double tamanoMB) {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.tamanoMB = tamanoMB;
    }

    public abstract double calcularPrecioFinal(); // POLIMORFISMO

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase; }
    public double getTamanoMB() { return tamanoMB; }
}
