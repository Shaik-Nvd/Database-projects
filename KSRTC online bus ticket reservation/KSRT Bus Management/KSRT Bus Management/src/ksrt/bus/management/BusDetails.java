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
@Table(name = "bus_details", catalog = "BusReservation", schema = "")
@NamedQueries({
    @NamedQuery(name = "BusDetails.findAll", query = "SELECT b FROM BusDetails b")
    , @NamedQuery(name = "BusDetails.findById", query = "SELECT b FROM BusDetails b WHERE b.id = :id")
    , @NamedQuery(name = "BusDetails.findByBusNo", query = "SELECT b FROM BusDetails b WHERE b.busNo = :busNo")
    , @NamedQuery(name = "BusDetails.findByBusSrc", query = "SELECT b FROM BusDetails b WHERE b.busSrc = :busSrc")
    , @NamedQuery(name = "BusDetails.findByBusDest", query = "SELECT b FROM BusDetails b WHERE b.busDest = :busDest")
    , @NamedQuery(name = "BusDetails.findByMovement", query = "SELECT b FROM BusDetails b WHERE b.movement = :movement")
    , @NamedQuery(name = "BusDetails.findByDate", query = "SELECT b FROM BusDetails b WHERE b.date = :date")
    , @NamedQuery(name = "BusDetails.findByTime", query = "SELECT b FROM BusDetails b WHERE b.time = :time")
    , @NamedQuery(name = "BusDetails.findByPrice", query = "SELECT b FROM BusDetails b WHERE b.price = :price")
    , @NamedQuery(name = "BusDetails.findBySeat", query = "SELECT b FROM BusDetails b WHERE b.seat = :seat")})
public class BusDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Bus_No")
    private String busNo;
    @Basic(optional = false)
    @Column(name = "Bus_Src")
    private String busSrc;
    @Basic(optional = false)
    @Column(name = "Bus_Dest")
    private String busDest;
    @Basic(optional = false)
    @Column(name = "Movement")
    private String movement;
    @Basic(optional = false)
    @Column(name = "Date")
    private String date;
    @Basic(optional = false)
    @Column(name = "Time")
    private String time;
    @Basic(optional = false)
    @Column(name = "Price")
    private int price;
    @Basic(optional = false)
    @Column(name = "Seat")
    private int seat;

    public BusDetails() {
    }

    public BusDetails(Integer id) {
        this.id = id;
    }

    public BusDetails(Integer id, String busNo, String busSrc, String busDest, String movement, String date, String time, int price, int seat) {
        this.id = id;
        this.busNo = busNo;
        this.busSrc = busSrc;
        this.busDest = busDest;
        this.movement = movement;
        this.date = date;
        this.time = time;
        this.price = price;
        this.seat = seat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        String oldBusNo = this.busNo;
        this.busNo = busNo;
        changeSupport.firePropertyChange("busNo", oldBusNo, busNo);
    }

    public String getBusSrc() {
        return busSrc;
    }

    public void setBusSrc(String busSrc) {
        String oldBusSrc = this.busSrc;
        this.busSrc = busSrc;
        changeSupport.firePropertyChange("busSrc", oldBusSrc, busSrc);
    }

    public String getBusDest() {
        return busDest;
    }

    public void setBusDest(String busDest) {
        String oldBusDest = this.busDest;
        this.busDest = busDest;
        changeSupport.firePropertyChange("busDest", oldBusDest, busDest);
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        String oldMovement = this.movement;
        this.movement = movement;
        changeSupport.firePropertyChange("movement", oldMovement, movement);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        String oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        int oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        int oldSeat = this.seat;
        this.seat = seat;
        changeSupport.firePropertyChange("seat", oldSeat, seat);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusDetails)) {
            return false;
        }
        BusDetails other = (BusDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ksrt.bus.management.BusDetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
