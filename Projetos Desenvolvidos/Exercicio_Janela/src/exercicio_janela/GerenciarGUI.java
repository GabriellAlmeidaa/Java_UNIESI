package exercicio_janela;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GerenciarGUI extends JFrame implements WindowListener, ActionListener {

    protected Dimension dFrame, dLabel, dTextField, dButton, dTextArea;
    protected Button cmdCalcular, cmdSair;
    protected TextField txtPeso, txtAltura, txtIMC;
    protected Label lblPeso, lblAltura, lblIMC;
    protected TextArea txtMsg;

    IMC imc = new IMC();

    public GerenciarGUI() {

        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(80, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95, 20);
        dTextArea = new Dimension(300, 140);

        setTitle("Claculo de IMC");
        setResizable(false);
        setSize(dFrame);
        setLocation(400, 200);
        setBackground(Color.lightGray);
        setLayout(null);

        lblPeso = new Label("Peso: ");
        lblPeso.setSize(dLabel);
        lblPeso.setLocation(25, 50);

        lblAltura = new Label("Altura: ");
        lblAltura.setSize(dLabel);
        lblAltura.setLocation(25, 80);

        lblIMC = new Label("IMC: ");
        lblIMC.setSize(dLabel);
        lblIMC.setLocation(25, 110);

        txtPeso = new TextField(null);
        txtPeso.setSize(dTextField);
        txtPeso.setLocation(120, 50);

        txtAltura = new TextField(null);
        txtAltura.setSize(dTextField);
        txtAltura.setLocation(120, 80);

        txtIMC = new TextField(null);
        txtIMC.setSize(dTextField);
        txtIMC.setLocation(120, 110);

        cmdCalcular = new Button("Calcular");
        cmdCalcular.setSize(dButton);
        cmdCalcular.setLocation(25, 185);
        cmdCalcular.addActionListener(this);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180, 185);
        cmdSair.addActionListener(this);

        txtMsg = new TextArea();
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);

        add(lblPeso);
        add(lblAltura);
        add(lblIMC);
        add(txtPeso);
        add(txtAltura);
        add(txtIMC);
        add(cmdCalcular);
        add(cmdSair);
        add(txtMsg);

        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent we) {

    }

    @Override
    public void windowClosing(WindowEvent we) {

    }

    @Override
    public void windowClosed(WindowEvent we) {

    }

    @Override
    public void windowIconified(WindowEvent we) {

    }

    @Override
    public void windowDeiconified(WindowEvent we) {

    }

    @Override
    public void windowActivated(WindowEvent we) {

    }

    @Override
    public void windowDeactivated(WindowEvent we) {

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == cmdSair) {
            System.exit(0);
        }

        if (ae.getSource() == cmdCalcular) {
            try {

                double peso = Double.parseDouble(txtPeso.getText());
                double alt = Double.parseDouble(txtAltura.getText());
                txtMsg.append(imc.calcularIMC(peso, alt));
                txtPeso.setText("");
                txtAltura.setText("");
                txtIMC.setText(Double.toString(imc.getIMC()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite apenas números" + ex.getMessage(), "Tipo Invalido", 0);
            }
        }
    }

}
