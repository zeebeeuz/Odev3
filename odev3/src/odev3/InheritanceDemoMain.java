package odev3;

public class InheritanceDemoMain {

	public static void main(String[] args) {
		//OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		//ogretmenKrediManager.Hesapla();
		
		KrediUI krediUI =new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
