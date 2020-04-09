/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksrt.bus.management;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author HP PC
 */
@Entity
@Table(name = "driver", catalog = "BusReservation", schema = "")
@NamedQueries({
    @NamedQuery(name = "Driver.findAll", query = "SELECT d FROM Driver d")
    , @NamedQuery(name = "Driver.findByEmpid", query = "SELECT d FROM Driver d WHERE d.empid = :empid")
    , @NamedQuery(name = "Driver.findByName", query = "SELECT d FROM Driver d WHERE d.name = :name")
    , @NamedQuery(name = "Driver.findBySalary", query = "SELECT d FROM Driver d WHERE d.salary = :salary")
    , @NamedQuery(name = "Driver.findByAge", query = "SELECT d FROM Driver d WHERE d.age = :age")
    , @NamedQuery(name = "Driver.findByBus", query = "SELECT d FROM Driver d WHERE d.bus = :bus")})
public class Driver implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "empid")
    private Integer empid;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "salary")
    private int salary;
    @Basic(optional = false)
    @Column(name = "age")
    private int age;
    @Basic(optional = false)
    @Column(name = "bus")
    private String bus;

    public Driver() {
    }

    public Driver(Integer empid) {
        this.empid = empid;
    }

    public Driver(Integer empid, String name, int salary, int age, String bus) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.bus = bus;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        Integer oldEmpid = this.empid;
        this.empid = empid;
        changeSupport.firePropertyChange("empid", oldEmpid, empid);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        int oldSalary = this.salary;
        this.salary = salary;
        changeSupport.firePropertyChange("salary", oldSalary, salary);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        String oldBus = this.bus;
        this.bus = bus;
        changeSupport.firePropertyChange("bus", oldBus, bus);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empid != null ? empid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Driver)) {
            return false;
        }
        Driver other = (Driver) object;
        if ((this.empid == null && other.empid != null) || (this.empid != null && !this.empid.equals(other.empid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ksrt.bus.management.Driver[ empid=" + empid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
