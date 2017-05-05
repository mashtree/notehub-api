/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notehub.api.service;

import com.notehub.api.entity.Note;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author aisyahumar
 */
public interface NotesService extends Remote{
    
    Note insertNote(Note note) throws RemoteException;
    
    void updateNote(Note note) throws RemoteException;
    
    void deleteNote(int idNote) throws RemoteException;
    
    void deleteNote(Note note) throws RemoteException;
    
    Note getNote(long id) throws RemoteException;
    
    List<Note> getNotes() throws RemoteException;
    
    int isAvailable(int UID, String note) throws RemoteException;
    
    int isAvailable(int UID, int noteID) throws RemoteException;
}
