package feniaAggelos;

import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 

class geeks extends JFrame implements ActionListener { 
    // create a frame 
    static JFrame f; 
  
    // create a textfield 
    static JTextField l; 
  
    // store oprerator and operands 
    String s0, s1, s2; 
  
    // default constrcutor 
    geeks() 
    { 
        s0 = s1 = s2 = ""; 
    } 
  
   
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
  
        // if the value is a number 
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') { 
            // if operand is present then add to second no 
            if (!s1.equals("")) 
                s2 = s2 + s; 
            else
                s0 = s0 + s; 
  
            // set the value of text 
            l.setText(s0 + s1 + s2); 
        } 
        else if (s.charAt(0) == 'C') { 
            // clear the one letter 
            s0 = s1 = s2 = ""; 
  
            // set the value of text 
            l.setText(s0 + s1 + s2); 
        } 
        else if (s.charAt(0) == '=') { 
  
            double te; 
  
            // store the value in 1st 
            if (s1.equals("+")) 
                te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
            else if (s1.equals("-")) 
                te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
            else if (s1.equals("/")) 
                te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
  
            // set the value of text 
            l.setText(s0 + s1 + s2 + "=" + te); 
  
            // convert it to string 
            s0 = Double.toString(te); 
  
            s1 = s2 = ""; 
        } 
        else { 
            // if there was no operand 
            if (s1.equals("") || s2.equals("")) 
                s1 = s; 
            // else evaluate 
            else { 
                double te; 
  
                // store the value in 1st 
                if (s1.equals("+")) 
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
                else if (s1.equals("-")) 
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
                else if (s1.equals("/")) 
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
  
                // convert it to string 
                s0 = Double.toString(te); 
  
                // place the operator 
                s1 = s; 
  
                // make the operand blank 
                s2 = ""; 
            } 
  
            // set the value of text 
            l.setText(s0 + s1 + s2); 
        } 
    } 
} 