package ExmenU2;

public class ProductosCongelados extends ProductosRefrigerados  {

	
	public ProductosCongelados(int fechaDeEnvasado, String paisOrigen) {
		super(fechaDeEnvasado, paisOrigen);
		// TODO Auto-generated constructor stub
	}
	
	public void información3() {
		System.out.println("Deme el nombre del producto congelado");
		producto=(t.next());
		System.out.println("Deme fecha de caducidad");
		Caducidad=t.nextInt();
		System.out.println("Ahora Numero de lote");
		NoDeLote=t.nextInt();
		System.out.println("Deme la fecha de envasado");
		setFechaDeEnvasado(t.nextInt());
		System.out.println("Su país de origen");
		setPaisOrigen(t.next());
		System.out.println("Para finalizar su temperatura de mantenimiento recomendada");
		setTMR(t.nextDouble());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
