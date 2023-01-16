package ec.edu.espe.urecords.view;

import ec.edu.espe.urecords.model.Instructor;
import ec.edu.espe.urecords.model.NRC;
import ec.edu.espe.urecords.model.Student;
import ec.edu.espe.urecords.model.UniversityMember;
import java.util.ArrayList;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class UniversityRecords {

    public static void main(String[] args) {
        UniversityMember universityMember;
        ArrayList<NRC> courses;

        courses = new ArrayList<>();

        universityMember = new Instructor(3920.F, "Syst ang", 1, "Edison Lascano", "170093114", courses);

        System.out.println("university member -->"+universityMember);
        System.out.println("university member type-->"+universityMember.getClass().getSimpleName());
        printUniversityMember(universityMember);
        universityMember= new Student(18.5F, 1, "Stepehn Drouet", "1726952946", courses);
        printUniversityMember(universityMember);
        Student student = new Student(16.5f,2, "Justin", "1805386205", courses);
         printUniversityMember(student);
        Instructor instructor = new Instructor(2851, "sw eng", 2, "Bernardo Aldaz", "1756046452", courses);
        printUniversityMember(instructor);
    }

    public static void printUniversityMember(UniversityMember universityMember){
        System.out.println("This is a university member -->"+universityMember);
    }
}
