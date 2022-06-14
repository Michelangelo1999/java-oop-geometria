package jana60.geometria;

public class Rettangolo {
	
	int base;
	int altezza;
	
	int calcolaArea(int dim1, int dim2) {
		return dim1*dim2;
	}
	
	int calcolaPerimetro(int dim1, int dim2) {
		return (dim1+dim2)*2;
	}

}
