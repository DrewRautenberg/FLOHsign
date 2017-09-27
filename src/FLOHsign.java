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
        int fTopVert;
        int fBottVert;

        //user input
        height = 10;
        width = 10;

        //F print out
        //calculate heights
        fTopVert = (height-2)/2;
        if (height % 2 == 0){
            fBottVert = fTopVert;
        }
        else {
            fBottVert = fTopVert + 1;
        }
        //Top of F
        for (i = 0; i < width; i++) {
            System.out.print(on);
        }
        System.out.println();
        //Top vertical of F
        for (i=0;i<fTopVert;i++){
            System.out.print(on);
            for (j=0;j<width-1;j++){
                System.out.print(off);
            }
            System.out.println();
        }
        //Middle horizontal of F
        for (i=0;i<width/2;i++){
            System.out.print(on);
        }
        for (j=i;j<width;j++){
            System.out.print(off);
        }
        System.out.println();
        //Bottom Vertical of F
        for (i=0;i<fBottVert;i++){
            System.out.print(on);
            for (j=0;j<width-1;j++){
                System.out.print(off);
            }
            System.out.println();
        }
        System.out.println();





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
