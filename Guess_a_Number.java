import java.util.Random;
import java.util.Scanner;

 class Guess_a_Number{
    public int number;
    public int inputnumber;
    public int noofgusess=0;
    Guess_a_Number()
    {
        Random ran=new Random();
        this.number=ran.nextInt(10);
    }
    public void takeuserinput()
    {
        System.out.println("GUSESS THE NUMBER");
        Scanner s=new Scanner(System.in);
        inputnumber=s.nextInt();
    }
    boolean iscorrectnumber()
    {
        noofgusess++;
        if(inputnumber==number)
        {
            System.out.printf("YES YOU GUSESS THE RIGHT NUMBER %d \n " +
                    "You pick it on %d attempt \n",number,noofgusess);
            return true;
        }
        else if (inputnumber<number)
        {
            System.out.println("TOO LOW......");
        }
        else if (inputnumber>number)
        {
            System.out.println("TOO HIGH.......");
        }

        return false;
    }
}
class Guess
{
    public static void main(String[] args) {
        Guess_a_Number g=new Guess_a_Number();
        Boolean b=false;
        while (!b)
        {
            g.takeuserinput();
            b = g.iscorrectnumber();
            System.out.println(b);
        }
    }
}