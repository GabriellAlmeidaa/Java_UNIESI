package exercicio_janela;

import javax.swing.JOptionPane;

public class IMC {

    private double IMC;

    public String calcularIMC(double peso, double alt) {
        String msg = "Erro ao executar Operação";
        try {
            if (peso <= 0 || alt <= 0) {
                throw new IllegalArgumentException();
            }
            this.setIMC(peso * (alt * alt));
            if (IMC < 18.5) {
                msg = "Magreza ----- Grau de obesidade = 0";
            } else if (IMC >= 18.5 || IMC <= 24.9) {
                msg = "Normal ----- Grau de obesidade = 0";
            } else if (IMC >= 25 || IMC <= 29.9) {
                msg = "Sobrepeso ----- Grau de obesidade = 1";
            } else if (IMC >= 30 || IMC <= 39.9) {
                msg = "Obesidade ----- Grau de obesidade = 2";
            } else {
                msg = "Obesidade Grave ----- Grau de obesidade = 3";
            }

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Operação não pode ser <= 0");
        } finally {
            return msg;
        }
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

}
