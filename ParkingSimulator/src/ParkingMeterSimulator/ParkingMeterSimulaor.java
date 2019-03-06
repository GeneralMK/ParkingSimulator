package ParkingMeterSimulator;

import javax.swing.*;

/**
 *
 * @author raoul
 */
public class ParkingMeterSimulaor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                PanelMoneyMatters myAppPanel = new PanelMoneyMatters();
                myAppPanel.setSize(860, 600);
                myAppPanel.setVisible(true);
                JFrame frame = new JFrame("Parking Sweep");
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.getContentPane().add(myAppPanel);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });

    }

}
