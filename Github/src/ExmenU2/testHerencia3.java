package ExmenU2;

import java.util.Scanner;

public class testHerencia3 extends CongeladosPorNitrogeno {
	
	//Clase donde se hará todo el proceso

	public testHerencia3(int fechaDeEnvasado, String paisOrigen) {
		super(fechaDeEnvasado, paisOrigen);
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t=new Scanner(System.in);
		//Parte de los productos frescos
		int i=1;
		while(i<=2) {
		testHerencia3 producto=new testHerencia3(0, "");
		System.out.println("Deberá insertar 2 productos frescos, un procedimiento por producto");
				producto.información();
	i++;
	System.out.println("Es congelado?");
	String r=t.next();
	if(r.equalsIgnoreCase("si")) {
		System.out.println("Elija el metodo de congelación");
		System.out.println("1.-Por aire");
		System.out.println("2.-Por agua");
		System.out.println("3.-Por nitrogeno");
		int opc=t.nextInt();
		switch(opc) {
			case 1: producto.TipoDeCongelado();
			producto.productofinal();
			producto.congelado3();
			break;
			case 2: producto.TipoDeCongelado2();
			producto.productofinal();
			producto.congelado();
			break;
			case 3: producto.TipoDeCongelado3();
			producto.productofinal();
			producto.congelado2();
			break;
		
		}
		
	}
		producto.productofinal();
		}
		
		//Parte de los productos refrigerados
		int i2=1;
		while(i2<=3) {
		testHerencia3 producto2=new testHerencia3(0, "");
		System.out.println("Deberá insertar 3 productos refrigerados, un procedimiento por producto");
				producto2.información2();
	i2++;
	System.out.println("Es congelado?");
	String r=t.next();
	if(r.equalsIgnoreCase("si")) {
		System.out.println("Elija el metodo de congelación");
		System.out.println("1.-Por aire");
		System.out.println("2.-Por agua");
		System.out.println("3.-Por nitrogeno");
		int opc=t.nextInt();
		switch(opc) {
			case 1: producto2.TipoDeCongelado();
			producto2.productofinal();
			producto2.congelado3();
			break;
			case 2: producto2.TipoDeCongelado2();
			producto2.productofinal();
			producto2.congelado();
			break;
			case 3: producto2.TipoDeCongelado3();
			producto2.productofinal();
			producto2.congelado2();
			break;
		
		}
	
	}
	producto2.productofinal();
		}
		
		//Parte de los productos congelados
		int i3=1;
		while(i3<=5) {
		testHerencia3 producto3=new testHerencia3(0, "");
		System.out.println("Deberá insertar 5 productos congelados, un procedimiento por producto");
				producto3.información3();
	i3++;
	
		System.out.println("Elija el metodo de congelación");
		System.out.println("1.-Por aire");
		System.out.println("2.-Por agua");
		System.out.println("3.-Por nitrogeno");
		int opc=t.nextInt();
		switch(opc) {
			case 1: producto3.TipoDeCongelado();
			producto3.productofinal();
			producto3.congelado3();
			break;
			case 2: producto3.TipoDeCongelado2();
			producto3.productofinal();
			producto3.congelado();
			break;
			case 3: producto3.TipoDeCongelado3();
			producto3.productofinal();
			producto3.congelado2();
			break;
		
		}
	
	
		producto3.productofinal();
		}
		
		
		System.out.println(" Excelente ");
		
		}
			
}	

	


