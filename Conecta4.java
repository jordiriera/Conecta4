package conecta4definitiu.pkg4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import conecta.pkg4.*;
import java.util.*;

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
        Scanner sc = new Scanner(System.in);
        Tauler aa;
        aa = new Tauler();
        
    
          
        aa.generarCaselles();
        aa.mostrarTauler();
        
        while(aa.victoria == false){
        
          
                
        System.out.println("Torn de l'equip F");
        int fitxaF = sc.nextInt();
        aa.colocar(fitxaF, 'F');
        aa.mostrarTauler();
          
            if(aa.victoria == false){
                
        
        System.out.println("Torn de l'equip O");
        int fitxaO = sc.nextInt();
        aa.colocar(fitxaO, 'O');
        aa.mostrarTauler();
            }
      }
        aa.mostrarTauler();
        
        
        
    }
    
}
