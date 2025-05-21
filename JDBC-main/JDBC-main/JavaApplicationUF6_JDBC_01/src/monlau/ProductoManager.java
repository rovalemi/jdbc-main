
package monlau;

import monlau.dao.ProductoDAO;
import monlau.dao.ProductoDAOImpl;
import monlau.model.Producto;

public class ProductoManager {
    public static void main(String[] args) {
        ProductoDAO productoDao =new ProductoDAOImpl();

        // Agregar nuevo producto
        Producto productoN = new Producto(200,"Manzana",5.5);
        productoDao.insert(productoN);
        System.out.println("\nSe ha agregado el producto: " + productoN);
        
        // Obtener el producto con el ID = 200
        Producto productoS = productoDao.read(200);
        if (productoS != null) {
            System.out.println("\nSe ha encontrado el producto: " + productoS);
        } else {
            System.out.println("\nProducto con ID: 200 no encontrado.");
        }

        // Actualizar el producto con el ID = 200
        if (productoS != null) {
            productoS.setNombre("Pera");
            productoS.setPrecio(5.5);
            System.out.println("");
            productoDao.update(productoS);
        } else {
            System.out.println("\nProducto con ID: 200 no encontrado.");
        }

        // Eliminar el producto
        if (productoS != null) {
            System.out.println("");
            productoDao.delete(productoS);
        } else {
            System.out.println("\nProducto con ID: 200 no encontrado.");
        }

        // Intentar leer de nuevo el producto
        Producto productoE = productoDao.read(200);
        if (productoE == null) {
            System.out.println("\nProducto con ID: 200 no se encuentra (eliminado).");
        } else {
            System.out.println("\nError: el producto todavia existe: " + productoE);
        }
    }
}
