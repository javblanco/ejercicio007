package es.cic.bootcamp.ejercicio007;

public class CrearCoche {

	private MotorElectrico motorE = new MotorElectrico();
	private MotorCombustion motorC = new MotorCombustion();

	public int encender() {
		
		if (motorE.arrancarElectrico()>20) {
			 
			return motorE.arrancarElectrico()/7;

			
		}else{
			
			return (motorE.arrancarElectrico() 
					+ motorC.arrancarCombustion())/7 ;
			
		}
	}

	public MotorElectrico getMotorElectrico() {
		return motorE;
	}
	
	public MotorCombustion getMotorCombustion() {
		return motorC;
	}

}
