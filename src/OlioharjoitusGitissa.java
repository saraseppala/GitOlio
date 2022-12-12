
public class OlioharjoitusGitissa {


		public static void main(String[] args) {
			
			Auto auto = new Auto();
			
			auto.naytaTiedot();
			//auto.autoJarruttaa();
			auto.autoKiihdyttaa("down");
			auto.tankkaa();
			
			Auto auto1 = new Auto();
			
			auto1.naytaTiedot();
		}
			
		}

	// Auto-luokka
	class Auto
	{
		public String merkki;
		public String malli;
		public int bensanMaara;
		public int tankkaus;

		//oletusmuodostin
		
		public Auto()
		{
			merkki="";
			malli="";
			bensanMaara=0;
		}
		
		//parametrisoitu muodostin
		
		public Auto(String Volvo, String V70, int polttoaine) {
			merkki = Volvo;
			malli = V70;
			bensanMaara = polttoaine;
			tankkaus = 5;
		}
	
		
		// metodit
		
//		public void autoJarruttaa()
//		{
//			System.out.println("Auto jarruttaa.");
//		}
	//	
		
		public void autoKiihdyttaa(String polttoaine)
		
		{
			if (polttoaine.equals("up")) {
				bensanMaara++;
			} else {
				bensanMaara--;}
			
			System.out.println("Auto kiihtyy");
		}
		
		public void naytaTiedot()
		{
			System.out.println(merkki);
			System.out.println(malli);
			System.out.println("Bensan maara: " + bensanMaara);
		}
		
		public void tankkaa()
		{
			System.out.println("Tankissa bensaa: " + bensanMaara);
			System.out.println("Tankkaus: " + tankkaus);
			System.out.println("Tankissa bensaa tankkauksen jälkeen: " + (tankkaus+bensanMaara));
		}



	}
