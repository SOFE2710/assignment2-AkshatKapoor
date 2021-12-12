
/***
 * Name:Akshat Kapoor
 * student number:100781511
 */


import java.util.Vector;

public class Student extends Person {
    //initializers

    private String id;
    private String  name;
    private Vector<Course> courses; // contains all courses the student is registered in


    public Student(String stdName, String stdId) { //constructors
        this.name = stdName;//store name
        this.id = stdId;    //store id
        this.courses = new Vector<Course>();

    }


    public String getName() { //returns the name
        return name;

    }

    public String getId() { //returns the id
        return id;

    }

    public void registerFor(Course course) { //check if the student is added or not

        if(!this.courses.contains(course))//if not adds the student
            this.courses.add(course);



    }




    public boolean isRegisteredInCourse(Course course) { //checks if the student is registered in tje course
        return this.courses.contains(course);

    }
    /*


*/

    public String toString() {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
if(this.courses.size() == 0){
    return this.id+"  "+this.name;
}

String courseadd="";//just store each course and display all the courses together
        for(Course course:this.courses){
           courseadd+=course.getCode()+" "+course.getNumber()+"  ";
        }

        return this.id+"  "+this.name+"\n"+"Registered courses: "+ "\n "+courseadd+" ";
    }








    }






