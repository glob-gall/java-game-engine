import gameEngine.Constants;

public class Mapa1 {
    //  128 x 40
    public char[][] mapa;
    private String mapaStr =
    "##############################################################################################################################" +
    "#............................................................................................................................#" +
    "#............................................................................................................................#" +
    "#............................................................................................................................#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################...#" +
    "#...######################################################################################################################.$.#";

    Mapa1(){
        String aux;
        char[] aux2;

        char[][] mapa = new char[Constants.PIXELS_HEIGHT][Constants.PIXELS_WIDTH];

        for (int i = 0; i < Constants.PIXELS_HEIGHT; i++) {
            aux = this.mapaStr.substring(i*126, (i*126)+126);
            aux2 = aux.toCharArray();
            System.out.println(aux2);
            for (int j = 0; j < Constants.PIXELS_WIDTH; j++) {
//                System.out.println("x:"+j+" y:"+i);
                mapa[i][j] = aux2[j];
            }
        }
        this.mapa = mapa;
    }
}
