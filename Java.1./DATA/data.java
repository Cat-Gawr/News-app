package com.example.covid_19.data;

import java.io.Serializable;

public class Data implements Serializable {

    private Summary summary;

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    private static Data instance;

    private Data() {}

    public static Data getInstance(){
        if (instance == null)
            instance = new Data();

        return instance;
    }

}
