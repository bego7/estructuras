

class Stack{
	
	// atributos
	char arreglo[];
	int size;

	// constructor
	public Stack(int tam){
		arreglo = new char [tam];
		size = 0;
	}

	public void push(char valor){
		arreglo[size] = valor;
		// System.out.println("pushee al arreglo el valor "+ valor);
		size++;	
	}

	public char pop(){
		char fuera = arreglo[size-1];
		arreglo[size-1]=0;
		// System.out.println("pop "+ fuera);
		size--;
		return fuera;
	}

	public void resultado(){
		// System.out.println("quiero dar el resultado");
		char fuera = arreglo[size-1];
		System.out.println(fuera);
	}
	



	
}