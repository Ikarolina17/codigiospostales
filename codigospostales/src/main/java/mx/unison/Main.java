package mx.unison;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

/* Contar cuantos códigos postales corresponden a asentamientos rurales
y cantos a asentamientos rurales
 */

public class Main {
    public static void main(String[] args) {

        String archivo = "C:/Users/IrlaK/Desktop/codigos_postales.csv";
                String linea = "";
                String separador = ",";
                int urbano = 0;
                int rural = 0;
        
                try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                    while ((linea = br.readLine()) != null) {
                        // Divide la línea en un array usando el separador
                        String[] columnas = linea.split(separador);
                        String terceraColumna = columnas[0];

                        // Verifica si la línea tiene al menos 3 columnas
                        if (columnas.length >= 3) {
                            // Obtiene la tercera columna
                             terceraColumna = columnas[2];
        
                            // Imprime la tercera columna
                        } else {
                            System.out.println("Línea con menos de 3 columnas: " + linea);
                        }
                        if (terceraColumna.equals("Urbano")){
                            urbano = urbano + 1;
                        } else if (terceraColumna.equals("Rural")){
                            rural = rural + 1;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("Rurales = " + rural);
                System.out.println("Urbanos = " + urbano);
            }
        }