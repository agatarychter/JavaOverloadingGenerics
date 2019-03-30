public class Employee {
    protected int id;
    protected String name;
    protected String surname;

    public Employee(int id, String name, String surname)
    {
        this.id = id;
        this.surname = surname;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString()
    {
        return "ID: " + id + " Surname: " + surname + " Name: " + name;
    }

    public void showPrivilegedData(Employee other)
    {
        int privilegedId = this.id < other.id ? this.id : other.id;
        System.out.println("More privileged employee's id " + privilegedId);
    }
}
