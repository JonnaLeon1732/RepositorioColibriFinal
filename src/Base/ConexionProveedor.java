/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;


import clases.Proveedor;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo 2
 */
public class ConexionProveedor {

    public ConexionProveedor() {
    }
    public ObjectContainer BaseProveedor(){
        ObjectContainer contenedor=Db4o.openFile("C:\\Program Files\\Colibri\\BaseProveedor.yap");
        return contenedor;
    }
    public void CrearProveedor(ObjectContainer basep,String codigo_prov, String ID, String nombre, String apellido, String telefono, String direccion){
        Proveedor prov=new Proveedor(codigo_prov,ID,nombre,apellido,telefono,direccion);
        if (ComprobarProveedor(basep,nombre,ID)!=0) {
            JOptionPane.showMessageDialog(null,"Registro Existente");
        }else{
            basep.set(prov);
            JOptionPane.showMessageDialog(null,"Registro Guardado");
        }
    }
    
    public static int ComprobarProveedor(ObjectContainer basep,String nombre,String ID){
        Proveedor prov=new Proveedor(null,ID,null,null,null,null);
        ObjectSet resultado=basep.get(prov);
        return resultado.size();
    }
    
    public void Cerrarbd(ObjectContainer basep){
        basep.close();
    }
    
    public boolean ConsultarProveedor(ObjectContainer basep,String codigo){
        Proveedor prov=new Proveedor(codigo,null,null,null,null,null);
        ObjectSet resultado=basep.get(prov);
        return !resultado.isEmpty();
    }
    
    public Proveedor[] ConsultarProv(Proveedor objeto) {
        Proveedor[] prov = null;
        ObjectContainer base=BaseProveedor();
        ObjectSet resultados = base.get(objeto);
        int i = 0;
        if (resultados.hasNext()) {
            prov = new Proveedor[resultados.size()];
            while (resultados.hasNext()) {
                prov[i] = (Proveedor) resultados.next();
                i++;
            }
        }
        Cerrarbd(base);
        return prov;
    }
    
    public void EliminarProveedor(ObjectContainer basep, String ID_proveedor) {
       Proveedor proveedor = new Proveedor(ID_proveedor, null, null, null, null, null);
        ObjectSet resultado = basep.get(proveedor);

        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "El Proveedor no se encuentra");
        } else {
            Proveedor eliminar = (Proveedor) resultado.next();
            basep.delete(eliminar);
            JOptionPane.showMessageDialog(null, "El Proveedor fue eliminado");
        }
    }
    
    public DefaultTableModel Proveedor() {
        String titulos[] = {"Codigo", "Cédula", "Nombre","Apellido","Teléfono","Dirección"};
        DefaultTableModel dtm = new DefaultTableModel(null, titulos);
        Proveedor prov = null;
        Proveedor[] p = ConsultarProv(prov);
        if (p != null) {
            for (Proveedor pro : p) {
                Object[] cli = new Object[6];
                cli[0] = pro.getCodigo_prov();
                cli[1] = pro.getCedula();
                cli[2] = pro.getNombre();
                cli[3] = pro.getApellido();
                cli[4] = pro.getTelefono();
                cli[5] = pro.getDireccion();
                dtm.addRow(cli);
            }
        }
        return dtm;
    }
    public String Codigo(ObjectContainer basep) {
        int generar;
        boolean confirmar;
        String codigo;
        generar=(int) Math.floor(Math.random()*90000+10000);
        codigo=generar+"";
        do {
            if (ConsultarProveedor(basep,codigo)!=false) {
        generar=(int) Math.floor(Math.random()*90000+10000);
                codigo=generar+"";
                confirmar=false;
            }else{
                confirmar=true;
            }
        } while (confirmar!=true);
        return codigo;
    }

}
