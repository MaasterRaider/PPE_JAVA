/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tnormand.main.auth;

import com.karimandco.cv.ListeCV;

/**
 *
 * @author t.normand
 */
public class DialogMesCV extends javax.swing.JDialog {

    javax.swing.JFrame objAutreFenetre = null;
    
    /**
     * Creates new form DialogMesCV
     */
    public DialogMesCV() {
        initComponents();
    }
    
    public DialogMesCV(javax.swing.JFrame fen) {
        this.objAutreFenetre = fen;
        initComponents();
        listeCV1.setFenParentMesCV(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listeCV1 = new com.karimandco.cv.ListeCV();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listeCV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listeCV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public ListeCV getListeCV1() {
        return listeCV1;
    }

    public void setListeCV1(ListeCV listeCV1) {
        this.listeCV1 = listeCV1;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.karimandco.cv.ListeCV listeCV1;
    // End of variables declaration//GEN-END:variables
}
