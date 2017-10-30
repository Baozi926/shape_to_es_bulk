package elasticSearch;

import com.esri.core.geometry.Geometry;
import elasticSearch.shape.ShapefileGeometryCursor;

import java.io.File;
import java.io.IOException;

/**
 * Created by Caihm on 2017/10/30.
 */
public class Bulk_Importer {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/polygons.shp");
        ShapefileGeometryCursor geometryCursor = new ShapefileGeometryCursor(file);
        Geometry geom = geometryCursor.next();
    }

}
