// David Anderson
public class Person {
  public String firstName; // should probably be private, we will talk about this later!
  public String lastName; // should probably be private, we will talk about this later!
  public static int numberOfPeople; // should probably be private, we will talk about this later!

  public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        numberOfPeople++;
  }

  @Override
  public String toString() {
        return firstName + " " + lastName;
  }

  @Override
  public boolean equals(Object object){
    if (object instanceof Person) {
      Person p = (Person) object;
      return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName);
    }
    else return false;
  }
}
