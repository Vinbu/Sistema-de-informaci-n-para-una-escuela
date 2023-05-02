package com.mycompany.infoescuela;
import java.util.Scanner;
import java.util.Arrays;

public class Infoescuela {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido, ingrese el número de estudiantes de su sección");
        int N_estudiantes= teclado.nextInt();
        
        double[][] notas=new double[N_estudiantes][3];
        double[][] promedioT=new double[N_estudiantes][1];

        String asignatura="Matemática";
        
        boolean verificador= false;
        
        for(int k=0;k<3;k++){
            if(verificador==true&&k==1){
                asignatura="Ciencias";
            }
            else if(verificador=true&&k==2){
                asignatura="Literatura";
            }
            for(int i=0;i<N_estudiantes;i++){
                for(int j=0;j<3;j++){
                    System.out.println("Por favor ingrese la nota "+(j+1)+" del alumno "+(i+1)+" en "+asignatura);
                    notas[i][j]=teclado.nextDouble();
                    if(j==2){
                        promedioT[i][j-2]=(notas[i][j]+notas[i][j-1]+notas[i][j-2])/3;
                        System.out.println("El promedio del estudiante "+ (i+1) + " en " + asignatura + " es " + promedioT[i][j-2]);
                        
                        if(i==2&&j==2){
                            double promedioA=(promedioT[i-1][j-2]+promedioT[i-2][j-2]+promedioT[i][j-2])/3;
                            System.out.println("El promedio del curso en "+ asignatura+" es de "+promedioA);
                            verificador=true;        
                        }
                    }
                }
            }
        }
    }
}