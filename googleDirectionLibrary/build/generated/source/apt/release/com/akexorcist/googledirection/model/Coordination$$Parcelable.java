
package com.amanladia.jars.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2019-09-13T23:01+0530")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Coordination$$Parcelable
    implements Parcelable, ParcelWrapper<com.amanladia.jars.model.Coordination>
{

    private com.amanladia.jars.model.Coordination coordination$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Coordination$$Parcelable.Creator$$16 CREATOR = new Coordination$$Parcelable.Creator$$16();

    public Coordination$$Parcelable(android.os.Parcel parcel$$0) {
        com.amanladia.jars.model.Coordination coordination$$2;
        if (parcel$$0 .readInt() == -1) {
            coordination$$2 = null;
        } else {
            coordination$$2 = readcom_akexorcist_googledirection_model_Coordination(parcel$$0);
        }
        coordination$$0 = coordination$$2;
    }

    public Coordination$$Parcelable(com.amanladia.jars.model.Coordination coordination$$4) {
        coordination$$0 = coordination$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (coordination$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_akexorcist_googledirection_model_Coordination(coordination$$0, parcel$$1, flags);
        }
    }

    private com.amanladia.jars.model.Coordination readcom_akexorcist_googledirection_model_Coordination(android.os.Parcel parcel$$2) {
        com.amanladia.jars.model.Coordination coordination$$1;
        coordination$$1 = new com.amanladia.jars.model.Coordination();
        coordination$$1 .latitude = parcel$$2 .readDouble();
        coordination$$1 .longitude = parcel$$2 .readDouble();
        return coordination$$1;
    }

    private void writecom_akexorcist_googledirection_model_Coordination(com.amanladia.jars.model.Coordination coordination$$3, android.os.Parcel parcel$$3, int flags$$0) {
        parcel$$3 .writeDouble(coordination$$3 .latitude);
        parcel$$3 .writeDouble(coordination$$3 .longitude);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.amanladia.jars.model.Coordination getParcel() {
        return coordination$$0;
    }

    public final static class Creator$$16
        implements Creator<Coordination$$Parcelable>
    {


        @Override
        public Coordination$$Parcelable createFromParcel(android.os.Parcel parcel$$4) {
            return new Coordination$$Parcelable(parcel$$4);
        }

        @Override
        public Coordination$$Parcelable[] newArray(int size) {
            return new Coordination$$Parcelable[size] ;
        }

    }

}
