/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notehub.api.service;

import com.notehub.api.entity.User;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author aisyahumar
 */
public interface AuthService extends Remote{
    
    User login(User user) throws RemoteException;
    
    Boolean isLogin(User user) throws RemoteException;
    
    User logout(User user) throws RemoteException;
    
}
