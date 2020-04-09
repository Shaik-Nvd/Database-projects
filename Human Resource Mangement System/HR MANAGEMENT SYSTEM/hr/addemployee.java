 
package hr;
import java.awt.Color;
import java.sql.*; 
import javax.swing.*; 

/**
 *
 * @author aastha
 */
public class addemployee extends javax.swing.JInternalFrame {

   
    public addemployee() {
        initComponents(); 
        getContentPane().setBackground(Color.ORANGE);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbutton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pos = new javax.swing.JComboBox<>();
        HireDay = new javax.swing.JComboBox<>();
        HireMonth = new javax.swing.JComboBox<>();
        HireYear = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel1.setText("NAME:-");

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel2.setText("BIRTHDAY:-");

        jLabel5.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel5.setText("ID:-");

        jLabel6.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel6.setText("MOBILE:-");

        jLabel7.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel7.setText("ADDRESS:-");

        jLabel8.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel8.setText("SEX:-");

        jLabel9.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel9.setText("DEPARTMENT ID :-");

        jLabel10.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel10.setText("QUALIFICATION ID :-");

        jLabel11.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel11.setText("SALARY:- ");

        jbutton1.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jbutton1.setText("ADD EMPLOYEE");
        jbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("HP Simplified", 1, 36)); // NOI18N
        jLabel12.setText("DETAILS OF EMPLOYEE");

        jLabel13.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        jLabel13.setText(" PLEASE INSERT DETAILS OF EMPLOYEE BELOW ");

        BirthDay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BirthDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01  ", "02 ", "03 ", "04 ", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        BirthMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BirthMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00 ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        BirthYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BirthYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1996 ", "1995 ", "1994 ", "1993 ", "1992 ", "1991 " }));

        sex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F  ", "M" }));

        department.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ", "2  ", "3 ", " " }));

        qualification.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        qualification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ", "2 ", "3 ", "4 ", "5 " }));

        jLabel3.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel3.setText("HIRE DATE:-");

        jLabel4.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel4.setText("POSITIONID:-");

        pos.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        pos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ", "2 ", "3 " }));

        HireDay.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        HireDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 ", "02 ", "03 ", "04 ", "05 ", "06", "07 ", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        HireMonth.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        HireMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        HireYear.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        HireYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1995 ", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(BirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(BirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(75, 75, 75)
                                .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(HireDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(HireMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(HireYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(jbutton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(HireDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HireMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HireYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(104, 104, 104)
                        .addComponent(jbutton1))
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(217, 217, 217))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton1ActionPerformed
        // TODO add your handling code here: 
        try{ 
            String url="jdbc:derby://localhost:1527/addemployee";  
            String username="abc"; 
            String password="1234"; 
            Connection conn=DriverManager.getConnection(url,username,password); 
         
            Statement stmt=conn.createStatement();  
             
             
            
            stmt.execute("INSERT INTO addemployee (NAME,BIRTHDAY,BIRTHMONTH,BIRTHYEAR,ID,ADDRESS,SEX,SALARY,DEPARTMENTID,POSITIONID,QUALIFICATIONID,MOBILE,HIREDAY,HIREMONTH,HIREYEAR)VALUES('"+NameText.getText()+"','"+ BirthDay.getSelectedItem()+"','"
                                          + BirthMonth.getSelectedItem()+"','"+ BirthYear.getSelectedItem()+"','"+ id.getText()+"','"+ address.getText()+"','"+ sex.getSelectedItem()+"','"
       + salary.getText()+"','"+ department.getSelectedItem()+"','"+ pos.getSelectedItem()+"','"+ qualification.getSelectedItem()+"','"+ mobile.getText()+"','"+ HireDay.getSelectedItem()+"','"+ HireMonth.getSelectedItem()+"','"+ HireYear.getSelectedItem()+"')"); 
          JOptionPane.showMessageDialog(null,"Employee addedto database"); 
         NameText.setText(null); 
         BirthDay.setSelectedItem(00); 
         BirthMonth.setSelectedItem(00);  
         BirthYear.setSelectedItem(00);  
         id.setText(null); 
         address.setText(null); 
         sex.setSelectedItem(00);  
         salary.setText(null);
         department.setSelectedItem(0);  
         pos.setSelectedItem(0);  
         qualification.setSelectedItem(0); 
         mobile.setText(null);  
         HireDay.setSelectedItem(00);  
         HireMonth.setSelectedItem(00); 
         HireYear.setSelectedItem(00);
         
    } 
        catch(SQLException ex)
        { 
          JOptionPane.showMessageDialog(null,ex.toString());   
        }
    }//GEN-LAST:event_jbutton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BirthDay;
    private javax.swing.JComboBox<String> BirthMonth;
    private javax.swing.JComboBox<String> BirthYear;
    private javax.swing.JComboBox<String> HireDay;
    private javax.swing.JComboBox<String> HireMonth;
    private javax.swing.JComboBox<String> HireYear;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField address;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbutton1;
    private javax.swing.JTextField mobile;
    private javax.swing.JComboBox<String> pos;
    private javax.swing.JComboBox<String> qualification;
    private javax.swing.JTextField salary;
    private javax.swing.JComboBox<String> sex;
    // End of variables declaration//GEN-END:variables
}
