import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidad = sc.nextInt();

		for(int j =0;j<=cantidad;j++){
			String operacion = sc.nextLine();
			int tamanio = operacion.length();

			Stack digits = new Stack (tamanio);
			Stack operadores = new Stack (tamanio);
			Queue parentesis = new Queue (tamanio);


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
						int resultado = 0;
						if(op1*op2<=9){
							resultado = (op1*op2)+48;
						}

						else{
							 resultado =(op1*op2);
						}
						
						digits.push((char)resultado);
						if(parentesis.isEmpty() && i==tamanio-1  && resultado>9){
							System.out.println(Integer.toString(resultado));
							// digits.resultado();
						}
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
						if(parentesis.isEmpty() && i==tamanio-1  && resultado2>9){
							System.out.println(Integer.toString(resultado2));
							// digits.resultado();
						}
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
						if(parentesis.isEmpty() && i==tamanio-1  && resultado3>9){
							System.out.println(Integer.toString(resultado3));
							// digits.resultado();
						}
						break;

						case 47:
						
						int resultado4 = 0;
						if(op1/op2<=9){
							resultado4 =(op1/op2)+48;
						}
						else{
							resultado4=(op1/op2);
						}

						if(parentesis.isEmpty() && i==tamanio-1 && resultado4>9){
							System.out.println(Integer.toString(resultado4));
							// digits.resultado();
						}
						
						digits.push((char)resultado4);
						
						break;
	
						default:
						System.out.println("Option not available!");
	
					}
			

				if(parentesis.isEmpty() && i==tamanio-1){
					// System.out.println("final");
					digits.resultado();
				}
			}

			else{
				digits.push(operacion.charAt(i));		
			}
		}
		}
		
	}
}