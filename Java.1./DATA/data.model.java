package com.example.covid_19.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DataModel implements Serializable {

//    properties

    @SerializedName("status")
    @Expose
    String status;
    private Data data;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    private static DataModel instance;

    private DataModel() {}

    public static DataModel getInstance(){
        if (instance == null)
            instance = new DataModel();

        return instance;
    }


}
