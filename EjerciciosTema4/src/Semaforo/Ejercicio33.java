package Semaforo;

public class Ejercicio33 {

	public static void main(String[] args) {
		
		Semaforo semaforo = new Semaforo();
		
		semaforo.setColor(Semaforo.colores.VERDE);
		System.out.println(semaforo.getColor());
		semaforo.toString();
		semaforo.setParpadeo(true);
		semaforo.setColor(Semaforo.colores.AMBAR);
		semaforo.setParpadeo(true);
		semaforo.toString();
		for ( int i = 0; i < 5 ; i ++) {
			semaforo.cambiarEstado();
			semaforo.toString();
		}
		
		Semaforo semaforo2;
		semaforo2 = semaforo;

	}

}
