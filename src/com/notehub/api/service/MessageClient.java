/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notehub.api.service;

import com.notehub.api.entity.Note;
import com.notehub.api.entity.NoteChangesMap;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author triyono
 */
public interface MessageClient extends Remote{
    
    void retrieveVersionMessage(String message, int noteID) throws RemoteException;
    
    void retrieveNoteChanges(Note note, List<NoteChangesMap> noteChangesMap) throws RemoteException;
}
