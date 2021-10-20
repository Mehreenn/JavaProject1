package exercise2;

import javax.swing.*;

public class DriverClass
{
    public  static  void main(String[] args)
    {
        Lotto lotto = new Lotto();
        int[] arr = lotto.getArray(); //gets array of number that was randomized
        int sum = 0; //initialized to 0

        //for loop
        for (int i = 0; i <arr.length ; i++)
        {
            sum = sum+arr[i]; //calculate total sum 
        }

        int number = 0; //initialized to 0
        boolean winsLotto = false; //initially false
        System.out.print(sum);

        for (int i = 0; i <5 ; i++) //game goes for 5 tries
        {
            number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number:"));
            while (number < 3 || number > 27) //repeats if the user doesn't enter number between 3 and 27
            {
                JOptionPane.showMessageDialog(null, "Please enter a number only between 3 - 27! Hit Enter to enter a number!");
                number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number:"));
            }
            if (number == sum)
            {
                JOptionPane.showMessageDialog(null, "You won the LOTTO!!");
                winsLotto = true;
                break;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You lost! Please try again!");
            }
        }
        if(!winsLotto) //if user doesn't win all 5 tries
        {
            JOptionPane.showMessageDialog(null,"Oops you lost all the chances to win the LOTTO!");
        }
    }
}

