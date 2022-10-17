
public abstract class GameCalculator {
	public abstract void hesapla(); // hesapla fonksiyonu herkeste farklı olmak zorunda.

	public final void gameOver() {
		System.out.println("Oyun Bitti");
	}
}
