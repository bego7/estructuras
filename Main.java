import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidad = sc.nextInt();
		sc.nextLine();
		for(int j =0;j<cantidad;j++){
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
							// System.out.println("valor antes del 48 "+ (op1*op2));
							resultado = (op1*op2)+48;
							// System.out.println("valor despues del 48 "+resultado);
							
						}

						else{
							 resultado =(op1*op2);
						}
						
						digits.push(resultado);

						if(parentesis.isEmpty() && i==tamanio-1){
							if(resultado>=48){
								resultado-=48;
							}
							System.out.println(resultado);	
						}
						break;
	
						case 43:
						int resultado2 = 0;
						
						if(op1+op2<=9){
							// System.out.println("valor antes del 48 "+ (op1+op2));
							resultado2 =  (op1+op2)+48;
							// System.out.println("valor deslpues del 48 "+resultado2);
						} 
						else{
							resultado2 = (op1+op2);
						}
						
						digits.push(resultado2);
						if(parentesis.isEmpty() && i==tamanio-1  ){
							if(resultado2>=48){
								resultado2-=48;
							}
							System.out.println((resultado2));
							// digits.resultado();
						}
						break;
	
						case 45:
						int resultado3 = 0;
						if((op1-op2)<=9){
							// System.out.println("valor antes del 48 "+ (op1-op2));
							resultado3=(op1-op2)+48;
							// System.out.println("valor antes del 48 "+ resultado3);
						}
	
						else{
							resultado3 = (op1-op2);
						}
						digits.push(resultado3);
						if(parentesis.isEmpty() && i==tamanio-1 ){
							if(resultado3>=48){
								resultado3-=48;
							}
							System.out.println((resultado3));
							// digits.resultado();
						}
						break;

						case 47:
						
						int resultado4 = 0;
						if(op1/op2<=9){
							// System.out.println("valor antes del 48 "+ (op1/op2));
							resultado4 =(op1/op2)+48;
							// System.out.println("valor antes del 48 "+ resultado4);
						}
						else{
							resultado4=(op1/op2);
						}

						if(parentesis.isEmpty() && i==tamanio-1 ){
							if(resultado4>=48){
								resultado4-=48;
							}
							System.out.println((resultado4));
							// digits.resultado();
						}
						
						digits.push(resultado4);
						
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
}