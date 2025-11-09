package entyties;


public class employees {
    private int id;
    private String role;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public employees() {
    }

    public employees(int id, String role, String name) {
        this.id = id;
        this.role = role;
        this.name = name;
    }

    public employees(String role, String name) {
        this.role = role;
        this.name = name;
    }

    @Override
    public String toString() {
        return "employees{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
