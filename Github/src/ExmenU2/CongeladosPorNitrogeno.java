package ExmenU2;

import java.util.Scanner;

public class CongeladosPorNitrogeno extends CongeladosPorAgua implements Congelados {

	public CongeladosPorNitrogeno(int fechaDeEnvasado, String paisOrigen) {
		super(fechaDeEnvasado, paisOrigen);
		// TODO Auto-generated constructor stub
	}

	Scanner t=new Scanner(System.in);
	public String Metodo;
	public int SegundosExpuesto;
	

	public int getSegundosExpuesto() {
		return SegundosExpuesto;
	}


	public void setSegundosExpuesto(int segundosExpuesto) {
		SegundosExpuesto = segundosExpuesto;
	}


	@Override
	public void TipoDeCongelado3() {
		System.out.println("El metodo de congelación es:");
		Metodo=t.next();
		System.out.println("Dame los segundos expuestos al nitrogeno");
		setSegundosExpuesto(t.nextInt());
		
		
	}
	
 
	public void congelado2() {
		System.out.println(" Su producto congelado por nitrogeno estuvo expuesto durante "+getSegundosExpuesto()+"segundos");
	}
}
