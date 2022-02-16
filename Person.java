import java.util.Scanner;

public class Person {
private String name;
 private String height;
  private String weight;
  public Person(String n, String h, String w) {
    name = n;
    height = h;
    weight = w;
  }
  public String toString() {
    return ("Name is " + name +
            "\nHeight is " + height +
            "\nWeight is " + weight + "\n");
  }
  public Person deepCopy() {
    Person clone = new Person(name, height, weight);
    return clone;
  }
  public int compareTo(String targetKey) {
    return(name.compareTo(targetKey));
  }
  public void setHeight(String h) {
    height = h;
  }
   public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    System.out.print("What is the Person's Name?");
    String name = scanner.nextLine();
    System.out.print("What is the Person's Height?");
    String height = scanner.nextLine();
    System.out.print("What is the Person's Weight?");
    String weight = scanner.nextLine();
    System.out.print("The Person's Name is " + name + "The Person's Height is " + height + "The Person's Weight is " + weight);
  	}
}
