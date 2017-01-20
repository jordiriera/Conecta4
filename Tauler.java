/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conecta.pkg4;

/**
 *
 * @author aluadmin
 */
public class Tauler {

    //  public int tauler [][] = new int [8][8];
    //int [][] tauler = new int[8][8];
    Casella tauler[][] = new Casella[8][7];
    boolean victoria = false;

    public void generarCaselles() {

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 7; y++) {
                tauler[x][y] = new Casella();
            }
            System.out.println("");
        }
    }

    public void mostrarTauler() {

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 7; y++) {
                System.out.print(tauler[x][y].equipo);
            }
            System.out.println();
        }
        System.out.println();

    }

    public void colocar(int lloc, String simbolo) {
        int y = 7;

        while (tauler[y][lloc].ocupada == true) {
            y--;
        }
        tauler[y][lloc].equipo = simbolo;
        tauler[y][lloc].ocupat();

        if (comprovaH(lloc, y, simbolo)) {
            System.out.println("Victòria per l'equip : " + simbolo);
            victoria = true;
        }
        if (comprovaV(lloc, y, simbolo)) {
            System.out.println("Victòria per l'equip : " + simbolo);
            victoria = true;
        }
        if (comprovaDiagonalD(lloc, y, simbolo)) {
            System.out.println("Victòria per l'equip : " + simbolo);
            victoria = true;

        }
        /*if (comprovaDiagonalI(lloc, y, simbolo)) {
            System.out.println("Victòria per l'equip : " + simbolo);
            victoria = true;

        }*/
    }

    public boolean comprovaH(int x, int y, String equip) {
        int counter = 1;
        for (int a = x + 1; a < 7; a++) {
            if (tauler[y][a].equipo.equals(equip)) {

                counter++;

            } else {
                break;
            }
        }
        for (int a = x - 1; a >= 0; a--) {
            if (tauler[y][a].equipo.equals(equip)) {

                counter++;

            } else {
                break;
            }
        }
        if (counter >= 4) {
            return true;
        } else {

            return false;
        }
    }

    public boolean comprovaV(int x, int y, String equip) {
        int counter = 1;
        for (int a = y + 1; a < 8; a++) {
            if (tauler[a][x].equipo.equals(equip)) {

                counter++;

            } else {

                break;
            }
        }
        if (counter >= 4) {

            return true;

        } else {
            return false;
        }
    }

    public boolean comprovaDiagonalD(int x, int y, String equip) {
        int counter = 1;
        int b = x;
        for (int a = y + 1; a < 8; a++) {
            b--;
            if (tauler[a][b].equipo.equals(equip)) {
                counter++;
            } else {
                break;
            }
        }
      /*  for (int a = y - 1; a > 0; a--) {
            if (b<7){
            if (x < 7) {b++;}
        }
            if (tauler[a][b].equipo.equals(equip)) {
                counter++;
            } else {
                break;
            }        
    }*/
        if (counter >= 4) {
            return true;

        } else {
            return false;
        }

}
    
    /*public boolean comprovaDiagonalI(int x, int y, String equip) {
        int counter = 1;
        int b = x;
        for (int a = y + 1; a < 8; a++) {
            if (b<7){
            if (x < 7) {b++;}
            
            }
            if (tauler[a][b].equipo.equals(equip)) {
                counter++;
            } else {
                break;
            }
        }
         for (int a = y - 1; a > 0; a--) {
            if (b<7){
            if (x < 7) {b++;}
            
            }
            if (tauler[a][b].equipo.equals(equip)) {
                counter++;
            } else {
                break;
            }
        }
        
        
        
        
        if (counter >= 4) {
            return true;

        } else {
            return false;
        }

}
        */
    
}
