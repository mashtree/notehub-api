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

/**
 *
 * @author triyono
 */
public interface MessageServerService extends Remote{
    
    void registerUser(int UID, MessageClient messageClient) throws RemoteException;
    
    void removeRegisterUser(int key)  throws RemoteException;
    
    void broadcastMessage(String message, int noteID) throws RemoteException;
    
    void broadcastNoteChanges(Note note, NoteChangesMap noteChangesMap) throws RemoteException; 
}
