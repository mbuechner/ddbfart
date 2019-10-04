/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ddb.labs.ddbfart;

import de.ddb.labs.ddbfart.gui.Main;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Michael Büchner <m.buechner@dnb.de>
 */
public class App {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            final Main main = new Main();
            main.setTitle("DDBfart - Find and Replace Text");
            main.setLocationRelativeTo(null);
            try {
                final BufferedImage myIco = ImageIO.read(App.class.getClassLoader().getResourceAsStream("icon.png"));
                main.setIconImage(myIco);
            } catch (IOException e) {
                // nothing
            }
            main.setVisible(true);
        });
    }
}
