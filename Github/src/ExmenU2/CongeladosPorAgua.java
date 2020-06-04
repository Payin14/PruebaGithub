package ExmenU2;

import java.util.Scanner;

public class CongeladosPorAgua extends CongeladosPorAire implements Congelados{

	public CongeladosPorAgua(int fechaDeEnvasado, String paisOrigen) {
		super(fechaDeEnvasado, paisOrigen);
		// TODO Auto-generated constructor stub
	}

	

	public CongeladosPorAgua(int fechaDeEnvasado, String paisOrigen, Scanner t, double salinidadDelAgua) {
		super(fechaDeEnvasado, paisOrigen);
		SalinidadDelAgua = salinidadDelAgua;
	}



	Scanner t=new Scanner(System.in);
	public double SalinidadDelAgua;
	
	
	


	public double getSalinidadDelAgua() {
		return SalinidadDelAgua;
	}


	public void setSalinidadDelAgua(double salinidadDelAgua) {
		SalinidadDelAgua = salinidadDelAgua;
	}


	@Override
	public void TipoDeCongelado2() {
		System.out.println("Dame la salinidad del agua(los gramos utlizados por litro de agua)");
		setSalinidadDelAgua(t.nextDouble());
		
	}
	
	public void congelado() {
		System.out.println("Su producto congelado por agua tiene una cantidad de "+ getSalinidadDelAgua()+" Gramos de sal por litro");
	}

}
