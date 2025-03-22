package com.example.covid_19.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Summary implements Serializable {

    @SerializedName("total_cases")
    @Expose
    String total_cases;

    @SerializedName("active_cases")
    @Expose
    String active_cases;

    @SerializedName("deaths")
    @Expose
    String deaths;

    @SerializedName("recovered")
    @Expose
    String recovered;

    @SerializedName("critical")
    @Expose
    String critical;

    public String getTotal_cases() {
        return total_cases;
    }

    public void setTotal_cases(String total_cases) {
        this.total_cases = total_cases;
    }

    public String getActive_cases() {
        return active_cases;
    }

    public void setActive_cases(String active_cases) {
        this.active_cases = active_cases;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    private static Summary instance;

    private Summary(){}

    public static Summary getInstance(){
        if (instance==null){
            instance = new Summary();
        }
        return instance;
    }


}
