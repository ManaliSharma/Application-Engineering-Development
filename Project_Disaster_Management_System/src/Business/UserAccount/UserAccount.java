/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;


/**
 *
 * @author rusha
 */
public class UserAccount {
    
    private String username;
    private String password;
      private Role role;
       private WorkQueue workQueue;

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    private Employee employee;
    
    
    
    @Override
    public String toString() {
        return username;
    }
    
}
