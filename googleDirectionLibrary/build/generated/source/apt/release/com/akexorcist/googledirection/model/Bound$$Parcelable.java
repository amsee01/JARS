
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
public class Bound$$Parcelable
    implements Parcelable, ParcelWrapper<com.amanladia.jars.model.Bound>
{

    private com.amanladia.jars.model.Bound bound$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Bound$$Parcelable.Creator$$10 CREATOR = new Bound$$Parcelable.Creator$$10();

    public Bound$$Parcelable(android.os.Parcel parcel$$0) {
        com.amanladia.jars.model.Bound bound$$2;
        if (parcel$$0 .readInt() == -1) {
            bound$$2 = null;
        } else {
            bound$$2 = readcom_akexorcist_googledirection_model_Bound(parcel$$0);
        }
        bound$$0 = bound$$2;
    }

    public Bound$$Parcelable(com.amanladia.jars.model.Bound bound$$4) {
        bound$$0 = bound$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (bound$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_akexorcist_googledirection_model_Bound(bound$$0, parcel$$1, flags);
        }
    }

    private com.amanladia.jars.model.Bound readcom_akexorcist_googledirection_model_Bound(android.os.Parcel parcel$$2) {
        com.amanladia.jars.model.Bound bound$$1;
        bound$$1 = new com.amanladia.jars.model.Bound();
        com.amanladia.jars.model.Coordination coordination$$1;
        if (parcel$$2 .readInt() == -1) {
            coordination$$1 = null;
        } else {
            coordination$$1 = readcom_akexorcist_googledirection_model_Coordination(parcel$$2);
        }
        bound$$1 .southwest = coordination$$1;
        com.amanladia.jars.model.Coordination coordination$$2;
        if (parcel$$2 .readInt() == -1) {
            coordination$$2 = null;
        } else {
            coordination$$2 = readcom_akexorcist_googledirection_model_Coordination(parcel$$2);
        }
        bound$$1 .northeast = coordination$$2;
        return bound$$1;
    }

    private com.amanladia.jars.model.Coordination readcom_akexorcist_googledirection_model_Coordination(android.os.Parcel parcel$$3) {
        com.amanladia.jars.model.Coordination coordination$$0;
        coordination$$0 = new com.amanladia.jars.model.Coordination();
        coordination$$0 .latitude = parcel$$3 .readDouble();
        coordination$$0 .longitude = parcel$$3 .readDouble();
        return coordination$$0;
    }

    private void writecom_akexorcist_googledirection_model_Bound(com.amanladia.jars.model.Bound bound$$3, android.os.Parcel parcel$$4, int flags$$0) {
        if (bound$$3 .southwest == null) {
            parcel$$4 .writeInt(-1);
        } else {
            parcel$$4 .writeInt(1);
            writecom_akexorcist_googledirection_model_Coordination(bound$$3 .southwest, parcel$$4, flags$$0);
        }
        if (bound$$3 .northeast == null) {
            parcel$$4 .writeInt(-1);
        } else {
            parcel$$4 .writeInt(1);
            writecom_akexorcist_googledirection_model_Coordination(bound$$3 .northeast, parcel$$4, flags$$0);
        }
    }

    private void writecom_akexorcist_googledirection_model_Coordination(com.amanladia.jars.model.Coordination coordination$$3, android.os.Parcel parcel$$5, int flags$$1) {
        parcel$$5 .writeDouble(coordination$$3 .latitude);
        parcel$$5 .writeDouble(coordination$$3 .longitude);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.amanladia.jars.model.Bound getParcel() {
        return bound$$0;
    }

    public final static class Creator$$10
        implements Creator<Bound$$Parcelable>
    {


        @Override
        public Bound$$Parcelable createFromParcel(android.os.Parcel parcel$$6) {
            return new Bound$$Parcelable(parcel$$6);
        }

        @Override
        public Bound$$Parcelable[] newArray(int size) {
            return new Bound$$Parcelable[size] ;
        }

    }

}
