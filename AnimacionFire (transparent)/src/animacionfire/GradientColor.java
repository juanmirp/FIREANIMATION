/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacionfire;

/**
 *
 * @author juanmi
 */
public class GradientColor {

    byte[][] paleta;

    public GradientColor() {

        this.paleta = new byte[4][256];
        rellenarPaleta();
        // mostrarPaleta();

    }

    private void rellenarPaleta() {

        for (int x = 0; x < paleta[0].length / 2; x++) {
            this.paleta[0][x] = (byte) (255);
            this.paleta[3][x] = (byte) (2 * x > 255 ? 255 : 2 * x);

        }

        int cont = 0;
        for (int i = paleta[0].length / 2; i < (3 * paleta[0].length / 4); i++) {
            this.paleta[0][i] = (byte) (10);
            this.paleta[3][i] = (byte) 255;
            this.paleta[2][i] = (byte) (cont * 2);

            cont++;

        }

        cont = 0;
        for (int i = (3 * paleta[0].length / 4); i < paleta[0].length; i++) {
            this.paleta[0][i] = (byte) (250);
            this.paleta[3][i] = (byte) 255;
            this.paleta[2][i] = (byte) ((2 * cont + 130) > 255 ? 255 : (2 * cont + 130));
            cont++;
        }
    }

    public byte[][] getPaleta() {
        return paleta;
    }

    public void mostrarPaleta() {

        for (int i = 0; i < paleta[0].length; i++) {
            System.out.println("color " + i);
            System.out.println("-------------------");
            System.out.print("R:" + this.paleta[3][i]);
            System.out.print("  ");
            System.out.print("G:" + this.paleta[2][i]);
            System.out.print("  ");
            System.out.print("B:" + this.paleta[1][i]);
            System.out.println("  ");
            System.out.println("A:" + this.paleta[0][i]);
            System.out.println("  ");
            System.out.println("");
        }

    }

}
