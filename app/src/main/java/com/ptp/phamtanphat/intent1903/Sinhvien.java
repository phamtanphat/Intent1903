package com.ptp.phamtanphat.intent1903;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by KhoaPhamPC on 27/4/2018.
 */

public class Sinhvien implements Parcelable {
    private String Ten;
    private int Tuoi;

    public Sinhvien(String ten, int tuoi) {
        Ten = ten;
        Tuoi = tuoi;
    }

    protected Sinhvien(Parcel in) {
        Ten = in.readString();
        Tuoi = in.readInt();
    }

    public static final Creator<Sinhvien> CREATOR = new Creator<Sinhvien>() {
        @Override
        public Sinhvien createFromParcel(Parcel in) {
            return new Sinhvien(in);
        }

        @Override
        public Sinhvien[] newArray(int size) {
            return new Sinhvien[size];
    }
    };

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Ten);
        dest.writeInt(Tuoi);
    }
}
