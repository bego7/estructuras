import java.util.Scanner;
public class Intento1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String operacion = sc.nextLine();

		int tamanio = operacion.length();

		// Stack digitos [] = new Stack[];


		char operadores [] = new char [tamanio];

		char parentesis [] = new char [tamanio];

		char digits [] = new char [tamanio];

		int j =0;
		int k=0;
		int l=0;

		for(int i=0;i<tamanio;i++){

			if(operacion.charAt(i) == '(' ){
				parentesis[j] = operacion.charAt(i);
				j++;
			}
			else if (operacion.charAt(i) =='+' || operacion.charAt(i)=='-' || operacion.charAt(i)=='*' || operacion.charAt(i)=='%'){
				operadores[k] = operacion.charAt(i);
				k++;

			}

			else if (operacion.charAt(i) == ')'){
				// aqui obtengo op2
				int op2=0;
				for(int n=digits.length-1;n>=0;n--){
					if(digits[n]!=0){
						op2=digits[n]-48;
						digits[n]=0;
						System.out.println("El valor de op2 es "+ op2);
						break;
					}

				}

				// aqui obtengo op1
				int op1=0;
				for(int n=digits.length-1;n>=0;n--){
					if(digits[n]!=0){
						op1=digits[n]-48;
						digits[n]=0;
						System.out.println("El valor de op1 es "+ op1);
						break;
					}

				}


				// aqui obtengo el operador 
				int op=0;
				for(int n=operadores.length-1;n>=0;n--){
					if(operadores[n]!=0){
						op=operadores[n];
						operadores[n]=0;
						// op=(char)op;
						// parseo el tipo de dato de op a un char con (char)
						System.out.println("El valor de op es "+ op);
						break;
					}

				}

				// voy  a tratar de hacer la operacion pertinente y pushear al stack 
				misOperaciones(op1,op2,op);
				


			}

			else{
				digits[l] = operacion.charAt(i);
				l++; 
			}
		}

		for(int i=0;i<tamanio;i++){
			if(parentesis[i]!=0){
				System.out.println(parentesis[i]);
				System.out.println(parentesis[i]+" esta en la posicion" + i);	
			}
			
		}
		System.out.println();

		for(int i=0;i<tamanio;i++){
			if(digits[i]!=0){
				System.out.println(digits[i]);
			}
			
		}

		System.out.println();

		System.out.println("Arreglo de operadores");
		for(int i=0;i<tamanio;i++){
			
			
			if(operadores[i]!=0){
				System.out.println(operadores[i]);
			}
		}


		
	}

	public static void misOperaciones(int op1, int op2, int op){
		switch(op){

			case 42:
			System.out.println("Hago una multiplicacion");
			System.out.println(op2*op1);
			break;

			case 43:
			System.out.println("Hago una suma");	
			System.out.println(op2 +op1);
			break;

			case 45:
			System.out.println(op2-op1);
			break;

			case 47:
			System.out.println(op2/op1);
			break;

			default:
			System.out.println("Option not available!");

		}
	}
}