package ExmenU2;

public class ProductosRefrigerados extends ProductosFrescos{
	

	public ProductosRefrigerados(int fechaDeEnvasado, String paisOrigen) {
		super(fechaDeEnvasado, paisOrigen);
	}

	protected int codigoOSA;
	protected double TMR;//TMR= Temperatura de Mantenimiento Recomendada
	
	
	
	public ProductosRefrigerados(int fechaDeEnvasado, String paisOrigen, int codigoOSA, double tMR) {
		super(fechaDeEnvasado, paisOrigen);
		this.codigoOSA = codigoOSA;
		TMR = tMR;
	}

	public int getCodigoOSA() {
		return codigoOSA;
	}

	public void setCodigoOSA(int codigoOSA) {
		this.codigoOSA = codigoOSA;
	}

	public double getTMR() {
		return TMR;
	}
	
	public void setTMR(double tMR) {
		TMR = tMR;
	}

	public void información2() {
		System.out.println("Deme el nombre del producto refrigerado");
		producto=t.next();
		System.out.println("Deme fecha de caducidad");
		Caducidad=t.nextInt();
		System.out.println("Ahora Numero de lote");
		NoDeLote=t.nextInt();
		System.out.println("Viendo que son productos refrigerados necesitare que me de el código del organismo de supervisión alimentaria");
		setCodigoOSA(t.nextInt());
		System.out.println("Ahora la fecha de envasado");
		setPaisOrigen(t.next());
		System.out.println("La temperatura recomendada");
		setTMR(t.nextDouble());
		System.out.println("Por ultimo el país de origen");
		setPaisOrigen(t.next());
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
