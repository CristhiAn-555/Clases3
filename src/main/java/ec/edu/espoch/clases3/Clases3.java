/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.clases3;

/**
 *
 * @author PERSONAL
 */
public class Clases3 {

    public static void main(String[] args) {
        
        //int contador=5;
        
        //syntaxis del while
       /* while(contador<5){
            
            System.out.println("hola"+contador);
            //contador=contador +3;
            contador++;
        }*/
       
       // sintaxys del do- while
       /* do {            
             
            
            System.out.println("hola"+contador);
            //contador=contador +3;
            contador++;
        } while (contador < 5);

*/
       //un programa que calcule el area del reactangulo
     /* double base= 2;       
      double altura= 4;
      
      double area=0;
      
      area=base*altura;
      
        System.out.println("La altura del rectangulo es:"+area);*/
     
     
     
     /*Ejercicio
     Un programa que determine un numero entero
     imprime si el numeero ingresado es positivo
     
     //entrada
     
     int num=2;
     if (num > 0){
         
         System.out.println("El numero es positivo:"+num);
         
     }
     else{
         
         System.out.println("Error, el numero es negativo");
     }
     */
     
     
     /*int numero = 2;
     if(numero%2==0){
         
         System.out.println("El numero  es PAR");
         
         
     }else{
         
         System.out.println("El numero es IMPAR");
     }     
     
      */
     
     
     /*Ejercicio:
     Escribe un programa que determoine si un estudiante aprueba o reprueba
segun su nota.

si la nota es mayor o igual a 90, imprime Excelente
si esta entre 70 y 89, imprime Aprobado
si es menor a 70, imprime Reprobado*/
     
     int nota = 80;
     
     if ((nota >= 0) && (nota <= 100)){
         if(nota >= 90){
             System.out.println("Excelente");
             
         }else if ((nota >=70)&& (nota <= 89)){
             System.out.println("Aprobado");
         }else if (nota < 70){
             System.out.println("Reprobado");
         }
     }else{
         
         System.out.println("Su nota es invalida");
     }
     
     
       
    }
}
