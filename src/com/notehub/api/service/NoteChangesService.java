/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notehub.api.service;

import com.notehub.api.entity.Note;
import com.notehub.api.entity.NoteChange;
import com.notehub.api.entity.NoteChangesMap;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author aisyahumar
 */
public interface NoteChangesService extends Remote{
    
    //NoteChange insertNoteChange(NoteChange nc) throws RemoteException;
    
    NoteChangesMap insertNoteChange(NoteChangesMap nc) throws RemoteException;

    void updateNoteChange(NoteChange nc) throws RemoteException;
    
    void deleteNoteChanges(Note note) throws RemoteException;
    
    NoteChange getNoteChange(long l) throws RemoteException;
    
    List<NoteChange> getNoteChanges(long l) throws RemoteException;
    
    List<NoteChange> getNoteChanges(Note note) throws RemoteException;
    
    List<NoteChange> getNoteChanges(Note note, int UID) throws RemoteException;
    
    int getLastVersion(Note note, int UID) throws RemoteException;
    
    List<NoteChangesMap> getNoteChangesMap(Note note, int UID, int startingVersion) throws RemoteException;
    
    
}
