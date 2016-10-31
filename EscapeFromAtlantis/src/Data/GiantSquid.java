/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author macas
 */
public class GiantSquid extends Animal {

    public GiantSquid(int position) {
        super(position,3);
        
    }
    
    //calamar gigante destruye barcos y se come a los pasajeros, puede subir a zonas costeras a comer aldeanos
    @Override
    public void doEffect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
