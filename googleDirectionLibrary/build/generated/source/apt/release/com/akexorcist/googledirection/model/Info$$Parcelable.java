
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
public class Info$$Parcelable
    implements Parcelable, ParcelWrapper<com.amanladia.jars.model.Info>
{

    private com.amanladia.jars.model.Info info$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Info$$Parcelable.Creator$$4 CREATOR = new Info$$Parcelable.Creator$$4();

    public Info$$Parcelable(android.os.Parcel parcel$$0) {
        com.amanladia.jars.model.Info info$$2;
        if (parcel$$0 .readInt() == -1) {
            info$$2 = null;
        } else {
            info$$2 = readcom_akexorcist_googledirection_model_Info(parcel$$0);
        }
        info$$0 = info$$2;
    }

    public Info$$Parcelable(com.amanladia.jars.model.Info info$$4) {
        info$$0 = info$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (info$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_akexorcist_googledirection_model_Info(info$$0, parcel$$1, flags);
        }
    }

    private com.amanladia.jars.model.Info readcom_akexorcist_googledirection_model_Info(android.os.Parcel parcel$$2) {
        com.amanladia.jars.model.Info info$$1;
        info$$1 = new com.amanladia.jars.model.Info();
        info$$1 .text = parcel$$2 .readString();
        info$$1 .value = parcel$$2 .readString();
        return info$$1;
    }

    private void writecom_akexorcist_googledirection_model_Info(com.amanladia.jars.model.Info info$$3, android.os.Parcel parcel$$3, int flags$$0) {
        parcel$$3 .writeString(info$$3 .text);
        parcel$$3 .writeString(info$$3 .value);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.amanladia.jars.model.Info getParcel() {
        return info$$0;
    }

    public final static class Creator$$4
        implements Creator<Info$$Parcelable>
    {


        @Override
        public Info$$Parcelable createFromParcel(android.os.Parcel parcel$$4) {
            return new Info$$Parcelable(parcel$$4);
        }

        @Override
        public Info$$Parcelable[] newArray(int size) {
            return new Info$$Parcelable[size] ;
        }

    }

}
