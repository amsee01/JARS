
package com.amanladia.jars.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2019-09-13T23:05+0530")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Vehicle$$Parcelable
    implements Parcelable, ParcelWrapper<com.amanladia.jars.model.Vehicle>
{

    private com.amanladia.jars.model.Vehicle vehicle$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Vehicle$$Parcelable.Creator$$11 CREATOR = new Vehicle$$Parcelable.Creator$$11();

    public Vehicle$$Parcelable(android.os.Parcel parcel$$0) {
        com.amanladia.jars.model.Vehicle vehicle$$2;
        if (parcel$$0 .readInt() == -1) {
            vehicle$$2 = null;
        } else {
            vehicle$$2 = readcom_amanladia_jars_model_Vehicle(parcel$$0);
        }
        vehicle$$0 = vehicle$$2;
    }

    public Vehicle$$Parcelable(com.amanladia.jars.model.Vehicle vehicle$$4) {
        vehicle$$0 = vehicle$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (vehicle$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_amanladia_jars_model_Vehicle(vehicle$$0, parcel$$1, flags);
        }
    }

    private com.amanladia.jars.model.Vehicle readcom_amanladia_jars_model_Vehicle(android.os.Parcel parcel$$2) {
        com.amanladia.jars.model.Vehicle vehicle$$1;
        vehicle$$1 = new com.amanladia.jars.model.Vehicle();
        vehicle$$1 .name = parcel$$2 .readString();
        vehicle$$1 .iconUrl = parcel$$2 .readString();
        vehicle$$1 .type = parcel$$2 .readString();
        return vehicle$$1;
    }

    private void writecom_amanladia_jars_model_Vehicle(com.amanladia.jars.model.Vehicle vehicle$$3, android.os.Parcel parcel$$3, int flags$$0) {
        parcel$$3 .writeString(vehicle$$3 .name);
        parcel$$3 .writeString(vehicle$$3 .iconUrl);
        parcel$$3 .writeString(vehicle$$3 .type);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.amanladia.jars.model.Vehicle getParcel() {
        return vehicle$$0;
    }

    public final static class Creator$$11
        implements Creator<Vehicle$$Parcelable>
    {


        @Override
        public Vehicle$$Parcelable createFromParcel(android.os.Parcel parcel$$4) {
            return new Vehicle$$Parcelable(parcel$$4);
        }

        @Override
        public Vehicle$$Parcelable[] newArray(int size) {
            return new Vehicle$$Parcelable[size] ;
        }

    }

}
