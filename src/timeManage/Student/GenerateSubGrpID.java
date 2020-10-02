/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeManage.Student;

import timeManage.DBManager;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;

/**
 *
 * @author Vinoth
 */
public class GenerateSubGrpID extends javax.swing.JPanel {
         ObjectId ID;
    /**
     * Creates new form GenerateSubGrpID
     */
    public GenerateSubGrpID() {
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
        SubNum = new javax.swing.JTextField();
        AddButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SubList = new javax.swing.JTable();
        EditButton1 = new javax.swing.JButton();
        DeleteButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        GenerateButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        SubIDList = new javax.swing.JTable();
        DeleteButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        AddYearButton = new javax.swing.JButton();
        CreateGrpButton = new javax.swing.JButton();
        AddTagButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Sub-Group Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Sub-Group Number");

        SubNum.setBackground(new java.awt.Color(204, 204, 204));
        SubNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubNumActionPerformed(evt);
            }
        });

        AddButton1.setBackground(new java.awt.Color(102, 255, 204));
        AddButton1.setText("Add");
        AddButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton1ActionPerformed(evt);
            }
        });

        SubList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Sub-Group Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        SubList.setFocusable(false);
        SubList.setRowHeight(25);
        SubList.setShowVerticalLines(false);
        SubList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SubList);

        EditButton1.setBackground(new java.awt.Color(153, 255, 204));
        EditButton1.setText("Edit");
        EditButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButton1ActionPerformed(evt);
            }
        });

        DeleteButton1.setBackground(new java.awt.Color(255, 102, 102));
        DeleteButton1.setText("Remove");
        DeleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SubNum)
                    .addComponent(AddButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addGap(240, 240, 240)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SubNum, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(AddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create Sub-Group ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Group ID");

        jLabel3.setText("Sub-Group Number");

        jComboBox2.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        GenerateButton.setBackground(new java.awt.Color(102, 255, 204));
        GenerateButton.setText("Generate Sub-Group ID");
        GenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateButtonActionPerformed(evt);
            }
        });

        SubIDList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Sub-Group ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        SubIDList.setFocusable(false);
        SubIDList.setRowHeight(25);
        SubIDList.setShowVerticalLines(false);
        SubIDList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubIDListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(SubIDList);

        DeleteButton2.setBackground(new java.awt.Color(255, 102, 102));
        DeleteButton2.setText("Remove Sub-Group ID");
        DeleteButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeleteButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GenerateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(194, 194, 194)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(GenerateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AddYearButton.setBackground(new java.awt.Color(153, 153, 255));
        AddYearButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AddYearButton.setForeground(new java.awt.Color(255, 255, 255));
        AddYearButton.setText("Add Year&Semester");
        AddYearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddYearButtonActionPerformed(evt);
            }
        });

        CreateGrpButton.setBackground(new java.awt.Color(102, 102, 255));
        CreateGrpButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        CreateGrpButton.setForeground(new java.awt.Color(255, 255, 255));
        CreateGrpButton.setText("Create Group ID");
        CreateGrpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateGrpButtonActionPerformed(evt);
            }
        });

        AddTagButton.setBackground(new java.awt.Color(102, 51, 255));
        AddTagButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AddTagButton.setForeground(new java.awt.Color(255, 255, 255));
        AddTagButton.setText("Add Tag");
        AddTagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTagButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(AddYearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(CreateGrpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(AddTagButton, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddYearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateGrpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddTagButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SubNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubNumActionPerformed

    private void AddButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton1ActionPerformed
        // TODO add your handling code here:

        try{
            int sub = Integer.parseInt(SubNum.getText());
            if(SubNum.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter the SubGroup Number");

            }

            else{
                SubGroupNumber subNum = new SubGroupNumber(sub);

                DBObject doc = createDBObject(subNum);
                DB MyDb = null;

                try
                {
                    MyDb = DBManager.getDatabase();
                }
                catch (UnknownHostException ex)
                {
                    JOptionPane.showMessageDialog(null, "Error When Connecting to DB");
                }
                DBCollection col = MyDb.getCollection("SubNumber");
                BasicDBObject theQuery = new BasicDBObject("SubNumber", sub);
                DBObject result = col.findOne(theQuery);

                if(result==null){
                    WriteResult result1 = col.insert(doc);
                    JOptionPane.showMessageDialog(null, "added Successfully");

                    SubNum.setText(null);

                    displayTable1();
                     jComboBox2.removeAllItems();
                        update2();

                }else{

                    JOptionPane.showMessageDialog(null, "Already Added");

                }

            }} catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Insertion Failed  please Fill Details to add!" + e.toString());

            }

    }//GEN-LAST:event_AddButton1ActionPerformed

    private void SubListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubListMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) SubList.getModel();
        int selectedIndex = SubList.getSelectedRow();
        ID= (ObjectId) model.getValueAt(selectedIndex,0);
        SubNum.setText(model.getValueAt(selectedIndex, 1).toString());

    }//GEN-LAST:event_SubListMouseClicked

    private void EditButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            int SubNumber = Integer.parseInt(SubNum.getText());

            if (SubNum.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "SubNumber is Mandatory");
            }
            else
            {
                //Check if name is there in DB
                DB MyDb = null;
                try
                {
                    MyDb = DBManager.getDatabase();
                }
                catch (UnknownHostException e)
                {
                    JOptionPane.showMessageDialog(null, "Error When Connecting to DB : " + e);
                }
                DBCollection col = MyDb.getCollection("SubNumber");
                BasicDBObject theQuery = new BasicDBObject("_id", ID );
                DBObject result = col.findOne(theQuery);

                if(result == null){
                    //If not add as new building

                    SubGroupNumber subNum = new SubGroupNumber(SubNumber);
                    DBObject doc = createDBObject(subNum);
                    col.insert(doc);
                    JOptionPane.showMessageDialog(null, "Added Successfully");
                    SubNum.setText(null);

                }else{
                    //if yes Edit existing building
                    BasicDBObject query = new BasicDBObject();
                    query.put("_id", ID);

                    BasicDBObject newDocument = new BasicDBObject();
                    newDocument.put("SubNumber", SubNumber);

                    BasicDBObject updateObject = new BasicDBObject();
                    updateObject.put("$set", newDocument);

                    MyDb.getCollection("SubNumber").update(query, updateObject);
                    JOptionPane.showMessageDialog(null, "Updated Succesfully!");
                    SubNum.setText(null);
                    SubNum.setText(null);
                }
                displayTable1();
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Insertion Failed  please Fill Details to add!" + e.toString());

        }

    }//GEN-LAST:event_EditButton1ActionPerformed

    private void DeleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButton1ActionPerformed
        // TODO add your handling code here:

        int row = SubList.getSelectedRow();
        ID = (ObjectId) SubList.getModel().getValueAt(row, 0);

        DB MyDb = null;
        try
        {
            MyDb = DBManager.getDatabase();
        }
        catch (UnknownHostException e)
        {
            JOptionPane.showMessageDialog(null, "Error When Connecting to DB" + e);
        }
        DBCollection col = MyDb.getCollection("SubNumber");
        BasicDBObject theQuery = new BasicDBObject();
        theQuery.put("_id", ID);
        WriteResult result = col.remove(theQuery);
        JOptionPane.showMessageDialog(null, "Deleted Succesfully!");
        SubNum.setText(null);

        displayTable1();

    }//GEN-LAST:event_DeleteButton1ActionPerformed

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
        // TODO add your handling code here:
        // update3();
    }//GEN-LAST:event_jComboBox2MouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
        //  update2();
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void GenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateButtonActionPerformed
        // TODO add your handling code here:

        try{
            String Gid =(String) jComboBox1.getSelectedItem();
            String Snum =(String) jComboBox2.getSelectedItem();
            String SubId =Gid+"."+Snum;

            if(Gid==null){
                JOptionPane.showMessageDialog(null, "Select Group ID");
            }
            else if(Snum==null){
                JOptionPane.showMessageDialog(null, "Select SubNumber");
            }
            else{
                SubGroupID SubgrpId = new SubGroupID(Gid,Snum);

                DBObject doc = createDBObject(SubgrpId);
                DB MyDb = null;

                try
                {
                    MyDb = DBManager.getDatabase();
                }
                catch (UnknownHostException ex)
                {
                    JOptionPane.showMessageDialog(null, "Error When Connecting to DB");
                }
                DBCollection col = MyDb.getCollection("SubGroupID");
                BasicDBObject theQuery = new BasicDBObject("SID", SubId);
                DBObject result = col.findOne(theQuery);

                if(result==null){
                    WriteResult result1 = col.insert(doc);
                    JOptionPane.showMessageDialog(null, "added Successfully");

                    jComboBox1.setSelectedItem(null);
                    jComboBox1.setSelectedItem(null);
                    jComboBox2.setSelectedItem(null);

                    displayTable2();

                }
                else{
                    JOptionPane.showMessageDialog(null, "Already Added");
                }}} catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Insertion Failed  please Fill Details to add!" + e.toString());

                }

    }//GEN-LAST:event_GenerateButtonActionPerformed

    private void SubIDListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubIDListMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) SubIDList.getModel();
        int selectedIndex = SubIDList.getSelectedRow();
        ID= (ObjectId) model.getValueAt(selectedIndex,0);

    }//GEN-LAST:event_SubIDListMouseClicked

    private void DeleteButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButton2ActionPerformed
        // TODO add your handling code here:
        int row = SubIDList.getSelectedRow();
        ID = (ObjectId) SubIDList.getModel().getValueAt(row, 0);

        DB MyDb = null;
        try
        {
            MyDb = DBManager.getDatabase();
        }
        catch (UnknownHostException e)
        {
            JOptionPane.showMessageDialog(null, "Error When Connecting to DB" + e);
        }
        DBCollection col = MyDb.getCollection("SubGroupID");
        BasicDBObject theQuery = new BasicDBObject();
        theQuery.put("_id", ID);
        WriteResult result = col.remove(theQuery);
        JOptionPane.showMessageDialog(null, "Deleted Succesfully!");

        displayTable2();

    }//GEN-LAST:event_DeleteButton2ActionPerformed

    private void AddYearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddYearButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

        new AddStudent().setVisible(true);
    }//GEN-LAST:event_AddYearButtonActionPerformed

    private void CreateGrpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateGrpButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AddGrpNumber().setVisible(true);
    }//GEN-LAST:event_CreateGrpButtonActionPerformed

    private void AddTagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTagButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AddTag().setVisible(true);
    }//GEN-LAST:event_AddTagButtonActionPerformed

    private void displayTable1(){
          DB MyDb = null;
        DBCursor cursor = null;
        try {
            MyDb = DBManager.getDatabase();
            DBCollection coll = MyDb.getCollection("SubNumber");
            cursor = coll.find();

            String[] columnNames = {"ID","SubGroupNumber" };
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
           

            while(cursor.hasNext()) {
                DBObject obj = cursor.next();
             
                String sub = (String)obj.get("SubNumber");
              
                ObjectId id = (ObjectId)obj.get("_id");
                model.addRow(new Object[] {id, sub });
            }
            SubList.setModel(model);
              SubList.getColumnModel().getColumn(0).setMinWidth(0);
             SubList.getColumnModel().getColumn(0).setMaxWidth(0);
            cursor.close(); 
            //MyDb.close();
        }catch(Exception e){
            System.err.println("Error in displayTable() method === "+e);
        }
      
    }
      
        private void displayTable2(){
          DB MyDb = null;
        DBCursor cursor = null;
        try {
            MyDb = DBManager.getDatabase();
            DBCollection coll = MyDb.getCollection("SubGroupID");
            cursor = coll.find();

            String[] columnNames = {"ID","SubGroupID" };
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
           

            while(cursor.hasNext()) {
                DBObject obj = cursor.next();
             
                String sid = (String)obj.get("SID");
              
                ObjectId id = (ObjectId)obj.get("_id");
                model.addRow(new Object[] {id, sid });
            }
            SubIDList.setModel(model);
              SubIDList.getColumnModel().getColumn(0).setMinWidth(0);
             SubIDList.getColumnModel().getColumn(0).setMaxWidth(0);
            cursor.close(); 
            //MyDb.close();
        }catch(Exception e){
            System.err.println("Error in displayTable() method === "+e);
        }
      
    }
      
        private void update1(){
    
     DB MyDb = null;
        DBCursor cursor = null;
        try {
            MyDb = DBManager.getDatabase();
            DBCollection coll = MyDb.getCollection("GroupID");
            cursor = coll.find();

        
           

            while(cursor.hasNext()) {
                DBObject obj = cursor.next();
               // String id = (String)obj.get(".id");
             
                        jComboBox1.addItem((String) obj.get("GrpID").toString());
               
              
            }
          
            cursor.close(); 
             jComboBox1.setSelectedItem(null);
            //MyDb.close();
        }catch(Exception e){
            System.err.println("Error in displayTable() method === "+e);
        }}
        
         private void update2(){
    
     DB MyDb = null;
        DBCursor cursor = null;
        try {
            MyDb = DBManager.getDatabase();
            DBCollection coll = MyDb.getCollection("SubNumber");
            cursor = coll.find();

        
           

            while(cursor.hasNext()) {
                DBObject obj = cursor.next();
               // String id = (String)obj.get(".id");
             
                        jComboBox2.addItem((String) obj.get("SubNumber"));
               
              
            }
          
            cursor.close(); 
             jComboBox2.setSelectedItem(null);
            //MyDb.close();
        }catch(Exception e){
            System.err.println("Error in displayTable() method === "+e);
        }}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton1;
    private javax.swing.JButton AddTagButton;
    private javax.swing.JButton AddYearButton;
    private javax.swing.JButton CreateGrpButton;
    private javax.swing.JButton DeleteButton1;
    private javax.swing.JButton DeleteButton2;
    private javax.swing.JButton EditButton1;
    private javax.swing.JButton GenerateButton;
    private javax.swing.JTable SubIDList;
    private javax.swing.JTable SubList;
    private javax.swing.JTextField SubNum;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

  private DBObject createDBObject(SubGroupNumber subNum) {
       BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
           docBuilder.append("SubNumber", subNum.SubNumber);
           return docBuilder.get();
    }

    private DBObject createDBObject(SubGroupID SubgrpId) {
       BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
           docBuilder.append("GID", SubgrpId.GID);
           docBuilder.append("SubNum", SubgrpId.SubNum);
            docBuilder.append("SID", SubgrpId.SID);
           return docBuilder.get();
    }

}