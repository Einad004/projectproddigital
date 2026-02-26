/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectproddigital.service;

import com.mycompany.projectproddigital.model.ProductoDigital;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dhan
 */
public class ProductoService {

    private static List<ProductoDigital> productos = new ArrayList<>();
    
    public static ProductoDigital addProducto(ProductoDigital p){
        productos.add(p);
        return p;
    }

    public static List<ProductoDigital> listarProductos() {
        return productos;
    }

    public static ProductoDigital buscarPorCodigo(int id) {
        for (ProductoDigital p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

   public static boolean actualizarProducto(ProductoDigital productoActualizado) {
    for (int i = 0; i < productos.size(); i++) {
        if (productos.get(i).getId() == productoActualizado.getId()) {
            productos.set(i, productoActualizado);
            return true;
        }
    }
    return false;
}

    public static boolean eliminar(int id) {
        ProductoDigital p = buscarPorCodigo(id);
        if (p != null) {
            productos.remove(p);
            return true;
        }
        return false;
    }
}
