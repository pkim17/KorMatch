public class Profile {

    private String name;
    private int age;
    private int height;
    private String location;
    private String occupation;
    private int salary;
    private double totalMatchPoint;

    public Profile() {
    }

    public Profile(String name, int age, int height, String location, String occupation, int salary, double totalMatchPoint) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.location = location;
        this.occupation = occupation;
        this.salary = salary;
        this.totalMatchPoint = totalMatchPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getTotalMatchPoint() {
        return totalMatchPoint;
    }

    public void setTotalMatchPoint(double totalMatchPoint) {
        this.totalMatchPoint = totalMatchPoint;
    }
}
