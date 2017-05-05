/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notehub.api.service;

import com.notehub.api.entity.NoteChange;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author aisyahumar
 */
public interface Git extends Remote{
    
    /**
     * push note for the first time to server
     * @param noteName
     * @throws RemoteException 
     */
    public void push(String noteName) throws RemoteException;
    
    /**
     * pull change from server
     * @param noteName
     * @return
     * @throws RemoteException 
     */
    public List<NoteChange> pull(String noteName) throws RemoteException;
    
    /**
     * is note has images
     * @param noteName
     * @return
     * @throws RemoteException 
     */
    public boolean isHaveImages(String noteName) throws RemoteException;
    
    /**
     * commit change to server
     * @param nc
     * @param noteName
     * @throws RemoteException 
     */
    public void commit(NoteChange nc, String noteName) throws RemoteException;
    
}
