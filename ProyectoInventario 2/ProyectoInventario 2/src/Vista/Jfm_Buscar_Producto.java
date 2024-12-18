
package Vista;

import Controlador.Registro;
import Controlador.Validacion;
import Modelo.Bodega;
import Modelo.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author administrador
 */
public class Jfm_Buscar_Producto extends javax.swing.JFrame {

    /**
     * Creates new form Jfm_Eliminar_Producto
     */
    public Jfm_Buscar_Producto() {
        initComponents();
        
        
        Registro rg = new Registro();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) this.jcb_bodega.getModel();
        modelo.removeAllElements();
        List<Bodega> lista = rg.buscarTodosBodega();
        
        for (Bodega bodega : lista) {
            modelo.addElement(bodega);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtn_eliminar = new javax.swing.JButton();
        jbt_salir = new javax.swing.JButton();
        jbt_modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxt_nombre_producto = new javax.swing.JTextField();
        jtxt_marca = new javax.swing.JTextField();
        jtxt_modelo = new javax.swing.JTextField();
        jtxt_id_producto = new javax.swing.JTextField();
        jtxt_bodega = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxt_stock = new javax.swing.JTextField();
        jcb_bodega = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jtxt_num = new javax.swing.JTextField();
        jtxt_buscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jbtm_buscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jcb_buscar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_productos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestor de inventario");

        jPanel1.setBackground(new java.awt.Color(228, 216, 237));

        jbtn_eliminar.setBackground(new java.awt.Color(162, 163, 226));
        jbtn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtn_eliminar.setText("Eliminar");
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
            }
        });

        jbt_salir.setBackground(new java.awt.Color(158, 85, 144));
        jbt_salir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbt_salir.setText("Salir al Menú");
        jbt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_salirActionPerformed(evt);
            }
        });

        jbt_modificar.setBackground(new java.awt.Color(162, 163, 226));
        jbt_modificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbt_modificar.setText("Modificar");
        jbt_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbt_modificarMouseClicked(evt);
            }
        });
        jbt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_modificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Marca");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Modelo");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("ID Producto");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Bodega");

        jtxt_id_producto.setEditable(false);

        jtxt_bodega.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Stock");

        jcb_bodega.setBackground(new java.awt.Color(224, 208, 198));
        jcb_bodega.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcb_bodega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcb_bodega.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_bodegaItemStateChanged(evt);
            }
        });
        jcb_bodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_bodegaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Buscar Producto");

        jtxt_num.setEditable(false);
        jtxt_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_numActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Nueva Bodega Destino");

        jbtm_buscar.setBackground(new java.awt.Color(162, 163, 226));
        jbtm_buscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtm_buscar.setText("Buscar");
        jbtm_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtm_buscarActionPerformed(evt);
            }
        });

        jLabel9.setText("ID-");

        jcb_buscar.setBackground(new java.awt.Color(224, 208, 198));
        jcb_buscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcb_buscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Marca", "Modelo", "ID Producto" }));
        jcb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_buscarActionPerformed(evt);
            }
        });

        jtb_productos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, null));
        jtb_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Marca", "Modelo", "ID Producto", "Bodega", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtb_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_productos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxt_id_producto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(25, 25, 25)
                                .addComponent(jtxt_nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addComponent(jtxt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtxt_bodega)))
                                .addGap(159, 159, 159))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbt_salir)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtn_eliminar)
                                .addGap(37, 37, 37)
                                .addComponent(jbt_modificar))
                            .addComponent(jScrollPane1))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jcb_bodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxt_num, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcb_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtm_buscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtm_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jtxt_nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jtxt_id_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_bodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtxt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jcb_bodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_eliminar)
                    .addComponent(jbt_modificar)
                    .addComponent(jbt_salir))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtm_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtm_buscarActionPerformed
        
        String nombre,marca,modelo,bodega;
        int idProducto, id,stock;

        Registro rg = new Registro();
        DefaultTableModel modelo1 = (DefaultTableModel) this.jtb_productos.getModel();
        modelo1.setRowCount(0);
        
        if(((String)this.jcb_buscar.getSelectedItem()).equals("Nombre")){
            System.out.println("buscarás por nombre");
            List<Producto> lista = rg.buscarPorNombreProducto(this.jtxt_buscar.getText());
                for (Producto tmp : lista) {
                    nombre = tmp.getNombre();
                    marca = tmp.getMarca();
                    modelo = tmp.getModelo();
                    bodega = tmp.getBodega().getNombre();
                    idProducto = tmp.getIdProducto();
                    stock = tmp.getStock();
                    modelo1.addRow(new Object[]{nombre, marca, modelo,idProducto, bodega,stock});
                }
        }else if(((String)this.jcb_buscar.getSelectedItem()).equals("ID Producto")){
            try {
                id = Integer.parseInt(this.jtxt_buscar.getText());
            } catch (Exception e) {
                id = 0;
            }

            if (id == 0) { //listar a todos
                List<Producto> lista = rg.buscarTodosProductos();
                for (Producto tmp : lista) {
                    nombre = tmp.getNombre();
                    marca = tmp.getMarca();
                    modelo = tmp.getModelo();
                    bodega = tmp.getBodega().getNombre();
                    idProducto = tmp.getIdProducto();
                    stock = tmp.getStock();

                    modelo1.addRow(new Object[]{nombre, marca, modelo,idProducto, bodega,stock});
                }
            } else { //listar por id
                Producto producto = rg.buscarPorIdProducto(id);
                nombre = producto.getNombre();
                marca = producto.getMarca();
                modelo = producto.getModelo();
                bodega = producto.getBodega().getNombre();
                idProducto = producto.getIdProducto();
                stock = producto.getStock();
                modelo1.addRow(new Object[]{nombre, marca, modelo,idProducto, bodega,stock});
            }
        }
        else if(((String)this.jcb_buscar.getSelectedItem()).equals("Marca")){
            System.out.println("buscarás por marca");
            List<Producto> lista = rg.buscarPorMarcaProducto(this.jtxt_buscar.getText());
                for (Producto tmp : lista) {
                    nombre = tmp.getNombre();
                    marca = tmp.getMarca();
                    modelo = tmp.getModelo();
                    bodega = tmp.getBodega().getNombre();
                    idProducto = tmp.getIdProducto();
                    stock = tmp.getStock();
                    modelo1.addRow(new Object[]{nombre, marca, modelo,idProducto, bodega,stock});
                }
        }
        else if(((String)this.jcb_buscar.getSelectedItem()).equals("Modelo")){
            System.out.println("buscarás por modelo");
            List<Producto> lista = rg.buscarPorModeloProducto(this.jtxt_buscar.getText());
                for (Producto tmp : lista) {
                    nombre = tmp.getNombre();
                    marca = tmp.getMarca();
                    modelo = tmp.getModelo();
                    bodega = tmp.getBodega().getNombre();
                    idProducto = tmp.getIdProducto();
                    stock = tmp.getStock();
                    modelo1.addRow(new Object[]{nombre, marca, modelo,idProducto, bodega,stock});
                }
        }
    }//GEN-LAST:event_jbtm_buscarActionPerformed

    private void jcb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_buscarActionPerformed

    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed

        int opcion = JOptionPane.showConfirmDialog(
        this, 
        "¿Estás seguro de que deseas Eliminar este producto?", 
        "Confirmar Eliminación", 
        JOptionPane.YES_NO_OPTION
    );

    // Evaluar la respuesta del usuario
    if (opcion == JOptionPane.YES_OPTION) {
        // Lógica para realizar la modificación
         Registro rg = new Registro();
//       Jfrm_Alerta_Eliminar alerta_eliminar = new Jfrm_Alerta_Eliminar();
//       alerta_eliminar.setVisible(true);
       if(rg.eliminarProducto((int)this.jtb_productos.getValueAt(this.jtb_productos.getSelectedRow(), 3))){
           DefaultTableModel modelo1 = (DefaultTableModel) this.jtb_productos.getModel();
           modelo1.removeRow(this.jtb_productos.getSelectedRow());
       }
    } else if (opcion == JOptionPane.NO_OPTION) {
        // Volver al JFrame anterior (puedes cerrar este JFrame si es necesario)

    }
       
    }//GEN-LAST:event_jbtn_eliminarActionPerformed

    private void jbt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_salirActionPerformed
       dispose();
    }//GEN-LAST:event_jbt_salirActionPerformed

    private void jbt_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_modificarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(
        this, 
        "¿Estás seguro de que deseas modificar este producto?", 
        "Confirmar Modificación", 
        JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {

            //        capturar datos
            String nombre,marca,modelo;
            int idProducto,stock;
            boolean flag = true;
            Bodega bodega = new Bodega();

            nombre = this.jtxt_nombre_producto.getText();
            marca = this.jtxt_marca.getText();
            modelo = this.jtxt_modelo.getText();
            //Validaciones previo a ejecución de query
            if(!(Validacion.validarNotNullString(nombre) && Validacion.validarVarchar20(nombre))){
               JOptionPane.showMessageDialog(this, "El nombre no puede tener más de 20 caracteres ni estar en blanco.");
               flag = false;
            }
            else if(!(Validacion.validarNotNullString(marca) && Validacion.validarVarchar20(marca))){
               JOptionPane.showMessageDialog(this, "La marca no puede tener más de 20 caracteres ni estar en blanco.");
               flag = false;
            }
            else if(!(Validacion.validarNotNullString(modelo) && Validacion.validarVarchar20(modelo))){
               JOptionPane.showMessageDialog(this, "El modelo no puede tener más de 20 caracteres ni estar en blanco.");
               flag = false;
            }

            try{
                idProducto = Integer.valueOf(this.jtxt_id_producto.getText());
            }
            catch(Exception ex){
               JOptionPane.showMessageDialog(this, "Ingrese solo caracteres numéricos en el id del producto");
               flag = false;
               idProducto = 0;
            }
            if(!(Validacion.validarInt(idProducto))){
               JOptionPane.showMessageDialog(this, "El idProducto no puede tener más de 9 dígitos, ni estar en blanco.");
               flag = false;
            }

            try{
                stock = Integer.valueOf(this.jtxt_stock.getText());
                if(!(Validacion.validarInt(stock))){
                    JOptionPane.showMessageDialog(this, "El stock no puede tener más de 9 dígitos, ni estar en blanco.");
                    flag = false;
                }
            }
            catch(Exception ex){
               JOptionPane.showMessageDialog(this, "Ingrese solo caracteres numéricos en el stock del producto");
               flag = false;
               stock = 0;
            }

            //esta línea captura la bodega seleccionada
            bodega = (Bodega)this.jcb_bodega.getSelectedItem();        

            //EJECUCIÓN DE QUERY
            Registro reg = new Registro();
            if(flag){
                Producto producto = new Producto(nombre, marca, modelo, idProducto, stock, bodega);
                reg.actualizarProducto(producto);
                JOptionPane.showMessageDialog(this, "Actualización exitosa de " + nombre);
            }

        } else if (opcion == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_jbt_modificarActionPerformed

    private void jtb_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_productosMouseClicked
            this.jtxt_nombre_producto.setText(this.jtb_productos.getValueAt(this.jtb_productos.getSelectedRow(),0).toString());
            this.jtxt_marca.setText(this.jtb_productos.getValueAt(this.jtb_productos.getSelectedRow(),1).toString());
            this.jtxt_modelo.setText(this.jtb_productos.getValueAt(this.jtb_productos.getSelectedRow(),2).toString());
            this.jtxt_bodega.setText(this.jtb_productos.getValueAt(this.jtb_productos.getSelectedRow(),4).toString());
            this.jcb_bodega.setSelectedItem(this.jtb_productos.getValueAt(this.jtb_productos.getSelectedRow(), 4).toString());

            int idProducto = Integer.parseInt(this.jtb_productos.getValueAt(this.jtb_productos.getSelectedRow(), 3).toString()); this.jtxt_id_producto.setText(String.valueOf(idProducto));
            int stock = Integer.parseInt(this.jtb_productos.getValueAt(this.jtb_productos.getSelectedRow(), 5).toString()); this.jtxt_stock.setText(String.valueOf(stock));
    }//GEN-LAST:event_jtb_productosMouseClicked

    private void jbt_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt_modificarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_modificarMouseClicked

    private void jcb_bodegaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_bodegaItemStateChanged
//        Bodega bodega = new Bodega();
//        
//        bodega = (Bodega)this.jcb_bodega.getSelectedItem();
//        
//        if (bodega.getNombre().equals("Viña del mar")) {
//            System.out.println("miauuu");
//            this.jtxt_num.setText("1");
//            int num = Integer.parseInt(this.jtxt_num.getText());
//            System.out.println(num);
//            
//        }
    }//GEN-LAST:event_jcb_bodegaItemStateChanged

    private void jcb_bodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_bodegaActionPerformed
        jcb_bodega.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el objeto seleccionado
                Bodega seleccion = (Bodega) jcb_bodega.getSelectedItem();

                // Actualizar el JTextField con el ID de la bodega seleccionada
                if (seleccion != null) {
                    jtxt_num.setText(String.valueOf(seleccion.getIdBodega()));
                }
            }
        });
    }//GEN-LAST:event_jcb_bodegaActionPerformed

    private void jtxt_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_numActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jfm_Buscar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jfm_Buscar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jfm_Buscar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jfm_Buscar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jfm_Buscar_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_modificar;
    private javax.swing.JButton jbt_salir;
    private javax.swing.JButton jbtm_buscar;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JComboBox<String> jcb_bodega;
    private javax.swing.JComboBox<String> jcb_buscar;
    private javax.swing.JTable jtb_productos;
    private javax.swing.JTextField jtxt_bodega;
    private javax.swing.JTextField jtxt_buscar;
    private javax.swing.JTextField jtxt_id_producto;
    private javax.swing.JTextField jtxt_marca;
    private javax.swing.JTextField jtxt_modelo;
    private javax.swing.JTextField jtxt_nombre_producto;
    private javax.swing.JTextField jtxt_num;
    private javax.swing.JTextField jtxt_stock;
    // End of variables declaration//GEN-END:variables
}
