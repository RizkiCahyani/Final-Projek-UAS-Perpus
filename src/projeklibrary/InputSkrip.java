/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeklibrary;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUI
 */
public class InputSkrip extends javax.swing.JDialog {

    /**
     * Creates new form InputBuku
     */
    public InputSkrip(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public InputSkrip(java.awt.Frame parent, boolean modal, String id) {
        super(parent, modal);
        initComponents();
        jLabel1.setText("UPDATE DATA SKRIPSI");
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Skripsi p = em.find(Skripsi.class, id);
        if (p != null) {
            p.setKategori(ambilKategori(id));
        }
        em.getTransaction().commit();
        em.close();
        Idskripsi.setText(p.getIdSkripsi());
        tahun.setText(p.getTahun());
        judulskrip.setText(p.getJudul());
        penulis.setText(p.getPenulis());
        pembimbing.setText(p.getPembimbing());
        prodi.setText(p.getProgramStudi());
        fakultas.setText(p.getFakultas());
        bahasa.setText(p.getBahasa());
        jSpinner1.setValue(p.getJumlahHalaman());
        jSpinner2.setValue(p.getJumlahSalinan());
        DefaultTableModel tbl1 = (DefaultTableModel) tblKategori.getModel();
        tbl1.setRowCount(0);
        for (String s : p.getKategori()) {
            tbl1.addRow(new Object[]{s});
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Idskripsi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tahun = new javax.swing.JTextField();
        judulskrip = new javax.swing.JTextField();
        penulis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        prodi = new javax.swing.JTextField();
        jmlbuku = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKategori = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        kategori = new javax.swing.JTextField();
        jmlhal = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        BATAL = new javax.swing.JButton();
        Tambah = new javax.swing.JButton();
        fakultas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pembimbing = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bahasa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(26, 27, 48));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INPUT DATA SKRIPSI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setText("ID Skripsi");

        Idskripsi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Idskripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdskripsiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Judul Skripsi");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Penulis");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setText("Tahun");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setText("Program Studi");

        prodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodiActionPerformed(evt);
            }
        });

        jmlbuku.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmlbuku.setText("Jumlah Salinan");

        tblKategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kategori"
            }
        ));
        jScrollPane3.setViewportView(tblKategori);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel11.setText("Kategori");

        kategori.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jmlhal.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jmlhal.setText("Jumlah Halaman");

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        BATAL.setBackground(new java.awt.Color(102, 0, 0));
        BATAL.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        BATAL.setForeground(new java.awt.Color(255, 255, 255));
        BATAL.setText("BATAL");
        BATAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BATALActionPerformed(evt);
            }
        });

        Tambah.setBackground(new java.awt.Color(102, 0, 0));
        Tambah.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Tambah.setForeground(new java.awt.Color(255, 255, 255));
        Tambah.setText("TAMBAH");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        fakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fakultasActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setText("Fakultas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Pembimbing");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setText("Bahasa");

        bahasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bahasaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSpinner2)
                                        .addComponent(jSpinner1)
                                        .addComponent(jmlhal)
                                        .addComponent(jmlbuku))
                                    .addComponent(Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BATAL, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(prodi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penulis, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judulskrip, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(Idskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(pembimbing)))
                            .addComponent(fakultas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bahasa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Idskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pembimbing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(judulskrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bahasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jmlhal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BATAL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jmlbuku)))))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodiActionPerformed

    private void IdskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdskripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdskripsiActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) tblKategori.getModel();
        String katego = kategori.getText();
        tbl.addRow(new Object[]{katego});
        tblKategori.setModel(tbl);
        kategori.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Skripsi mod = new Skripsi();
        mod.setIdSkripsi(Idskripsi.getText());
        mod.setJudul(judulskrip.getText());
        mod.setPenulis(penulis.getText());
        mod.setFakultas(fakultas.getText());
        mod.setPembimbing(pembimbing.getText());
        mod.setTahun(tahun.getText());
        mod.setBahasa(bahasa.getText());
        mod.setProgramStudi(prodi.getText());
        mod.setJumlahSalinan(Integer.parseInt(jSpinner1.getValue().toString()));
        mod.setJumlahHalaman(Integer.parseInt(jSpinner1.getValue().toString()));
        em.persist(mod);
        List<String> kategori = new ArrayList();
        DefaultTableModel tblK = (DefaultTableModel) tblKategori.getModel();
        int indexK = tblK.getRowCount() - 1;
        
        for (int i = 0; i <= indexK; i++) {
            String k = tblK.getValueAt(i, 0).toString();
            kategori.add(k);
        }
        
        mod.setKategori(kategori);
        
        if (jLabel1.getText().equals("INPUT DATA BUKU")) {
            em.persist(mod);
        } else {
            em.merge(mod);
            String sql = "DELETE FROM KATEGORI_SKRIPSI WHERE ID_SKRIPSI = ?;";
            Query query = em.createNativeQuery(sql);
            query.setParameter(1, mod.getIdSkripsi());
            query.executeUpdate();
        }
        if (!mod.getKategori().isEmpty()) {
            String sql = "INSERT INTO KATEGORI_SKRIPSI (ID_SKRIPSI, KATEGORI) VALUES (?,?)";

            for (String kat : kategori) {
                Query query = em.createNativeQuery(sql);
                query.setParameter(1, mod.getIdSkripsi());
                query.setParameter(2, kat);
                query.executeUpdate();
            }
        }
        
        em.getTransaction().commit();
        em.close();
        dispose();

    }//GEN-LAST:event_TambahActionPerformed

    private void BATALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BATALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BATALActionPerformed

    private void fakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fakultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fakultasActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) tblKategori.getModel();
        int index = tblKategori.getSelectedRow();
        try {
            tbl.removeRow(index);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dihapus");
        }
        tblKategori.setModel(tbl);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void bahasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bahasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bahasaActionPerformed

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
            java.util.logging.Logger.getLogger(InputSkrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputSkrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputSkrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputSkrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InputSkrip dialog = new InputSkrip(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BATAL;
    private javax.swing.JTextField Idskripsi;
    private javax.swing.JButton Tambah;
    private javax.swing.JTextField bahasa;
    private javax.swing.JTextField fakultas;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel jmlbuku;
    private javax.swing.JLabel jmlhal;
    private javax.swing.JTextField judulskrip;
    private javax.swing.JTextField kategori;
    private javax.swing.JTextField pembimbing;
    private javax.swing.JTextField penulis;
    private javax.swing.JTextField prodi;
    private javax.swing.JTextField tahun;
    private javax.swing.JTable tblKategori;
    // End of variables declaration//GEN-END:variables

    List<String> ambilKategori(String id) {
        String sql = "SELECT KATEGORI FROM KATEGORI_BUKU WHERE ID_BUKU = ?";
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createNativeQuery(sql);
        query.setParameter(1, id);
        List<String> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }
    
}