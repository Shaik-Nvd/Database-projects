/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr;
import java.awt.Color;
import java.sql.*; 
import javax.swing.*; 
/**
 *
 * @author aastha
 */
public class editemp extends javax.swing.JInternalFrame {

    final void FillList() {  
        
          try{ 
            String url="jdbc:derby://localhost:1527/addemployee";  
            String username="abc"; 
            String password="1234"; 
            Connection conn=DriverManager.getConnection(url,username,password); 
         
            Statement stmt=conn.createStatement();  
             String Query="SELECT *FROM addemployee"; 
             ResultSet rs=stmt.executeQuery(Query); 
             DefaultListModel  DLM =new DefaultListModel (); 
             
            while(rs.next()) { 
        
           DLM.addElement(rs.getString(1)); 
           
                
          } 
            List1.setModel(DLM); 
          }
           catch(SQLException ex)
        { 
          JOptionPane.showMessageDialog(null,ex.toString());   
        } 
     
    }
    public editemp() {
        initComponents(); 
        FillList ();
       getContentPane().setBackground(Color.PINK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        HireMonth = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        HireYear = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        department = new javax.swing.JComboBox<>();
        salary = new javax.swing.JTextField();
        qualification = new javax.swing.JComboBox<>();
        upd_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pos = new javax.swing.JComboBox<>();
        BirthDay = new javax.swing.JComboBox<>();
        BirthMonth = new javax.swing.JComboBox<>();
        BirthYear = new javax.swing.JComboBox<>();
        id = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        HireDay = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel8.setText("SEX:-");

        HireMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel9.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel9.setText("DEPARTMENT ID :-");

        HireYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1995 ", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003" }));

        jLabel10.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel10.setText("QUALIFICATION ID :-");

        jLabel11.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel11.setText("SALARY:- ");

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel1.setText("NAME:-");

        sex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F  ", "M" }));
        sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexActionPerformed(evt);
            }
        });

        department.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ", "2  ", "3 ", " " }));

        qualification.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        qualification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ", "2 ", "3 ", "4 ", "5 " }));

        upd_btn.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        upd_btn.setText("UPDATE");
        upd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_btnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel2.setText("BIRTHDAY:-");

        jLabel3.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel3.setText("HIRE DATE:-");

        jLabel5.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel5.setText("ID:-");

        jLabel4.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel4.setText("POSITIONID:-");

        jLabel6.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel6.setText("MOBILE:-");

        pos.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        pos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ", "2 ", "3 " }));

        BirthDay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BirthDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01  ", "02 ", "03 ", "04 ", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        BirthMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BirthMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00 ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        BirthYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BirthYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1996 ", "1995 ", "1994 ", "1993 ", "1992 ", "1991 " }));

        jLabel7.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel7.setText("ADDRESS:-");

        HireDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 ", "02 ", "03 ", "04 ", "05 ", "06", "07 ", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        jLabel14.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        jLabel14.setText("UPDATE EMPLOYEE DETAILS");

        jLabel12.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel12.setText("PLEASE CHOOSE AN ITEM FROM THE LIST THE THEN UPDATE THE DETAIILS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(BirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(BirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(120, 120, 120)
                                .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(HireMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(HireYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(upd_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HireDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addContainerGap(572, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(46, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(BirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel5)
                                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(81, 81, 81)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel4)
                                                    .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(64, 64, 64)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel10)
                                                    .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35)
                                                .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(HireDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(HireMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(HireYear, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(upd_btn)))))
                .addContainerGap(591, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexActionPerformed

    }//GEN-LAST:event_sexActionPerformed

    private void upd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_btnActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:derby://localhost:1527/addemployee";
            String username="abc";
            String password="1234";
            Connection conn=DriverManager.getConnection(url,username,password);

            Statement stmt=conn.createStatement();
            String Query="UPDATE addemployee SET NAME ='"+NameText.getText()+"',BIRTHDAY ='"+BirthDay.getSelectedItem()+"',BIRTHMONTH ='"+BirthMonth.getSelectedItem()+"',BIRTHYEAR ='"+BirthYear.getSelectedItem()+"',ID ='"+id.getSelectedText()+"',ADDRESS ='"+address.getText()+"',SEX ='"+sex.getSelectedItem()+"',SALARY ='"+salary.getText()+"',DEPARTMENTID ='"+department.getSelectedItem()+"', POSITIONID='"+pos.getSelectedItem()+"',QUALIFICATIONID='"+qualification.getSelectedItem()+"',MOBILE='"+mobile.getText()+"',HIREDAY='"+HireDay.getSelectedItem()+"',HIREMONTH='"+HireMonth.getSelectedItem()+"',HIREYEAR='"+HireYear.getSelectedItem()+"' where NAME= '"+List1.getSelectedValue()+"'";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null,"empolyee info successfully updated in database");  
            
            FillList();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_upd_btnActionPerformed

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
        // TODO add your handling code here: 
       try{ 
            String url="jdbc:derby://localhost:1527/addemployee";  
            String username="abc"; 
            String password="1234"; 
            Connection conn=DriverManager.getConnection(url,username,password); 
         
            Statement stmt=conn.createStatement();  
             String Query="SELECT *FROM addemployee where NAME ='"+List1.getSelectedValue()+"'";  
             ResultSet rs=stmt.executeQuery(Query); 
            
             
            while(rs.next()) { 
               NameText.setText(rs.getString(1)); 
               BirthDay.setSelectedItem(rs.getString(2)); 
               BirthMonth.setSelectedItem(rs.getString(3)); 
               BirthYear.setSelectedItem(rs.getString(4)); 
               id.setText(rs.getString(5)); 
               address.setText(rs.getString(6)); 
               sex.setSelectedItem(rs.getString(7)); 
               salary.setText(rs.getString(8)); 
               department.setSelectedItem(rs.getString(9)); 
               pos.setSelectedItem(rs.getString(10)); 
               qualification.setSelectedItem(rs.getString(11)); 
               mobile.setText(rs.getString(11)); 
               HireDay.setSelectedItem(rs.getString(12)); 
               HireMonth.setSelectedItem(rs.getString(13)); 
               HireYear.setSelectedItem(rs.getString(14)); 
            } 
            
         } 
                catch(SQLException ex)
        { 
          JOptionPane.showMessageDialog(null,ex.toString());   
        } 
        
    }//GEN-LAST:event_List1ValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BirthDay;
    private javax.swing.JComboBox<String> BirthMonth;
    private javax.swing.JComboBox<String> BirthYear;
    private javax.swing.JComboBox<String> HireDay;
    private javax.swing.JComboBox<String> HireMonth;
    private javax.swing.JComboBox<String> HireYear;
    private javax.swing.JList<String> List1;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField address;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobile;
    private javax.swing.JComboBox<String> pos;
    private javax.swing.JComboBox<String> qualification;
    private javax.swing.JTextField salary;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JButton upd_btn;
    // End of variables declaration//GEN-END:variables
}