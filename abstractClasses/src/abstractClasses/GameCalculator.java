package abstractClasses;

public abstract class GameCalculator {// abstract bir s�n�f�m abstract olabilmesi i�in abstract imzas�yla beslenmesi gerekir.
	public abstract void hesapla(); //hesaplamay� i�ermek zorunda fakat kendi hesaplas�n� yazmak zorunda..Operasyonun abstract olabilmesi i�in yine abstract tan beslenmesi gerekir
		
	
	public final void gameOver(){ //kim GameCalculator u kullan�yorsa gameOver i oldu�u gibi kullanmak zorunda
		System.out.println("Oyun Bitti");
	}
	

}
