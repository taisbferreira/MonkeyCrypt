package frame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class DrawTable extends JPanel
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DrawTable(String firstrow, String secondrow, String key) {
    	 
    	 String [] column = new String [firstrow.length()];
    	 Object [] array1 = new Object [secondrow.length()];
    	 Object [] array2 = new Object [secondrow.length()];
    	 for (int i = 0; i<array1.length; i++) {
    		 column[i] = String.valueOf(firstrow.charAt(i));
    		 array2[i] = secondrow.charAt(i);
    		 array1[i] = firstrow.charAt(i);
    	 }
    	 Object[][] data =  new Object[][]{array1, array2};
          
         //create table with data
         JTable table = new JTable(data, array1);
         table.setTableHeader(null);
         //add the table to the frame
         
         JScrollPane j = new JScrollPane(table);
         this.add(new JLabel(" key: " + key));
         this.add(j);    
    }   
}
