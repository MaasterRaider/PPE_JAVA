/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tnormand.main.auth;

import com.karimandco.cv.CreationDuCV;

/**
 *
 * @author t.normand
 */
public class DialogCreationCV extends javax.swing.JDialog {

    javax.swing.JFrame objAutreFenetre = null;

    /**
     * Creates new form DialogCreationCV
     */
    public DialogCreationCV() {
        initComponents();
    }

    public DialogCreationCV(javax.swing.JFrame fen) {
        this.objAutreFenetre = fen;
        initComponents();
        creationDuCV1.setFenParentCreationCV(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        creationDuCV1 = new com.karimandco.cv.CreationDuCV();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(creationDuCV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(creationDuCV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public CreationDuCV getCreationDuCV1() {
        return creationDuCV1;
    }

    public void setCreationDuCV1(CreationDuCV creationDuCV1) {
        this.creationDuCV1 = creationDuCV1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.karimandco.cv.CreationDuCV creationDuCV1;
    // End of variables declaration//GEN-END:variables
}
