/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jbatik.imageeditor.actions;

import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Dimas Y. Danurwenda
 */
public class RotateImagePanel extends javax.swing.JPanel {

    final SpinnerNumberModel degModel = new SpinnerNumberModel(0, -180, 180, 1);

    /**
     * Creates new form RotateImagePanel
     */
    public RotateImagePanel() {
        initComponents();
        degS.setModel(degModel);
    }

    public boolean isRelative() {
        return relativeCB.isSelected();
    }

    public int getRotatingDegree() {
        return degModel.getNumber().intValue();
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
        degS = new javax.swing.JSpinner();
        relativeCB = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(RotateImagePanel.class, "RotateImagePanel.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(relativeCB, org.openide.util.NbBundle.getMessage(RotateImagePanel.class, "RotateImagePanel.relativeCB.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(relativeCB)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(degS)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(degS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(relativeCB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner degS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox relativeCB;
    // End of variables declaration//GEN-END:variables
}
