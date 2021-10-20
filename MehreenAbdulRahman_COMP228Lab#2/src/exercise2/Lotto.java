package exercise2;

public class Lotto
{
    //array to hold numbers
    private int[] array;
    
    public Lotto()
    {
        array = new int[3];
        for (int i = 0; i <3 ; i++)
        {
            int number = (int) (Math.random() * (9 - 1)+ 1);
            array[i] = number;
        }
    }

    //get array
    public int[] getArray()
    {
        return array;
    }
}

