package vista;

import javax.swing.*;
import java.awt.event.*;

public class IngreseTipoDesastre extends JDialog {
    private JPanel contentPane;
    private JRadioButton INCENDIORadioButton;
    private JRadioButton TSUNAMIRadioButton;
    private JRadioButton SEQUIARadioButton;
    private JRadioButton TORMENTARadioButton;
    private JRadioButton INUNDACIONRadioButton;
    private JRadioButton ERUPCIONRadioButton;
    private JButton validaYContinuaButton;
    private JButton buttonOK;
    private JButton buttonCancel;

    public IngreseTipoDesastre() {
        setContentPane(contentPane);
        setModal(true);
    }
}
