
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Administrator
 */



public class sidePanel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        side myLabel = new side();

        JFrame myFrame = new JFrame();
        
        myFrame.setSize(1500,500);
        myFrame.setVisible(true);
        myFrame.add(myLabel.myLabel());
    }
    
}


class side{


    public JLabel myLabel(){
        
        JLabel myLabel = new JLabel();
        myLabel.setText("Hello World");
               
        return myLabel;
         
    }

}
