/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.valores;

import javax.swing.JOptionPane;

/**
 *
 * @author Fillipe
 */
public class Veiculo {

    private String marca[] = new String[3];
    private String modelo[] = new String[3];

    public void cadMarca() {
        String resultado = "";        

        for (int i = 0; i < marca.length; i++) {
            marca[i] = JOptionPane.showInputDialog("Informe a " + (i + 1) + "ª marca: ");
            modelo[i] = JOptionPane.showInputDialog("Informe o " + (i + 1) + "º modelo: ");
            resultado += marca[i] + " - " + modelo[i] + "\n";

        }
       JOptionPane.showMessageDialog(null, resultado);
        
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero (0 a 2): "));
        JOptionPane.showMessageDialog(null, marca[indice] + " - " + modelo[indice]);
        
        
       
            
    }     
    
    
}

  

      
        


