/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

/**
 *
 * @author Usuario
 */
public class EscritorioPesonalizado extends JDesktopPane{
    private BufferedImage img;
    
    public EscritorioPesonalizado(){
        try {
            img=ImageIO.read(getClass().getResourceAsStream("/imgs/icono.jpeg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawImage(img,50,50,268,92,null);
        g.drawImage(img,0,0,null);
         }
    
    
    
}
