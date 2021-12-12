


import java.util.Random;
import java.util.Vector;


public class Department {
    private String name; // the name of school Dept of Computing and Info Science
    private String id; // short name for courses SOFE, ELEE, STAT, etc
    private Vector<Course> courseList; // all courses offered by the department
    private Vector<Student> registerList; // all students taking courses in the department.




    public Department(String name, String id) { //constructor
        // also initialize the vectors
        this.name=name;
        this.id=id;
        this.courseList=new Vector<Course>();
        this.registerList=new Vector<Student>();


    }


    public void offerCourse(Course course) {//offer course adds the courses to the course list we made in the
       //add courses to the vector array
        this.courseList.add(course);


    }


    public void printCoursesOffered() {    //Display all the courses offered by department
        for (Course course : this.courseList) { //cycle though the course list, which contains all the courses and stores the courses
            System.out.println(course);  //display the courses
        }
    }


    public void registerStudentCourseInDepartment(Student student,Course course){  // method to add courses and students


        if(!this.courseList.contains(course)){ //checks if the course is in the list, if not
            this.courseList.add(course);       // add it
        }
        if(!this.registerList.contains(student)){ //check if the student is registered , if not
            this.registerList.add(student);       // it adds it
        }

    }


    public void printStudentsByName(){  //method to display list of the students in the course


    for(Student register : registerList)       //for loop which go through the students in the register list
        System.out.println(register.toString()); // use student toString to display the info of the students registered in the courses
}




    public String getName() { //get method returning name
         return this.name;

    }


    public String getId() { //get method returning ID
            return this.id;
    }



    public boolean isStudentRegistered(Student student){     //method to check if student is registered in a course
        return this.registerList.contains(student);      // check if the List contains the student, if then returns true,else false

}

    public Vector StudentsRegisteredInCourse(int code) {   //Method to return the students in the course
        Vector<Student> studentList=new Vector<>();                  //Vector created to store the students
        for( Course c:courseList){                        //loop go thorug the courses in the course list
            if(c.getNumber()==code){                      //check if the code user put matches the course number
              studentList= c.getList();                                  //s vector stores the student using oh() method which returns classList
            }
        }
             return studentList;                                    //returns the students stored in the course

    }


    public void printStudentsRegisteredInCourse(int code){           //method to display the student in a specific course
        Vector<Student>classList = StudentsRegisteredInCourse(code); //List created to store the students in the course using StudentsRegisteredInCourse
                                                                     //method
        for(Student information:classList){                                    //For loop to cycle though all the students in the classList.

            System.out.println(information.getName()+" "+information.getId());           //prints the student info.
        }

            }




            public Course largestCourse() { //find the largest course

                Vector<Student> StudentList;   //define a list to store no of students in the classlist
                Course hold, largenumber = null;  //defining course variables to use them to take store list from course class
                int maximum = 0;                   // use to store max class list size

                for(int i = 0; i<courseList.size(); i++){ //loop to access all the courses in the course list and in classlist
                    hold = courseList.elementAt(i);       //to store courses from the course list
                    StudentList = hold.getList();             //StudentList to store the elements in class list
                    if(maximum <= StudentList.size()){       //if condition to compare the max from the size, if it is less than swap
                        maximum =  StudentList.size();      //stores the size of the list.
                        largenumber = hold;                //largenum stores the course which is big
                    }

                }
                return largenumber;


                    }


                    public String toString() {
        // returns a string representation of department name, number
        // of courses offered and number of students registered in the
        // department. Use the format:
        // ECSE: 53 courses, 460 students

        return this.name+": "+String.valueOf(this.courseList.size())+"courses, "+ String.valueOf(this.registerList.size())+"  Students";



    }



}

