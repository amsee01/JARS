
package com.amanladia.jars.model;

import java.util.ArrayList;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2019-09-13T23:01+0530")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Leg$$Parcelable
    implements Parcelable, ParcelWrapper<com.amanladia.jars.model.Leg>
{

    private com.amanladia.jars.model.Leg leg$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Leg$$Parcelable.Creator$$6 CREATOR = new Leg$$Parcelable.Creator$$6();

    public Leg$$Parcelable(android.os.Parcel parcel$$0) {
        com.amanladia.jars.model.Leg leg$$2;
        if (parcel$$0 .readInt() == -1) {
            leg$$2 = null;
        } else {
            leg$$2 = readcom_akexorcist_googledirection_model_Leg(parcel$$0);
        }
        leg$$0 = leg$$2;
    }

    public Leg$$Parcelable(com.amanladia.jars.model.Leg leg$$4) {
        leg$$0 = leg$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (leg$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_akexorcist_googledirection_model_Leg(leg$$0, parcel$$1, flags);
        }
    }

    private com.amanladia.jars.model.Leg readcom_akexorcist_googledirection_model_Leg(android.os.Parcel parcel$$2) {
        com.amanladia.jars.model.Leg leg$$1;
        leg$$1 = new com.amanladia.jars.model.Leg();
        com.amanladia.jars.model.TimeInfo timeInfo$$1;
        if (parcel$$2 .readInt() == -1) {
            timeInfo$$1 = null;
        } else {
            timeInfo$$1 = readcom_akexorcist_googledirection_model_TimeInfo(parcel$$2);
        }
        leg$$1 .departureTime = timeInfo$$1;
        com.amanladia.jars.model.Info info$$1;
        if (parcel$$2 .readInt() == -1) {
            info$$1 = null;
        } else {
            info$$1 = readcom_akexorcist_googledirection_model_Info(parcel$$2);
        }
        leg$$1 .duration = info$$1;
        com.amanladia.jars.model.Info info$$2;
        if (parcel$$2 .readInt() == -1) {
            info$$2 = null;
        } else {
            info$$2 = readcom_akexorcist_googledirection_model_Info(parcel$$2);
        }
        leg$$1 .durationInTraffic = info$$2;
        com.amanladia.jars.model.Info info$$3;
        if (parcel$$2 .readInt() == -1) {
            info$$3 = null;
        } else {
            info$$3 = readcom_akexorcist_googledirection_model_Info(parcel$$2);
        }
        leg$$1 .distance = info$$3;
        com.amanladia.jars.model.Coordination coordination$$1;
        if (parcel$$2 .readInt() == -1) {
            coordination$$1 = null;
        } else {
            coordination$$1 = readcom_akexorcist_googledirection_model_Coordination(parcel$$2);
        }
        leg$$1 .startLocation = coordination$$1;
        com.amanladia.jars.model.TimeInfo timeInfo$$2;
        if (parcel$$2 .readInt() == -1) {
            timeInfo$$2 = null;
        } else {
            timeInfo$$2 = readcom_akexorcist_googledirection_model_TimeInfo(parcel$$2);
        }
        leg$$1 .arrivalTime = timeInfo$$2;
        leg$$1 .startAddress = parcel$$2 .readString();
        int int$$0 = parcel$$2 .readInt();
        ArrayList<com.amanladia.jars.model.Waypoint> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new ArrayList<com.amanladia.jars.model.Waypoint>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                com.amanladia.jars.model.Waypoint waypoint$$1;
                if (parcel$$2 .readInt() == -1) {
                    waypoint$$1 = null;
                } else {
                    waypoint$$1 = readcom_akexorcist_googledirection_model_Waypoint(parcel$$2);
                }
                list$$0 .add(waypoint$$1);
            }
        }
        leg$$1 .viaWaypointList = list$$0;
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
                    step$$2 = readcom_akexorcist_googledirection_model_Step(parcel$$2);
                }
                list$$1 .add(step$$2);
            }
        }
        leg$$1 .stepList = list$$1;
        leg$$1 .endAddress = parcel$$2 .readString();
        com.amanladia.jars.model.Coordination coordination$$6;
        if (parcel$$2 .readInt() == -1) {
            coordination$$6 = null;
        } else {
            coordination$$6 = readcom_akexorcist_googledirection_model_Coordination(parcel$$2);
        }
        leg$$1 .endLocation = coordination$$6;
        return leg$$1;
    }

    private com.amanladia.jars.model.TimeInfo readcom_akexorcist_googledirection_model_TimeInfo(android.os.Parcel parcel$$3) {
        com.amanladia.jars.model.TimeInfo timeInfo$$0;
        timeInfo$$0 = new com.amanladia.jars.model.TimeInfo();
        timeInfo$$0 .timeZone = parcel$$3 .readString();
        timeInfo$$0 .text = parcel$$3 .readString();
        timeInfo$$0 .value = parcel$$3 .readString();
        return timeInfo$$0;
    }

    private com.amanladia.jars.model.Info readcom_akexorcist_googledirection_model_Info(android.os.Parcel parcel$$4) {
        com.amanladia.jars.model.Info info$$0;
        info$$0 = new com.amanladia.jars.model.Info();
        info$$0 .text = parcel$$4 .readString();
        info$$0 .value = parcel$$4 .readString();
        return info$$0;
    }

    private com.amanladia.jars.model.Coordination readcom_akexorcist_googledirection_model_Coordination(android.os.Parcel parcel$$5) {
        com.amanladia.jars.model.Coordination coordination$$0;
        coordination$$0 = new com.amanladia.jars.model.Coordination();
        coordination$$0 .latitude = parcel$$5 .readDouble();
        coordination$$0 .longitude = parcel$$5 .readDouble();
        return coordination$$0;
    }

    private com.amanladia.jars.model.Waypoint readcom_akexorcist_googledirection_model_Waypoint(android.os.Parcel parcel$$6) {
        com.amanladia.jars.model.Waypoint waypoint$$0;
        waypoint$$0 = new com.amanladia.jars.model.Waypoint();
        waypoint$$0 .interpolation = parcel$$6 .readDouble();
        waypoint$$0 .index = parcel$$6 .readInt();
        com.amanladia.jars.model.Coordination coordination$$2;
        if (parcel$$6 .readInt() == -1) {
            coordination$$2 = null;
        } else {
            coordination$$2 = readcom_akexorcist_googledirection_model_Coordination(parcel$$6);
        }
        waypoint$$0 .location = coordination$$2;
        return waypoint$$0;
    }

    private com.amanladia.jars.model.Step readcom_akexorcist_googledirection_model_Step(android.os.Parcel parcel$$7) {
        com.amanladia.jars.model.Step step$$0;
        step$$0 = new com.amanladia.jars.model.Step();
        com.amanladia.jars.model.Info info$$4;
        if (parcel$$7 .readInt() == -1) {
            info$$4 = null;
        } else {
            info$$4 = readcom_akexorcist_googledirection_model_Info(parcel$$7);
        }
        step$$0 .duration = info$$4;
        step$$0 .htmlInstruction = parcel$$7 .readString();
        com.amanladia.jars.model.Info info$$5;
        if (parcel$$7 .readInt() == -1) {
            info$$5 = null;
        } else {
            info$$5 = readcom_akexorcist_googledirection_model_Info(parcel$$7);
        }
        step$$0 .distance = info$$5;
        com.amanladia.jars.model.Coordination coordination$$3;
        if (parcel$$7 .readInt() == -1) {
            coordination$$3 = null;
        } else {
            coordination$$3 = readcom_akexorcist_googledirection_model_Coordination(parcel$$7);
        }
        step$$0 .startLocation = coordination$$3;
        com.amanladia.jars.model.TransitDetail transitDetail$$1;
        if (parcel$$7 .readInt() == -1) {
            transitDetail$$1 = null;
        } else {
            transitDetail$$1 = readcom_akexorcist_googledirection_model_TransitDetail(parcel$$7);
        }
        step$$0 .transitDetail = transitDetail$$1;
        int int$$6 = parcel$$7 .readInt();
        ArrayList<com.amanladia.jars.model.Step> list$$3;
        if (int$$6 < 0) {
            list$$3 = null;
        } else {
            list$$3 = new ArrayList<com.amanladia.jars.model.Step>();
            for (int int$$7 = 0; (int$$7 <int$$6); int$$7 ++) {
                com.amanladia.jars.model.Step step$$1;
                if (parcel$$7 .readInt() == -1) {
                    step$$1 = null;
                } else {
                    step$$1 = readcom_akexorcist_googledirection_model_Step(parcel$$7);
                }
                list$$3 .add(step$$1);
            }
        }
        step$$0 .stepList = list$$3;
        com.amanladia.jars.model.Coordination coordination$$5;
        if (parcel$$7 .readInt() == -1) {
            coordination$$5 = null;
        } else {
            coordination$$5 = readcom_akexorcist_googledirection_model_Coordination(parcel$$7);
        }
        step$$0 .endLocation = coordination$$5;
        step$$0 .maneuver = parcel$$7 .readString();
        com.amanladia.jars.model.RoutePolyline routePolyline$$1;
        if (parcel$$7 .readInt() == -1) {
            routePolyline$$1 = null;
        } else {
            routePolyline$$1 = readcom_akexorcist_googledirection_model_RoutePolyline(parcel$$7);
        }
        step$$0 .polyline = routePolyline$$1;
        step$$0 .travelMode = parcel$$7 .readString();
        return step$$0;
    }

    private com.amanladia.jars.model.TransitDetail readcom_akexorcist_googledirection_model_TransitDetail(android.os.Parcel parcel$$8) {
        com.amanladia.jars.model.TransitDetail transitDetail$$0;
        transitDetail$$0 = new com.amanladia.jars.model.TransitDetail();
        com.amanladia.jars.model.TimeInfo timeInfo$$3;
        if (parcel$$8 .readInt() == -1) {
            timeInfo$$3 = null;
        } else {
            timeInfo$$3 = readcom_akexorcist_googledirection_model_TimeInfo(parcel$$8);
        }
        transitDetail$$0 .departureTime = timeInfo$$3;
        transitDetail$$0 .headsign = parcel$$8 .readString();
        transitDetail$$0 .stopNumber = parcel$$8 .readString();
        com.amanladia.jars.model.StopPoint stopPoint$$1;
        if (parcel$$8 .readInt() == -1) {
            stopPoint$$1 = null;
        } else {
            stopPoint$$1 = readcom_akexorcist_googledirection_model_StopPoint(parcel$$8);
        }
        transitDetail$$0 .arrivalStopPoint = stopPoint$$1;
        com.amanladia.jars.model.StopPoint stopPoint$$2;
        if (parcel$$8 .readInt() == -1) {
            stopPoint$$2 = null;
        } else {
            stopPoint$$2 = readcom_akexorcist_googledirection_model_StopPoint(parcel$$8);
        }
        transitDetail$$0 .departureStopPoint = stopPoint$$2;
        com.amanladia.jars.model.TimeInfo timeInfo$$4;
        if (parcel$$8 .readInt() == -1) {
            timeInfo$$4 = null;
        } else {
            timeInfo$$4 = readcom_akexorcist_googledirection_model_TimeInfo(parcel$$8);
        }
        transitDetail$$0 .arrivalTime = timeInfo$$4;
        com.amanladia.jars.model.Line line$$1;
        if (parcel$$8 .readInt() == -1) {
            line$$1 = null;
        } else {
            line$$1 = readcom_akexorcist_googledirection_model_Line(parcel$$8);
        }
        transitDetail$$0 .line = line$$1;
        return transitDetail$$0;
    }

    private com.amanladia.jars.model.StopPoint readcom_akexorcist_googledirection_model_StopPoint(android.os.Parcel parcel$$9) {
        com.amanladia.jars.model.StopPoint stopPoint$$0;
        stopPoint$$0 = new com.amanladia.jars.model.StopPoint();
        stopPoint$$0 .name = parcel$$9 .readString();
        com.amanladia.jars.model.Coordination coordination$$4;
        if (parcel$$9 .readInt() == -1) {
            coordination$$4 = null;
        } else {
            coordination$$4 = readcom_akexorcist_googledirection_model_Coordination(parcel$$9);
        }
        stopPoint$$0 .location = coordination$$4;
        return stopPoint$$0;
    }

    private com.amanladia.jars.model.Line readcom_akexorcist_googledirection_model_Line(android.os.Parcel parcel$$10) {
        com.amanladia.jars.model.Line line$$0;
        line$$0 = new com.amanladia.jars.model.Line();
        line$$0 .color = parcel$$10 .readString();
        line$$0 .name = parcel$$10 .readString();
        line$$0 .shortName = parcel$$10 .readString();
        line$$0 .textColor = parcel$$10 .readString();
        int int$$4 = parcel$$10 .readInt();
        ArrayList<com.amanladia.jars.model.Agency> list$$2;
        if (int$$4 < 0) {
            list$$2 = null;
        } else {
            list$$2 = new ArrayList<com.amanladia.jars.model.Agency>();
            for (int int$$5 = 0; (int$$5 <int$$4); int$$5 ++) {
                com.amanladia.jars.model.Agency agency$$1;
                if (parcel$$10 .readInt() == -1) {
                    agency$$1 = null;
                } else {
                    agency$$1 = readcom_akexorcist_googledirection_model_Agency(parcel$$10);
                }
                list$$2 .add(agency$$1);
            }
        }
        line$$0 .agencyList = list$$2;
        com.amanladia.jars.model.Vehicle vehicle$$1;
        if (parcel$$10 .readInt() == -1) {
            vehicle$$1 = null;
        } else {
            vehicle$$1 = readcom_akexorcist_googledirection_model_Vehicle(parcel$$10);
        }
        line$$0 .vehicle = vehicle$$1;
        return line$$0;
    }

    private com.amanladia.jars.model.Agency readcom_akexorcist_googledirection_model_Agency(android.os.Parcel parcel$$11) {
        com.amanladia.jars.model.Agency agency$$0;
        agency$$0 = new com.amanladia.jars.model.Agency();
        agency$$0 .name = parcel$$11 .readString();
        agency$$0 .url = parcel$$11 .readString();
        return agency$$0;
    }

    private com.amanladia.jars.model.Vehicle readcom_akexorcist_googledirection_model_Vehicle(android.os.Parcel parcel$$12) {
        com.amanladia.jars.model.Vehicle vehicle$$0;
        vehicle$$0 = new com.amanladia.jars.model.Vehicle();
        vehicle$$0 .name = parcel$$12 .readString();
        vehicle$$0 .iconUrl = parcel$$12 .readString();
        vehicle$$0 .type = parcel$$12 .readString();
        return vehicle$$0;
    }

    private com.amanladia.jars.model.RoutePolyline readcom_akexorcist_googledirection_model_RoutePolyline(android.os.Parcel parcel$$13) {
        com.amanladia.jars.model.RoutePolyline routePolyline$$0;
        routePolyline$$0 = new com.amanladia.jars.model.RoutePolyline();
        routePolyline$$0 .rawPointList = parcel$$13 .readString();
        return routePolyline$$0;
    }

    private void writecom_akexorcist_googledirection_model_Leg(com.amanladia.jars.model.Leg leg$$3, android.os.Parcel parcel$$14, int flags$$0) {
        if (leg$$3 .departureTime == null) {
            parcel$$14 .writeInt(-1);
        } else {
            parcel$$14 .writeInt(1);
            writecom_akexorcist_googledirection_model_TimeInfo(leg$$3 .departureTime, parcel$$14, flags$$0);
        }
        if (leg$$3 .duration == null) {
            parcel$$14 .writeInt(-1);
        } else {
            parcel$$14 .writeInt(1);
            writecom_akexorcist_googledirection_model_Info(leg$$3 .duration, parcel$$14, flags$$0);
        }
        if (leg$$3 .durationInTraffic == null) {
            parcel$$14 .writeInt(-1);
        } else {
            parcel$$14 .writeInt(1);
            writecom_akexorcist_googledirection_model_Info(leg$$3 .durationInTraffic, parcel$$14, flags$$0);
        }
        if (leg$$3 .distance == null) {
            parcel$$14 .writeInt(-1);
        } else {
            parcel$$14 .writeInt(1);
            writecom_akexorcist_googledirection_model_Info(leg$$3 .distance, parcel$$14, flags$$0);
        }
        if (leg$$3 .startLocation == null) {
            parcel$$14 .writeInt(-1);
        } else {
            parcel$$14 .writeInt(1);
            writecom_akexorcist_googledirection_model_Coordination(leg$$3 .startLocation, parcel$$14, flags$$0);
        }
        if (leg$$3 .arrivalTime == null) {
            parcel$$14 .writeInt(-1);
        } else {
            parcel$$14 .writeInt(1);
            writecom_akexorcist_googledirection_model_TimeInfo(leg$$3 .arrivalTime, parcel$$14, flags$$0);
        }
        parcel$$14 .writeString(leg$$3 .startAddress);
        if (leg$$3 .viaWaypointList == null) {
            parcel$$14 .writeInt(-1);
        } else {
            parcel$$14 .writeInt(leg$$3 .viaWaypointList.size());
            for (com.amanladia.jars.model.Waypoint waypoint$$2 : ((java.util.List<com.amanladia.jars.model.Waypoint> ) leg$$3 .viaWaypointList)) {
                if (waypoint$$2 == null) {
                    parcel$$14 .writeInt(-1);
                } else {
                    parcel$$14 .writeInt(1);
                    writecom_akexorcist_googledirection_model_Waypoint(waypoint$$2, parcel$$14, flags$$0);
                }
            }
        }
        if (leg$$3 .stepList == null) {
            parcel$$14 .writeInt(-1);
        } else {
            parcel$$14 .writeInt(leg$$3 .stepList.size());
            for (com.amanladia.jars.model.Step step$$3 : ((java.util.List<com.amanladia.jars.model.Step> ) leg$$3 .stepList)) {
                if (step$$3 == null) {
                    parcel$$14 .writeInt(-1);
                } else {
                    parcel$$14 .writeInt(1);
                    writecom_akexorcist_googledirection_model_Step(step$$3, parcel$$14, flags$$0);
                }
            }
        }
        parcel$$14 .writeString(leg$$3 .endAddress);
        if (leg$$3 .endLocation == null) {
            parcel$$14 .writeInt(-1);
        } else {
            parcel$$14 .writeInt(1);
            writecom_akexorcist_googledirection_model_Coordination(leg$$3 .endLocation, parcel$$14, flags$$0);
        }
    }

    private void writecom_akexorcist_googledirection_model_TimeInfo(com.amanladia.jars.model.TimeInfo timeInfo$$5, android.os.Parcel parcel$$15, int flags$$1) {
        parcel$$15 .writeString(timeInfo$$5 .timeZone);
        parcel$$15 .writeString(timeInfo$$5 .text);
        parcel$$15 .writeString(timeInfo$$5 .value);
    }

    private void writecom_akexorcist_googledirection_model_Info(com.amanladia.jars.model.Info info$$6, android.os.Parcel parcel$$16, int flags$$2) {
        parcel$$16 .writeString(info$$6 .text);
        parcel$$16 .writeString(info$$6 .value);
    }

    private void writecom_akexorcist_googledirection_model_Coordination(com.amanladia.jars.model.Coordination coordination$$7, android.os.Parcel parcel$$17, int flags$$3) {
        parcel$$17 .writeDouble(coordination$$7 .latitude);
        parcel$$17 .writeDouble(coordination$$7 .longitude);
    }

    private void writecom_akexorcist_googledirection_model_Waypoint(com.amanladia.jars.model.Waypoint waypoint$$3, android.os.Parcel parcel$$18, int flags$$4) {
        parcel$$18 .writeDouble(waypoint$$3 .interpolation);
        parcel$$18 .writeInt(waypoint$$3 .index);
        if (waypoint$$3 .location == null) {
            parcel$$18 .writeInt(-1);
        } else {
            parcel$$18 .writeInt(1);
            writecom_akexorcist_googledirection_model_Coordination(waypoint$$3 .location, parcel$$18, flags$$4);
        }
    }

    private void writecom_akexorcist_googledirection_model_Step(com.amanladia.jars.model.Step step$$4, android.os.Parcel parcel$$19, int flags$$5) {
        if (step$$4 .duration == null) {
            parcel$$19 .writeInt(-1);
        } else {
            parcel$$19 .writeInt(1);
            writecom_akexorcist_googledirection_model_Info(step$$4 .duration, parcel$$19, flags$$5);
        }
        parcel$$19 .writeString(step$$4 .htmlInstruction);
        if (step$$4 .distance == null) {
            parcel$$19 .writeInt(-1);
        } else {
            parcel$$19 .writeInt(1);
            writecom_akexorcist_googledirection_model_Info(step$$4 .distance, parcel$$19, flags$$5);
        }
        if (step$$4 .startLocation == null) {
            parcel$$19 .writeInt(-1);
        } else {
            parcel$$19 .writeInt(1);
            writecom_akexorcist_googledirection_model_Coordination(step$$4 .startLocation, parcel$$19, flags$$5);
        }
        if (step$$4 .transitDetail == null) {
            parcel$$19 .writeInt(-1);
        } else {
            parcel$$19 .writeInt(1);
            writecom_akexorcist_googledirection_model_TransitDetail(step$$4 .transitDetail, parcel$$19, flags$$5);
        }
        if (step$$4 .stepList == null) {
            parcel$$19 .writeInt(-1);
        } else {
            parcel$$19 .writeInt(step$$4 .stepList.size());
            for (com.amanladia.jars.model.Step step$$5 : ((java.util.List<com.amanladia.jars.model.Step> ) step$$4 .stepList)) {
                if (step$$5 == null) {
                    parcel$$19 .writeInt(-1);
                } else {
                    parcel$$19 .writeInt(1);
                    writecom_akexorcist_googledirection_model_Step(step$$5, parcel$$19, flags$$5);
                }
            }
        }
        if (step$$4 .endLocation == null) {
            parcel$$19 .writeInt(-1);
        } else {
            parcel$$19 .writeInt(1);
            writecom_akexorcist_googledirection_model_Coordination(step$$4 .endLocation, parcel$$19, flags$$5);
        }
        parcel$$19 .writeString(step$$4 .maneuver);
        if (step$$4 .polyline == null) {
            parcel$$19 .writeInt(-1);
        } else {
            parcel$$19 .writeInt(1);
            writecom_akexorcist_googledirection_model_RoutePolyline(step$$4 .polyline, parcel$$19, flags$$5);
        }
        parcel$$19 .writeString(step$$4 .travelMode);
    }

    private void writecom_akexorcist_googledirection_model_TransitDetail(com.amanladia.jars.model.TransitDetail transitDetail$$2, android.os.Parcel parcel$$20, int flags$$6) {
        if (transitDetail$$2 .departureTime == null) {
            parcel$$20 .writeInt(-1);
        } else {
            parcel$$20 .writeInt(1);
            writecom_akexorcist_googledirection_model_TimeInfo(transitDetail$$2 .departureTime, parcel$$20, flags$$6);
        }
        parcel$$20 .writeString(transitDetail$$2 .headsign);
        parcel$$20 .writeString(transitDetail$$2 .stopNumber);
        if (transitDetail$$2 .arrivalStopPoint == null) {
            parcel$$20 .writeInt(-1);
        } else {
            parcel$$20 .writeInt(1);
            writecom_akexorcist_googledirection_model_StopPoint(transitDetail$$2 .arrivalStopPoint, parcel$$20, flags$$6);
        }
        if (transitDetail$$2 .departureStopPoint == null) {
            parcel$$20 .writeInt(-1);
        } else {
            parcel$$20 .writeInt(1);
            writecom_akexorcist_googledirection_model_StopPoint(transitDetail$$2 .departureStopPoint, parcel$$20, flags$$6);
        }
        if (transitDetail$$2 .arrivalTime == null) {
            parcel$$20 .writeInt(-1);
        } else {
            parcel$$20 .writeInt(1);
            writecom_akexorcist_googledirection_model_TimeInfo(transitDetail$$2 .arrivalTime, parcel$$20, flags$$6);
        }
        if (transitDetail$$2 .line == null) {
            parcel$$20 .writeInt(-1);
        } else {
            parcel$$20 .writeInt(1);
            writecom_akexorcist_googledirection_model_Line(transitDetail$$2 .line, parcel$$20, flags$$6);
        }
    }

    private void writecom_akexorcist_googledirection_model_StopPoint(com.amanladia.jars.model.StopPoint stopPoint$$3, android.os.Parcel parcel$$21, int flags$$7) {
        parcel$$21 .writeString(stopPoint$$3 .name);
        if (stopPoint$$3 .location == null) {
            parcel$$21 .writeInt(-1);
        } else {
            parcel$$21 .writeInt(1);
            writecom_akexorcist_googledirection_model_Coordination(stopPoint$$3 .location, parcel$$21, flags$$7);
        }
    }

    private void writecom_akexorcist_googledirection_model_Line(com.amanladia.jars.model.Line line$$2, android.os.Parcel parcel$$22, int flags$$8) {
        parcel$$22 .writeString(line$$2 .color);
        parcel$$22 .writeString(line$$2 .name);
        parcel$$22 .writeString(line$$2 .shortName);
        parcel$$22 .writeString(line$$2 .textColor);
        if (line$$2 .agencyList == null) {
            parcel$$22 .writeInt(-1);
        } else {
            parcel$$22 .writeInt(line$$2 .agencyList.size());
            for (com.amanladia.jars.model.Agency agency$$2 : ((java.util.List<com.amanladia.jars.model.Agency> ) line$$2 .agencyList)) {
                if (agency$$2 == null) {
                    parcel$$22 .writeInt(-1);
                } else {
                    parcel$$22 .writeInt(1);
                    writecom_akexorcist_googledirection_model_Agency(agency$$2, parcel$$22, flags$$8);
                }
            }
        }
        if (line$$2 .vehicle == null) {
            parcel$$22 .writeInt(-1);
        } else {
            parcel$$22 .writeInt(1);
            writecom_akexorcist_googledirection_model_Vehicle(line$$2 .vehicle, parcel$$22, flags$$8);
        }
    }

    private void writecom_akexorcist_googledirection_model_Agency(com.amanladia.jars.model.Agency agency$$3, android.os.Parcel parcel$$23, int flags$$9) {
        parcel$$23 .writeString(agency$$3 .name);
        parcel$$23 .writeString(agency$$3 .url);
    }

    private void writecom_akexorcist_googledirection_model_Vehicle(com.amanladia.jars.model.Vehicle vehicle$$2, android.os.Parcel parcel$$24, int flags$$10) {
        parcel$$24 .writeString(vehicle$$2 .name);
        parcel$$24 .writeString(vehicle$$2 .iconUrl);
        parcel$$24 .writeString(vehicle$$2 .type);
    }

    private void writecom_akexorcist_googledirection_model_RoutePolyline(com.amanladia.jars.model.RoutePolyline routePolyline$$2, android.os.Parcel parcel$$25, int flags$$11) {
        parcel$$25 .writeString(routePolyline$$2 .rawPointList);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.amanladia.jars.model.Leg getParcel() {
        return leg$$0;
    }

    public final static class Creator$$6
        implements Creator<Leg$$Parcelable>
    {


        @Override
        public Leg$$Parcelable createFromParcel(android.os.Parcel parcel$$26) {
            return new Leg$$Parcelable(parcel$$26);
        }

        @Override
        public Leg$$Parcelable[] newArray(int size) {
            return new Leg$$Parcelable[size] ;
        }

    }

}
