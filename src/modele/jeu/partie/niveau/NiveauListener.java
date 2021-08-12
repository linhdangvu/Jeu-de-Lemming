/**
 * 
 */
package modele.jeu.partie.niveau;

import java.util.EventListener;


public interface NiveauListener extends EventListener {
	public void niveauChanged(NiveauChangedEvent evt);
}
