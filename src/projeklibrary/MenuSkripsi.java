/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeklibrary;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import static projeklibrary.MenuUtama.mod;

public class MenuSkripsi extends javax.swing.JPanel {

    
    List<Skripsi> mod = null;
    public MenuSkripsi() {
        initComponents();
        loadData();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tblskripsi = new javax.swing.JScrollPane();
        tblskrip = new javax.swing.JTable();
        tf_cari = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        Pilihan = new javax.swing.JComboBox<>();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_cetak = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jPanel1.setPreferredSize(new java.awt.Dimension(383, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/skripsi.png"))); // NOI18N
        jLabel2.setText("DATA SKRPISI PERPUSTAKAAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        tblskrip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Skripsi", "Judul", "Penulis", "Tahun"
            }
        ));
        tblskripsi.setViewportView(tblskrip);

        tf_cari.setText("Cari");
        tf_cari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_cariFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_cariFocusLost(evt);
            }
        });
        tf_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cariActionPerformed(evt);
            }
        });
        tf_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_cariKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cariKeyTyped(evt);
            }
        });

        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search.png"))); // NOI18N
        btn_cari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_cariFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_cariFocusLost(evt);
            }
        });
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        Pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Skripsi", "Judul", "Penulis", "Tahun " }));

        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_ubah.setText("UBAH");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_cetak.setText("CETAK");
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tblskripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Pilihan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cetak)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cari))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cetak))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_tambah)
                        .addGap(18, 18, 18)
                        .addComponent(btn_hapus)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ubah)
                        .addGap(0, 199, Short.MAX_VALUE))
                    .addComponent(tblskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
                
            
    }//GEN-LAST:event_btn_cariActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        new InputSkrip(null, true).setVisible(true);
        loadData();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        String s = (String) tblskrip.getValueAt(tblskrip.getSelectedRow(), 0);
        String sql = "DELETE FROM KATEGORI_SKRIPSI WHERE ID_SKRIPSI = ?;";
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Skripsi p = em.find(Skripsi.class, s);
        Query query = em.createNativeQuery(sql);
        query.setParameter(1, s);
        query.executeUpdate();
        em.remove(p);
        em.getTransaction().commit();
        em.close();
        loadData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void tf_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cariActionPerformed

    private void tf_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cariKeyTyped
        char c = evt.getKeyChar();
        if (c == '\n') {
            btn_cariActionPerformed(null);
        }
    }//GEN-LAST:event_tf_cariKeyTyped

    private void btn_cariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_cariFocusGained
        String s = tf_cari.getText();
        if (s.equals("Cari")) {
            tf_cari.setText("");
        }
    }//GEN-LAST:event_btn_cariFocusGained

    private void btn_cariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_cariFocusLost
        String s = tf_cari.getText();
        if (s.equals("")) {
            tf_cari.setText("Cari");
        }
    }//GEN-LAST:event_btn_cariFocusLost

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        if (tblskrip.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Pilih Data Terlebih Dahulu");
        } else {
            String s = (String) tblskrip.getValueAt(tblskrip.getSelectedRow(), 0);
            new InputSkrip(null, true, s).setVisible(true);
        }
        loadData();
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void tf_cariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cariFocusGained
        String s = tf_cari.getText();
        if (s.equals("Cari")) {
            tf_cari.setText("");
        }
    }//GEN-LAST:event_tf_cariFocusGained

    private void tf_cariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cariFocusLost
        String s = tf_cari.getText();
        if (s.equals("")) {
            tf_cari.setText("Cari");
        }
    }//GEN-LAST:event_tf_cariFocusLost

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        try {
            String selection = (String) Pilihan.getSelectedItem();
            String searchTerm = tf_cari.getText().trim();

            EntityManager entityManager = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
            entityManager.getTransaction().begin();

            TypedQuery<Skripsi> querySelectAll = entityManager.createNamedQuery("Skripsi.findAll", Skripsi.class
            );
            
            List<Skripsi> results = querySelectAll.getResultList();
            Map<String, Object> parameter = new HashMap<>();
            parameter.put("querySearch", searchTerm);
            parameter.put("searchBy", selection);

            entityManager.getTransaction().commit();
            entityManager.close();

            String jrxmlFile = "src/projeklibrary/reportSkripsi.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(jrxmlFile);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameter, new JRBeanCollectionDataSource(mod));
            JasperViewer.viewReport(jp, false);

        } catch (JRException ex) {
            Logger.getLogger(Skripsi.class
                    .getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_btn_cetakActionPerformed

    private void tf_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cariKeyReleased
       
    }//GEN-LAST:event_tf_cariKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Pilihan;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tblskrip;
    private javax.swing.JScrollPane tblskripsi;
    private javax.swing.JTextField tf_cari;
    // End of variables declaration//GEN-END:variables

    private void setColWidht() {
        int[] noCol = {0, 1, 2, 3, 4, 6};
        int[] noColW = {35, 80, 200, 150, 100, 70};

        TableColumnModel tblModel = tblskrip.getColumnModel();
        for (int i = 0; i < noCol.length; i++) {
            tblModel.getColumn(noCol[i]).setPreferredWidth(noColW[i]);
            tblModel.getColumn(noCol[i]).setMaxWidth(noColW[i]);
            tblModel.getColumn(noCol[i]).setMinWidth(noColW[i]);
        }
    }

    private void loadData() {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tbl1 = (DefaultTableModel) tblskrip.getModel();
        tbl1.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            Skripsi s = list.get(i);
            s.setKategori(ambilKategori(s.getIdSkripsi()));
            list.set(i, s);
            String peng = "";
            for (String p : s.getKategori()) {
                if (peng.equals("")) {
                    peng = p;
                } else {
                    peng = peng + ", " + p;
                }
            }
            tbl1.addRow(new Object[]{
                s.getIdSkripsi(), s.getJudul(), s.getPenulis(), s.getTahun(), peng
            });
        }
        tblskrip.setModel(tbl1);
        mod = list;

    }

    List<String> ambilKategori(String id) {
        String sql = "SELECT KATEGORI FROM KATEGORI_SKRIPSI WHERE ID_SKRIPSI = ?";
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
