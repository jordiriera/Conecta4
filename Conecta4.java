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
public class Conecta4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tauler aa;
        aa = new Tauler();
        
      /*
        aa.generarCaselles();
        aa.mostrarTauler();
        aa.mostrarTauler();
        aa.colocar(1, "F ");
        aa.colocar(2, "O ");
        aa.colocar(2, "F ");
        aa.colocar(3, "O ");
        aa.colocar(3, "O ");
        aa.colocar(3, "F ");
        aa.colocar(4, "O ");
        aa.colocar(4, "O ");
        aa.colocar(4, "F ");
        aa.colocar(4, "F ");
                
        aa.mostrarTauler();
        */
        aa.comprovaDiagonalD(4, 5,"O");
        
    }
    
}
