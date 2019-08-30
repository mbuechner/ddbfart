/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ddb.labs.ddbfart.gui;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ProgressMonitor;
import javax.swing.ProgressMonitorInputStream;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;

/**
 *
 * @author Michael Büchner <m.buechner@dnb.de>
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Main() {
        initComponents();
        try {
            jButton1.addActionListener(readFiles(this));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("Add..");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);
        jPopupMenu1.add(jSeparator1);

        jMenuItem2.setText("Delete");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setText("Add row");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem3);
        jPopupMenu2.add(jSeparator2);

        jMenuItem4.setText("Delete row");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setSize(new java.awt.Dimension(640, 480));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Files"));

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPane1MousePressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Filename", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Find and Replace Text"));

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPane2MousePressed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Boolean(true), "\\u0098", "", "  ̃ = NON-SORT BEGIN / START OF STRING"},
                { new Boolean(true), "\\u009c", "", "œ = NON-SORT END / STRING TERMINATOR"},
                { new Boolean(true), "&#152;", "", "  ̃ = NON-SORT BEGIN / START OF STRING"},
                { new Boolean(true), "&#156;", "", "œ = NON-SORT END / STRING TERMINATOR"}
            },
            new String [] {
                "Enable", "Character to find", "Replace with", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

        jLabel1.setText("UTF-8 Normalization");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Don't change", "UTF-8 composed", "UTF-8 decomposed" }));

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Dry run (change nothing)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Run");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if (evt.getButton() == MouseEvent.BUTTON3) {
            int r = jTable1.rowAtPoint(evt.getPoint());
            if (r >= 0 && r < jTable1.getRowCount()) {
                jTable1.setRowSelectionInterval(r, r);
            } else {
                jTable1.clearSelection();
            }

            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        final JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        chooser.setDialogTitle("Select file(s)...");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            final DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            final File[] files = chooser.getSelectedFiles();
            if (files != null && model != null) {
                for (File file : files) {
                    model.addRow(new String[]{file.toString(), file.canRead() ? "OK" : "NOT readable"});
                }
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jScrollPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MousePressed
        if (evt.getButton() == MouseEvent.BUTTON3) {
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jScrollPane1MousePressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        final DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        final int[] rows = jTable1.getSelectedRows();
        for (int row : rows) {
            model.removeRow(row);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        final DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object[]{false, "", "", "", ""});

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
        if (evt.getButton() == MouseEvent.BUTTON3) {
            int r = jTable2.rowAtPoint(evt.getPoint());
            if (r >= 0 && r < jTable2.getRowCount()) {
                jTable2.setRowSelectionInterval(r, r);
            } else {
                jTable2.clearSelection();
            }

            jPopupMenu2.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable2MousePressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        final DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        final int[] rows = jTable2.getSelectedRows();
        for (int row : rows) {
            model.removeRow(row);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jScrollPane2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MousePressed
        if (evt.getButton() == MouseEvent.BUTTON3) {
            jPopupMenu2.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jScrollPane2MousePressed

    private ActionListener readFiles(Component parent) throws IOException {

        return (ae) -> {
            new Thread(() -> {
                if (jCheckBox1.isSelected()) {
                    dryRun(parent);
                } else {
                    nondryRun(parent);
                }
            }).start();
        };
    }

    private void nondryRun(Component parent) {
        jButton1.setEnabled(false);

        final DefaultTableModel modelFile = (DefaultTableModel) jTable1.getModel();
        final DefaultTableModel modelReplace = (DefaultTableModel) jTable2.getModel();
        final Map<String, String> replace = new HashMap<>();

        for (int i = 0; i < modelReplace.getRowCount(); ++i) {
            if ((boolean) modelReplace.getValueAt(i, 0)) {
                final String key = StringEscapeUtils.unescapeJava((String) modelReplace.getValueAt(i, 1));
                final String value = StringEscapeUtils.unescapeJava(((String) modelReplace.getValueAt(i, 2) == null) ? "" : (String) modelReplace.getValueAt(i, 2));
                replace.put(key, value);
            }
        }
        ProgressMonitorInputStream pMonitorInputStream;
        long start = System.currentTimeMillis();
        boolean isCanceled = false;
        for (int i = 0; i < modelFile.getRowCount(); ++i) {

            if (isCanceled) {
                break;
            }

            final File inputFile = new File((String) modelFile.getValueAt(i, 0));

            final String base = FilenameUtils.removeExtension(inputFile.getAbsolutePath());
            final String extension = FilenameUtils.getExtension(inputFile.getAbsolutePath());
            final String outputFilename = base + "_fart" + "." + extension;

            try (final BufferedReader in = new BufferedReader(new InputStreamReader(pMonitorInputStream = new ProgressMonitorInputStream(parent, "Reading " + inputFile.getName(), new FileInputStream(inputFile)), Charset.forName("UTF-8"))); 
                    final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFilename), Charset.forName("UTF-8")))) {

                
                final ProgressMonitor progressMonitor = pMonitorInputStream.getProgressMonitor();
                progressMonitor.setMillisToDecideToPopup(0);
                progressMonitor.setMillisToPopup(0);

                String line;
                while ((line = in.readLine()) != null && !progressMonitor.isCanceled()) {

                    if (jComboBox1.getSelectedIndex() == 1) {
                        line = Normalizer.normalize(line, Form.NFC);
                    } else if (jComboBox1.getSelectedIndex() == 2) {
                        line = Normalizer.normalize(line, Form.NFD);
                    }

                    line = StringUtils.replaceEach(line,
                            replace.keySet().toArray(new String[replace.keySet().size()]),
                            replace.values().toArray(new String[replace.values().size()])
                    );

                    out.append(line);
                    out.newLine();
                    out.flush();
                }
                isCanceled = progressMonitor.isCanceled();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                isCanceled = true;
            }

        }
        if (!isCanceled) {

            JOptionPane.showMessageDialog(this,
                    "File(s): " + modelFile.getRowCount() + "\n"
                    + "Time: " + ((System.currentTimeMillis() - start) / 1000L) + " sec.",
                    "Success!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        jButton1.setEnabled(true);
    }

    private void dryRun(Component parent) {
        jButton1.setEnabled(false);

        final DefaultTableModel modelFile = (DefaultTableModel) jTable1.getModel();
        final DefaultTableModel modelReplace = (DefaultTableModel) jTable2.getModel();
        final Map<String, String> replace = new HashMap<>();
        final Map<String, Long> stat = new HashMap<>();

        for (int i = 0; i < modelReplace.getRowCount(); ++i) {
            if ((boolean) modelReplace.getValueAt(i, 0)) {
                replace.put(StringEscapeUtils.unescapeJava((String) modelReplace.getValueAt(i, 1)),
                        StringEscapeUtils.unescapeJava((String) modelReplace.getValueAt(i, 2)));
                stat.put(StringEscapeUtils.unescapeJava((String) modelReplace.getValueAt(i, 1)), 0L);
            }
        }
        ProgressMonitorInputStream pMonitorInputStream;
        long start = System.currentTimeMillis();
        boolean isCanceled = false;
        for (int i = 0; i < modelFile.getRowCount(); ++i) {

            if (isCanceled) {
                break;
            }

            final File inputFile = new File((String) modelFile.getValueAt(i, 0));

            try (final BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            pMonitorInputStream = new ProgressMonitorInputStream(
                                    parent,
                                    "Reading " + inputFile.getName(),
                                    new FileInputStream(inputFile)), Charset.forName("UTF-8")))) {

                final ProgressMonitor progressMonitor = pMonitorInputStream.getProgressMonitor();
                progressMonitor.setMillisToDecideToPopup(0);
                progressMonitor.setMillisToPopup(0);

                String line;
                while ((line = in.readLine()) != null && !progressMonitor.isCanceled()) {
                    for (Entry<String, String> e : replace.entrySet()) {

                        long stat_tmp = stat.get(e.getKey());
                        stat_tmp += StringUtils.countMatches(line, e.getKey());
                        stat.put(e.getKey(), stat_tmp);

                    }
                }
                isCanceled = progressMonitor.isCanceled();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                isCanceled = true;
            }

        }
        if (!isCanceled) {
            final StringBuilder result = new StringBuilder();

            for (Entry<String, Long> e : stat.entrySet()) {
                result.append('\'');
                result.append(StringEscapeUtils.escapeJava(e.getKey()));
                result.append('\'');
                result.append(": ");
                result.append(e.getValue());
                result.append("\n");
            }

            JOptionPane.showMessageDialog(this,
                    "File(s): " + modelFile.getRowCount() + "\n"
                    + result.toString()
                    + "Time: " + ((System.currentTimeMillis() - start) / 1000L) + " sec.",
                    "Statistics",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        jButton1.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
