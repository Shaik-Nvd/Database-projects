
package hr;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.text.Position;


public class searchemp extends javax.swing.JInternalFrame {

    final void fillList() {  
        
          try{ 
            String url= "jdbc:derby://localhost:1527/addemployee"; 
            String username="abc"; 
            String password="1234"; 
            Connection conn=DriverManager.getConnection(url,username,password); 
             
            Statement stmt=conn.createStatement();  
             String Query="SELECT *FROM addemployee"; 
             ResultSet rs=stmt.executeQuery(Query); 
             DefaultListModel  DLM =new DefaultListModel (); 
             
            while(rs.next()) { 
        
           DLM.addElement(rs.getString(5)); 
           
                
          } 
            List1.setModel(DLM); 
          }
           catch(SQLException ex)
        { 
          JOptionPane.showMessageDialog(null,ex.toString());   
        } 
     
    }
    public searchemp() {
        initComponents(); 
        fillList(); 
        getContentPane().setBackground(Color.BLUE); 
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        BirthDay = new javax.swing.JComboBox<>();
        BirthMonth = new javax.swing.JComboBox<>();
        BirthYear = new javax.swing.JComboBox<>();
        id = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        department = new javax.swing.JComboBox<>();
        salary = new javax.swing.JTextField();
        qualification = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        HireDay = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        HireMonth = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        HireYear = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        SearchText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        BirthDay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BirthDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01  ", "02 ", "03 ", "04 ", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        BirthMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BirthMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00 ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        BirthYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BirthYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1996 ", "1995 ", "1994 ", "1993 ", "1992 ", "1991 " }));

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

        jLabel7.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel7.setText("ADDRESS:-");

        HireDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 ", "02 ", "03 ", "04 ", "05 ", "06", "07 ", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

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

        jLabel14.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel14.setText("enter the employee id:");

        jButton1.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        jLabel15.setText("SEARCH EMPLOYEE DETAILS");

        jLabel12.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel12.setText("PLEASE ENTER EMPLOYEE ID TO SEARCH ITS DETAILS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(347, 347, 347)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(142, 142, 142)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(26, 26, 26)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(BirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(BirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(BirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(296, 296, 296)
                                                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(146, 146, 146)
                                                    .addComponent(jLabel11))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(HireDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addComponent(HireMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(HireYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(488, 488, 488)
                        .addComponent(jLabel15)))
                .addContainerGap(423, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel12))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel9)
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(BirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(45, 45, 45))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(HireDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HireMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HireYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(351, 351, 351))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
         try{ 
            String url="jdbc:derby://localhost:1527/addemployee";  
            String username="abc"; 
            String password="1234"; 
            Connection conn=DriverManager.getConnection(url,username,password); 
         
            Statement stmt=conn.createStatement();  
             String Query="SELECT *FROM addemployee where ID ='"+List1.getSelectedValue()+"'";  
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
               JOptionPane.showMessageDialog(null,"empolyee info successfully found in database"); 
            } 
         }
                catch(SQLException ex)
        { 
          JOptionPane.showMessageDialog(null,ex.toString());   
        } 
        
    }//GEN-LAST:event_List1ValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: 
       int result= List1.getNextMatch(SearchText.getText(),0, Position.Bias.Forward); 
       List1.setSelectedIndex(result);  
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexActionPerformed

    }//GEN-LAST:event_sexActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BirthDay;
    private javax.swing.JComboBox<String> BirthMonth;
    private javax.swing.JComboBox<String> BirthYear;
    private javax.swing.JComboBox<String> HireDay;
    private javax.swing.JComboBox<String> HireMonth;
    private javax.swing.JComboBox<String> HireYear;
    private javax.swing.JList<String> List1;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField SearchText;
    private javax.swing.JTextField address;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    // End of variables declaration//GEN-END:variables
}
