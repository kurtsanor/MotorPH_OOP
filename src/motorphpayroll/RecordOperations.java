
package motorphpayroll;

import javax.swing.JTable;
import javax.swing.JTextField;


public interface RecordOperations {
    
    void loadTable(JTable table);
    void fillDetails(int employeeID, JTextField data2, JTextField data3, JTextField data4, JTextField data5, JTextField data6);
    void search(JTable table, String identifier);
    
}
