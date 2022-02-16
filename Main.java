public class Main {
    private Person[] data;
   private int next;
    private int size;
    
    public Main() {
      next = 0;
      size = 100;
      data = new Person[size];
    }
    public Main(int s) {
      next = 0;
      data = new Person[s];
      size = s;
    }
    public boolean insert (Person newPerson) {
      if (next >= size)
        return false;
      data[next] = newPerson.deepCopy();
      
      if (data[next] == null)
        return false;
      next = next + 1;
      return true;
    }
    public Person fetch(String targetKey) {
      Person person;
      Person temp;
      int i = 0;
      while (i < next && !(data[i].compareTo(targetKey) == 0))
      { i++;
      }
      if (i == next)
        return null;
      person = data[i].deepCopy();
      if (i != 0)
      {
        temp = data[i -1];
        data[i -1] = data[i];
        data[i] = temp;
      }
      return person;
    }
  public boolean delete(String targetKey) {
    int i = 0;
    while(i < next && !(data[i].compareTo(targetKey) == 0)) {
      i++;
    }
    if(i == next)
      return false;
    data[i] = data[next -1];
    data[next - 1] = null;
    next = next - 1;
    return true;
  }
    public boolean update(String targetKey, Person newPerson) {
      if(delete(targetKey) == false)
        return false;
      else if(insert(newPerson) == false)
        return false;
      else
        return true;
    }
  public void showAll() {
    for (int i = 0; i < next; i++)
     System.out.println(data[i].toString()); 
  }
}
