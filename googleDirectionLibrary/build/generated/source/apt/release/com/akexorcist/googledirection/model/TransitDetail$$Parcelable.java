
package com.amanladia.jars.model;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2019-09-13T23:01+0530")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class TransitDetail$$Parcelable
    implements Parcelable, ParcelWrapper<com.amanladia.jars.model.TransitDetail>
{

    private com.amanladia.jars.model.TransitDetail transitDetail$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static TransitDetail$$Parcelable.Creator$$2 CREATOR = new TransitDetail$$Parcelable.Creator$$2();

    public TransitDetail$$Parcelable(android.os.Parcel parcel$$0) {
        com.amanladia.jars.model.TransitDetail transitDetail$$2;
        if (parcel$$0 .readInt() == -1) {
            transitDetail$$2 = null;
        } else {
            transitDetail$$2 = readcom_akexorcist_googledirection_model_TransitDetail(parcel$$0);
        }
        transitDetail$$0 = transitDetail$$2;
    }

    public TransitDetail$$Parcelable(com.amanladia.jars.model.TransitDetail transitDetail$$4) {
        transitDetail$$0 = transitDetail$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (transitDetail$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_akexorcist_googledirection_model_TransitDetail(transitDetail$$0, parcel$$1, flags);
        }
    }

    private com.amanladia.jars.model.TransitDetail readcom_akexorcist_googledirection_model_TransitDetail(android.os.Parcel parcel$$2) {
        com.amanladia.jars.model.TransitDetail transitDetail$$1;
        transitDetail$$1 = new com.amanladia.jars.model.TransitDetail();
        com.amanladia.jars.model.TimeInfo timeInfo$$1;
        if (parcel$$2 .readInt() == -1) {
            timeInfo$$1 = null;
        } else {
            timeInfo$$1 = readcom_akexorcist_googledirection_model_TimeInfo(parcel$$2);
        }
        transitDetail$$1 .departureTime = timeInfo$$1;
        transitDetail$$1 .headsign = parcel$$2 .readString();
        transitDetail$$1 .stopNumber = parcel$$2 .readString();
        com.amanladia.jars.model.StopPoint stopPoint$$1;
        if (parcel$$2 .readInt() == -1) {
            stopPoint$$1 = null;
        } else {
            stopPoint$$1 = readcom_akexorcist_googledirection_model_StopPoint(parcel$$2);
        }
        transitDetail$$1 .arrivalStopPoint = stopPoint$$1;
        com.amanladia.jars.model.StopPoint stopPoint$$2;
        if (parcel$$2 .readInt() == -1) {
            stopPoint$$2 = null;
        } else {
            stopPoint$$2 = readcom_akexorcist_googledirection_model_StopPoint(parcel$$2);
        }
        transitDetail$$1 .departureStopPoint = stopPoint$$2;
        com.amanladia.jars.model.TimeInfo timeInfo$$2;
        if (parcel$$2 .readInt() == -1) {
            timeInfo$$2 = null;
        } else {
            timeInfo$$2 = readcom_akexorcist_googledirection_model_TimeInfo(parcel$$2);
        }
        transitDetail$$1 .arrivalTime = timeInfo$$2;
        com.amanladia.jars.model.Line line$$1;
        if (parcel$$2 .readInt() == -1) {
            line$$1 = null;
        } else {
            line$$1 = readcom_akexorcist_googledirection_model_Line(parcel$$2);
        }
        transitDetail$$1 .line = line$$1;
        return transitDetail$$1;
    }

    private com.amanladia.jars.model.TimeInfo readcom_akexorcist_googledirection_model_TimeInfo(android.os.Parcel parcel$$3) {
        com.amanladia.jars.model.TimeInfo timeInfo$$0;
        timeInfo$$0 = new com.amanladia.jars.model.TimeInfo();
        timeInfo$$0 .timeZone = parcel$$3 .readString();
        timeInfo$$0 .text = parcel$$3 .readString();
        timeInfo$$0 .value = parcel$$3 .readString();
        return timeInfo$$0;
    }

    private com.amanladia.jars.model.StopPoint readcom_akexorcist_googledirection_model_StopPoint(android.os.Parcel parcel$$4) {
        com.amanladia.jars.model.StopPoint stopPoint$$0;
        stopPoint$$0 = new com.amanladia.jars.model.StopPoint();
        stopPoint$$0 .name = parcel$$4 .readString();
        com.amanladia.jars.model.Coordination coordination$$1;
        if (parcel$$4 .readInt() == -1) {
            coordination$$1 = null;
        } else {
            coordination$$1 = readcom_akexorcist_googledirection_model_Coordination(parcel$$4);
        }
        stopPoint$$0 .location = coordination$$1;
        return stopPoint$$0;
    }

    private com.amanladia.jars.model.Coordination readcom_akexorcist_googledirection_model_Coordination(android.os.Parcel parcel$$5) {
        com.amanladia.jars.model.Coordination coordination$$0;
        coordination$$0 = new com.amanladia.jars.model.Coordination();
        coordination$$0 .latitude = parcel$$5 .readDouble();
        coordination$$0 .longitude = parcel$$5 .readDouble();
        return coordination$$0;
    }

    private com.amanladia.jars.model.Line readcom_akexorcist_googledirection_model_Line(android.os.Parcel parcel$$6) {
        com.amanladia.jars.model.Line line$$0;
        line$$0 = new com.amanladia.jars.model.Line();
        line$$0 .color = parcel$$6 .readString();
        line$$0 .name = parcel$$6 .readString();
        line$$0 .shortName = parcel$$6 .readString();
        line$$0 .textColor = parcel$$6 .readString();
        int int$$0 = parcel$$6 .readInt();
        ArrayList<com.amanladia.jars.model.Agency> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new ArrayList<com.amanladia.jars.model.Agency>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                com.amanladia.jars.model.Agency agency$$1;
                if (parcel$$6 .readInt() == -1) {
                    agency$$1 = null;
                } else {
                    agency$$1 = readcom_akexorcist_googledirection_model_Agency(parcel$$6);
                }
                list$$0 .add(agency$$1);
            }
        }
        line$$0 .agencyList = list$$0;
        com.amanladia.jars.model.Vehicle vehicle$$1;
        if (parcel$$6 .readInt() == -1) {
            vehicle$$1 = null;
        } else {
            vehicle$$1 = readcom_akexorcist_googledirection_model_Vehicle(parcel$$6);
        }
        line$$0 .vehicle = vehicle$$1;
        return line$$0;
    }

    private com.amanladia.jars.model.Agency readcom_akexorcist_googledirection_model_Agency(android.os.Parcel parcel$$7) {
        com.amanladia.jars.model.Agency agency$$0;
        agency$$0 = new com.amanladia.jars.model.Agency();
        agency$$0 .name = parcel$$7 .readString();
        agency$$0 .url = parcel$$7 .readString();
        return agency$$0;
    }

    private com.amanladia.jars.model.Vehicle readcom_akexorcist_googledirection_model_Vehicle(android.os.Parcel parcel$$8) {
        com.amanladia.jars.model.Vehicle vehicle$$0;
        vehicle$$0 = new com.amanladia.jars.model.Vehicle();
        vehicle$$0 .name = parcel$$8 .readString();
        vehicle$$0 .iconUrl = parcel$$8 .readString();
        vehicle$$0 .type = parcel$$8 .readString();
        return vehicle$$0;
    }

    private void writecom_akexorcist_googledirection_model_TransitDetail(com.amanladia.jars.model.TransitDetail transitDetail$$3, android.os.Parcel parcel$$9, int flags$$0) {
        if (transitDetail$$3 .departureTime == null) {
            parcel$$9 .writeInt(-1);
        } else {
            parcel$$9 .writeInt(1);
            writecom_akexorcist_googledirection_model_TimeInfo(transitDetail$$3 .departureTime, parcel$$9, flags$$0);
        }
        parcel$$9 .writeString(transitDetail$$3 .headsign);
        parcel$$9 .writeString(transitDetail$$3 .stopNumber);
        if (transitDetail$$3 .arrivalStopPoint == null) {
            parcel$$9 .writeInt(-1);
        } else {
            parcel$$9 .writeInt(1);
            writecom_akexorcist_googledirection_model_StopPoint(transitDetail$$3 .arrivalStopPoint, parcel$$9, flags$$0);
        }
        if (transitDetail$$3 .departureStopPoint == null) {
            parcel$$9 .writeInt(-1);
        } else {
            parcel$$9 .writeInt(1);
            writecom_akexorcist_googledirection_model_StopPoint(transitDetail$$3 .departureStopPoint, parcel$$9, flags$$0);
        }
        if (transitDetail$$3 .arrivalTime == null) {
            parcel$$9 .writeInt(-1);
        } else {
            parcel$$9 .writeInt(1);
            writecom_akexorcist_googledirection_model_TimeInfo(transitDetail$$3 .arrivalTime, parcel$$9, flags$$0);
        }
        if (transitDetail$$3 .line == null) {
            parcel$$9 .writeInt(-1);
        } else {
            parcel$$9 .writeInt(1);
            writecom_akexorcist_googledirection_model_Line(transitDetail$$3 .line, parcel$$9, flags$$0);
        }
    }

    private void writecom_akexorcist_googledirection_model_TimeInfo(com.amanladia.jars.model.TimeInfo timeInfo$$3, android.os.Parcel parcel$$10, int flags$$1) {
        parcel$$10 .writeString(timeInfo$$3 .timeZone);
        parcel$$10 .writeString(timeInfo$$3 .text);
        parcel$$10 .writeString(timeInfo$$3 .value);
    }

    private void writecom_akexorcist_googledirection_model_StopPoint(com.amanladia.jars.model.StopPoint stopPoint$$3, android.os.Parcel parcel$$11, int flags$$2) {
        parcel$$11 .writeString(stopPoint$$3 .name);
        if (stopPoint$$3 .location == null) {
            parcel$$11 .writeInt(-1);
        } else {
            parcel$$11 .writeInt(1);
            writecom_akexorcist_googledirection_model_Coordination(stopPoint$$3 .location, parcel$$11, flags$$2);
        }
    }

    private void writecom_akexorcist_googledirection_model_Coordination(com.amanladia.jars.model.Coordination coordination$$2, android.os.Parcel parcel$$12, int flags$$3) {
        parcel$$12 .writeDouble(coordination$$2 .latitude);
        parcel$$12 .writeDouble(coordination$$2 .longitude);
    }

    private void writecom_akexorcist_googledirection_model_Line(com.amanladia.jars.model.Line line$$2, android.os.Parcel parcel$$13, int flags$$4) {
        parcel$$13 .writeString(line$$2 .color);
        parcel$$13 .writeString(line$$2 .name);
        parcel$$13 .writeString(line$$2 .shortName);
        parcel$$13 .writeString(line$$2 .textColor);
        if (line$$2 .agencyList == null) {
            parcel$$13 .writeInt(-1);
        } else {
            parcel$$13 .writeInt(line$$2 .agencyList.size());
            for (com.amanladia.jars.model.Agency agency$$2 : ((List<com.amanladia.jars.model.Agency> ) line$$2 .agencyList)) {
                if (agency$$2 == null) {
                    parcel$$13 .writeInt(-1);
                } else {
                    parcel$$13 .writeInt(1);
                    writecom_akexorcist_googledirection_model_Agency(agency$$2, parcel$$13, flags$$4);
                }
            }
        }
        if (line$$2 .vehicle == null) {
            parcel$$13 .writeInt(-1);
        } else {
            parcel$$13 .writeInt(1);
            writecom_akexorcist_googledirection_model_Vehicle(line$$2 .vehicle, parcel$$13, flags$$4);
        }
    }

    private void writecom_akexorcist_googledirection_model_Agency(com.amanladia.jars.model.Agency agency$$3, android.os.Parcel parcel$$14, int flags$$5) {
        parcel$$14 .writeString(agency$$3 .name);
        parcel$$14 .writeString(agency$$3 .url);
    }

    private void writecom_akexorcist_googledirection_model_Vehicle(com.amanladia.jars.model.Vehicle vehicle$$2, android.os.Parcel parcel$$15, int flags$$6) {
        parcel$$15 .writeString(vehicle$$2 .name);
        parcel$$15 .writeString(vehicle$$2 .iconUrl);
        parcel$$15 .writeString(vehicle$$2 .type);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.amanladia.jars.model.TransitDetail getParcel() {
        return transitDetail$$0;
    }

    public final static class Creator$$2
        implements Creator<TransitDetail$$Parcelable>
    {


        @Override
        public TransitDetail$$Parcelable createFromParcel(android.os.Parcel parcel$$16) {
            return new TransitDetail$$Parcelable(parcel$$16);
        }

        @Override
        public TransitDetail$$Parcelable[] newArray(int size) {
            return new TransitDetail$$Parcelable[size] ;
        }

    }

}
