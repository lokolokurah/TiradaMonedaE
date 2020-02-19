package TiradaMoneda;

public class TiradaMonedaCX {

	/**
	 * @deprecated Use {@link Extraer#main(String[])} instead
	 */
	public static void main(String[] args) {
		Extraer.main(args);
	}

	/**
	 * @deprecated Use {@link #imprime(int,int,int,int)} instead
	 */
	private static void imprimir(int contadorCaras, int contadorCruces, int maximoCarasDoblesConsecutivas,
			int maximoCrucesDoblesConsecutivas) {
				imprime(contadorCaras, contadorCruces, maximoCarasDoblesConsecutivas, maximoCrucesDoblesConsecutivas);
			}

	//Cambiada visibilidad para poder usarse en extraer.
	static void imprime(int contadorCaras, int contadorCruces, int maximoCarasDoblesConsecutivas,
			int maximoCrucesDoblesConsecutivas) {
		System.out.println("Caras: " + contadorCaras + ", Cruces: " + contadorCruces);
		System.out.println("Maximo de caras dobles consecutivas: " + maximoCarasDoblesConsecutivas);
		System.out.println("Maximo de cruces dobles consecutivas: " + maximoCrucesDoblesConsecutivas);
	}
}