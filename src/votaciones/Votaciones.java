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
        int p,k,R1,R2;
        R1=0;
        R2=0;
        int may1,may2;
        may1=0;
        may2=0;
                
               
        System.out.println("----------Votaciones Deparatamento de Topaiti------------");
        System.out.println();
        System.out.println("Ingrese el numero de municipios: "); 
        m = lectura.nextInt();
        System.out.println("Ingrese el numero de Candidatos por municipio: ");
        c = lectura.nextInt();
        System.out.println("El número de municipios es " + m + " y por cada uno hay " + c + " candidatos");
        System.out.println();
        //Ingresan el numero de municipios y candidatos
        mat = new int[m][c];//ingreso de los votos por candidato
        for(p=0;p<m;p++){
            System.out.println("            Municipio "+ p);
            System.out.println("NOTA: el candidato número 0 corresponde a los votos en blanco");
            for(k=0;k<c;k++){
            System.out.println("- Votos Mun. " + p + ", candidato " + k);
                mat[p][k] =lectura.nextInt();
            }
            
        }//Llenado de cada espacio de la matriz-votos
        
        System.out.println("--------------------------------------------------------");
        
        System.out.println("        Tabla de votaciones");//impresion tabla
        for(p=0;p<m;p++){
            System.out.println("Mun" + p);
            for(k=0;k<c;k++){
            System.out.print(" | Candidato "+ k + ": " + mat[p][k]);//Imprimir en la linea
            }
            System.out.println();//Salto de linea
        }
        
        System.out.println("--------------------------------------------------------");
        
        int por;
        for(p=0;p<m;p++){//Realizar el calculo de porcentajes
            por=0;
            for(k=0;k<c;k++){
                por=mat[p][k]+por;
            }
            for(k=0;k<c;k++){
                mat[p][k]=((mat[p][k])*100)/por;
            } 
        }
        
             
       System.out.println("         Tabla de Porcentajes");//impresion tabla
        for(p=0;p<m;p++){
            System.out.println("Mun" + p);
            for(k=0;k<c;k++){
            System.out.print(" | Candidato "+ k + ": " + mat[p][k]+"%");//Imprimir en la linea
            }
            System.out.println();//Salto de linea
        }
        
        System.out.println("--------------------------------------------------------");
        
        System.out.println("             Más votados por municipio");
        
        
        for(p=0;p<m;p++){
            System.out.println("       Resultados Minicipio "+p);
            
            for(k=0;k<c;k++){
                
                
                
            if(mat[p][k]>50){//imprime el ganador con mas de 50%
                System.out.println("El ganador de las votaciones del municipio "+p+" es el candidato "+k+" con el "+mat[p][k]+"% de los votos");
            }else if(mat[p][k]>may1){//imprime los que deben tener nueva votacion
                    may1=mat[p][k];//mayor 1
                    R1=k;//posicion del mayor 1
                  
            } 
            if(mat[p][k]<may1){
                  may2=mat[p][k];
                  R2=k;
                              }
            }
             
        }
        System.out.println("mayor"+may1+"can"+R1);
        System.out.println("menor"+may2+"can"+R2);
        System.out.print("El candidato "+R1+" el candidato "+R2+" pasan a una segunda ronda.");
    }
    
}
