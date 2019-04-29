package main;

public class PantallaInicioTablet implements PantallaInicio{

	@Override
	public void mostrarPantalla() {
		System.out.println("Mostrar pantalla en TABLET");
	}

	@Override
	public void ocultarPantalla() {
		System.out.println("Ocultando pantalla en TABLET");		
	}

	
}
