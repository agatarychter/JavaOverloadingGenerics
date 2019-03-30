public class Teacher extends Employee {
    protected String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String toString()
    {
        return super.toString() + " Field: " + field;
    }

    public Teacher(int id, String name, String surname, String field) {
        super(id, name, surname);
        this.field = field;
    }

    public void showPrivilegedData(Teacher other)
    {
        int privilegedId;
        String privilegedField;
        if(this.field.compareTo(other.field) <0)
        {
            privilegedId = this.id;
            privilegedField = this.field;

        }
        else
        {
            privilegedId = other.id;
            privilegedField = other.field;
        }
        System.out.println("More privileged teacher's id " + privilegedId + ",field " + privilegedField );
    }
}
