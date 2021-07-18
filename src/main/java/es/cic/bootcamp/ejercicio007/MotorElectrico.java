package es.cic.bootcamp.ejercicio007;

public class MotorElectrico {

	private int potenciaElectrica;
	
	public MotorElectrico() {
		this.potenciaElectrica = (int) generarPotenciaElectricaEntre0y40();
	}

	public int arrancarElectrico() {
		return potenciaElectrica;
	}
	
	
	private double generarPotenciaElectricaEntre0y40() {
		return Math.floor(Math.random() * 40);
}
}