/**
 * 
 */
package vue.swing.partie;

import controleur.PartieController;


public abstract class PartieView {
	private PartieController controller;

	/**
	 * Sémantique : Crée un NiveauDisplayView
	 * Préconditions :
	 * Postconditions :
	 * 
	 * @param controller
	 */
	public PartieView(PartieController controller) {
		this.controller = controller;
	}

	public abstract void close();

	public abstract void display();

	public final PartieController getController() {
		return this.controller;
	}
}
