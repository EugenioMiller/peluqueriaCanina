package igu;

import javax.swing.JOptionPane;
import logica.ControladoraLogica;


public class Pantalla extends javax.swing.JFrame {

    ControladoraLogica control;
    
    public Pantalla(ControladoraLogica control) {
        initComponents();
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombrePerro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        raza = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombreDuenio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        celular = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacion = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        alergico = new javax.swing.JComboBox<>();
        atEspecial = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Peluquería Canina");

        jLabel2.setText("(*) Cliente N°:");

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        jLabel3.setText("(*) Nombre:");

        nombrePerro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrePerroKeyTyped(evt);
            }
        });

        jLabel4.setText("(*) Raza:");

        raza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                razaKeyTyped(evt);
            }
        });

        jLabel5.setText("(*) Color:");

        color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colorKeyTyped(evt);
            }
        });

        jLabel6.setText("Alérgico:");

        jLabel7.setText("Atención especial:");

        jLabel8.setText("(*) Nombre del dueño:");

        nombreDuenio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreDuenioKeyTyped(evt);
            }
        });

        jLabel9.setText("(*) Cel. dueño:");

        celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                celularKeyTyped(evt);
            }
        });

        jLabel10.setText("Observaciones:");

        observacion.setColumns(20);
        observacion.setRows(5);
        jScrollPane1.setViewportView(observacion);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dog.jpg"))); // NOI18N

        alergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "No", "Si" }));

        atEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "No", "Si" }));

        jLabel12.setText("(*) Campos obligatorios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(id))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel6))
                                            .addGap(29, 29, 29)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(alergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nombrePerro, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                                                    .addComponent(raza)
                                                    .addComponent(color)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(atEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nombreDuenio)
                                    .addComponent(celular))))
                        .addGap(92, 92, 92)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(nombrePerro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(alergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(atEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       id.setText("");
       nombrePerro.setText("");
       raza.setText("");
       color.setText("");
       alergico.setSelectedItem("-");
       atEspecial.setSelectedItem("-");
       nombreDuenio.setText("");
       celular.setText("");
       observacion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String vacio = ""; //Variable utilizada para comprobar que no haya campos obligatorios vacíos.
        
        //Compruebo que no hayan quedado campos obligatorios vacíos
        if(!id.getText().equals(vacio) && !nombrePerro.getText().equals(vacio) && !raza.getText().equals(vacio) &&
           !color.getText().equals(vacio) &&  !nombreDuenio.getText().equals(vacio) && !celular.getText().equals(vacio)){
                int idCliente = Integer.parseInt(id.getText());
                String nomPerro = nombrePerro.getText();
                String razaP = raza.getText();
                String colorP = color.getText();
                String perroAlergico = alergico.getSelectedItem().toString(); //Extrae el texto del comboBox
                String especial = atEspecial.getSelectedItem().toString();//Extrae el texto del comboBox
                String duenio = nombreDuenio.getText();
                String celu = celular.getText();
                String obs = observacion.getText();
                
                //Cambio el guión por la frase "No especifica" en caso de que haya seleccionado esa opción
                if(perroAlergico.equals("-"))
                    perroAlergico = "No especifica";
                
                if(especial.equals("-"))
                    especial = "No especifica";
                
                control.altaCliente(idCliente, duenio, celu);
                control.altaPerro(nomPerro, razaP, colorP, perroAlergico, especial, obs);
                
                JOptionPane.showMessageDialog(rootPane, "Se han agregado correctamente el dueño y la mascota", "Agregado correctamente", JOptionPane.INFORMATION_MESSAGE);
                btnLimpiarActionPerformed(evt);
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Debe commpletar todos los campos obligatorios antes de guardar");
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    //Función que me asegura que sólo se ingresen números en el campo de número de cliente
    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo números");
        }
    }//GEN-LAST:event_idKeyTyped

    //Función que me valida que solo ingresen letras en los campos asignados.
    private void nombrePerroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePerroKeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo letras");
        }
    }//GEN-LAST:event_nombrePerroKeyTyped
    //Función que me valida que solo ingresen letras en los campos asignados.
    private void razaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_razaKeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo letras");
        }
    }//GEN-LAST:event_razaKeyTyped

    //Función que me valida solo el ingreso de letras
    private void colorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colorKeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo letras");
        }
    }//GEN-LAST:event_colorKeyTyped

    //Método que me valida solo el ingreso de letras
    private void nombreDuenioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreDuenioKeyTyped
       char validar = evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo letras");
        }
    }//GEN-LAST:event_nombreDuenioKeyTyped

    //Método que me asegura solo el ingreso de números
    private void celularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celularKeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo números");
        }
    }//GEN-LAST:event_celularKeyTyped

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alergico;
    private javax.swing.JComboBox<String> atEspecial;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField color;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField nombreDuenio;
    private javax.swing.JTextField nombrePerro;
    private javax.swing.JTextArea observacion;
    private javax.swing.JTextField raza;
    // End of variables declaration//GEN-END:variables
}
