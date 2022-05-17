
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */


public class PersonelEkrani extends javax.swing.JDialog {
    
    DefaultTableModel model; // tablo üzerinde işlem yapmak için ekledik
    DatabaseProcess islem = new DatabaseProcess(); // veri tabanı işlemleri burada de gerçekleşecek o yüzden ekledik

    public PersonelEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel)personel_tablo.getModel(); //modeli tekrar tekrar oluşturmayalım diye
        personelListeleme();
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        personel_tablo = new javax.swing.JTable();
        arama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_ad = new javax.swing.JTextField();
        txt_soyad = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_tc = new javax.swing.JTextField();
        btn_ekle = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        secili_id = new javax.swing.JLabel();
        btn_guncelle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        personel_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "ad", "soyad", "e-mail", "tc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        personel_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personel_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personel_tablo);
        if (personel_tablo.getColumnModel().getColumnCount() > 0) {
            personel_tablo.getColumnModel().getColumn(0).setResizable(false);
            personel_tablo.getColumnModel().getColumn(1).setResizable(false);
            personel_tablo.getColumnModel().getColumn(2).setResizable(false);
            personel_tablo.getColumnModel().getColumn(3).setResizable(false);
            personel_tablo.getColumnModel().getColumn(4).setResizable(false);
        }

        arama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaKeyReleased(evt);
            }
        });

        jLabel1.setText("ARAMA:");

        jLabel2.setText("Ad:");

        jLabel3.setText("Soyad:");

        jLabel4.setText("E-Mail:");

        jLabel5.setText("T.C:");

        btn_ekle.setBackground(new java.awt.Color(0, 255, 0));
        btn_ekle.setText("Kaydet");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });

        jLabel6.setText("Seçili ID:");

        secili_id.setForeground(new java.awt.Color(255, 0, 0));

        btn_guncelle.setBackground(new java.awt.Color(51, 51, 255));
        btn_guncelle.setText("Güncellle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });

        btn_sil.setBackground(new java.awt.Color(255, 0, 0));
        btn_sil.setText("Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arama, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_tc, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(txt_mail)
                            .addComponent(txt_ad)
                            .addComponent(txt_soyad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secili_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(338, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secili_id)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(btn_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btn_guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btn_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Tablo Üzerinde Arama Yapma
    public void aramaYap(String arama){
        
        TableRowSorter <DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        personel_tablo.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(arama));
    }
    private void aramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaKeyReleased
        String ara = arama.getText();
        
        aramaYap(ara);
    }//GEN-LAST:event_aramaKeyReleased

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed
        
        JOptionPane.showMessageDialog(null, "Personel Bilgileri Kayıt Edildi.");
        
        String ad = txt_ad.getText();
        String soyad = txt_soyad.getText();
        String mail = txt_mail.getText();
        String tc = txt_tc.getText();
        
        islem.personelEkle(ad,soyad,mail,tc);
        personelListeleme();
        temizle();
                
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void personel_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personel_tabloMouseClicked
        
        int secili_satir = personel_tablo.getSelectedRow();
        
        secili_id.setText(model.getValueAt(secili_satir, 0).toString());
        txt_ad.setText(model.getValueAt(secili_satir, 1).toString());
        txt_soyad.setText(model.getValueAt(secili_satir, 2).toString());
        txt_mail.setText(model.getValueAt(secili_satir, 3).toString());
        txt_tc.setText(model.getValueAt(secili_satir, 4).toString());
        
    }//GEN-LAST:event_personel_tabloMouseClicked

    public void temizle(){
        
        txt_ad.setText("");
        txt_soyad.setText("");
        txt_mail.setText("");
        txt_tc.setText("");
        secili_id.setText("");
    }
    
    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed
       
        String ad = txt_ad.getText();
        String soyad = txt_soyad.getText();
        String mail = txt_mail.getText();
        String tc = txt_tc.getText();
        
        int secili_satir  = personel_tablo.getSelectedRow();
        
        if (secili_satir == -1) //tablo boş mu ya da seçili satır yok mu kontorlü
        {
            if (model.getRowCount() == 0) //tablo boş mu ?
            {
                JOptionPane.showMessageDialog(null, "Tabloya herhangi bir değer eklenmedi.");
            }
            else   {
                JOptionPane.showMessageDialog(null, "Lütfen bir satır seçin.");
            }
        }
        else {
            
            int id = (int)model.getValueAt(secili_satir, 0); //Tablodan id değerini aldık
            islem.personelleriGuncelle(id , ad , soyad, mail ,tc);
            personelListeleme();
            temizle();
            JOptionPane.showMessageDialog(null, "Güncelleme işlemi başarılı.");
        }
    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        
        int secili_satir = personel_tablo.getSelectedRow();
        
         if (secili_satir == -1) //tablo boş mu ya da seçili satır yok mu kontorlü
        {
            if (model.getRowCount() == 0) //tablo boş mu ?
            {
                JOptionPane.showMessageDialog(null, "Tabloya herhangi bir değer eklenmedi.");
            }
            else   {
                JOptionPane.showMessageDialog(null, "Lütfen bir satır seçin.");
            }
        }
         else{
             int id = (int)model.getValueAt(secili_satir, 0); //Tablodan id değerini aldık
             
             islem.personelSil(id);
             personelListeleme();
             temizle();
             JOptionPane.showMessageDialog(null, "Silme işlemi başarılı.");
         }
    }//GEN-LAST:event_btn_silActionPerformed

    public void personelListeleme(){
        model.setRowCount(0); //tabloyu boşaltmaya yarar
        
        ArrayList<Personel> personel = new ArrayList<Personel>();
        personel = islem.personelgetir();
        
        if (personel != null) {
            
            for (Personel personel1 : personel) {
                
                Object [] eklenecek = {personel1.getId(),personel1.getAd(), personel1.getSoyad(), personel1.getEmail(), personel1.getTc()};
                
                model.addRow(eklenecek);
            }
            
        }
        
    }
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
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PersonelEkrani dialog = new PersonelEkrani(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField arama;
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_sil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable personel_tablo;
    private javax.swing.JLabel secili_id;
    private javax.swing.JTextField txt_ad;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_soyad;
    private javax.swing.JTextField txt_tc;
    // End of variables declaration//GEN-END:variables
}
