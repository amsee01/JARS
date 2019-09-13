
package com.amanladia.jars.model;

import java.util.ArrayList;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2019-09-13T23:05+0530")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Step$$Parcelable
    implements Parcelable, ParcelWrapper<com.amanladia.jars.model.Step>
{

    private com.amanladia.jars.model.Step step$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Step$$Parcelable.Creator$$9 CREATOR = new Step$$Parcelable.Creator$$9();

    public Step$$Parcelable(android.os.Parcel parcel$$0) {
        com.amanladia.jars.model.Step step$$3;
        if (parcel$$0 .readInt() == -1) {
            step$$3 = null;
        } else {
            step$$3 = readcom_amanladia_jars_model_Step(parcel$$0);
        }
        step$$0 = step$$3;
    }

    public Step$$Parcelable(com.amanladia.jars.model.Step step$$6) {
        step$$0 = step$$6;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (step$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_amanladia_jars_model_Step(step$$0, parcel$$1, flags);
        }
    }

    private com.amanladia.jars.model.Step readcom_amanladia_jars_model_Step(android.os.Parcel parcel$$2) {
        com.amanladia.jars.model.Step step$$1;
        step$$1 = new com.amanladia.jars.model.Step();
        com.amanladia.jars.model.Info info$$1;
        if (parcel$$2 .readInt() == -1) {
            info$$1 = null;
        } else {
            info$$1 = readcom_amanladia_jars_model_Info(parcel$$2);
        }
        step$$1 .duration = info$$1;
        step$$1 .htmlInstruction = parcel$$2 .readString();
        com.amanladia.jars.model.Info info$$2;
        if (parcel$$2 .readInt() == -1) {
            info$$2 = null;
        } else {
            info$$2 = readcom_amanladia_jars_model_Info(parcel$$2);
        }
        step$$1 .distance = info$$2;
        com.amanladia.jars.model.Coordination coordination$$1;
        if (parcel$$2 .readInt() == -1) {
            coordination$$1 = null;
        } else {
            coordination$$1 = readcom_amanladia_jars_model_Coordination(parcel$$2);
        }
        step$$1 .startLocation = coordination$$1;
        com.amanladia.jars.model.TransitDetail transitDetail$$1;
        if (parcel$$2 .readInt() == -1) {
            transitDetail$$1 = null;
        } else {
            transitDetail$$1 = readcom_amanladia_jars_model_TransitDetail(parcel$$2);
        }
        step$$1 .transitDetail = transitDetail$$1;
        int int$$2 = parcel$$2 .readInt();
        ArrayList<com.amanladia.jars.model.Step> list$$1;
        if (int$$2 < 0) {
            list$$1 = null;
        } else {
            list$$1 = new ArrayList<com.amanladia.jars.model.Step>();
            for (int int$$3 = 0; (int$$3 <int$$2); int$$3 ++) {
                com.amanladia.jars.model.Step step$$2;
                if (parcel$$2 .readInt() == -1) {
                    step$$2 = null;
                } else {
                    step$$2 = readcom_amanladia_jars_model_Step(parcel$$2);
                }
                list$$1 .add(step$$2);
            }
        }
        step$$1 .stepList = list$$1;
        com.amanladia.jars.model.Coordination coordination$$3;
        if (parcel$$2 .readInt() == -1) {
            coordination$$3 = null;
        } else {
            coordination$$3 = readcom_amanladia_jars_model_Coordination(parcel$$2);
        }
        step$$1 .endLocation = coordination$$3;
        step$$1 .maneuver = parcel$$2 .readString();
        com.amanladia.jars.model.RoutePolyline routePolyline$$1;
        if (parcel$$2 .readInt() == -1) {
            routePolyline$$1 = null;
        } else {
            routePolyline$$1 = readcom_amanladia_jars_model_RoutePolyline(parcel$$2);
        }
        step$$1 .polyline = routePolyline$$1;
        step$$1 .travelMode = parcel$$2 .readString();
        return step$$1;
    }

    private com.amanladia.jars.model.Info readcom_amanladia_jars_model_Info(android.os.Parcel parcel$$3) {
        com.amanladia.jars.model.Info info$$0;
        info$$0 = new com.amanladia.jars.model.Info();
        info$$0 .text = parcel$$3 .readString();
        info$$0 .value = parcel$$3 .readString();
        return info$$0;
    }

    private com.amanladia.jars.model.Coordination readcom_amanladia_jars_model_Coordination(android.os.Parcel parcel$$4) {
        com.amanladia.jars.model.Coordination coordination$$0;
        coordination$$0 = new com.amanladia.jars.model.Coordination();
        coordination$$0 .latitude = parcel$$4 .readDouble();
        coordination$$0 .longitude = parcel$$4 .readDouble();
        return coordination$$0;
    }

    private com.amanladia.jars.model.TransitDetail readcom_amanladia_jars_model_TransitDetail(android.os.Parcel parcel$$5) {
        com.amanladia.jars.model.TransitDetail transitDetail$$0;
        transitDetail$$0 = new com.amanladia.jars.model.TransitDetail();
        com.amanladia.jars.model.TimeInfo timeInfo$$1;
        if (parcel$$5 .readInt() == -1) {
            timeInfo$$1 = null;
        } else {
            timeInfo$$1 = readcom_amanladia_jars_model_TimeInfo(parcel$$5);
        }
        transitDetail$$0 .departureTime = timeInfo$$1;
        transitDetail$$0 .headsign = parcel$$5 .readString();
        transitDetail$$0 .stopNumber = parcel$$5 .readString();
        com.amanladia.jars.model.StopPoint stopPoint$$1;
        if (parcel$$5 .readInt() == -1) {
            stopPoint$$1 = null;
        } else {
            stopPoint$$1 = readcom_amanladia_jars_model_StopPoint(parcel$$5);
        }
        transitDetail$$0 .arrivalStopPoint = stopPoint$$1;
        com.amanladia.jars.model.StopPoint stopPoint$$2;
        if (parcel$$5 .readInt() == -1) {
            stopPoint$$2 = null;
        } else {
            stopPoint$$2 = readcom_amanladia_jars_model_StopPoint(parcel$$5);
        }
        transitDetail$$0 .departureStopPoint = stopPoint$$2;
        com.amanladia.jars.model.TimeInfo timeInfo$$2;
        if (parcel$$5 .readInt() == -1) {
            timeInfo$$2 = null;
        } else {
            timeInfo$$2 = readcom_amanladia_jars_model_TimeInfo(parcel$$5);
        }
        transitDetail$$0 .arrivalTime = timeInfo$$2;
        com.amanladia.jars.model.Line line$$1;
        if (parcel$$5 .readInt() == -1) {
            line$$1 = null;
        } else {
            line$$1 = readcom_amanladia_jars_model_Line(parcel$$5);
        }
        transitDetail$$0 .line = line$$1;
        return transitDetail$$0;
    }

    private com.amanladia.jars.model.TimeInfo readcom_amanladia_jars_model_TimeInfo(android.os.Parcel parcel$$6) {
        com.amanladia.jars.model.TimeInfo timeInfo$$0;
        timeInfo$$0 = new com.amanladia.jars.model.TimeInfo();
        timeInfo$$0 .timeZone = parcel$$6 .readString();
        timeInfo$$0 .text = parcel$$6 .readString();
        timeInfo$$0 .value = parcel$$6 .readString();
        return timeInfo$$0;
    }

    private com.amanladia.jars.model.StopPoint readcom_amanladia_jars_model_StopPoint(android.os.Parcel parcel$$7) {
        com.amanladia.jars.model.StopPoint stopPoint$$0;
        stopPoint$$0 = new com.amanladia.jars.model.StopPoint();
        stopPoint$$0 .name = parcel$$7 .readString();
        com.amanladia.jars.model.Coordination coordination$$2;
        if (parcel$$7 .readInt() == -1) {
            coordination$$2 = null;
        } else {
            coordination$$2 = readcom_amanladia_jars_model_Coordination(parcel$$7);
        }
        stopPoint$$0 .location = coordination$$2;
        return stopPoint$$0;
    }

    private com.amanladia.jars.model.Line readcom_amanladia_jars_model_Line(android.os.Parcel parcel$$8) {
        com.amanladia.jars.model.Line line$$0;
        line$$0 = new com.amanladia.jars.model.Line();
        line$$0 .color = parcel$$8 .readString();
        line$$0 .name = parcel$$8 .readString();
        line$$0 .shortName = parcel$$8 .readString();
        line$$0 .textColor = parcel$$8 .readString();
        int int$$0 = parcel$$8 .readInt();
        ArrayList<com.amanladia.jars.model.Agency> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new ArrayList<com.amanladia.jars.model.Agency>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                com.amanladia.jars.model.Agency agency$$1;
                if (parcel$$8 .readInt() == -1) {
                    agency$$1 = null;
                } else {
                    agency$$1 = readcom_amanladia_jars_model_Agency(parcel$$8);
                }
                list$$0 .add(agency$$1);
            }
        }
        line$$0 .agencyList = list$$0;
        com.amanladia.jars.model.Vehicle vehicle$$1;
        if (parcel$$8 .readInt() == -1) {
            vehicle$$1 = null;
        } else {
            vehicle$$1 = readcom_amanladia_jars_model_Vehicle(parcel$$8);
        }
        line$$0 .vehicle = vehicle$$1;
        return line$$0;
    }

    private com.amanladia.jars.model.Agency readcom_amanladia_jars_model_Agency(android.os.Parcel parcel$$9) {
        com.amanladia.jars.model.Agency agency$$0;
        agency$$0 = new com.amanladia.jars.model.Agency();
        agency$$0 .name = parcel$$9 .readString();
        agency$$0 .url = parcel$$9 .readString();
        return agency$$0;
    }

    private com.amanladia.jars.model.Vehicle readcom_amanladia_jars_model_Vehicle(android.os.Parcel parcel$$10) {
        com.amanladia.jars.model.Vehicle vehicle$$0;
        vehicle$$0 = new com.amanladia.jars.model.Vehicle();
        vehicle$$0 .name = parcel$$10 .readString();
        vehicle$$0 .iconUrl = parcel$$10 .readString();
        vehicle$$0 .type = parcel$$10 .readString();
        return vehicle$$0;
    }

    private com.amanladia.jars.model.RoutePolyline readcom_amanladia_jars_model_RoutePolyline(android.os.Parcel parcel$$11) {
        com.amanladia.jars.model.RoutePolyline routePolyline$$0;
        routePolyline$$0 = new com.amanladia.jars.model.RoutePolyline();
        routePolyline$$0 .rawPointList = parcel$$11 .readString();
        return routePolyline$$0;
    }

    private void writecom_amanladia_jars_model_Step(com.amanladia.jars.model.Step step$$4, android.os.Parcel parcel$$12, int flags$$0) {
        if (step$$4 .duration == null) {
            parcel$$12 .writeInt(-1);
        } else {
            parcel$$12 .writeInt(1);
            writecom_amanladia_jars_model_Info(step$$4 .duration, parcel$$12, flags$$0);
        }
        parcel$$12 .writeString(step$$4 .htmlInstruction);
        if (step$$4 .distance == null) {
            parcel$$12 .writeInt(-1);
        } else {
            parcel$$12 .writeInt(1);
            writecom_amanladia_jars_model_Info(step$$4 .distance, parcel$$12, flags$$0);
        }
        if (step$$4 .startLocation == null) {
            parcel$$12 .writeInt(-1);
        } else {
            parcel$$12 .writeInt(1);
            writecom_amanladia_jars_model_Coordination(step$$4 .startLocation, parcel$$12, flags$$0);
        }
        if (step$$4 .transitDetail == null) {
            parcel$$12 .writeInt(-1);
        } else {
            parcel$$12 .writeInt(1);
            writecom_amanladia_jars_model_TransitDetail(step$$4 .transitDetail, parcel$$12, flags$$0);
        }
        if (step$$4 .stepList == null) {
            parcel$$12 .writeInt(-1);
        } else {
            parcel$$12 .writeInt(step$$4 .stepList.size());
            for (com.amanladia.jars.model.Step step$$5 : ((java.util.List<com.amanladia.jars.model.Step> ) step$$4 .stepList)) {
                if (step$$5 == null) {
                    parcel$$12 .writeInt(-1);
                } else {
                    parcel$$12 .writeInt(1);
                    writecom_amanladia_jars_model_Step(step$$5, parcel$$12, flags$$0);
                }
            }
        }
        if (step$$4 .endLocation == null) {
            parcel$$12 .writeInt(-1);
        } else {
            parcel$$12 .writeInt(1);
            writecom_amanladia_jars_model_Coordination(step$$4 .endLocation, parcel$$12, flags$$0);
        }
        parcel$$12 .writeString(step$$4 .maneuver);
        if (step$$4 .polyline == null) {
            parcel$$12 .writeInt(-1);
        } else {
            parcel$$12 .writeInt(1);
            writecom_amanladia_jars_model_RoutePolyline(step$$4 .polyline, parcel$$12, flags$$0);
        }
        parcel$$12 .writeString(step$$4 .travelMode);
    }

    private void writecom_amanladia_jars_model_Info(com.amanladia.jars.model.Info info$$3, android.os.Parcel parcel$$13, int flags$$1) {
        parcel$$13 .writeString(info$$3 .text);
        parcel$$13 .writeString(info$$3 .value);
    }

    private void writecom_amanladia_jars_model_Coordination(com.amanladia.jars.model.Coordination coordination$$4, android.os.Parcel parcel$$14, int flags$$2) {
        parcel$$14 .writeDouble(coordination$$4 .latitude);
        parcel$$14 .writeDouble(coordination$$4 .longitude);
    }

    private void writecom_amanladia_jars_model_TransitDetail(com.amanladia.jars.model.TransitDetail transitDetail$$2, android.os.Parcel parcel$$15, int flags$$3) {
        if (transitDetail$$2 .departureTime == null) {
            parcel$$15 .writeInt(-1);
        } else {
            parcel$$15 .writeInt(1);
            writecom_amanladia_jars_model_TimeInfo(transitDetail$$2 .departureTime, parcel$$15, flags$$3);
        }
        parcel$$15 .writeString(transitDetail$$2 .headsign);
        parcel$$15 .writeString(transitDetail$$2 .stopNumber);
        if (transitDetail$$2 .arrivalStopPoint == null) {
            parcel$$15 .writeInt(-1);
        } else {
            parcel$$15 .writeInt(1);
            writecom_amanladia_jars_model_StopPoint(transitDetail$$2 .arrivalStopPoint, parcel$$15, flags$$3);
        }
        if (transitDetail$$2 .departureStopPoint == null) {
            parcel$$15 .writeInt(-1);
        } else {
            parcel$$15 .writeInt(1);
            writecom_amanladia_jars_model_StopPoint(transitDetail$$2 .departureStopPoint, parcel$$15, flags$$3);
        }
        if (transitDetail$$2 .arrivalTime == null) {
            parcel$$15 .writeInt(-1);
        } else {
            parcel$$15 .writeInt(1);
            writecom_amanladia_jars_model_TimeInfo(transitDetail$$2 .arrivalTime, parcel$$15, flags$$3);
        }
        if (transitDetail$$2 .line == null) {
            parcel$$15 .writeInt(-1);
        } else {
            parcel$$15 .writeInt(1);
            writecom_amanladia_jars_model_Line(transitDetail$$2 .line, parcel$$15, flags$$3);
        }
    }

    private void writecom_amanladia_jars_model_TimeInfo(com.amanladia.jars.model.TimeInfo timeInfo$$3, android.os.Parcel parcel$$16, int flags$$4) {
        parcel$$16 .writeString(timeInfo$$3 .timeZone);
        parcel$$16 .writeString(timeInfo$$3 .text);
        parcel$$16 .writeString(timeInfo$$3 .value);
    }

    private void writecom_amanladia_jars_model_StopPoint(com.amanladia.jars.model.StopPoint stopPoint$$3, android.os.Parcel parcel$$17, int flags$$5) {
        parcel$$17 .writeString(stopPoint$$3 .name);
        if (stopPoint$$3 .location == null) {
            parcel$$17 .writeInt(-1);
        } else {
            parcel$$17 .writeInt(1);
            writecom_amanladia_jars_model_Coordination(stopPoint$$3 .location, parcel$$17, flags$$5);
        }
    }

    private void writecom_amanladia_jars_model_Line(com.amanladia.jars.model.Line line$$2, android.os.Parcel parcel$$18, int flags$$6) {
        parcel$$18 .writeString(line$$2 .color);
        parcel$$18 .writeString(line$$2 .name);
        parcel$$18 .writeString(line$$2 .shortName);
        parcel$$18 .writeString(line$$2 .textColor);
        if (line$$2 .agencyList == null) {
            parcel$$18 .writeInt(-1);
        } else {
            parcel$$18 .writeInt(line$$2 .agencyList.size());
            for (com.amanladia.jars.model.Agency agency$$2 : ((java.util.List<com.amanladia.jars.model.Agency> ) line$$2 .agencyList)) {
                if (agency$$2 == null) {
                    parcel$$18 .writeInt(-1);
                } else {
                    parcel$$18 .writeInt(1);
                    writecom_amanladia_jars_model_Agency(agency$$2, parcel$$18, flags$$6);
                }
            }
        }
        if (line$$2 .vehicle == null) {
            parcel$$18 .writeInt(-1);
        } else {
            parcel$$18 .writeInt(1);
            writecom_amanladia_jars_model_Vehicle(line$$2 .vehicle, parcel$$18, flags$$6);
        }
    }

    private void writecom_amanladia_jars_model_Agency(com.amanladia.jars.model.Agency agency$$3, android.os.Parcel parcel$$19, int flags$$7) {
        parcel$$19 .writeString(agency$$3 .name);
        parcel$$19 .writeString(agency$$3 .url);
    }

    private void writecom_amanladia_jars_model_Vehicle(com.amanladia.jars.model.Vehicle vehicle$$2, android.os.Parcel parcel$$20, int flags$$8) {
        parcel$$20 .writeString(vehicle$$2 .name);
        parcel$$20 .writeString(vehicle$$2 .iconUrl);
        parcel$$20 .writeString(vehicle$$2 .type);
    }

    private void writecom_amanladia_jars_model_RoutePolyline(com.amanladia.jars.model.RoutePolyline routePolyline$$2, android.os.Parcel parcel$$21, int flags$$9) {
        parcel$$21 .writeString(routePolyline$$2 .rawPointList);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.amanladia.jars.model.Step getParcel() {
        return step$$0;
    }

    public final static class Creator$$9
        implements Creator<Step$$Parcelable>
    {


        @Override
        public Step$$Parcelable createFromParcel(android.os.Parcel parcel$$22) {
            return new Step$$Parcelable(parcel$$22);
        }

        @Override
        public Step$$Parcelable[] newArray(int size) {
            return new Step$$Parcelable[size] ;
        }

    }

}
