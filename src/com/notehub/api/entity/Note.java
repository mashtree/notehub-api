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
public class Note implements Serializable{
    
    private int idNote;
    private String noteTitle;
    private String description;
    private int owner;
    private String content;
    private String institution;
    private String institutionAddress;
    private String createdAt;

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
     * @return the noteTitle
     */
    public String getNoteTitle() {
        return noteTitle;
    }

    /**
     * @param noteTitle the noteTitle to set
     */
    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the owner
     */
    public int getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(int owner) {
        this.owner = owner;
    }

    /**
     * @return the institution
     */
    public String getInstitution() {
        return institution;
    }

    /**
     * @param institution the institution to set
     */
    public void setInstitution(String institution) {
        this.institution = institution;
    }

    /**
     * @return the institutionAddress
     */
    public String getInstitutionAddress() {
        return institutionAddress;
    }

    /**
     * @param institutionAddress the institutionAddress to set
     */
    public void setInstitutionAddress(String institutionAddress) {
        this.institutionAddress = institutionAddress;
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
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }
    
    
}
