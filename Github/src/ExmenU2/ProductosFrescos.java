package ExmenU2;

import java.util.Scanner;

public abstract class ProductosFrescos extends Producto {
	
	
	private int FechaDeEnvasado;
	private String PaisOrigen;
	
	Scanner t=new Scanner(System.in);

	public ProductosFrescos(int fechaDeEnvasado, String paisOrigen) {
		super(fechaDeEnvasado, fechaDeEnvasado, paisOrigen);
		FechaDeEnvasado = fechaDeEnvasado;
		PaisOrigen = paisOrigen;
	}



	public int getFechaDeEnvasado() {
		return FechaDeEnvasado;
	}



	public void setFechaDeEnvasado(int fechaDeEnvasado) {
		FechaDeEnvasado = fechaDeEnvasado;
	}



	public String getPaisOrigen() {
		return PaisOrigen;
	}



	public void setPaisOrigen(String paisOrigen) {
		PaisOrigen = paisOrigen;
	}



	public void información() {
		System.out.println("Deme el nombre del producto fresco");
		setProducto(t.next());
		System.out.println("Deme fecha de caducidad");
		setCaducidad(t.nextInt());
		System.out.println("Ahora Numero de lote");
		setNoDeLote(t.nextInt());
		
		System.out.println("Viendo que son productos frescos necesitare que me de la fecha de envasado");
		setFechaDeEnvasado(t.nextInt());
		
		System.out.println("Y por ultimo su país de origen");
		setPaisOrigen(t.next());
		
	}
	
	public void productofinal() {
		System.out.println("Su producto es "+getProducto()+" fecha de caducidad "+ getCaducidad()+" Numero de Lote "+getNoDeLote()+" País de origen "+getPaisOrigen());
	}
	
	
}
