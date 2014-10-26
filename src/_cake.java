import java.util.Scanner;

public class _cake {
	public static void main(String args[]) {
		@SuppressWarnings("resource")

		Scanner _input = new Scanner(System.in);

		String _cake;		
		System.out.println("What cake do you want to bake? ");
		_cake = _input.next();

		int _bake;
		System.out.println("How long shall we bake the cake? ");
		_bake = _input.nextInt();

		if (_bake <= 10){
			System.out.println("It has only been" + _bake + "minutes." + "The cake has not barely been cooked.");
		} else if (_bake > 35 || _bake < 40 ){
			System.out.println("Looks like your cake is ready to eat.");

			String _eat;
			System.out.println("You have baked a " + _cake + " cake. Do you want to eat it?");
			_eat = _input.next();			

			if (_eat.equals("yes") || _eat.equals("Yes") || _eat.equals("YES")){
				System.out.println("You have eaten the eat.");
			} else {
				System.out.println("Looks like the cake has spoiled.");
			}

		} else {
			System.out.println("You have burnt the cake.");
		}
	}
}