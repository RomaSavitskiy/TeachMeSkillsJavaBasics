package teachmeskills.lesson2;

public class VariablesClass
{

    public void FindIntValue()
    {
        int V1 = 1120;
        short V2 = 301;
        byte V3 = 2;
        long V4 = 100000;
        boolean flag = false;

        V4 = V1 / V2 * V3 + V4;

        if (V4 > 100)
        {
            flag = true;
        }

        if (flag == true){
            System.out.println("Above");
        }
        else
        {
            System.out.println("Not above");
        }

    }

    public void FindFloatValue()
    {
        float V1 = 0.0001f;
        double V2 = 0.0001;
        V2 = V1 + V2;
        System.out.println(V2);
    }

    public void FindCharValue()
    {
        char V1 = 'A';
        char V2 = 'j';
        int  V3;
        V3 = V2 - V1;
        System.out.println((char)V3);
    }
}
