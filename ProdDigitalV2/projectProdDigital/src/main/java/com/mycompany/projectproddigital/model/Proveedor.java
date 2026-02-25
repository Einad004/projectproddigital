/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectproddigital.model;

public class Proveedor {

    private String nombreProveedor;
    private String pais;

    public Proveedor(String nombreProveedor, String pais) {
        this.nombreProveedor = nombreProveedor;
        this.pais = pais;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public String getPais() {
        return pais;
    }
}
