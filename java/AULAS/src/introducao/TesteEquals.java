package introducao;

public class TesteEquals {

	public static void main(String[] args) {
		
		
		String nome="ED";
		String nomes[]= {"MARIA", "ED", "CARLOS"};
		
		for (int x=0; x<nomes.length; x++) {
			if (nomes[x] ==(nome)) {
				System.out.println("Ok, � o ED");
			}
			else {
				System.out.println("N� ele n�o!!!");
			}
		}
		
		

	}

}
