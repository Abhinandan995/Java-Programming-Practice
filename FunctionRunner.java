import java.util.List;
class FunctionRunner
{
  public static void main(String args[])
  {
    List <Integers> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
    checking(numbers);
   }
   public static void checking(List <Integer> numbers)
   {
    numbers.Stream().filter(elements -> elements%2 == 1).foreach(elements -> System.out.println(elements));\\ for odd numbers
    \\ for even the syntax will be: -  element -> elements%2 == 0.
   }
  }
