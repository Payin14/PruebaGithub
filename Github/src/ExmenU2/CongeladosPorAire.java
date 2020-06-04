package ExmenU2;

import java.util.Scanner;

public class CongeladosPorAire extends ProductosCongelados implements Congelados {

	public CongeladosPorAire(int fechaDeEnvasado, String paisOrigen) {
		super(fechaDeEnvasado, paisOrigen);
		// TODO Auto-generated constructor stub
	}

	Scanner t=new Scanner(System.in);
	public double PorcentajeN, PorcentajeO, PorcentajeD, PorcentajeV;
	
	

	public CongeladosPorAire(int fechaDeEnvasado, String paisOrigen, Scanner t, double porcentajeN, double porcentajeO,
			double porcentajeD, double porcentajeV) {
		super(fechaDeEnvasado, paisOrigen);
		PorcentajeN = porcentajeN;
		PorcentajeO = porcentajeO;
		PorcentajeD = porcentajeD;
		PorcentajeV = porcentajeV;
	}

	public double getPorcentajeN() {
		return PorcentajeN;
	}

	public void setPorcentajeN(double porcentajeN) {
		PorcentajeN = porcentajeN;
	}

	public double getPorcentajeO() {
		return PorcentajeO;
	}

	public void setPorcentajeO(double porcentajeO) {
		PorcentajeO = porcentajeO;
	}

	public double getPorcentajeD() {
		return PorcentajeD;
	}

	public void setPorcentajeD(double porcentajeD) {
		PorcentajeD = porcentajeD;
	}
	
	public double getPorcentajeV() {
		return PorcentajeV;
	}

	public void setPorcentajeV(double porcentajeV) {
		PorcentajeV = porcentajeV;
	}



	@Override
	public void TipoDeCongelado() {
		
		System.out.println("Dame el porcentaje del nitrogeno usado");
		setPorcentajeN(t.nextDouble());
		System.out.println("Dame el porcentaje de Oxigeno usado");
		setPorcentajeO(t.nextDouble());
		System.out.println("Dame el porcentaje de dioxido usado");
		setPorcentajeD(t.nextDouble());
		System.out.println("Dame el porcentaje de vapor usado");
		setPorcentajeV(t.nextDouble());
		
		
	}

	
	public void congelado3() {
		System.out.println(" Su producto congelado por aire tiene un porcentaje de "+getPorcentajeN()+" de nitrogeno usado");
		System.out.println(" Su producto congelado por aire tiene un porcentaje de "+getPorcentajeO()+" de Oxigeno usado");
		System.out.println(" Su producto congelado por aire tiene un porcentaje de "+getPorcentajeD()+" de Dioxido de carbono usado");
		System.out.println(" Su producto congelado por aire tiene un porcentaje de "+getPorcentajeV()+" de Vapor usado");
		
	}
	
	@Override
	public void TipoDeCongelado2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TipoDeCongelado3() {
		// TODO Auto-generated method stub
		
	}

	

}
