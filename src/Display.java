import java.util.LinkedList;
import java.util.List;

public class Display {
    public static void getEmployeeData(Container<? extends Employee> container)
    {
        for (Employee employee: container.getList()
             ) {
            System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSurname());
        }
    }

    public static void getTeacherData(Container<? extends Teacher> container)
    {
        for (Teacher teacher: container.getList()
        ) {
            System.out.println(teacher.getId() + " " + teacher.getName() + " " + teacher.getSurname() + " " + teacher.getField());
        }
    }

    public static void getClassTeacherData(Container<ClassTeacher> container)
    {
        for (ClassTeacher classTeacher: container.getList()
        ) {
            System.out.println(classTeacher.getId() + " " + classTeacher.getName() + " "
                    + classTeacher.getSurname() + " " + classTeacher.getField() + " " + classTeacher.getClassId());
        }
    }


    public static void main(String[] args)
    {
        List<Employee> employees = new LinkedList<>();
        List<Teacher> teachers = new LinkedList<>();
        List<ClassTeacher> classTeachers = new LinkedList<>();

        employees.add(new Employee(1,"Joshua","Smith"));
        employees.add(new Employee(2,"Mark","Slone"));

        teachers.add(new Teacher(3,"Meredith","Grey","math"));
        teachers.add(new Teacher(4,"Lexi","Grey","P.E."));

        classTeachers.add(new ClassTeacher(5,"Derek","Shepard","biology","IA"));
        classTeachers.add(new ClassTeacher(6,"Amelia","Wilson","chemistry","IB"));


        Container<Employee> employeeContainer = new Container<>(employees);
        Container<Teacher> teacherContainer = new Container<>(teachers);
        Container<ClassTeacher> classTeacherContainer = new Container<>(classTeachers);

        getEmployeeData(employeeContainer);
        getEmployeeData(teacherContainer);
        getEmployeeData(classTeacherContainer);

//        getTeacherData(employeeContainer); //compilation error
        getTeacherData(teacherContainer);
        getTeacherData(classTeacherContainer);

//        getClassTeacherData(employeeContainer);//compilation error
//        getClassTeacherData(teacherContainer);//compilation error
        getClassTeacherData(classTeacherContainer);

        Employee employee = new Employee(5,"Matthew","Stark");
        Employee employeeTeacher = new Teacher(6,"John","Dark","chemistry");
        Employee employeeClassTeacher = new ClassTeacher(7,"Susannah","Lannister","history","IIIA");

        Teacher teacher = new Teacher(8,"Christopher","Sin","math");
        Teacher teacherClassTeacher = new ClassTeacher(9,"Patrick","Swan","history","IIIB");

        ClassTeacher classTeacher = new ClassTeacher(10,"Amanda","Maison","arts","IVC");

        employee.showPrivilegedData(employeeTeacher); // should print employee id 5
        employee.showPrivilegedData(employee); //should print employee id 5
        employee.showPrivilegedData(teacher); // should print employee id 5
        employee.showPrivilegedData(classTeacher);// should print employee 5

        teacher.showPrivilegedData(teacher); //should print teacher id 8 field math
        teacher.showPrivilegedData(employeeTeacher); // should print employee id 6
        teacher.showPrivilegedData(teacherClassTeacher);// should print teacher 7 field history
        teacher.showPrivilegedData(classTeacher); // should print teacher id 10 field arts

        classTeacher.showPrivilegedData(classTeacher);// should print class teacher id 10 class IV C
        classTeacher.showPrivilegedData(teacher); // should print teacher id 10 field arts
        classTeacher.showPrivilegedData(employee); //should print employee id 5

        //wywolania w ktorych referencja rozni sie od faktycznego typu
        System.out.println("Wywolania w których typ referencji rozni sie od faktycznego typu obiektu");

        employeeTeacher.showPrivilegedData(teacher); //should print employee id 6
        employeeClassTeacher.showPrivilegedData(classTeacher); //should print employee id 7

        teacherClassTeacher.showPrivilegedData(classTeacher); //should print teacher id 10 arts

    }
}
