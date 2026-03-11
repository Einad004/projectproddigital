/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.projectproductodigital;

import com.mycompany.view.ViewPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dhan
 */
public class ProjectProductoDigital {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        ViewPrincipal gui = new ViewPrincipal();
        gui.setVisible(true);
    }
    
    public static void testEstudiante(){        
        try {
        } catch (Exception ex) {
            Logger.getLogger(ProjectProductoDigital.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
