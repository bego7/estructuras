import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Ingrese una cifra");
		String operacion = sc.nextLine();
		int tamanio = operacion.length();

		Stack digits = new Stack ();
		Stack operadores = new Stack ();
		Queue parentesis = new Queue ();

		for(int i=0;i<tamanio;i++){

			if (operacion.charAt(i) =='+' || operacion.charAt(i) =='-' || operacion.charAt(i) =='*' || operacion.charAt(i)=='/'){
				operadores.push(operacion.charAt(i));
			}


			else if(operacion.charAt(i) == '(' ){
				parentesis.agregar(operacion.charAt(i));
				
			}

			else if (operacion.charAt(i) == ')'){
				int op2=digits.pop()-48;
				int op1=digits.pop()-48;
				parentesis.quitar();

				switch(operadores.pop()){

					case 42:
					char resultado = ' ';
					if(op1*op2<=9){
						resultado = (char)(op1*op2);

					}
					else{
						 resultado =(char)(op1*op2);
					}
					
					digits.push((char)resultado);
					// System.out.println((char)resultado);
					System.out.println(Integer.toString(resultado));
					break;

					case 43:
					int resultado2 = 0;
					
					if(op1+op2<=9){
						resultado2 =  (op1+op2)+48;
					} 
					else{
						resultado2 = (op1+op2);
					}
					
					digits.push((char)resultado2);
					System.out.println((char)resultado2);
					System.out.println(Integer.toString(resultado2));
					break;

					case 45:
					
					int resultado3 = 0;
					if((op1-op2)<=9){

						resultado3=(op1-op2)+48;
					}

					else{
						resultado3 = (op1-op2);
					}
					digits.push((char)resultado3);
					System.out.println((char)resultado3);
					break;

					case 47:
					
					int resultado4 = 0;
					if(op1/op2<=9){
						resultado4 =(op1/op2)+48;
					}
					else{
						resultado4=(op1/op2);
					}
					// System.out.println(resultado4);
					digits.push((char)resultado4);
					System.out.println((char)resultado4);
					break;

					default:
					System.out.println("Option not available!");

				}

			}

			else{
				digits.push(operacion.charAt(i));		
			}
		}
	}
}