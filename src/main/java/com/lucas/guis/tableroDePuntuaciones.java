package com.lucas.guis;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.lucas.Datos.GestorArchivos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tableroDePuntuaciones extends JFrame implements ActionListener {

    private JPanel panel1;
    private JButton volverPuntajesButton;
    private JTable puntuacionesTable;
    private DefaultTableModel puntuacionesTableModel;
    private GestorArchivos gestor = new GestorArchivos();

    public tableroDePuntuaciones() {
        $$$setupUI$$$();
        add(panel1);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        volverPuntajesButton.addActionListener(this);
    }

    public static void main(String[] args) {
        new tableroDePuntuaciones().setVisible(true);
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
        panel1.setBackground(new Color(-14786275));
        panel1.setMinimumSize(new Dimension(1360, 680));
        panel1.setPreferredSize(new Dimension(1360, 680));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-14123225));
        panel1.add(panel2, BorderLayout.NORTH);
        final JLabel label1 = new JLabel();
        label1.setForeground(new Color(-1));
        label1.setText("Mejores puntajes");
        panel2.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        volverPuntajesButton = new JButton();
        volverPuntajesButton.setText("Regresar al menú principal");
        panel2.add(volverPuntajesButton, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(1, 1, new Insets(20, 20, 20, 20), -1, -1));
        panel3.setBackground(new Color(-14786275));
        panel1.add(panel3, BorderLayout.CENTER);
        puntuacionesTable = new JTable();
        puntuacionesTable.setBackground(new Color(-14123225));
        puntuacionesTable.setForeground(new Color(-1));
        panel3.add(puntuacionesTable, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        String[] columnasPuntuacionesTable = {"Nombre", "Puntaje"};


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == volverPuntajesButton) {
            this.setVisible(false);
            new MenuPrincipalGUI().setVisible(true);
            this.dispose();
        }
    }
}
