/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import vista.PanelRegistrarPedido;
import vista.VentanaPrincipal;

/**
 *
 * @author krypt97
 */
public class TestPaneles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PanelRegistrarPedido miPanelRegistrarPedido = new PanelRegistrarPedido();
        miPanelRegistrarPedido.setSize(935, 701);
        
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        miVentanaPrincipal.setSize(935, 900);
        miVentanaPrincipal.PanelPrincipal.add(miPanelRegistrarPedido);
        
        miVentanaPrincipal.setVisible(true);
        miPanelRegistrarPedido.setVisible(true);
    }
    
}
