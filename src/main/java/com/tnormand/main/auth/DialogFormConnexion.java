/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tnormand.main.auth;

import com.karimandco.mdp.PanneauFormConnexionBanque;

/**
 *
 * @author t.normand
 */
public class DialogFormConnexion extends javax.swing.JDialog {

    javax.swing.JFrame objAutreFenetre = null;

    /**
     * Creates new form DialogFormConnexion
     */
    public DialogFormConnexion() {
        initComponents();
    }

    public DialogFormConnexion(javax.swing.JFrame fen) {
        this.objAutreFenetre = fen;
        initComponents();
        panneauFormConnexionBanque1.setFenParentConnexionBanque(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneauFormConnexionBanque1 = new com.karimandco.mdp.PanneauFormConnexionBanque();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panneauFormConnexionBanque1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panneauFormConnexionBanque1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public PanneauFormConnexionBanque getPanneauFormConnexionBanque1() {
        return panneauFormConnexionBanque1;
    }

    public void setPanneauFormConnexionBanque1(PanneauFormConnexionBanque panneauFormConnexionBanque1) {
        this.panneauFormConnexionBanque1 = panneauFormConnexionBanque1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.karimandco.mdp.PanneauFormConnexionBanque panneauFormConnexionBanque1;
    // End of variables declaration//GEN-END:variables
}
