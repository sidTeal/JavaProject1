package tisdaleproject1;

import java.awt.Color;

/******************************************************
***  Class Name: TisdaleProject1
***  Class Author: Chris Tisdale 
******************************************************
*** Purpose of the class:
*** This class simply creates a new instance of the StatisticsGUI, set color green,
*** sets the title, and sets it to be visible.
****************************************************** 
*** September 5, 2017
******************************************************
*** August 30:  Reviewed assignment and created design for my program and
***             implemented with pseudocode.
*** August 30:  Created TisdaleProject1, StatisticsGUI and CalculateStatistics classes.
***             Tested the input and verified the output of the program, as well as error catching.
*** August 31:  Added comments and final testing.
******************************************************
***  
*******************************************************/
public class TisdaleProject1 {

    public static void main(String[] args) {
        StatisticsGUI GUI = new StatisticsGUI();
        GUI.getContentPane().setBackground(Color.green);
        GUI.setTitle("Mean & Standard Deviation Calculator");
        GUI.setVisible(true);
    }
}
