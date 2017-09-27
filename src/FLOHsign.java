/* PROJECT:  FLOHsign
 * AUTHOR: Drew Rautenberg
 * DESCRIPTION:
 *
 *****************************************************************************/
public class FLOHsign {
    public static void main(String[] args) {
        //variable declaration
        int height;
        int width;
        char on = 'X';
        char off = '.';
        int i;
        int j;

        //user input
        height = 10;
        width = 10;

        //F print out




        //L print out

        //O print out
        //Top horizontal of O
        for (i = 0; i < width; i++) {
            System.out.print(on);
        }
        System.out.println();
        //Sides of O
        for (i = 0; i < height-2; i++) {
            System.out.print(on);
            for (j=0;j<width-2;j++){
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
        //H print out

    }
}
