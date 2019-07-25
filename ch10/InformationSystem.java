// David Anderson
public class InformationSystem{
  public static void main(String[] args){
    Person p = new Person("David", "Anderson");
    Person p2 = new Person("Hello", "World");
    System.out.println(p.firstName);
    System.out.println(Person.numberOfPeople);
    System.out.println(p);
  }
}
