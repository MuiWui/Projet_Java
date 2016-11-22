
public class CarreNombre {
	
	int resultat;

	public static void main(String[] args) {
		
		nombrePremier(100);
		
		
	}

	public static void nombrePremier(int iteration){
		
		
		int compteur = 0;
        for (int i = 2; compteur <iteration/2; i++)
            {
            if ( i % 2 == 0 && i / 2 > 1)
                continue;
            else if ( i % 3 == 0 && i / 3 > 1)
                continue;
            else if ( i % 5 == 0 && i / 5 > 1)
                continue;
            else if ( i % 7 == 0 && i / 7 > 1)
                continue;
                compteur = compteur + 1 ;
                System.out.println(i);
		
		
		
		
		/*if (n < 0) {
			isPremier = false;
		} else if (n != 0 && n != 1) {
			for (int i = 2; i <= n/2; i++) {
				if (n != i && n % i == 0) {
					isPremier = false;
					break;
				}
			}
		}*/
	}
}
}