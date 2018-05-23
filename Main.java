import java.util.NoSuchElementException;

public class Main
{


    public static void main(String[] args)
    {
    LinkedIntList linkedIntList = new LinkedIntList();
    LinkedIntList emptyLinkedIntList = new LinkedIntList();

        linkedIntList.add(1);
        linkedIntList.add(2);
        linkedIntList.add(3);
        linkedIntList.add(4);
        linkedIntList.add(5);
        linkedIntList.add(6);
        linkedIntList.add(100);

        System.out.println(max(linkedIntList));
        System.out.println(max(emptyLinkedIntList));

    }

    public static int max (LinkedIntList linkedIntList)
    {
        ListNode current = linkedIntList.getFront();
        int max = 0;
        int size = linkedIntList.size();

        if(current==null)
        {
            throw new NoSuchElementException();
        }
        else
        {


            for (int i = 0; i < size; i++)

            {
                if (current.data > max)
                {
                    max = current.data;
                }

                current = current.next;
            }
            return max;
        }

    }

}
