/*
 Nombre del Autor: Abraham Alejandro Rosales Martinez 
 Correo:   lelalez@hotmail.com
 tel: 715 159 63 23
 Instituto Tecnologico de Zitacuaro 
 Ing Informatica 8º sem
    
Programa desarrollado en NetBeans IDE 8.0.2 con JDK 1.8
 */
package obj;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import modelo.Cuadrado;
import modelo.Cubo;

/**
 *
 * @author AbrahamAlejandro
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        setJTexFieldChanged(jTextTexto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextTraduccion = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextTexto = new javax.swing.JTextPane();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tratamiento de Objetos y Herencias");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Ingrese la medida del lado:");

        jTextTraduccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(jTextTraduccion);

        jLabel3.setText("Los resultados son los siguientes");

        jTextTexto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(jTextTexto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(70, 70, 70)))
                .addContainerGap(279, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextTexto;
    private javax.swing.JTextPane jTextTraduccion;
    // End of variables declaration//GEN-END:variables

    private void setJTexFieldChanged(JTextPane jTextTexto) {
        DocumentListener documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!jTextTexto.getText().isEmpty()) {
                    jTextTraduccion.setText(calcular(jTextTexto.getText()));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (!jTextTexto.getText().isEmpty()) {
                    jTextTraduccion.setText(calcular(jTextTexto.getText()));
                } else {
                    jTextTraduccion.setText("");
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        };
        jTextTexto.getDocument().addDocumentListener(documentListener);
    }
    
    
    public String calcular(String medida){
        try {
            int lado = Integer.parseInt(medida);
            String resultados = "Los resultados son los siguientes:\n";
            Cuadrado cuadrado= new Cuadrado(lado);
            resultados +="El perimetro del cuadrado es= " +cuadrado.calcularPerimetro()+"\n";
            resultados +="El area del cuadrado es= " +cuadrado.calcularArea()+"\n";           
            
            Cubo cubo= new Cubo(lado);
            
            resultados +="El perimetro del cubo es= " +cubo.calcularPerimetro()+"\n";
            resultados +="El volumen del cubo es= " +cubo.calcularVolumen()+"\n";
            
            return resultados;
        } catch (Exception e) {
            return "No fue posible realizar los calculos";
        }        
    }
  
}
