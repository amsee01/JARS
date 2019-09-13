
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
public class RoutePolyline$$Parcelable
    implements Parcelable, ParcelWrapper<com.amanladia.jars.model.RoutePolyline>
{

    private com.amanladia.jars.model.RoutePolyline routePolyline$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static RoutePolyline$$Parcelable.Creator$$0 CREATOR = new RoutePolyline$$Parcelable.Creator$$0();

    public RoutePolyline$$Parcelable(android.os.Parcel parcel$$0) {
        com.amanladia.jars.model.RoutePolyline routePolyline$$2;
        if (parcel$$0 .readInt() == -1) {
            routePolyline$$2 = null;
        } else {
            routePolyline$$2 = readcom_amanladia_jars_model_RoutePolyline(parcel$$0);
        }
        routePolyline$$0 = routePolyline$$2;
    }

    public RoutePolyline$$Parcelable(com.amanladia.jars.model.RoutePolyline routePolyline$$4) {
        routePolyline$$0 = routePolyline$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (routePolyline$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_amanladia_jars_model_RoutePolyline(routePolyline$$0, parcel$$1, flags);
        }
    }

    private com.amanladia.jars.model.RoutePolyline readcom_amanladia_jars_model_RoutePolyline(android.os.Parcel parcel$$2) {
        com.amanladia.jars.model.RoutePolyline routePolyline$$1;
        routePolyline$$1 = new com.amanladia.jars.model.RoutePolyline();
        routePolyline$$1 .rawPointList = parcel$$2 .readString();
        return routePolyline$$1;
    }

    private void writecom_amanladia_jars_model_RoutePolyline(com.amanladia.jars.model.RoutePolyline routePolyline$$3, android.os.Parcel parcel$$3, int flags$$0) {
        parcel$$3 .writeString(routePolyline$$3 .rawPointList);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.amanladia.jars.model.RoutePolyline getParcel() {
        return routePolyline$$0;
    }

    public final static class Creator$$0
        implements Creator<RoutePolyline$$Parcelable>
    {


        @Override
        public RoutePolyline$$Parcelable createFromParcel(android.os.Parcel parcel$$4) {
            return new RoutePolyline$$Parcelable(parcel$$4);
        }

        @Override
        public RoutePolyline$$Parcelable[] newArray(int size) {
            return new RoutePolyline$$Parcelable[size] ;
        }

    }

}
