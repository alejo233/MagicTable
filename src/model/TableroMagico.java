package model;

public class TableroMagico {

	private int[][] tablero;
	private int numero;

	public TableroMagico(int tamanio) {
		tablero = new int[tamanio][tamanio];
		generarTablero(tamanio);
	}

	public int[][] getTablero() {
		return tablero;
	}

	public void setTablero(int[][] tablero) {
		this.tablero = tablero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void generarTablero(int numero) {
		this.numero = numero;
		tablero = new int[numero][numero];
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero; j++) {
				tablero[i][j] = 0;
			}
		}
	}

	public void establecerLateralDerecho() {
		int tamanho = tablero.length;
		int mitadTamanho = tamanho / 2;
		if (tablero[mitadTamanho][tamanho - 1] == 0) {
			tablero[mitadTamanho][tamanho - 1] = 1;
		}

	}

	public int[][] establecerLateralIzquierdo() {
		int tamanho = tablero.length;
		int mitadTamanho = tamanho / 2;
		if (tablero[mitadTamanho][0] == 0) {
			tablero[mitadTamanho][0] = 1;
		}
		// int[][]nuevaPosicion=new int[mitadTamanho][0];
		// nuevaPosicion[mitadTamanho][0]=1;
		return tablero;
	}

	public int[][] establecerTechoSuperior() {
		int tamanho = tablero.length;
		int mitadTamanho = tamanho / 2;
		if (tablero[0][mitadTamanho] == 0) {
			tablero[0][mitadTamanho] = 1;
		}
		return tablero;
	}

	public int[][] establecerTechoInferior() {
		int tamanho = tablero.length;
		int mitadTamanho = tamanho / 2;
		if (tablero[tamanho][mitadTamanho] == 0) {
			tablero[tamanho][mitadTamanho] = 1;
		}
		return tablero;
	}

	public void fillDiagonalNERight(int direction){
		int i=0;
		int j=0;
		
		boolean stop=false;
		salite:
		for ( i=0; i < tablero.length&&!stop; i++) {
			for ( j=0; j < tablero.length&&!stop; j++) {
				if (tablero[i][j]==1) {
					break salite;
				}
			}
		}
		System.out.println("pos"+i+""+j);
		int tamanho=tablero.length;
		int contador=1;
		
		System.out.println("ante while");
		while(contador<tamanho*tamanho) {
			System.out.println(contador+" i: "+i+" j: "+j);
				contador++;
				j++;
				i=i+direction;
				if(j==tamanho){
					j=0;	
				}
				 if (i<0) {
					i=tamanho-1;
				}	
				 if (tablero[i][j]!=0) {
					if(i==tamanho-1&&j==0) {
						i=0;
						j=tamanho-2;
					}else {
					i+=1;
					j-=2;
					}				
				}
				
				tablero[i][j]=contador;
				
		
		}
	}
	
	public void fillDiagonalNEUp(int direction){
		int i=0;
		int j=0;
		
		boolean stop=false;
		salite:
		for ( i=0; i < tablero.length&&!stop; i++) {
			for ( j=0; j < tablero.length&&!stop; j++) {
				if (tablero[i][j]==1) {
					break salite;
				}
			}
		}
		System.out.println("pos"+i+""+j);
		int tamanho=tablero.length;
		int contador=1;
		
		System.out.println("ante while");
		while(contador<tamanho*tamanho) {
			System.out.println(contador+" i: "+i+" j: "+j);
				contador++;
				j++;
				i=i+direction;
				if(j==tamanho){
					j=0;	
				}
				 if (i<0) {
					i=tamanho-1;
				}	
				 if (tablero[i][j]!=0) {
					if(i==tamanho-1&&j==0) {
						i=1;
						j=tamanho-1;
					}else {
					i+=2;
					j-=1;
					}				
				}
				
				tablero[i][j]=contador;
				
		
		}
	}


	public void fillDiagonalNOUp(int direction){
		int i=0;
		int j=0;
		
		boolean stop=false;
		salite:
		for ( i=0; i < tablero.length&&!stop; i++) {
			for ( j=0; j < tablero.length&&!stop; j++) {
				if (tablero[i][j]==1) {
					break salite;
				}
			}
		}
		System.out.println("pos"+i+""+j);
		int tamanho=tablero.length;
		int contador=1;
		
		System.out.println("ante while");
		while(contador<tamanho*tamanho) {
			System.out.println(contador+" i: "+i+" j: "+j);
				contador++;
				j=j+direction;
				i=i+direction;
				if(j<0){
					j=tamanho-1;	
				}
				 if (i<0) {
					i=tamanho-1;
				}	
				 if (tablero[i][j]!=0) {
					if(i==tamanho-1&&j==tamanho-1) {
						i=1;
						j=0;
					}else {
					i+=2;
					j+=1;
					}				
				}
				
				tablero[i][j]=contador;
				
		
		}
	}

	
	public void fillDiagonalNOLeft(int direction){
		int i=0;
		int j=0;
		
		boolean stop=false;
		salite:
		for ( i=0; i < tablero.length&&!stop; i++) {
			for ( j=0; j < tablero.length&&!stop; j++) {
				if (tablero[i][j]==1) {
					break salite;
				}
			}
		}
		System.out.println("pos"+i+""+j);
		int tamanho=tablero.length;
		int contador=1;
		
		System.out.println("ante while");
		while(contador<tamanho*tamanho) {
			System.out.println(contador+" i: "+i+" j: "+j);
				contador++;
				j=j+direction;
				i=i+direction;
				if(j<0){
					j=tamanho-1;	
				}
				 if (i<0) {
					i=tamanho-1;
				}	
				 if (tablero[i][j]!=0) {
					if(i==tamanho-1&&j==tamanho-1) {
						i=0;
						j=1;
					}else {
					i+=1;
					j+=2;
					}				
				}
				
				tablero[i][j]=contador;
				
		
		}
	}

	
	public void fillDiagonalSOLeft(int direction){
		int i=0;
		int j=0;
		
		boolean stop=false;
		salite:
		for ( i=0; i < tablero.length&&!stop; i++) {
			for ( j=0; j < tablero.length&&!stop; j++) {
				if (tablero[i][j]==1) {
					break salite;
				}
			}
		}
		System.out.println("pos"+i+""+j);
		int tamanho=tablero.length;
		int contador=1;
		
		System.out.println("ante while");
		while(contador<tamanho*tamanho) {
			System.out.println(contador+" i: "+i+" j: "+j);
				contador++;
				j=j+direction;
				i=i+1;
				if(j<0){
					j=tamanho-1;	
				}
				 if (i==tamanho) {
					i=0;
				}	
				 if (tablero[i][j]!=0) {
					if(i==0&&j==tamanho-1) {
						i=tamanho-1;
						j=1;
					}else {
					i-=1;
					j+=2;
					}				
				}
				
				tablero[i][j]=contador;
				
		
		}
	}

	public void fillDiagonalSODown(int direction){
		int i=0;
		int j=0;
		
		boolean stop=false;
		salite:
		for ( i=0; i < tablero.length&&!stop; i++) {
			for ( j=0; j < tablero.length&&!stop; j++) {
				if (tablero[i][j]==1) {
					break salite;
				}
			}
		}
		System.out.println("pos"+i+""+j);
		int tamanho=tablero.length;
		int contador=1;
		
		System.out.println("ante while");
		while(contador<tamanho*tamanho) {
			System.out.println(contador+" i: "+i+" j: "+j);
				contador++;
				j=j+direction;
				i=i+direction;
				if(j<0){
					j=tamanho-1;	
				}
				 if (i<0) {
					i=tamanho-1;
				}	
				 if (tablero[i][j]!=0) {
					if(i==tamanho-1&&j==tamanho-1) {
						i=1;
						j=0;
					}else {
					i+=2;
					j+=1;
					}				
				}
				
				tablero[i][j]=contador;
				
		
		}
	}

	public void fillDiagonalSEDown(int direction){
		int i=0;
		int j=0;
		
		boolean stop=false;
		salite:
		for ( i=0; i < tablero.length&&!stop; i++) {
			for ( j=0; j < tablero.length&&!stop; j++) {
				if (tablero[i][j]==1) {
					break salite;
				}
			}
		}
		System.out.println("pos"+i+""+j);
		int tamanho=tablero.length;
		int contador=1;
		
		System.out.println("ante while");
		while(contador<tamanho*tamanho) {
			System.out.println(contador+" i: "+i+" j: "+j);
				contador++;
				j=j+direction;
				i=i+direction;
				if(j<0){
					j=tamanho-1;	
				}
				 if (i<0) {
					i=tamanho-1;
				}	
				 if (tablero[i][j]!=0) {
					if(i==tamanho-1&&j==tamanho-1) {
						i=1;
						j=0;
					}else {
					i+=2;
					j+=1;
					}				
				}
				
				tablero[i][j]=contador;
				
		
		}
	}

	
	
	public void fillDiagonalSERight(int direction){
		int i=0;
		int j=0;
		
		boolean stop=false;
		salite:
		for ( i=0; i < tablero.length&&!stop; i++) {
			for ( j=0; j < tablero.length&&!stop; j++) {
				if (tablero[i][j]==1) {
					break salite;
				}
			}
		}
		System.out.println("pos"+i+""+j);
		int tamanho=tablero.length;
		int contador=1;
		
		System.out.println("ante while");
		while(contador<tamanho*tamanho) {
			System.out.println(contador+" i: "+i+" j: "+j);
				contador++;
				j++;
				i=i+direction;
				if(j==tamanho){
					j=0;
				}
				if (i==tamanho) {
					i=0;
				}
				if (tablero[i][j]!=0) {
					if(i==0&&j==0) {
						i=tamanho-1;
						j=tamanho-2;
					}else{
					i-=1;
					j-=2;
					}
				}
				tablero[i][j]=contador;
				
				
		
		}
		
		
		
	
		
		
		
		
		
	}

}
