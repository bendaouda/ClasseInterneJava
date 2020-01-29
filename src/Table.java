

public class Table {
	private int [] tableau;
	private int capacite;
	private int index;
	
	public Table(int max_size){
		this.tableau = new int[max_size];
		this.capacite = max_size;
		this.index = -1; //l'index jusqu'auquel le tableau est rempli
	}
	
	public int[] getTableau() {
		return this.tableau;
	}
	
	public void setTableau(int[] tableau) {
		this.tableau=tableau;
	}
	
	
	public int getCapacite() {
		return this.capacite;
	}
	
	public void setCapacite(int capacite) {
		this.capacite=capacite;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public void setIndex(int index) {
		this.index=index;
	}
	
	
	public int size() {
		 return this.index +1 ;
	}
	
	public void add(int element) {
		if (this.size()< this.capacite) {
				this.tableau[++this.index] = element;
			}
		}
			
		public ImpIterator iterator () {
			return new ImpIterator(this);
		}
	
}


//Compiler avec les deux fichiers séparés
//2. en faire une classe interne
