package conecta4definitiu.pkg4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import conecta.pkg4.*;

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
        System.out.println("0 1 2 3 4 5 6");
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 7; y++) {
                System.out.print(tauler[x][y].equipo + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public void colocar(int lloc, char simbol) {
        int y = 7;

        while (tauler[y][lloc].ocupada == true) {
            y--;
        }
        tauler[y][lloc].equipo = simbol;
        tauler[y][lloc].ocupat();

        if (comprovaH(lloc, y, simbol)) {
            System.out.println("Victòria per l'equip : " + simbol);
            victoria = true;
        }
        if (comprovaV(lloc, y, simbol)) {
            System.out.println("Victòria per l'equip : " + simbol);
            victoria = true;
        }
        if (comprovaDiagonalD(lloc, y, simbol)) {
            System.out.println("Victòria per l'equip : " + simbol);
            victoria = true;

        }
        if (comprovaDiagonalI(lloc, y, simbol)) {
            System.out.println("Victòria per l'equip : " + simbol);
            victoria = true;

        }
        if (lloc >= 56){
            System.out.println("¡EMPAT!");
        }
    }

    public boolean comprovaH(int x, int y, char equip) {
        int counter = 1;
        for (int a = x + 1; a < 7; a++) {
            if (tauler[y][a].equipo == equip) {

                counter++;

            } else {
                break;
            }
        }
        for (int a = x - 1; a >= 0; a--) {
            if (tauler[y][a].equipo == equip) {

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

    public boolean comprovaV(int x, int y, char equip) {
        int counter = 1;
        for (int a = y + 1; a < 8; a++) {
            if (tauler[a][x].equipo == equip ) {

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

    public boolean comprovaDiagonalD(int x, int y, char equip) {
        int counter = 1;
        int b = x;
        for (int a = y + 1; a < 8; a++) {
            if (b > 0) {
                b--;
            }
            if (tauler[a][b].equipo == equip) {
                counter++;
            } else {
                break;
            }
        }
        for (int a = y - 1; a > 0; a--) {
            if (b <= 5) {
                b++;
            }
            if (tauler[a][b].equipo == equip) {
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

    public boolean comprovaDiagonalI(int x, int y, char equip) {
        int counter = 1;
        int b = x;
        for (int a = y + 1; a < 8; a++) {
            if (b <= 5) {
                b++;
            }
            if (tauler[a][b].equipo == equip ) {
                counter++;
            } else {
                break;
            }
        }
        for (int a = y - 1; a > 0; a--) {
            if (b > 0 ) {
                if (x > 0) {
                    b--;
                }

            }
            if (tauler[a][b].equipo == equip) {
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

}
