public class Person {
    private String   name;


    public Person(String initialName)//return name
    {
      this.name=initialName;
    }

    public Person()
    {

    }

    public void setName( String fullName) {//set name to store full name
        this.name=fullName;

    }

    public String getName() {  //returns the name
        return this.getName();
    }

    public String toString() { //return the name if the student
        return "Person: "+this.name;

    }
}

