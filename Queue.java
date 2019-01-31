

class Queue{
	
	char arreglo[];
	int frente, atras, size;
	int capacidad;

	public 	Queue(int capacidad){
		this.capacidad=capacidad;
		frente =this.size =0;
		atras = capacidad-1;
		arreglo = new char[this.capacidad];
	}
 
	 void agregar( char valor) 
	 { 
		 
		 this.atras = (this.atras + 1)%this.capacidad; 
		 this.arreglo[this.atras] = valor; 
		 this.size = this.size + 1; 
		
	 } 

	 char quitar() 
	 { 	
		 char valor = this.arreglo[this.frente]; 
		 this.frente = (this.frente + 1)%this.capacidad; 
		 this.size = this.size - 1; 
		//  System.out.println("Quite un parentesis");
		 return valor; 
	 } 

	 boolean isEmpty() 
    {  
		return (this.size == 0); 
	} 

}