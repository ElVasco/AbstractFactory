package main;


public class PantallaInicioFactory {

	public static PantallaInicio crearPantallaInicio() {
		
		boolean tablet = true;
		if(tablet) {
			return new PantallaInicioTablet();
		}else {
			return new PantallaInicioMobile();
		}
		
	}
}
