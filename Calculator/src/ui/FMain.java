
package ui;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Maja Janković
 */
public class FMain extends JFrame{
  
    JLabel aLabel;
    JLabel bLabel;
    JLabel resultLabel;
    JTextField a;
    JTextField b;
    JTextField result;
    JButton btnSum;
    JButton btnSub;
   

    public FMain(){
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200,200,400,200); //when window is restored down
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void createComponents(){

        
        aLabel = new JLabel("a:");
        bLabel = new JLabel("b:");
        resultLabel = new JLabel("result:");
        a = new JTextField();
        b = new JTextField();
        result = new JTextField();
        btnSum= new JButton("+");
        btnSub= new JButton("-");
        
        aLabel.setBounds(1,1,100,20);
        bLabel.setBounds(1,25,100,20);
        resultLabel.setBounds(1,50,100,20);
        a.setBounds(110,1,100,20);
        b.setBounds(110,25,100,20);
        result.setBounds(110,50,100,20);
        btnSum.setBounds(1,80,100,20);
        btnSub.setBounds(110,80,100,20);

        
        Container container = getContentPane();
        container.setLayout(null);
     
        container.add(aLabel);    
        container.add(bLabel); 
        container.add(resultLabel);  
        container.add(a);
        container.add(b);
        container.add(result);
        container.add(btnSub);
        container.add(btnSum);
    }
    
    public void setListeners(){

        btnSum.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
            try{
                int first = Integer.parseInt (a.getText().trim());
                int second = Integer.parseInt (b.getText().trim());
                int r=0;
                r = first+second;
                result.setText(String.valueOf(r));
            }
            catch(Exception ex){
            }
            }
            });
   
           
        btnSub.addActionListener(new ActionListener(){
    
            public void actionPerformed(ActionEvent e){
                try{
                int first = Integer.parseInt (a.getText().trim());
                int second = Integer.parseInt (b.getText().trim());
                int r=0;
                r = first-second;
                result.setText(String.valueOf(r));
                }catch(Exception ex){
                }
                }
                });
        }
}