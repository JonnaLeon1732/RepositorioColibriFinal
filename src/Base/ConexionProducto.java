/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import clases.Administrador;
import clases.Producto;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo 2
 */
public class ConexionProducto {

    public ConexionProducto() {
    }
        public ObjectContainer BaseProducto(){
        ObjectContainer contenedor=Db4o.openFile("C:\\Program Files\\Colibri\\BaseProduct.yap");
        return contenedor;
    }
    public void CrearProducto(ObjectContainer basep,String codigo, String nombre, String descripcion, int exitencias, double precio, String ID_proveedor){
        Producto producto=new Producto(codigo,nombre,descripcion,exitencias,precio,ID_proveedor);
        if (ComprobarProducto(basep,codigo)!=0) {
            JOptionPane.showMessageDialog(null,"Registro Existente");
        }else{
            basep.set(producto);
            JOptionPane.showMessageDialog(null,"Registro Guardado");
        }
    }
    
    public static int ComprobarProducto(ObjectContainer basep,String codigo){
        Producto producto=new Producto(codigo,null,null,0,0,null);
        ObjectSet resultado=basep.get(producto);
        return resultado.size();
    }
    
    public void Cerrarbd(ObjectContainer basep){
        basep.close();
    }
    
    public boolean ConsultarProducto(ObjectContainer basep,String codigo){
        Producto producto=new Producto(codigo,null,null,0,0,null);
        ObjectSet resultado=basep.get(producto);
        if (resultado.size()==0) {
            return false;
        }else{
            return true;
        }
    }
    
    public Producto[] ConsultarProducto(Producto objeto) {
        Producto[] producto = null;
        ObjectContainer base=BaseProducto();
        ObjectSet resultados = base.get(objeto);
        int i = 0;
        if (resultados.hasNext()) {
            producto = new Producto[resultados.size()];
            while (resultados.hasNext()) {
                producto[i] = (Producto) resultados.next();
                i++;
            }
        }
        Cerrarbd(base);
        return producto;
    }
    
    public DefaultTableModel Productos() {
        String titulos[] = {"Codigo", "Producto", "Descripción","Existencia","Precio","Proveedor"};
        DefaultTableModel dtm = new DefaultTableModel(null, titulos);
        Producto producto = null;
        Producto[] p = ConsultarProducto(producto);
        if (p != null) {
            for (Producto pro : p) {
                Object[] cli = new Object[6];
                cli[0] = pro.getCodigo();
                cli[1] = pro.getNombre();
                cli[2] = pro.getDescripcion();
                cli[3] = pro.getExistencias();
                cli[4] = pro.getPrecio();
                cli[5] = pro.getID_proveedor();
                dtm.addRow(cli);
            }
        }
        return dtm;
    }
    public DefaultTableModel EscojerProductos(String dato) {
        String titulos[] = {"Codigo", "Producto","Existencia","Precio"};
        DefaultTableModel dtm = new DefaultTableModel(null, titulos);
        Producto producto = null;
        Producto[] p = ConsultarProducto(producto);
        if (p != null) {
            for (Producto pro : p) {
                Object[] cli = new Object[4];
                if (dato.equals(pro.getDescripcion())) {
                    cli[0] = pro.getCodigo();
                    cli[1] = pro.getNombre();
                    cli[2] = pro.getExistencias();
                    cli[3] = pro.getPrecio();
                    dtm.addRow(cli);
                }

            }
        }
        return dtm;
    }
}