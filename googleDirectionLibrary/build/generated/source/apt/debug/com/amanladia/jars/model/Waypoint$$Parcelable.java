
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
public class Waypoint$$Parcelable
    implements Parcelable, ParcelWrapper<com.amanladia.jars.model.Waypoint>
{

    private com.amanladia.jars.model.Waypoint waypoint$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Waypoint$$Parcelable.Creator$$7 CREATOR = new Waypoint$$Parcelable.Creator$$7();

    public Waypoint$$Parcelable(android.os.Parcel parcel$$0) {
        com.amanladia.jars.model.Waypoint waypoint$$2;
        if (parcel$$0 .readInt() == -1) {
            waypoint$$2 = null;
        } else {
            waypoint$$2 = readcom_amanladia_jars_model_Waypoint(parcel$$0);
        }
        waypoint$$0 = waypoint$$2;
    }

    public Waypoint$$Parcelable(com.amanladia.jars.model.Waypoint waypoint$$4) {
        waypoint$$0 = waypoint$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (waypoint$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_amanladia_jars_model_Waypoint(waypoint$$0, parcel$$1, flags);
        }
    }

    private com.amanladia.jars.model.Waypoint readcom_amanladia_jars_model_Waypoint(android.os.Parcel parcel$$2) {
        com.amanladia.jars.model.Waypoint waypoint$$1;
        waypoint$$1 = new com.amanladia.jars.model.Waypoint();
        waypoint$$1 .interpolation = parcel$$2 .readDouble();
        waypoint$$1 .index = parcel$$2 .readInt();
        com.amanladia.jars.model.Coordination coordination$$1;
        if (parcel$$2 .readInt() == -1) {
            coordination$$1 = null;
        } else {
            coordination$$1 = readcom_amanladia_jars_model_Coordination(parcel$$2);
        }
        waypoint$$1 .location = coordination$$1;
        return waypoint$$1;
    }

    private com.amanladia.jars.model.Coordination readcom_amanladia_jars_model_Coordination(android.os.Parcel parcel$$3) {
        com.amanladia.jars.model.Coordination coordination$$0;
        coordination$$0 = new com.amanladia.jars.model.Coordination();
        coordination$$0 .latitude = parcel$$3 .readDouble();
        coordination$$0 .longitude = parcel$$3 .readDouble();
        return coordination$$0;
    }

    private void writecom_amanladia_jars_model_Waypoint(com.amanladia.jars.model.Waypoint waypoint$$3, android.os.Parcel parcel$$4, int flags$$0) {
        parcel$$4 .writeDouble(waypoint$$3 .interpolation);
        parcel$$4 .writeInt(waypoint$$3 .index);
        if (waypoint$$3 .location == null) {
            parcel$$4 .writeInt(-1);
        } else {
            parcel$$4 .writeInt(1);
            writecom_amanladia_jars_model_Coordination(waypoint$$3 .location, parcel$$4, flags$$0);
        }
    }

    private void writecom_amanladia_jars_model_Coordination(com.amanladia.jars.model.Coordination coordination$$2, android.os.Parcel parcel$$5, int flags$$1) {
        parcel$$5 .writeDouble(coordination$$2 .latitude);
        parcel$$5 .writeDouble(coordination$$2 .longitude);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.amanladia.jars.model.Waypoint getParcel() {
        return waypoint$$0;
    }

    public final static class Creator$$7
        implements Creator<Waypoint$$Parcelable>
    {


        @Override
        public Waypoint$$Parcelable createFromParcel(android.os.Parcel parcel$$6) {
            return new Waypoint$$Parcelable(parcel$$6);
        }

        @Override
        public Waypoint$$Parcelable[] newArray(int size) {
            return new Waypoint$$Parcelable[size] ;
        }

    }

}
