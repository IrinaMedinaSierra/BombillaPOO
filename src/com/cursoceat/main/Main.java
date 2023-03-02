package com.cursoceat.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bombilla salon=new Bombilla();
		Bombilla hab1=new Bombilla();
		Bombilla hab2=new Bombilla();
		Bombilla cocina=new Bombilla();
		Bombilla banio=new Bombilla();
		Bombilla terraza=new Bombilla();
		int opcion;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Que bombilla desea utilizar");
			System.out.println("1. Salón"+ "["+salon.mostrarEstado()+"]");
			System.out.println("2. Cocina"+"["+cocina.mostrarEstado()+"]");	
			System.out.println("3. Baño"+ "["+banio.mostrarEstado()+"]");
			System.out.println("4. Habitación Principal"+"["+hab1.mostrarEstado()+"]");
			System.out.println("5. Habitación Auxiliar"+ "["+hab2.mostrarEstado()+"]");
			System.out.println("6. Terraza"+ "["+terraza.mostrarEstado()+"]");
			System.out.println("7. Interruptor General"+ "["+ Bombilla.interruptorGeneral +"]");
			System.out.println("8. Salir");
			System.out.print("Indique su opción->");
			opcion=entrada.nextInt();
			String mensaje="El estado de la bombilla es: ";
			switch (opcion) {
			case 1-> {
				salon.encenderOapagar();			
			}
			case 2->{
				cocina.encenderOapagar();
			}
			case 3->{
				banio.encenderOapagar();
			}
			case 4-> {
				hab1.encenderOapagar();				
			}
			case 5->{
				hab2.encenderOapagar();			}
			case 6->{
				terraza.encenderOapagar();
			}
			case 7->{
				if(Bombilla.interruptorGeneral) {
					Bombilla.interruptorGeneral=false;
				}else {
					Bombilla.interruptorGeneral=true;
				}				
			}
			
			default->
				System.out.println("Opción no válida");
			}			
			
		}while(opcion!=8);
		
	}

}
