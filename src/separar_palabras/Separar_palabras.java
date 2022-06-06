/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package separar_palabras;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Brandon
 */
public class Separar_palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        //esto separa las palabras de un texto y las mete 
        //en un vector por separado
           JFileChooser j = new JFileChooser();
     //  j.setFileFilter(filtro);
        j.showOpenDialog(j)
        String ruta = j.getSelectedFile().getAbsolutePath();
        File f = new File(ruta);

        try (
                PrintWriter pw = new PrintWriter(f, "utf-8")) {
            String palabra;
            System.out.println("Escriba el contenido que desea agregar al archivo. ");
            Scanner myVar = new Scanner(System.in);
            palabra = myVar.next();

            pw.print(palabra);

        }
       
        palabra += " a";
        System.out.println(palabra);
        String[] texto = new String[10000];
        int contador = 0;

        String AUX = "";
        String AUX1 = "";

        for (int i = 1; i <= palabra.length(); i++) {

            //System.out.println("Letra " + i + " : " + palabra.substring((i - 1), i));
            AUX = palabra.substring((i - 1), i);

            if (" ".equals(AUX)) {
                texto[contador] = AUX1;
                AUX1 = "";
                contador++;
            } else {
                AUX1 += AUX;
            }
        }
        for (int i = 0; i < contador; i++) {
            System.out.println(texto[i]);
            pw.print(texto[i]);
        }

    }

}
