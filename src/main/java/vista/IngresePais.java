package vista;

import modelo.Ciudad;
import modelo.Pais;
import modelo.ZonaGeografica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresePais extends JFrame implements ActionListener {

    private JTextField dameCiudad;
    private JTextField damePais;
    private JRadioButton rocosaRadioButton;
    private JRadioButton costeraRadioButton;
    private JRadioButton urbanaRadioButton;
    private JRadioButton ruralRadioButton;
    private JButton validaYContinuaButton;
    private JLabel Presentacion;
    private JLabel labelPais;
    private JLabel labelCiudad;
    private JLabel labelZonaGeografica;
    private ButtonGroup grupoBotones;

    public IngresePais(){
        this.setTitle("Ingrese país");
        this.setMinimumSize(new Dimension(440, 400));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void agregarActionListener(){
        rocosaRadioButton.addActionListener(this);
        costeraRadioButton.addActionListener(this);
        urbanaRadioButton.addActionListener(this);
        ruralRadioButton.addActionListener(this);
    }

    public void agregarActionCommand(){

        rocosaRadioButton.setActionCommand("ROCOSA");
        costeraRadioButton.setActionCommand("COSTERA");
        urbanaRadioButton.setActionCommand("URBANA");
        ruralRadioButton.setActionCommand("RURAL");
    }
    public void agregarBotones(){
        grupoBotones.add(rocosaRadioButton);
        grupoBotones.add(costeraRadioButton);
        grupoBotones.add(urbanaRadioButton);
        grupoBotones.add(ruralRadioButton);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String nombre = damePais.getText();
        Pais pais = new Pais(nombre);
        nombre = dameCiudad.getText();
        ZonaGeografica zonaGeografica = ZonaGeografica.valueOf(grupoBotones.getSelection().getActionCommand());
        pais.agregarCiudades(new Ciudad(nombre, zonaGeografica));
    }
}
