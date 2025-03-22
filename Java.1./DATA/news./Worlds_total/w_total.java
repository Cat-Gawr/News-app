package com.example.covid_19.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class World_Total implements Serializable {

    @SerializedName("total_cases")
    @Expose
    String total_cases;

    @SerializedName("total_deaths")
    @Expose
    String total_deaths;

    @SerializedName("total_recovered")
    @Expose
    String total_recovered;

    @SerializedName("active_cases")
    @Expose
    String active_cases;

    @SerializedName("serious_critical")
    @Expose
    String serious_critical;

    public String getTotal_cases() {
        return total_cases;
    }

    public void setTotal_cases(String total_cases) {
        this.total_cases = total_cases;
    }

    public String getTotal_deaths() {
        return total_deaths;
    }

    public void setTotal_deaths(String total_deaths) {
        this.total_deaths = total_deaths;
    }

    public String getTotal_recovered() {
        return total_recovered;
    }

    public void setTotal_recovered(String total_recovered) {
        this.total_recovered = total_recovered;
    }

    public String getActive_cases() {
        return active_cases;
    }

    public void setActive_cases(String active_cases) {
        this.active_cases = active_cases;
    }

    public String getSerious_critical() {
        return serious_critical;
    }

    public void setSerious_critical(String serious_critical) {
        this.serious_critical = serious_critical;
    }

}v
