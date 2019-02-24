package Business.Organisation;

import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectiory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

public abstract class Organisation {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectiory userAccountDirectory;
    private Enterprise enterprise;
    private int organisationID;
    private static int counter=0;
    
    public enum Type{
       
        Admin("Admin Organization"), Hospital("Hospital Organization"), AvailabiltyOrgHospital("AvailableHospitalOganisation"),Police("Police Department"),Fire("FireDepartment"),BloodBank("Blood Bank"),RequestRehab("Request Rehab"),RequestReport("Request Report"),AvailabiltyOrgFire("AvailableFireOganisation"),FireRehabRequest("FireRehabRequestOrganisation");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organisation(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectiory();
        organisationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectiory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganisationID() {
        return organisationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}

