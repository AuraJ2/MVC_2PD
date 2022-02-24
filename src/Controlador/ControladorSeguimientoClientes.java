package Controlador;

import Modelo.MDB;
import Vista.FrmSeguimientoClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorSeguimientoClientes implements ActionListener {
    FrmSeguimientoClientes _view;
    private MDB _model;
    
    public ControladorSeguimientoClientes(FrmSeguimientoClientes view, MDB model){
        this._model=model;
        this._view=view;
        this._view.cmdAltasSeguimiento.addActionListener(this);
        this._view.cmdEliminarSeguimiento.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent i) {
        String leyenda = "";
        
        if(i.getSource()== _view.cmdAltasSeguimiento){
            leyenda = _model.registrarAlta("seguimiento_clientes","null,"+ _view.txtCedula.getText()+ ",'" + _view.txtLugarEx.getText()+"','" + _view.txtNombre.getText()+ "','"
                    +_view.txtProfesion.getText()+"','" + _view.txtRecidencia.getText()+"','"+_view.txtCiudad.getText()+"','"+_view.txtDepa.getText()+"','"+_view.txtEmail.getText()+"',"+_view.txtTelResi.getText()+","+
                    _view.txtTelTra.getText()+","+_view.txtNumFact.getText()+",'"+_view.txtCartera.getText()+"','"+_view.txtFechaMora.getText()+"',"+_view.txtDiasMora.getText()+","+_view.txtValorMora.getText()+","+
                    _view.txtSeguro.getText()+","+_view.txtInteresMora.getText()+","+_view.txtSalud.getText()+",'"+_view.txtCobro.getText()+"','"+_view.txtFechaAc1.getText()+"','"+_view.txtAcuerdo1.getText()+"','"+
                    _view.txtFechaAc2.getText()+"','"+_view.txtAcuerdo2.getText()+"','"+_view.txtFechAc3.getText()+"','"+_view.txtAcuerdo3.getText()+"','"+_view.txtFechaAcuerdo4.getText()+"','"+_view.txtAcuerdo4.getText()+"'");
            System.out.println(leyenda);
            limpiar();
//            JOptionPane.showMessageDialog(null, leyenda);
        }
    }
    
    public void iniciar(){
        _view.setTitle("Seguimiento Clientes");
    }
    
    public void limpiar(){
        _view.txtCedula.setText(null);
        _view.txtLugarEx.setText(null);
        _view.txtNombre.setText(null);
        _view.txtProfesion.setText(null);
        _view.txtRecidencia.setText(null);
        _view.txtCiudad.setText(null);
        _view.txtDepa.setText(null);
        _view.txtEmail.setText(null);
        _view.txtTelResi.setText(null);
        _view.txtTelTra.setText(null);
        _view.txtNumFact.setText(null);
        _view.txtCartera.setText(null);
        _view.txtFechaMora.setText(null);
        _view.txtDiasMora.setText(null);
        _view.txtDiasMora.setText(null);
        _view.txtValorMora.setText(null);
        _view.txtSeguro.setText(null);
        _view.txtInteresMora.setText(null);
        _view.txtSalud.setText(null);
        _view.txtCobro.setText(null);
        _view.txtFechaAc1.setText(null);
        _view.txtAcuerdo1.setText(null);
        _view.txtFechaAc2.setText(null);
        _view.txtAcuerdo2.setText(null);
        _view.txtFechAc3.setText(null);
        _view.txtAcuerdo3.setText(null);
        _view.txtFechaAcuerdo4.setText(null);
        _view.txtAcuerdo4.setText(null);
    }
}