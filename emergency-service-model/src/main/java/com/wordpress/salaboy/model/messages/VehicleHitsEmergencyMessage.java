/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.model.messages;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author esteban
 */
public class VehicleHitsEmergencyMessage implements Serializable {
    private Long vehicleId;
    private Long callId;
    private Date time;

    public VehicleHitsEmergencyMessage(Long vehicleId, Long callId, Date time) {
        this.vehicleId = vehicleId;
        this.callId = callId;
        this.time = time;
    }

    public Long getCallId() {
        return callId;
    }

    public void setCallId(Long emergecyId) {
        this.callId = emergecyId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    
}
