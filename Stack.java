

class Stack{
	
	// atributos
	int arreglo[];
	int size;

	// constructor
	public Stack(int tam){
		arreglo = new int [tam];
		size = 0;
	}

	public void push(int valor){
		arreglo[size] = valor;
		// System.out.println("pushee al arreglo el valor "+ valor);
		size++;	
	}

	public int pop(){
		int fuera = arreglo[size-1];
		arreglo[size-1]=0;
		// System.out.println("pop "+ fuera);
		size--;
		return fuera;
	}

	public void resultado(){
		// System.out.println("quiero dar el resultado");
		int fuera = arreglo[size-1];
		System.out.println(fuera);
	}
	



	
}