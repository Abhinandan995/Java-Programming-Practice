import java.util.List;
class MapRunner
{
  public static void main(String args[])
  {
    List <Integers> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
    Squaring(numbers);
   }
   public static void Squaring(List <Integer> numbers)
   {
    numbers.Stream().map(element -> element*element).foreach(elements -> System.out.println(elements));
   }
  }
