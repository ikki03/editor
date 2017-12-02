package org.ulco;

import org.ulco.*;

public class Utilitaires
{
    public static GraphicsObjects select(Document doc,Point pt, double distance) {
        GraphicsObjects list = new GraphicsObjects();
        for(Layer layer : doc.get_layers())
        for (GraphicsObject object : layer.get_list()) {
            if (object.isClosed(pt, distance)) {
                list.add(object);
            }
        }
        return list;
    }
}
