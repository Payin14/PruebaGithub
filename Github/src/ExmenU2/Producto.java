package ExmenU2;

public abstract class Producto {
	
	public int NoDeLote;
	public int Caducidad;
	public String producto;
	public String ProductoFinal;
	
	

	public Producto(int noDeLote, int caducidad, String producto) {
		super();
		NoDeLote = noDeLote;
		Caducidad = caducidad;
		this.producto = producto;
	}


	public int getNoDeLote() {
		return NoDeLote;
	}


	public void setNoDeLote(int noDeLote) {
		NoDeLote = noDeLote;
	}


	public int getCaducidad() {
		return Caducidad;
	}


	public void setCaducidad(int caducidad) {
		Caducidad = caducidad;
	}


	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	public String getProductoFinal() {
		return ProductoFinal;
	}


	public void setProductoFinal(String productoFinal) {
		ProductoFinal = productoFinal;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
