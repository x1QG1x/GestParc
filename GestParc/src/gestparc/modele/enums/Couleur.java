/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele.enums;

import java.awt.Color;

/**
 * Enumération des différentes couleurs représentatives de l'état du véhicule
 * @author vpivet
 */
public enum Couleur {
    VERT(Color.green), ORANGE(Color.orange), ROUGE(Color.red);
    private final Color color;
    
    Couleur(Color color)
    {
        this.color = color;
    }
    
    public Color getColor()
    {
        return color;
    }
}
