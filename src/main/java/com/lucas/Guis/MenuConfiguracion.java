package com.lucas.Guis;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.lucas.Carioca_Digital.Reglas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuConfiguracion extends JFrame implements ActionListener {
    private JPanel panel1;
    private JButton volverAlMenuPrincipalButton;
    private JCheckBox modoDiosCheckBox;
    private JCheckBox siUnJugadorSeCheckBox;

    public MenuConfiguracion() {
        add(panel1);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        if (Reglas.getValorRegla(0)) {
            modoDiosCheckBox.setSelected(true);
        }
        if (Reglas.getValorRegla(1)) {
            siUnJugadorSeCheckBox.setSelected(true);
        }
        volverAlMenuPrincipalButton.addActionListener(this);
        modoDiosCheckBox.addActionListener(this);
        siUnJugadorSeCheckBox.addActionListener(this);
    }

    public static void main(String[] args) {
        new MenuConfiguracion().setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(0, 0));
        panel1.setPreferredSize(new Dimension(1360, 680));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-13989079));
        panel1.add(panel2, BorderLayout.NORTH);
        volverAlMenuPrincipalButton = new JButton();
        volverAlMenuPrincipalButton.setText("Volver al menú principal");
        panel2.add(volverAlMenuPrincipalButton, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setForeground(new Color(-1));
        label1.setText("Configuración");
        panel2.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel3.setBackground(new Color(-14786275));
        panel1.add(panel3, BorderLayout.CENTER);
        modoDiosCheckBox = new JCheckBox();
        modoDiosCheckBox.setText("Modo Dios");
        panel3.add(modoDiosCheckBox, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        siUnJugadorSeCheckBox = new JCheckBox();
        siUnJugadorSeCheckBox.setText("Si un jugador se bajó, ¿Puede sacar carta del pozo?");
        panel3.add(siUnJugadorSeCheckBox, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == volverAlMenuPrincipalButton) {
            this.setVisible(false);
            new MenuPrincipalGUI().setVisible(true);
            this.dispose();
        }
        if (e.getSource() == modoDiosCheckBox) {

            Reglas.setRegla(0, !Reglas.getValorRegla(0));
        }
        if (e.getSource() == siUnJugadorSeCheckBox) {
            Reglas.setRegla(1, !Reglas.getValorRegla(1));
        }

    }
}
