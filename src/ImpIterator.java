import java.util.Iterator;

//public class ImpIterator implements Iterator <Integer>{ on demande de travailler sur des integer
public class ImpIterator implements Iterator{
	
	private Table tab;
	private int compteur;
	
	
	public ImpIterator(Table tab) {
		this.tab = tab;
		this.compteur = 0;
	}
	
	public Table getTab() {
		return this.tab;
	}
	
	public void setTab(Table tab) {
		this.tab = tab;
	}
	
	public int getCompteur() {
		return this.compteur;
	}
	
	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}
	
	
	@Override
	public boolean hasNext() {
		return (this.compteur<= this.tab.getIndex());
	}

	//public Interger next() { si on met Integer en haut
	@Override
	public Object next() {
		int v[] = this.tab.getTableau();
		return v[this.compteur++];
	}
	
	public void remove() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}

}
