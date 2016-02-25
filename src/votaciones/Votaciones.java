/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votaciones;

/**
 *
 * @author David
 */
public class Votaciones {

    
    public static void main(String[] args) {
        
        java.util.Scanner lectura= new java.util.Scanner(System.in);
        
        int m,c; //municipios y candidatos
        int [][] mat;//matriz
        int p,k;
        
        System.out.println("Ingrese el numero de municipios: "); 
        m = lectura.nextInt();
        System.out.println("Ingrese el numero de Candidatos por municipio: ");
        c = lectura.nextInt();
        System.out.println("El número de municipios es " + m + " y por cada uno hay " + c + " candidatos");
        //Ingresan el numero de municipios y candidatos
        mat = new int[m][c];//ingreso de los votos por candidato
        for(p=1;p<=m;p++){
            for(k=0;k<=c;k++){
            System.out.println("Votos Mun. " + p + ", candidato " + k);
                mat[p][k]=lectura.nextInt();
            }
            
        }//Llenado de cada espacio de la matriz-votos
        System.out.println("Tabla de votaciones");
        for(p=0;p<=m;p++){
            System.out.println("Mun1");
            for(k=0;k<=c;k++){
            System.out.println("Can" + k + mat[m][c]);
            }
        }
        
        
        
        
    }
    
}
