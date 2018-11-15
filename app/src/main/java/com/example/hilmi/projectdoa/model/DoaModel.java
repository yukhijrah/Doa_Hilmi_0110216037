package com.example.hilmi.projectdoa.model;

import java.io.Serializable;


public class DoaModel implements Serializable {
    private String doaTitle;
    private String doaSubtitle;
    private String doaSurah;


    public DoaModel(String doaTitle, String doaSubtitle, String doaSurah) {
        this.doaTitle = doaTitle;
        this.doaSubtitle = doaSubtitle;
        this.doaSurah = doaSurah;
    }

    public String getDoaTitle() {
        return doaTitle;
    }

    public String getDoaSubtitle() {
        return doaSubtitle;
    }

    public String getDoaSurah() {
        return doaSurah;
    }
}
