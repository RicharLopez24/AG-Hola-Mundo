
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ricardo
 */
public class vista extends javax.swing.JFrame {

    int cantidadPo;
    public String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz1234567890 ";
    
    Cromosoma ag = new Cromosoma();
    Aptitud fit = new Aptitud();
    Ruleta rul = new Ruleta();
    ArrayList<Integer> aptitues = new ArrayList<>();
    ArrayList<Cromosoma> poblacion = new ArrayList<>();
    ArrayList<Cromosoma> antes = new ArrayList<>();
    ArrayList<Double> valoresEs = new ArrayList<>();
    double sumaAptitudes = 0;
    double frecuencia ;
    double sumaEsperados;
  
    public vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFrase = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnfrase = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtGeneracion = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCantPoblacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtexto = new javax.swing.JTextArea();
        btnAG = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JLDestino = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("frase destino");

        btnfrase.setText("Generar poblacion");
        btnfrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfraseActionPerformed(evt);
            }
        });

        jLabel2.setText("No. Generaciones");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad Poblacion");

        Jtexto.setColumns(20);
        Jtexto.setRows(5);
        jScrollPane1.setViewportView(Jtexto);

        btnAG.setText("Start AG");
        btnAG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGActionPerformed(evt);
            }
        });

        jLabel4.setText("mejor poblador");

        JLDestino.setText("AG hola mundo");

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLDestino)
                                    .addComponent(btnAG)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnfrase)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(9, 9, 9)
                                        .addComponent(txtFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(7, 7, 7)
                                        .addComponent(txtGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(7, 7, 7)
                                        .addComponent(txtCantPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtCantPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btnfrase)
                .addGap(45, 45, 45)
                .addComponent(btnAG)
                .addGap(80, 80, 80)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(JLDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(jButton1))
                .addGap(99, 99, 99))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnfraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfraseActionPerformed
        // TODO add your handling code here:
        
        if(txtFrase.getText().equals("") && txtGeneracion.getText().equals("")){
            System.out.println("no hay ninguna frase y generacion");
        }else{
            
            ag.setFrase(txtFrase.getText());
            ag.setGeneracion(Integer.parseInt(txtGeneracion.getText()));
            cantidadPo = Integer.parseInt(txtCantPoblacion.getText());

            System.out.println("la frase es: "+ag.getFrase()+"\nGeneracion: "+ag.getGeneracion());
            txtFrase.setText("");
            txtGeneracion.setText("");
            txtCantPoblacion.setText("");
        }
        System.out.println("cantidad de poblacion: "+cantidadPo);
        
        for (int i = 0; i < cantidadPo; i++) {
          //  antes.add(new Cromosoma());
            poblacion.add(new Cromosoma());
            poblacion.get(i).setAlfabeto(alfabeto);
            poblacion.get(i).setTamFrase(ag.getFrase().length());
            poblacion.get(i).init();

        }
        
        poblacionIm();
        
        
     //   System.out.println("poblacion: "+poblacion);
        
    }//GEN-LAST:event_btnfraseActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGActionPerformed
        Jtexto.append("\n"+ag.getFrase());
        Jtexto.append("\nAptitudes \n");
        for (int i = 0; i < cantidadPo; i++) {
            
            aptitues.add( fit.fitness(poblacion.get(i), ag.getFrase()));
            Jtexto.append(i+1+" : "+poblacion.get(i)+" -> "+aptitues.get(i)+"\n");
        }
        sumaAptitudes = rul.SumaApt(aptitues);
        
       // System.out.println("suma de aptitudes: "+sumaAptitudes);
        frecuencia = (double)sumaAptitudes/aptitues.size();
        System.out.println("frecuencia: "+frecuencia);
        
        for (int i = 0; i < aptitues.size(); i++) {
            valoresEs.add(aptitues.get(i)*frecuencia);
        }
        
        //System.out.println("valores esperados: "+valoresEs);
        
        sumaEsperados = rul.SumaAptEs(valoresEs);
        System.out.println("suma esperados: "+sumaEsperados);
        
        for (int i = 0; i < cantidadPo; i++) {
            double r = Math.random() * sumaEsperados;
            //System.out.println("aleatorio: "+r);
            double suma = 0;
            Cromosoma pob = rul.Seleccion(sumaEsperados, r,valoresEs,suma,poblacion);
            antes.add(pob);
            
            
        }
        
        Jtexto.append("\n metodo ruleta\n");
        for (int i = 0; i < cantidadPo; i++) {
            
            Jtexto.append(i+1+" : "+antes.get(i)+"\n");
        }
        
        System.out.println("poblacion antes: "+antes);
        
        //Jtexto.append("\nnueva poblacion\n"+antes.get(0));
        //System.out.println("poblacion nueva: "+antes);
        
        //JLDestino.setText(antes.get(0).toString());
    }//GEN-LAST:event_btnAGActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        JLDestino.setText("AG hola mundo");
        Jtexto.setText("");
        antes.clear();
        aptitues.clear();
        poblacion.clear();
        valoresEs.clear();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void poblacionIm(){
        
        Jtexto.append("Poblacion inicial\n");
        for (int i = 0; i < cantidadPo; i++) {
                Jtexto.append(i+1+" : "+poblacion.get(i)+"\n");
            }
        
        /*
        for (int j = 0; j < ag.getGeneracion(); j++) {
            //System.out.println("Generacion: "+ j);
            Jtexto.append("generacion: "+(j+1)+" \n");
            for (int i = 0; i < cantidadPo; i++) {
                Jtexto.append(i+1+" : "+poblacion.get(i)+"\n");
            }
            Jtexto.append(" \n");
        }*/
        
        
        
    }
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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLDestino;
    private javax.swing.JTextArea Jtexto;
    private javax.swing.JButton btnAG;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnfrase;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantPoblacion;
    private javax.swing.JTextField txtFrase;
    private javax.swing.JTextField txtGeneracion;
    // End of variables declaration//GEN-END:variables
}
