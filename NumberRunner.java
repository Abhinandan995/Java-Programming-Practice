import java.util.List;
class NumberRunner
{
  public static void main(String args[])
  {
    List < Integer > number = List.of(1,2,3,4,5,6,7);
    functionprocess();
   }
   public static void functionprocess()
   {
     number.Stream().foreach(element -> System.out.println(element));
    }
   }
