package abstractClasses;

public abstract class GameCalculator {// abstract bir sýnýfým abstract olabilmesi için abstract imzasýyla beslenmesi gerekir.
	public abstract void hesapla(); //hesaplamayý içermek zorunda fakat kendi hesaplasýný yazmak zorunda..Operasyonun abstract olabilmesi için yine abstract tan beslenmesi gerekir
		
	
	public final void gameOver(){ //kim GameCalculator u kullanýyorsa gameOver i olduðu gibi kullanmak zorunda
		System.out.println("Oyun Bitti");
	}
	

}
