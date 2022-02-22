/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Stevia
 */
import Modelo.MDB;
import Vista.FrmClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorClientes implements ActionListener{
  private FrmClientes _view; //el formulario 
  private MDB _model;//el manejador de bases de datos
  
  //Probando Cambios
    
    public ControladorClientes(FrmClientes view, MDB model){
       this._model=model;
       this._view=view;
        this._view.cmdAlta.addActionListener(this);//se obtiene el control sobre el botón alta del formulario
this._view.cmdEliminar.addActionListener(this);//se obtiene el control de botón eliminar
}
@Override
//En este método se ΗatrapaΗ la interacción del usuario
public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql

        if (e.getSource()==_view.cmdAlta){ //Si el botón presionado fue el de alta
         // System.out.print("paso");
        //leyenda=_model.registrarAlta("tbusuarios"," null, ' " +_view.txtNombre.getText()+" ',' " +_view.txtUsuario.getText() +" ', "+_view.txtpsw.getText() );
        leyenda = _model.registrarAlta("clientes", _view.txtCedula.getText() + ",'" + _view.txtLugarExpedicion.getText() + "','" 
                + _view.txtNombreCompleto.getText() + "','" + _view.txtProfesion.getText() + "','" 
                + _view.txtDireccionResidencial.getText() + "','" 
                + _view.txtCiudad.getText() + "','" 
                + _view.txtDepartamento.getText() + "','" 
                + _view.txtEmail.getText() + "'," 
                + _view.txtTelefonoResidencia.getText() + ","
                + _view.txtTelefonoTrabajo.getText() + ","
                + _view.txtNumeroFactura.getText() + ","
                + _view.txtFechaCredito.getText() + ",'" 
                + _view.txtTipoCartera.getText() + "'," 
                + _view.txtValorCredito.getText() + "," 
                + _view.txtNumeroCuotas.getText());
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obteindos de las cajas de texto
       System.out.print (leyenda);
       JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();//se limpian las cajas de texto
        //agregar otros botones si se necesitan implementar
}
}
public void iniciar(){
_view.setTitle("MVC_Visual");
}
public void limpiar(){
_view.txtCedula.setText(null);
_view.txtCiudad.setText(null);
_view.txtDepartamento.setText(null);
_view.txtDireccionResidencial.setText(null);
_view.txtEmail.setText(null);
_view.txtFechaCredito.setText(null);
_view.txtLugarExpedicion.setText(null);
_view.txtNombreCompleto.setText(null);
_view.txtNumeroCuotas.setText(null);
_view.txtNumeroFactura.setText(null);
_view.txtProfesion.setText(null);
_view.txtTelefonoResidencia.setText(null);
_view.txtTelefonoTrabajo.setText(null);
_view.txtTipoCartera.setText(null);
_view.txtValorCredito.setText(null);
}
}
