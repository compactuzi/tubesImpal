/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesKelompok6IF3809.View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author A_CITRA
 */
public class MenuKelolaRuangan extends javax.swing.JFrame implements View {

    /**
     * Creates new form MenuKelolaRuangan
     */
    public MenuKelolaRuangan() {
        initComponents();
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
        btn_tambahRuangan = new javax.swing.JButton();
        btn_lihatdaftarRuangan = new javax.swing.JButton();
        btn_cariRuangan = new javax.swing.JButton();
        btn_peminjamanRuangan = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        btn_tambahbarang = new javax.swing.JButton();
        btn_lihatdaftarpinjam = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Menu Kelola Ruangan");

        btn_tambahRuangan.setBackground(new java.awt.Color(255, 204, 204));
        btn_tambahRuangan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_tambahRuangan.setText("Tambah Data Ruangan");

        btn_lihatdaftarRuangan.setBackground(new java.awt.Color(255, 204, 204));
        btn_lihatdaftarRuangan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_lihatdaftarRuangan.setText("Lihat Daftar Ruangan");

        btn_cariRuangan.setBackground(new java.awt.Color(255, 204, 204));
        btn_cariRuangan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_cariRuangan.setText("Ubah Data Ruangan");

        btn_peminjamanRuangan.setBackground(new java.awt.Color(255, 204, 204));
        btn_peminjamanRuangan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_peminjamanRuangan.setText("Pinjam Ruangan");

        btn_kembali.setBackground(new java.awt.Color(255, 204, 204));
        btn_kembali.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_kembali.setText("Kembali");

        btn_tambahbarang.setBackground(new java.awt.Color(255, 204, 204));
        btn_tambahbarang.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_tambahbarang.setText("Tambah Barang pada Ruangan");

        btn_lihatdaftarpinjam.setBackground(new java.awt.Color(255, 204, 204));
        btn_lihatdaftarpinjam.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_lihatdaftarpinjam.setText("Lihat Daftar Peminjaman");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_lihatdaftarpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn_kembali))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_tambahbarang)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_lihatdaftarRuangan)
                                            .addComponent(btn_tambahRuangan)
                                            .addComponent(btn_cariRuangan)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(btn_peminjamanRuangan)))))))))
                .addGap(0, 112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(btn_tambahRuangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_lihatdaftarRuangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cariRuangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_peminjamanRuangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tambahbarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_lihatdaftarpinjam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btn_kembali)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cariRuangan;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_lihatdaftarRuangan;
    private javax.swing.JButton btn_lihatdaftarpinjam;
    private javax.swing.JButton btn_peminjamanRuangan;
    private javax.swing.JButton btn_tambahRuangan;
    private javax.swing.JButton btn_tambahbarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void showMessage(String m) {
        JOptionPane.showMessageDialog(this, m);
    }

    @Override
    public void setListener(ActionListener a) {
        btn_cariRuangan.addActionListener(a);
        btn_kembali.addActionListener(a);
        btn_lihatdaftarRuangan.addActionListener(a);
        btn_lihatdaftarpinjam.addActionListener(a);
        btn_peminjamanRuangan.addActionListener(a);
        btn_tambahRuangan.addActionListener(a);
        btn_tambahbarang.addActionListener(a);
    }

    public JButton getBtn_cariRuangan() {
        return btn_cariRuangan;
    }

    public void setBtn_cariRuangan(JButton btn_cariRuangan) {
        this.btn_cariRuangan = btn_cariRuangan;
    }

    public JButton getBtn_kembali() {
        return btn_kembali;
    }

    public void setBtn_kembali(JButton btn_kembali) {
        this.btn_kembali = btn_kembali;
    }

    public JButton getBtn_lihatdaftarRuangan() {
        return btn_lihatdaftarRuangan;
    }

    public void setBtn_lihatdaftarRuangan(JButton btn_lihatdaftarRuangan) {
        this.btn_lihatdaftarRuangan = btn_lihatdaftarRuangan;
    }

    public JButton getBtn_peminjamanRuangan() {
        return btn_peminjamanRuangan;
    }

    public void setBtn_peminjamanRuangan(JButton btn_peminjamanRuangan) {
        this.btn_peminjamanRuangan = btn_peminjamanRuangan;
    }

    public JButton getBtn_tambahRuangan() {
        return btn_tambahRuangan;
    }

    public void setBtn_tambahRuangan(JButton btn_tambahRuangan) {
        this.btn_tambahRuangan = btn_tambahRuangan;
    }

    public JButton getBtn_tambahbarang() {
        return btn_tambahbarang;
    }

    public void setBtn_tambahbarang(JButton btn_tambahbarang) {
        this.btn_tambahbarang = btn_tambahbarang;
    }

    public JButton getBtn_lihatdaftarpinjam() {
        return btn_lihatdaftarpinjam;
    }

    public void setBtn_lihatdaftarpinjam(JButton btn_lihatdaftarpinjam) {
        this.btn_lihatdaftarpinjam = btn_lihatdaftarpinjam;
    }
    
    
    
}
