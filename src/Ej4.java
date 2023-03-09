/* Ejercicio 4:
Escribe un programa Java que declare una variable entera N y asígnale un valor. A continuación, escribe las instrucciones que 
realicen los siguientes:
- Incrementar N en 77;
- Decrementarla en 3;
- Duplicar su valor.*/

public class Ej4 {
	public static void main(String args[]) {
		
	//He usado un bucle para hacer el incremento de manera distinta a los ejercicios anteriores
		
	int n=1;
	int contador=0;
	
	while(contador<77) {
		n++;
		contador++;
		}
	System.out.println(n);
		
	
	int contador2=0;
		
	while(contador2<3) {
		n--;
		contador2++;
	}
	System.out.println(n);
	System.out.println("Duplicar valor de n : "+(n*2));
	}
	
	
}

