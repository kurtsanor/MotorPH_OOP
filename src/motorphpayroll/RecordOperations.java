
package motorphpayroll;

import java.util.List;
import javax.swing.JTextField;


public interface RecordOperations {
    
    List <String []> getAllRecords();
    List <String []> search(String searchInput);
    
}
