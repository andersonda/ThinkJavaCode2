// David Anderson
public class Person{
  public String firstName;
  public String lastName;
  public static int numberOfPeople;

  public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        numberOfPeople++;
  }

  public Person(String first) {
        this(first, null);
  }

  public String toString() {
        return firstName + " " + lastName;
  }

  public boolean equals(Object object){
    if (object instanceof Person) {
      Person p = (Person) object;
      return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName);
    }
    else return false;
  }
}
