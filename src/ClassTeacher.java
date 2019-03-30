public class ClassTeacher extends Teacher {
    protected String classId;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public ClassTeacher(int id, String name, String surname, String field, String classId) {
        super(id, name, surname, field);
        this.classId = classId;
    }

    public String toString()
    {
        return super.toString() + " Class: " + classId;
    }

    public void showPrivilegedData(ClassTeacher other)
    {
        int privilegedId;
        String privilegedClass;
        if(this.classId.compareTo(other.classId) <0)
        {
            privilegedId = this.id;
            privilegedClass = this.classId;

        }
        else
        {
            privilegedId = other.id;
            privilegedClass = other.classId;
        }
        System.out.println("More privileged class teacher's id" + privilegedId + ", class " + privilegedClass);
    }
}
