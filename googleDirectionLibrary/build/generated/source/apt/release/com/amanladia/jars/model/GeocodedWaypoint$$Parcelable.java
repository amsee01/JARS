
package com.amanladia.jars.model;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2019-09-13T23:05+0530")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class GeocodedWaypoint$$Parcelable
    implements Parcelable, ParcelWrapper<com.amanladia.jars.model.GeocodedWaypoint>
{

    private com.amanladia.jars.model.GeocodedWaypoint geocodedWaypoint$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static GeocodedWaypoint$$Parcelable.Creator$$13 CREATOR = new GeocodedWaypoint$$Parcelable.Creator$$13();

    public GeocodedWaypoint$$Parcelable(android.os.Parcel parcel$$0) {
        com.amanladia.jars.model.GeocodedWaypoint geocodedWaypoint$$2;
        if (parcel$$0 .readInt() == -1) {
            geocodedWaypoint$$2 = null;
        } else {
            geocodedWaypoint$$2 = readcom_amanladia_jars_model_GeocodedWaypoint(parcel$$0);
        }
        geocodedWaypoint$$0 = geocodedWaypoint$$2;
    }

    public GeocodedWaypoint$$Parcelable(com.amanladia.jars.model.GeocodedWaypoint geocodedWaypoint$$4) {
        geocodedWaypoint$$0 = geocodedWaypoint$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (geocodedWaypoint$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_amanladia_jars_model_GeocodedWaypoint(geocodedWaypoint$$0, parcel$$1, flags);
        }
    }

    private com.amanladia.jars.model.GeocodedWaypoint readcom_amanladia_jars_model_GeocodedWaypoint(android.os.Parcel parcel$$2) {
        com.amanladia.jars.model.GeocodedWaypoint geocodedWaypoint$$1;
        geocodedWaypoint$$1 = new com.amanladia.jars.model.GeocodedWaypoint();
        int int$$0 = parcel$$2 .readInt();
        ArrayList<java.lang.String> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new ArrayList<java.lang.String>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                list$$0 .add(parcel$$2 .readString());
            }
        }
        geocodedWaypoint$$1 .types = list$$0;
        geocodedWaypoint$$1 .placeId = parcel$$2 .readString();
        geocodedWaypoint$$1 .status = parcel$$2 .readString();
        return geocodedWaypoint$$1;
    }

    private void writecom_amanladia_jars_model_GeocodedWaypoint(com.amanladia.jars.model.GeocodedWaypoint geocodedWaypoint$$3, android.os.Parcel parcel$$3, int flags$$0) {
        if (geocodedWaypoint$$3 .types == null) {
            parcel$$3 .writeInt(-1);
        } else {
            parcel$$3 .writeInt(geocodedWaypoint$$3 .types.size());
            for (java.lang.String string$$0 : ((List<java.lang.String> ) geocodedWaypoint$$3 .types)) {
                parcel$$3 .writeString(string$$0);
            }
        }
        parcel$$3 .writeString(geocodedWaypoint$$3 .placeId);
        parcel$$3 .writeString(geocodedWaypoint$$3 .status);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.amanladia.jars.model.GeocodedWaypoint getParcel() {
        return geocodedWaypoint$$0;
    }

    public final static class Creator$$13
        implements Creator<GeocodedWaypoint$$Parcelable>
    {


        @Override
        public GeocodedWaypoint$$Parcelable createFromParcel(android.os.Parcel parcel$$4) {
            return new GeocodedWaypoint$$Parcelable(parcel$$4);
        }

        @Override
        public GeocodedWaypoint$$Parcelable[] newArray(int size) {
            return new GeocodedWaypoint$$Parcelable[size] ;
        }

    }

}
