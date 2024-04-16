class Calc {
	public static void main(String args[]){
		float n1 = Float.parseFloat(args[0]);
		float n2 = Float.parseFloat(args[1]);
		char operator = args[2].charAt(0);
		switch (operator) {
			case '+':
				System.out.println(n1 + n2);
				break;
			case '-':
				System.out.println(n1 - n2);
				break;
			case 'x':
				System.out.println(n1 * n2);
				break;
			case '/':
				System.out.println(n1 / n2);
				break;
			default:
				System.out.println("Invalid");
				break;
		}
	}
}