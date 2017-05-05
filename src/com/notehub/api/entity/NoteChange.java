/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notehub.api.entity;

import java.io.Serializable;

/**
 *
 * @author aisyahumar
 */
public class NoteChange implements Serializable{
    
    private int idNoteChange;
    private int idUser;
    private int idNote;
    private int rowChange;
    private int version;
    private String old;
    private String newChanges;
    private String changeType;
    private String createdAt;

    /**
     * @return the idNoteChange
     */
    public int getIdNoteChange() {
        return idNoteChange;
    }

    /**
     * @param idNoteChange the idNoteChange to set
     */
    public void setIdNoteChange(int idNoteChange) {
        this.idNoteChange = idNoteChange;
    }

    /**
     * @return the idUser
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the idNote
     */
    public int getIdNote() {
        return idNote;
    }

    /**
     * @param idNote the idNote to set
     */
    public void setIdNote(int idNote) {
        this.idNote = idNote;
    }

    /**
     * @return the rowChange
     */
    public int getRowChange() {
        return rowChange;
    }

    /**
     * @param rowChange the rowChange to set
     */
    public void setRowChange(int rowChange) {
        this.rowChange = rowChange;
    }

    /**
     * @return the old
     */
    public String getOld() {
        return old;
    }

    /**
     * @param old the old to set
     */
    public void setOld(String old) {
        this.old = old;
    }

    /**
     * @return the newChanges
     */
    public String getNewChanges() {
        return newChanges;
    }

    /**
     * @param newChanges the newChanges to set
     */
    public void setNewChanges(String newChanges) {
        this.newChanges = newChanges;
    }

    /**
     * @return the createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the version
     */
    public int getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * @return the changeType
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * @param changeType the changeType to set
     */
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }
    
    
    
    
}
