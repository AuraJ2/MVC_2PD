package mvc_java;

import Controlador.ControladorClientes;
import Controlador.ControladorMDB;
import Controlador.ControladorSeguimientoClientes;
import Modelo.MDB;
import Vista.FrmClientes;
import Vista.FrmSeguimientoClientes;
import Vista.FrmVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Stevia
 */
public class MVC_Java  {

    private FrmClientes _view;
    private FrmSeguimientoClientes _view2;
    private FrmVista _view3;

    public static void main(String[] args) {
        // TODO code application logic here

        MDB objModelo = new MDB();
        FrmVista objVista = new FrmVista();
        FrmClientes objClientes = new FrmClientes();
        FrmSeguimientoClientes objSeguimiento = new FrmSeguimientoClientes();
        ControladorMDB objController;
        ControladorClientes objControllerClientes;
        ControladorSeguimientoClientes objControllerSiguimiento;

        objController = new ControladorMDB(objVista, objModelo);
        objController.iniciar();

        objControllerClientes = new ControladorClientes(objClientes, objModelo);
        objControllerClientes.iniciar();
        objClientes.setVisible(true);

        objControllerSiguimiento = new ControladorSeguimientoClientes(objSeguimiento, objModelo);
        objControllerSiguimiento.iniciar();
        objSeguimiento.setVisible(true);
        
}

}
