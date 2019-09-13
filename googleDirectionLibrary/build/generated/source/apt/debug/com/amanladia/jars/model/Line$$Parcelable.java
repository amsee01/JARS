
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
public class Line$$Parcelable
    implements Parcelable, ParcelWrapper<com.amanladia.jars.model.Line>
{

    private com.amanladia.jars.model.Line line$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Line$$Parcelable.Creator$$15 CREATOR = new Line$$Parcelable.Creator$$15();

    public Line$$Parcelable(android.os.Parcel parcel$$0) {
        com.amanladia.jars.model.Line line$$2;
        if (parcel$$0 .readInt() == -1) {
            line$$2 = null;
        } else {
            line$$2 = readcom_amanladia_jars_model_Line(parcel$$0);
        }
        line$$0 = line$$2;
    }

    public Line$$Parcelable(com.amanladia.jars.model.Line line$$4) {
        line$$0 = line$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (line$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_amanladia_jars_model_Line(line$$0, parcel$$1, flags);
        }
    }

    private com.amanladia.jars.model.Line readcom_amanladia_jars_model_Line(android.os.Parcel parcel$$2) {
        com.amanladia.jars.model.Line line$$1;
        line$$1 = new com.amanladia.jars.model.Line();
        line$$1 .color = parcel$$2 .readString();
        line$$1 .name = parcel$$2 .readString();
        line$$1 .shortName = parcel$$2 .readString();
        line$$1 .textColor = parcel$$2 .readString();
        int int$$0 = parcel$$2 .readInt();
        ArrayList<com.amanladia.jars.model.Agency> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new ArrayList<com.amanladia.jars.model.Agency>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                com.amanladia.jars.model.Agency agency$$1;
                if (parcel$$2 .readInt() == -1) {
                    agency$$1 = null;
                } else {
                    agency$$1 = readcom_amanladia_jars_model_Agency(parcel$$2);
                }
                list$$0 .add(agency$$1);
            }
        }
        line$$1 .agencyList = list$$0;
        com.amanladia.jars.model.Vehicle vehicle$$1;
        if (parcel$$2 .readInt() == -1) {
            vehicle$$1 = null;
        } else {
            vehicle$$1 = readcom_amanladia_jars_model_Vehicle(parcel$$2);
        }
        line$$1 .vehicle = vehicle$$1;
        return line$$1;
    }

    private com.amanladia.jars.model.Agency readcom_amanladia_jars_model_Agency(android.os.Parcel parcel$$3) {
        com.amanladia.jars.model.Agency agency$$0;
        agency$$0 = new com.amanladia.jars.model.Agency();
        agency$$0 .name = parcel$$3 .readString();
        agency$$0 .url = parcel$$3 .readString();
        return agency$$0;
    }

    private com.amanladia.jars.model.Vehicle readcom_amanladia_jars_model_Vehicle(android.os.Parcel parcel$$4) {
        com.amanladia.jars.model.Vehicle vehicle$$0;
        vehicle$$0 = new com.amanladia.jars.model.Vehicle();
        vehicle$$0 .name = parcel$$4 .readString();
        vehicle$$0 .iconUrl = parcel$$4 .readString();
        vehicle$$0 .type = parcel$$4 .readString();
        return vehicle$$0;
    }

    private void writecom_amanladia_jars_model_Line(com.amanladia.jars.model.Line line$$3, android.os.Parcel parcel$$5, int flags$$0) {
        parcel$$5 .writeString(line$$3 .color);
        parcel$$5 .writeString(line$$3 .name);
        parcel$$5 .writeString(line$$3 .shortName);
        parcel$$5 .writeString(line$$3 .textColor);
        if (line$$3 .agencyList == null) {
            parcel$$5 .writeInt(-1);
        } else {
            parcel$$5 .writeInt(line$$3 .agencyList.size());
            for (com.amanladia.jars.model.Agency agency$$2 : ((List<com.amanladia.jars.model.Agency> ) line$$3 .agencyList)) {
                if (agency$$2 == null) {
                    parcel$$5 .writeInt(-1);
                } else {
                    parcel$$5 .writeInt(1);
                    writecom_amanladia_jars_model_Agency(agency$$2, parcel$$5, flags$$0);
                }
            }
        }
        if (line$$3 .vehicle == null) {
            parcel$$5 .writeInt(-1);
        } else {
            parcel$$5 .writeInt(1);
            writecom_amanladia_jars_model_Vehicle(line$$3 .vehicle, parcel$$5, flags$$0);
        }
    }

    private void writecom_amanladia_jars_model_Agency(com.amanladia.jars.model.Agency agency$$3, android.os.Parcel parcel$$6, int flags$$1) {
        parcel$$6 .writeString(agency$$3 .name);
        parcel$$6 .writeString(agency$$3 .url);
    }

    private void writecom_amanladia_jars_model_Vehicle(com.amanladia.jars.model.Vehicle vehicle$$2, android.os.Parcel parcel$$7, int flags$$2) {
        parcel$$7 .writeString(vehicle$$2 .name);
        parcel$$7 .writeString(vehicle$$2 .iconUrl);
        parcel$$7 .writeString(vehicle$$2 .type);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.amanladia.jars.model.Line getParcel() {
        return line$$0;
    }

    public final static class Creator$$15
        implements Creator<Line$$Parcelable>
    {


        @Override
        public Line$$Parcelable createFromParcel(android.os.Parcel parcel$$8) {
            return new Line$$Parcelable(parcel$$8);
        }

        @Override
        public Line$$Parcelable[] newArray(int size) {
            return new Line$$Parcelable[size] ;
        }

    }

}
