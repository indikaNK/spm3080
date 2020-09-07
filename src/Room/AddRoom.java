package Room;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import DBUtils.DBManager;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Building.AddBuilding;
import Building.Building;
import DBUtils.TimeManagerDB;
import com.mongodb.BasicDBObject;
import org.bson.types.ObjectId;

/**
 *
 * @author Shimran
 */
public class AddRoom extends javax.swing.JFrame {
    
    String buildingId, buildingName, buildingCenter, buildingDepartment, buildingLocation, buildingNumberOfFloors;

    /**
     * Creates new form AddBook
     */
    public AddRoom() {
        DBIntialization();
        initComponents();
        displayTable();
    }
    
    public AddRoom(String buildingId){
        this.buildingId = buildingId;
        DBIntialization();
        initComponents();
        displayTable();
        
        JOptionPane.showMessageDialog(null, "Building Name : "+buildingName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfRoomNumber = new javax.swing.JTextField();
        tfLocation = new javax.swing.JTextField();
        tfSection = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addRoom = new javax.swing.JButton();
        tfType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomList = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tfFloorNumber = new javax.swing.JTextField();
        btnDeleteRoom = new javax.swing.JButton();
        btnEditRoom = new javax.swing.JButton();
        btnApplyChanges = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfRoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRoomNumberActionPerformed(evt);
            }
        });

        jLabel1.setText("Room Number");

        jLabel2.setText("Room Type");

        jLabel3.setText("Location");

        jLabel4.setText("Floor Number");

        jLabel6.setText("Section");

        addRoom.setText("Add New Room");
        addRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomActionPerformed(evt);
            }
        });

        tfType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lecture Hall", "Lab", "Hall", "Auditorium"}));
        tfType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTypeActionPerformed(evt);
            }
        });

        roomList.setModel(roomList.getModel());
        roomList.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(roomList);
        roomList.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (roomList.getColumnModel().getColumnCount() > 0) {
            roomList.getColumnModel().getColumn(0).setResizable(false);
            roomList.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            roomList.getColumnModel().getColumn(1).setResizable(false);
            roomList.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            roomList.getColumnModel().getColumn(2).setResizable(false);
            roomList.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            roomList.getColumnModel().getColumn(3).setResizable(false);
            roomList.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        jLabel5.setText(buildingName);

        btnDeleteRoom.setText("Delete Room");
        btnDeleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRoomActionPerformed(evt);
            }
        });

        btnEditRoom.setText("Edit Room");
        btnEditRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditRoomActionPerformed(evt);
            }
        });

        btnApplyChanges.setText("Apply Changes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnApplyChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfLocation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(tfRoomNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfSection, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfFloorNumber, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addComponent(addRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEditRoom)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteRoom)))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfFloorNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(addRoom))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApplyChanges)
                    .addComponent(btnDeleteRoom)
                    .addComponent(btnEditRoom))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomActionPerformed
        try
        {
        String roomNumber = tfRoomNumber.getText();
        String type = (String)tfType.getSelectedItem();
        String floorNumber = (String)tfFloorNumber.getText();
        String location = (String)tfLocation.getText();
        String section = tfSection.getText();
        String bname = "ooo lala lala laaaa";
                //jLabel5.getText();

        if (roomNumber.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Room Number is Mandatory");
        }
        else
        {
            Room room = new Room(roomNumber, type, floorNumber, location, section, bname);
            DBObject doc = createDBObject(room);
            DB MyDb = null;
            try
            {
                MyDb = DBManager.getDatabase();
            }
            catch (UnknownHostException ex)
            {
                JOptionPane.showMessageDialog(null, "Error When Connecting to DB");
            }
            DBCollection col = MyDb.getCollection("Rooms");
            WriteResult result = col.insert(doc);
            JOptionPane.showMessageDialog(null, "Room added Successfully");
                        tfRoomNumber.setText(null);
                        tfType.setSelectedItem(null);
                        tfLocation.setText(null);
                        tfFloorNumber.setText(null);
                        tfSection.setText(null);
        }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Insertion Failed  please Fill Details to add!" + e.toString());
            tfRoomNumber.grabFocus();
        }
        
    }//GEN-LAST:event_addRoomActionPerformed

    private void tfRoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRoomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRoomNumberActionPerformed

    private void tfTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTypeActionPerformed

    private void btnDeleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRoomActionPerformed
        // TODO add your handling code here:
        int row = roomList.getSelectedRow();
        String roomName = roomList.getModel().getValueAt(row, 1).toString();
        
        DB MyDb = null;
        try
          {
            MyDb = DBManager.getDatabase();
          }
          catch (UnknownHostException e)
           {
                JOptionPane.showMessageDialog(null, "Error When Connecting to DB" + e);
           }
        DBCollection col = MyDb.getCollection("Rooms");
        BasicDBObject theQuery = new BasicDBObject();
        theQuery.put("roomNumber", roomName);
        WriteResult result = col.remove(theQuery);
    }//GEN-LAST:event_btnDeleteRoomActionPerformed

    private void btnEditRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditRoomActionPerformed
        // TODO add your handling code here:
        int row = roomList.getSelectedRow();
        String roomNumber = roomList.getModel().getValueAt(row, 0).toString();
        
        DB MyDb = null;
        try
          {
            MyDb = DBManager.getDatabase();
          }
          catch (UnknownHostException e)
           {
                JOptionPane.showMessageDialog(null, "Error When Connecting to DB" + e);
           }
        DBCollection col = MyDb.getCollection("Rooms");
        DBObject theQuery = new BasicDBObject("roomNumber", roomNumber);
        JOptionPane.showMessageDialog(null, "theQuery : "+ theQuery.toString());
        DBObject result = col.findOne(theQuery);
                        tfRoomNumber.setText((String)result.get("roomNumber"));
                        //tfBuildingName.setEditable(false);
                        tfType.setSelectedItem((String)result.get("type"));
                        tfLocation.setText((String)result.get("location"));
                        tfFloorNumber.setText((String)result.get("floorNumber"));
                        tfSection.setText((String)result.get("section"));
    }//GEN-LAST:event_btnEditRoomActionPerformed

    //INITIALIZE variables
    public void DBIntialization(){
        DB MyDb = null;
        try{
            MyDb = DBManager.getDatabase();
        }catch(UnknownHostException e){
            JOptionPane.showMessageDialog(null, "Error When Connecting to DB in ADDROOM.java " + e);
        }
        //GET COLLECTIONS relevant to DB operations
        DBCollection buildingCollection = MyDb.getCollection("Buildings");
        DBCollection roomCollection = MyDb.getCollection("Rooms");
        
        BasicDBObject theQuery = new BasicDBObject("_id", new ObjectId(buildingId));
        DBObject result = buildingCollection.findOne(theQuery);
        
        this.buildingName = result.get("buildingName").toString();
        this.buildingCenter = result.get("center").toString();
        this.buildingDepartment = result.get("department").toString();
        this.buildingNumberOfFloors = result.get("numberOfFloors").toString();
        this.buildingLocation = result.get("location").toString();
    }
    
    //DISPLAY TABLE OF BUILDINGS
    private void displayTable(){
        DB MyDb = null;
        DBCursor cursor = null;
        try {
            MyDb = DBManager.getDatabase();
            BasicDBObject whereQuery = new BasicDBObject();
            whereQuery.put("buildingName", buildingName);
            DBCollection coll = MyDb.getCollection("Rooms");
            cursor = coll.find(whereQuery);

            String[] columnNames = {"Room Number", "Room Type", "Section"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            while(cursor.hasNext()) {
                DBObject obj = cursor.next();
                String roomNumber = (String)obj.get("roomNumber");
                String type = (String)obj.get("type");
                String section = (String)obj.get("section");
                model.addRow(new Object[] { roomNumber, type, section });
            }
            roomList.setModel(model);

            cursor.close(); 
            //MyDb.close();
        }catch(Exception e){
            System.err.println("Error in displayTable() method === "+e);
        }
    }
    
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
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRoom().setVisible(true);
            }
        });
        
        
    }
    
    private static DBObject createDBObject(Room room)
{
            BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
            docBuilder.append("roomNumber", room.roomNumber);
            docBuilder.append("type", room.type);
            docBuilder.append("floorNumber", room.floorNumber);
            docBuilder.append("location", room.location);
            docBuilder.append("section", room.section);
            return docBuilder.get();
}
    
    
    
    private static DBObject createRemoveDBObject(Room room)
{
            BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
            docBuilder.append("roomNumber", room.roomNumber);
            return docBuilder.get();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoom;
    private javax.swing.JButton btnApplyChanges;
    private javax.swing.JButton btnDeleteRoom;
    private javax.swing.JButton btnEditRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable roomList;
    private javax.swing.JTextField tfFloorNumber;
    private javax.swing.JTextField tfLocation;
    private javax.swing.JTextField tfRoomNumber;
    private javax.swing.JTextField tfSection;
    private javax.swing.JComboBox<String> tfType;
    // End of variables declaration//GEN-END:variables
}
