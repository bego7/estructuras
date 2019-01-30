class Stack{
	
	char arreglo[] = new char [1000];

	public void push(char valor){
		for(int i =0;i<arreglo.length;i++){
			if(arreglo[i]==0){
				arreglo[i]= valor;
				System.out.println(Integer.toString(valor));
				break;
			}
		}
	}

	public char pop(){
		char fuera = ' ';
		for(int n=arreglo.length-1;n>=0;n--){
			if(arreglo[n]!=0){
				fuera= arreglo[n];
				arreglo[n]=0;
				System.out.println(" Saque del stack en "+ n);
				break;
			}
		}

		return fuera;
	}

	// int op2=0;
	// 			for(int n=digits.length-1;n>=0;n--){
	// 				if(digits[n]!=0){
	// 					op2=digits[n]-48;
	// 					digits[n]=0;
	// 					System.out.println("El valor de op2 es "+ op2);
	// 					break;
	// 				}

	// 			}



	
}