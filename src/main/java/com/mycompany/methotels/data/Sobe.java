/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.data;

import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author BASKETBALL IN HEART
 */
public class Sobe {
    private String imeSobe;
    private String sprat;
    private boolean tv;
    private boolean internet;
    private boolean djakuzi;
    
    @Inject
    public Sobe() {
    }

    public Sobe(String imeSobe, String sprat, boolean tv, boolean internet, boolean djakuzi) {
        this.imeSobe = imeSobe;
        this.sprat = sprat;
        this.tv = tv;
        this.internet = internet;
        this.djakuzi = djakuzi;
    }

    public String getImeSobe() {
        return imeSobe;
    }

    public void setImeSobe(String imeSobe) {
        this.imeSobe = imeSobe;
    }

    public String getSprat() {
        return sprat;
    }

    public void setSprat(String sprat) {
        this.sprat = sprat;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isDjakuzi() {
        return djakuzi;
    }

    public void setDjakuzi(boolean djakuzi) {
        this.djakuzi = djakuzi;
    }
    
    
}
