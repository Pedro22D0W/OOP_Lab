import java.util.*;
public class Account {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		UserAccount user1 = new UserAccount();
		
		              //Entrada//
	////////////////////////////////////////////////////////////
			System.out.print("Nome de Usuario:");
			user1.setName(input.nextLine());
			
			System.out.print("Numero da conta:");
			user1.setAccountNumber(input.nextInt());



			System.out.print("Limite:");
			user1.setLimit(input.nextDouble());

				              //saida//
	////////////////////////////////////////////////////////////
			user1.show();
			user1.changPassword(input.next());

			
			
	}

}
