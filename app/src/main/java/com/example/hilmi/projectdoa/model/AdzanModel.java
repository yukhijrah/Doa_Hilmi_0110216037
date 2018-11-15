package com.example.hilmi.projectdoa.model;

/**
 * Created by hilmi on 15/11/18.
 */

public class AdzanModel {
    private String jadwal;
    private String waktu;

    /* *Constructor * Menginisialisasikan Variable  */
    public AdzanModel(String jadwal, String waktu) {
        this.jadwal = jadwal;
        this.waktu = waktu;
    }

    public String getJadwal() {
        return jadwal;
    }

    public String getWaktu() {
        return waktu;
    }
}
