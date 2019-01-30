class Queue{
	
	char arreglo[] = new char [1000];

	public void agregar(char valor){
		for(int i =0;i<arreglo.length;i++){
			if(arreglo[i]==0){
				arreglo[i]= valor;
				// System.out.println("El valor es "+ arreglo[i]);
				break;
			}
		}

	}

	public void quitar(){
		for(int n=0;n<arreglo.length;n++){
			if(arreglo[n]!=0){
				arreglo[n]=0;
				System.out.println(n);
				break;
			}

		}
	}
}