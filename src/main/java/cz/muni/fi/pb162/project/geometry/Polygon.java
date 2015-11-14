package cz.muni.fi.pb162.project.geometry;

import cz.muni.fi.pb162.project.geometry.Vertex2D;
import cz.muni.fi.pb162.project.geometry.Solid;

/**
 * Interface for general polygons including irregular polygons
 * 
 * @author Radek Oslejsek &lt;oslejsek@fi.muni.cz&gt;, Masaryk University, Faculty of Informatics
 */
public interface Polygon extends Solid {
    
    /**
     * Returns vertex at given index modulo number of indices.
     * 
     * @param index vertex index
     * @return vertex at given index modulo number of indices
     * @throws IllegalArgumentException if index is negative
     */
    Vertex2D getVertex(int index) throws IllegalArgumentException;

    /**
     * Returns number of vertices of the polygon.
     * 
     * @return number of vertices
     */
    int getNumVertices();
}
