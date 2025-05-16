
package monlau;

import monlau.dao.ProductoDAO;
import monlau.dao.ProductoDAOImpl;
import monlau.model.Producto;

public class ProductoManager {
    public static void main(String[] args) {
        ProductoDAO productoDao =new ProductoDAOImpl();

        // Agregar nuevo producto
//        Producto nuevoProducto = new Producto(3,"Fresa",4.5);
        Producto nuevoProducto = new Producto("Fresa",4.5);
        productoDao.insert(nuevoProducto);


    }
}