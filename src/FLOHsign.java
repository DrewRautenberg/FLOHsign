/* PROJECT:  FLOHsign
 * AUTHOR: Drew Rautenberg
 * DESCRIPTION:
 *
 *****************************************************************************/

import javax.swing.*;

public class FLOHsign {
    public static void main(String[] args) {
        //variable declaration
        int height;
        int width;
        char on = 'X';
        char off = '.';
        int i;
        int j;
        int fTopVer;
        int fBotVer;
        int hTop;
        int hBot;

        //user input
        height = Integer.parseInt(JOptionPane.showInputDialog("Height:"));
        width = Integer.parseInt(JOptionPane.showInputDialog("Width:"));

        //F print out
        //calculate heights
        fTopVer = (height - 2) / 2;
        if (height % 2 == 0) {
            fBotVer = fTopVer;
        } else {
            fBotVer = fTopVer + 1;
        }
        //Top of F
        for (i = 0; i < width; i++) {
            System.out.print(on);
        }
        System.out.println();
        //Top vertical of F
        for (i = 0; i < fTopVer; i++) {
            System.out.print(on);
            for (j = 0; j < width - 1; j++) {
                System.out.print(off);
            }
            System.out.println();
        }
        //Middle horizontal of F
        for (i = 0; i < width / 2; i++) {
            System.out.print(on);
        }
        for (j = i; j < width; j++) {
            System.out.print(off);
        }
        System.out.println();
        //Bottom Vertical of F
        for (i = 0; i < fBotVer; i++) {
            System.out.print(on);
            for (j = 0; j < width - 1; j++) {
                System.out.print(off);
            }
            System.out.println();
        }
        System.out.println();

        //L print out
        //Top vertical of L
        for (i = 0; i < height - 1; i++) {
            System.out.print(on);
            for (j = 0; j < width - 1; j++) {
                System.out.print(off);
            }
            System.out.println();
        }
        //Bottom of L
        for (i = 0; i < width; i++) {
            System.out.print(on);
        }
        System.out.println();
        System.out.println();

        //O print out
        //Top horizontal of O
        for (i = 0; i < width; i++) {
            System.out.print(on);
        }
        System.out.println();
        //Sides of O
        for (i = 0; i < height - 2; i++) {
            System.out.print(on);
            for (j = 0; j < width - 2; j++) {
                System.out.print(off);
            }
            System.out.print(on);
            System.out.println();
        }
        //Bottom horizontal of O
        for (i = 0; i < width; i++) {
            System.out.print(on);
        }
        System.out.println();
        System.out.println();

        //H print out
        //calculate heights
        hTop = (height - 1) / 2;
        if (height % 2 == 0) {
            hBot = hTop + 1;
        } else {
            hBot = hTop;
        }
        //Top of H
        for (i = 0; i < hTop; i++) {
            System.out.print(on);
            for (j = 0; j < width - 2; j++) {
                System.out.print(off);
            }
            System.out.print(on);
            System.out.println();
        }
        //Middle of H
        for (i = 0; i < width; i++) {
            System.out.print(on);
        }
        System.out.println();
        //Bottom of H
        for (i = 0; i < hBot; i++) {
            System.out.print(on);
            for (j = 0; j < width - 2; j++) {
                System.out.print(off);
            }
            System.out.print(on);
            System.out.println();
        }
    }
}
