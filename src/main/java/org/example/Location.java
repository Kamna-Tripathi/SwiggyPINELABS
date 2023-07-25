package org.example;

public class Location {
    String restroId;
    int lati;
    int lony;

    public void setRestroId(String restroId) {
        this.restroId = restroId;
    }

    public void setLati(int lati) {
        this.lati = lati;
    }

    public void setLony(int lony) {
        this.lony = lony;
    }

    public String getRestroId() {
        return restroId;
    }

    public int getLati() {
        return lati;
    }

    public int getLony() {
        return lony;
    }

    @Override
    public String toString()
    {
        return "Location{" +
                "restroId='" + restroId + '\'' +
                ", lati=" + lati +
                ", lony=" + lony +
                '}';
    }


}
