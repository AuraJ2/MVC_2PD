/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_java;

import Controlador.ControladorClientes;
import Controlador.ControladorMDB;
import Controlador.ControladorSeguimientoClientes;
import Modelo.MDB;
import Vista.FrmClientes;
import Vista.FrmSeguimientoClientes;
import Vista.FrmVista;

/**
 *
 * @author Stevia
 */
public class MVC_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MDB objModelo=new MDB();
        FrmVista objVista=new FrmVista();
        FrmClientes objClientes = new FrmClientes();
        FrmSeguimientoClientes objSeguimiento = new FrmSeguimientoClientes();
        ControladorMDB objController;
        ControladorClientes objControllerClientes;
        ControladorSeguimientoClientes objControllerSiguimiento;
      
        objController = new ControladorMDB(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
        
        objControllerClientes = new ControladorClientes(objClientes, objModelo);
        objControllerClientes.iniciar();
        objClientes.setVisible(true);
        
          objControllerSiguimiento = new ControladorSeguimientoClientes(objSeguimiento, objModelo);
          objControllerSiguimiento.iniciar();
          objSeguimiento.setVisible(true);
          
        
    }
    
}
