/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacionfire;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author juanmi
 */
public class AnimacionFire extends JFrame
        implements ComponentListener, ActionListener, ChangeListener {

    /**
     * @param args the command line arguments
     */
    Viewer cv;

    public AnimacionFire() {

        
        cv = new Viewer(new Dimension(600, 400));
        createLayout(getContentPane());
        createFrame();
        cv.animacion();
    }

    public static void main(String[] args) {
        // TODO code application logic here

        AnimacionFire af = new AnimacionFire();

    }

    private void createFrame() {
        this.setDefaultCloseOperation(3);
        this.setTitle("····· 2on.DAM ····· Efectos Gráficos de Fuego");
        //setPreferredSize(new Dimension(500, 500));
        this.addComponentListener(this);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

       

    }

    private void createLayout(Container panel) {

        panel.add(cv, BorderLayout.CENTER);

    }

    

    @Override
    public void componentResized(ComponentEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void componentShown(ComponentEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
