package Prueba15;

import java.util.Scanner;

public class Pruebaaaaa {

	public static void main(String[] args) {
		
	     Scanner ent = new Scanner(System.in);
	     int num=0, fac=1;
	     
	     System.out.println("Ingresa un número para calcular su factorial: ");
	     num = Integer.parseInt(ent.nextLine());
	        

	        if(num < 0){
	            System.out.println("No, se puede calcular el factorial de un número negativo");
	        }else{
	            for (int i = 1; i <= num; i++) {
	                fac *= i;
	            }
	            System.out.println("El factorial de " + num + " es " + fac);
	        }
	  }
}


