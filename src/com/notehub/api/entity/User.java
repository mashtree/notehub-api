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
public class User implements Serializable{
    private int idUser;
    private int idOnline;
    private String username;
    private String password;
    private String lastConnect;
    private String ipAddress;
    private String updatedAt;

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
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the lastConnect
     */
    public String getLastConnect() {
        return lastConnect;
    }

    /**
     * @param lastConnect the lastConnect to set
     */
    public void setLastConnect(String lastConnect) {
        this.lastConnect = lastConnect;
    }

    /**
     * @return the ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * @param ipAddress the ipAddress to set
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * @return the updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return the idOnline
     */
    public int getIdOnline() {
        return idOnline;
    }

    /**
     * @param idOnline the idOnline to set
     */
    public void setIdOnline(int idOnline) {
        this.idOnline = idOnline;
    }

    
}
