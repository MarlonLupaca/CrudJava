
package interfaces;

import InterfaceOperacionesLogin.logearse;

import com.formdev.flatlaf.FlatLightLaf;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
/**
 *
 * @author Marlon Diego Lupaca
 */
public class login extends javax.swing.JFrame {
    int xMause, yMause;
    public login() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.inicializador();
    }
    public void inicializador()
    {
        visualizador(new logearse());
    }
    private void visualizador(JPanel p)
    {
        p.setSize(470,620);
        p.setLocation(0,0);
        panellogearse.removeAll();
        panellogearse.setLayout(new BorderLayout());
        panellogearse.add(p,BorderLayout.CENTER);
        panellogearse.revalidate();
        panellogearse.repaint();
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        barralogin = new javax.swing.JPanel();
        cerrar = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        panellogearse = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 620));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barralogin.setBackground(new java.awt.Color(0, 0, 0));
        barralogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barralogin.setOpaque(false);
        barralogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraloginMouseDragged(evt);
            }
        });
        barralogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraloginMousePressed(evt);
            }
        });

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
        });

        x.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x.setText("X");
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarLayout = new javax.swing.GroupLayout(cerrar);
        cerrar.setLayout(cerrarLayout);
        cerrarLayout.setHorizontalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );
        cerrarLayout.setVerticalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cerrarLayout.createSequentialGroup()
                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout barraloginLayout = new javax.swing.GroupLayout(barralogin);
        barralogin.setLayout(barraloginLayout);
        barraloginLayout.setHorizontalGroup(
            barraloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(barraloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(barraloginLayout.createSequentialGroup()
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 961, Short.MAX_VALUE)))
        );
        barraloginLayout.setVerticalGroup(
            barraloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(barraloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(barraloginLayout.createSequentialGroup()
                    .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(barralogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        javax.swing.GroupLayout panellogearseLayout = new javax.swing.GroupLayout(panellogearse);
        panellogearse.setLayout(panellogearseLayout);
        panellogearseLayout.setHorizontalGroup(
            panellogearseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        panellogearseLayout.setVerticalGroup(
            panellogearseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        getContentPane().add(panellogearse, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 470, 620));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logofinal2.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraloginMousePressed
        xMause = evt.getX();
        yMause = evt.getY();
    }//GEN-LAST:event_barraloginMousePressed

    private void barraloginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraloginMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMause, y-yMause);
    }//GEN-LAST:event_barraloginMouseDragged

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xMouseClicked

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
      
    }//GEN-LAST:event_cerrarMouseEntered

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        cerrar.setBackground(Color.red);
        x.setForeground(Color.WHITE);
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        cerrar.setBackground(Color.WHITE);
        x.setForeground(Color.black);
    }//GEN-LAST:event_xMouseExited

    public static void main(String args[]) {
        
        FlatLightLaf.setup();
        UIManager.put( "Button.arc", 100 );
        UIManager.put( "TextComponent.arc", 100 );
        UIManager.put( "Component.arc", 100 );
        UIManager.put( "Component.innerFocusWidth", 2 );
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barralogin;
    private javax.swing.JPanel cerrar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panellogearse;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}

