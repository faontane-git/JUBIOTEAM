/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author fabri
 */
public class QuizRealizoMal extends javax.swing.JFrame {

    /**
     * Creates new form QuizRealizoMal
     */
    public QuizRealizoMal() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        Manejadores.Manejador.aciertos = 0;
        Manejadores.Manejador.contador = 1;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lWallPaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText(" ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 70, 80));

        lWallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/realizoMalNiña.png"))); // NOI18N
        lWallPaper.setText(" ");
        getContentPane().add(lWallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        if (Manejadores.Manejador.mundo1) {
            HormigolandiaVideo hv = new HormigolandiaVideo();
            hv.setVisible(true);
            HormigolandiaVideo.btnSiguiente.setEnabled(false);
            HormigolandiaVideo.btnQuiz.setEnabled(true);
            this.dispose();
        } else if (Manejadores.Manejador.mundo2) {
            FurbalandiaVideo fv = new FurbalandiaVideo();
            fv.setVisible(true);
            FurbalandiaVideo.btnSiguiente.setEnabled(false);
            FurbalandiaVideo.btnQuiz.setEnabled(true);
            this.dispose();
        } else if (Manejadores.Manejador.mundo3) {
            BacplanVideo bv = new BacplanVideo();
            bv.setVisible(true);
            BacplanVideo.btnQuiz.setEnabled(true);
            BacplanVideo.btnSiguiente.setEnabled(false);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(QuizRealizoMal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizRealizoMal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizRealizoMal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizRealizoMal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizRealizoMal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lWallPaper;
    // End of variables declaration//GEN-END:variables
}
