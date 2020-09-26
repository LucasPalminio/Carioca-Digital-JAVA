package com.lucas.guis;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipalGUI extends JFrame implements ActionListener {
    private JButton jugarUnaPartidaButton;
    private JButton mejoresPuntajesButton;
    private JButton configuracionButton;
    private JButton salirButton;
    private JPanel panelMain;
    private JLabel logo;
    private JLabel tituloLabel;
    ImageIcon imagenLogo = new ImageIcon("src//images//varios//logoPrincipal.png");


    public MenuPrincipalGUI() {

        add(panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        logo.setIcon(imagenLogo);
        jugarUnaPartidaButton.addActionListener(this);
        mejoresPuntajesButton.addActionListener(this);
        configuracionButton.addActionListener(this);
        salirButton.addActionListener(this);
    }

    public static void main(String[] args) {
        new MenuPrincipalGUI().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jugarUnaPartidaButton) {

            this.setVisible(false);
            new menuJuego().setVisible(true);
            this.dispose();


        }
        if (e.getSource() == mejoresPuntajesButton) {
            this.setVisible(false);
            new tableroDePuntuaciones().setVisible(true);
            this.dispose();

        }
        if (e.getSource() == configuracionButton) {
            this.setVisible(false);
            new menuConfiguracion().setVisible(true);
            this.dispose();

        }
        if (e.getSource() == salirButton) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea salir realmente?");
            if (respuesta == 0) {
                System.exit(0);
            }

        }
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

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
        panelMain = new JPanel();
        panelMain.setLayout(new GridLayoutManager(6, 1, new Insets(0, 0, 0, 0), -1, -1));
        panelMain.setBackground(new Color(-14786275));
        panelMain.setPreferredSize(new Dimension(1360, 680));
        tituloLabel = new JLabel();
        tituloLabel.setForeground(new Color(-1));
        tituloLabel.setText("Carioca Digital");
        panelMain.add(tituloLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 100), new Dimension(-1, 100), 0, false));
        jugarUnaPartidaButton = new JButton();
        jugarUnaPartidaButton.setText("Jugar una partida");
        panelMain.add(jugarUnaPartidaButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        mejoresPuntajesButton = new JButton();
        mejoresPuntajesButton.setText("Mejores puntajes");
        panelMain.add(mejoresPuntajesButton, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        configuracionButton = new JButton();
        configuracionButton.setText("Configuración");
        panelMain.add(configuracionButton, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        salirButton = new JButton();
        salirButton.setText("Salir");
        panelMain.add(salirButton, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        logo = new JLabel();
        logo.setText("");
        panelMain.add(logo, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelMain;
    }
}
