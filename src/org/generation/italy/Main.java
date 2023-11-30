package org.generation.italy;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner (System.in);
		Float moneta;
		int codiceBevanda, quantita,cont=1;
		String risposta, password;
		DistributoreBevande distributore = new DistributoreBevande();
		
		do {
			System.out.println("\n\n\n\n\n\n");
			
			distributore.elencoBevande();
			System.out.println("il tuo credito è: "+ distributore.getCredito());
			
			System.out.println(" ");
			System.out.println("1 - inserisci moneta");
			System.out.println("2 - scegli bevanda");
			System.out.println("3 - carica bevanda");
			System.out.println("4 - esci");
			System.out.print("\nche operazione vuoi compiere?");
			
			risposta=sc.nextLine();
			switch (risposta) {
            case "1":
    				System.out.println("\nPuoi inserire monete da: 0.50/1.00/2.00 €");
    				moneta = Float.parseFloat(sc.nextLine());
    				distributore.inserisciMoneta(moneta);
            case "2":
                
            	System.out.println("scegli numero bevanda");
				codiceBevanda = Integer.parseInt(sc.nextLine());
				distributore.erogaBevanda(codiceBevanda);
            
            case "3":
                System.out.println("Inserisci password");
                password = sc.nextLine();
                do {
                    if (password.equals("12345")) {
                        System.out.println("Quale bevanda vuoi caricare?");
                        codiceBevanda = Integer.parseInt(sc.nextLine());
                        System.out.println("Quanta ne vuoi caricare?");
                        quantita = Integer.parseInt(sc.nextLine());
                        distributore.caricaBevanda(codiceBevanda, quantita);
                       
                    } else {
                        System.out.println("Password errata riprova:");
                        password = sc.nextLine();
                        cont += 1;
                    }
                } while (!password.equals("12345") && cont < 3);

                if (cont == 3) {
                    System.out.println("Troppi tentativi. Riprova fra 5 secondi.");
                
                        try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}  
                    
                    cont = 0;  // Resetta il contatore dopo l'attesa
                	
                }
                break;
            case "4":
            	System.out.println("Arrivederci");
                break;
            
            default:
                System.out.println("Scelta non valida");
			}
			
		} while (!risposta.equals("4"));
		
		
		sc.close();
	}

}
