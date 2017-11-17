/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacionfire;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

/**
 *
 * @author juanmi
 */
public class Viewer extends Canvas {

    private byte[][] gc;
    private MyBufferedImage bi;
    private byte[] data;
    private int[] data2;
    private int w, h;

    public Viewer(Dimension d) {

        w = (int) d.getWidth();
        h = (int) d.getHeight();
        setSize(w, h);
        setPreferredSize(d);
        //setPreferredSize(new Dimension(w, h));
        bi = new MyBufferedImage(w, h, BufferedImage.TYPE_4BYTE_ABGR);
        data = ((DataBufferByte) bi.getRaster().getDataBuffer()).getData();
        data2 = new int[w * h];
        gc = new GradientColor().getPaleta();
        setBackground(Color.BLACK);
        //System.out.println("data:" + data.length);

    }

    @Override
    public void paint(Graphics g) {

        this.myPaint(g);
    }

    private void myPaint(Graphics g) {

        if (g == null) {
            System.out.println("falla");

            return;
        }

        g.drawImage(bi, 0, 0, w, h, null);

    }

    public void myPaint() {

        this.myPaint(this.getGraphics());
    }

    public void animacion() {

        while (true) {

            for (int x = 0; x < w; x++) {

                data2[x + w * (h - 1)] = Math.random() > 0.70 ? 0 : 255;
                
            }

            for (int y = 1; y < h - 1; y++) {
                for (int x = 1; x < w - 1; x++) {

                    data2[x + y * w]
                            = (int) ((int) (((data2[x + w * y]
                            + data2[x + w * (y + 1)]
                            + data2[(x - 1) + w * (y + 1)]
                            + data2[(x + 1) + w * (y + 1)])) / 4.009999) * 1.004999);
                }
            }

            for (int i = 0; i < data.length; i = i + 4) {

                int x = i / 4;
                data[i] = gc[0][data2[x]];
                data[i + 1] = gc[1][data2[x]];
                data[i + 2] = gc[2][data2[x]];
                data[i + 3] = gc[3][data2[x]];

            }
            myPaint();
        }

    }
}
