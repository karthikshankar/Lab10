/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     * Name string variable.
     */
    private String name;

    /**
     * manager String variable.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param employeeName variable.
     * @param employeeManager variable.
     */
    public Employee(final String employeeName, final String employeeManager) {
        this.name = employeeName;
        this.manager = employeeManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param employeeName variable.
     */
    public void setName(final String employeeName) {
        this.name = employeeName;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param employeeManager variable.
     */
    public void setManager(final String employeeManager) {
        this.manager = employeeManager;
    }
}
