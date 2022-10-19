package tn.esprit;

public class Calcul {
	// -----------------------------------------------------------------
//C'est la classe clacul
	public void getAllPrducts() {
		try {
			System.out.println("In getAllPrducts() : ");
			System.out.println("Je vais lancer la divsion.");
			int i = 1 / 2;
			System.out.println("Je viens de finir la méthode de divsion. " + i);
			System.out.println("Je viens de finir l'opération X.");
			System.out.println("Out getAllPrducts() without errors.");
		} catch (Exception e) {
			System.out.println("Erreur dans getAllPrducts() : " + e);
		}
	}

	// --------------------------------------------------------------------
	public int calculerSom(int a, int b) {
		int res = 0;
		try {
			System.out.println("In calculerSom (" + a + ", " + b + ")");
			System.out.println("Je vais lancer l'addition");
			res = a + b;
			System.out.println("J'ai finis l'addition");
			System.out.println("Out calculerSom() : " + res);
		} catch (Exception e) {
			System.out.println("Erreur : " + e);
		}
		// res=31;
		return res;
	}

	public int calculerDiff(int a, int b) {
		int res = 0;
		try {
			System.out.println("In calculerDiff(" + a + ", " + b + ")");
			res = a - b;
			System.out.println("Out calculerDiff() : " + res);
		} catch (Exception e) {
			System.out.println("Erreur : " + e);
		}
		return res;
	}

	public int calculerDiv(int a, int b) {

		int res = 0;

		try {

			System.out.println("In calculerDiv(" + a + ", " + b + ")");

			res = a / b;

			System.out.println("Out calculerDiv() : " + res);
		} catch (Exception e) {
			System.out.println("Erreur : " + e);
		}
		return res;

	}
}