package es.cic.bootcamp.ejercicio007;

public class MotorCombustion {

private int potenciaCombustion;
	
	public MotorCombustion() {
		this.potenciaCombustion = (int) generarPotenciaCombustionEntre0y40();
	}

	public int arrancarCombustion() {
		return potenciaCombustion;
	}
	
	
	private double generarPotenciaCombustionEntre0y40() {
		return Math.floor(Math.random() * 40);
}
	
}
