package sesliharfler;

public class Main {

	public static void main(String[] args) {
		char harf='I';
		
		switch(harf){
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(harf +" Kal�n Sesli harftir");
			break;
			default:
			System.out.println(harf +" �nce Sesli harftir");
		}

	}

}
