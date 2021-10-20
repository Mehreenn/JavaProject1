package exercise1;

import java.util.Random;
import javax.swing.JOptionPane;


public class Test
{

    private int correctAns;
    private int wrongAns;
    private int totalQuest;

    public Test()
    {
        correctAns = 0; //initialized to 0
        wrongAns = 0; //initialized to 0
        totalQuest = 5; //total 5 quest to be asked
    }

    //display quest on screen
    //-	create a method to simulate the questions – simulateQuestion
    private void simulateQuestion(int options)
    {
        String questions = ""; //questions to be asked
        String[] answers = new String[4]; // created array to hold answers
        int ans = 5; //5 correct answers for 5 questions

        switch (options + 1)
        {
            case 1: 
            	questions = "(1) The following symbol indicates single line comment in Java Application source code:";
                answers[0] = "(i) #";
                answers[1] = "(ii) //";
                answers[2] = "(iii) \\";
                answers[3] = "(iv) /* ";
                ans = 1; //correct answer for above question
                break;
            case 2: 
            	questions = "(2) Class variables must be declared as:";
                answers[0] = "(i) static";
                answers[1] = "(ii) final";
                answers[2] = "(iii) var";
                answers[3] = "(iv) const";
                ans = 0; //correct answer for above question
                break;
            case 3: 
            	questions = "(3) Method arguments may be:";
                answers[0] = "(i) only strings";
                answers[1] = "(ii) only constants";
                answers[2] = "(iii) constant, variables or expressions";
                answers[3] = "(iv) only variables";
                ans = 2; //correct answer for above question
                break;
            case 4: 
            	questions = "(4) Converting an argument’s value, if possible, to the type that the method expects to receive in its corresponding parameter is:";
                answers[0] = "(i) argument conversion";
                answers[1] = "(ii) argument promotion";
                answers[2] = "(iii) argument truncation";
                answers[3] = "(iv) type casting";
                ans = 1; //correct answer for above question
                break;
            case 5: 
            	questions = "(5) Which of the following processes is typically used by JVM to execute bytecode?";
                answers[0] = "(i) interpretation";
                answers[1] = "(ii) Regular time compilation only";
                answers[2] = "(iii) Just-in-time JIT compilation";
                answers[3] = "(iv) combination of interpretation and just-in-time (JIT) compilation";
                ans = 3; //correct answer for above question
                break;
        }
        int answer = JOptionPane.showOptionDialog(null,
                questions,
                "Choose Your Answer",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                answers,
                ans);
        checkAnswer(answer, ans); //check answer inputed by user

    }


    //-	create a method to check the answer – checkAnswer
    private void checkAnswer(int ans1, int ans2) 
    {
        //Random random = new Random();
        if (ans1 == ans2) 
        {
            correctAns++;
            JOptionPane.showMessageDialog(null, generateMessage(1));
        } 
        else 
        {
            wrongAns++;
            JOptionPane.showMessageDialog(null, generateMessage(2));
        }
    }
    
  //-	create a method to display a random message for the user – generateMessage
    private String generateMessage(int option) 
    {

        Random randomObject = new Random(); //to select randomly
        if (option == 1) //works only if answer is correct
        {
            switch (randomObject.nextInt(4)) 
            {
                case 0:
                    return "Excellent!";
                case 1:
                    return "Good!";
                case 2:
                    return "Keep up the good work!";
                case 3:
                    return "Nice Work!";
            }
        } 
        else 
        {
            switch (randomObject.nextInt(4)) 
            {
                case 0:
                    return "No. Please try again!";
                case 1:
                    return "Wrong. Try once more!";
                case 2:
                    return "Don't give up!";
                case 3:
                    return "No. Keep trying!";
            }
        }return "";
    }

  //Simulates test 
    public static void main(String args[]) 
    {
        Test test = new Test();
        test.inputAnswer();
    }

    //-	create a method to interact with the user - inputAnswer
    private void inputAnswer() 
    {
        for (int i = 0; i < totalQuest; i++) 
        {
            simulateQuestion(i); //calls simulateQuestion to start test
        }
        finalScore();//after test finishes final score can be seen
    }

    //At the end of the test display the number of correct and incorrect answers, and the percentage of the correct answers.
    private void finalScore() 
    {
        String message = "";
        message = "Here is your no. of correct answers : " + correctAns;
        message += "\n Here is your no. of wrong answers : " + wrongAns;
        message += "\n Your Percentage is : " + ((double) correctAns / totalQuest) * 100 + "%";
        JOptionPane.showMessageDialog(null, message); //shows the message
    }
}
    

