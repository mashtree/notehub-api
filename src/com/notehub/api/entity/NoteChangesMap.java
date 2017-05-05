/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notehub.api.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aisyahumar
 */
public class NoteChangesMap implements Serializable{
    
    private int version;
    
    private final Map<Integer, NoteChange> noteChangesMap = new HashMap<>();

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
     * @return the noteChangesMap
     */
    public Map<Integer, NoteChange> getNoteChangesMap() {
        return noteChangesMap;
    }
    
    /**
     * 
     * @param key
     * @param noteChange 
     */
    public void setNoteChange(int key, NoteChange noteChange){
        noteChangesMap.put(key, noteChange);
    }
    
    public int getNumberOfChanges(){
        return noteChangesMap.size();
    }
    
}
