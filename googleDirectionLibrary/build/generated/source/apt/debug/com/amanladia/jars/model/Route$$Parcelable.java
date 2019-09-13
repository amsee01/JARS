
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
public class Route$$Parcelable
    implements Parcelable, ParcelWrapper<com.amanladia.jars.model.Route>
{

    private com.amanladia.jars.model.Route route$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Route$$Parcelable.Creator$$5 CREATOR = new Route$$Parcelable.Creator$$5();

    public Route$$Parcelable(android.os.Parcel parcel$$0) {
        com.amanladia.jars.model.Route route$$2;
        if (parcel$$0 .readInt() == -1) {
            route$$2 = null;
        } else {
            route$$2 = readcom_amanladia_jars_model_Route(parcel$$0);
        }
        route$$0 = route$$2;
    }

    public Route$$Parcelable(com.amanladia.jars.model.Route route$$4) {
        route$$0 = route$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (route$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_amanladia_jars_model_Route(route$$0, parcel$$1, flags);
        }
    }

    private com.amanladia.jars.model.Route readcom_amanladia_jars_model_Route(android.os.Parcel parcel$$2) {
        com.amanladia.jars.model.Route route$$1;
        route$$1 = new com.amanladia.jars.model.Route();
        route$$1 .summary = parcel$$2 .readString();
        com.amanladia.jars.model.Fare fare$$1;
        if (parcel$$2 .readInt() == -1) {
            fare$$1 = null;
        } else {
            fare$$1 = readcom_amanladia_jars_model_Fare(parcel$$2);
        }
        route$$1 .fare = fare$$1;
        com.amanladia.jars.model.RoutePolyline routePolyline$$1;
        if (parcel$$2 .readInt() == -1) {
            routePolyline$$1 = null;
        } else {
            routePolyline$$1 = readcom_amanladia_jars_model_RoutePolyline(parcel$$2);
        }
        route$$1 .overviewPolyline = routePolyline$$1;
        route$$1 .copyrights = parcel$$2 .readString();
        int int$$0 = parcel$$2 .readInt();
        ArrayList<com.amanladia.jars.model.Leg> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new ArrayList<com.amanladia.jars.model.Leg>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                com.amanladia.jars.model.Leg leg$$1;
                if (parcel$$2 .readInt() == -1) {
                    leg$$1 = null;
                } else {
                    leg$$1 = readcom_amanladia_jars_model_Leg(parcel$$2);
                }
                list$$0 .add(leg$$1);
            }
        }
        route$$1 .legList = list$$0;
        com.amanladia.jars.model.Bound bound$$1;
        if (parcel$$2 .readInt() == -1) {
            bound$$1 = null;
        } else {
            bound$$1 = readcom_amanladia_jars_model_Bound(parcel$$2);
        }
        route$$1 .bound = bound$$1;
        int int$$10 = parcel$$2 .readInt();
        ArrayList<java.lang.String> list$$5;
        if (int$$10 < 0) {
            list$$5 = null;
        } else {
            list$$5 = new ArrayList<java.lang.String>();
            for (int int$$11 = 0; (int$$11 <int$$10); int$$11 ++) {
                list$$5 .add(parcel$$2 .readString());
            }
        }
        route$$1 .warningList = list$$5;
        return route$$1;
    }

    private com.amanladia.jars.model.Fare readcom_amanladia_jars_model_Fare(android.os.Parcel parcel$$3) {
        com.amanladia.jars.model.Fare fare$$0;
        fare$$0 = new com.amanladia.jars.model.Fare();
        fare$$0 .currency = parcel$$3 .readString();
        fare$$0 .text = parcel$$3 .readString();
        fare$$0 .value = parcel$$3 .readString();
        return fare$$0;
    }

    private com.amanladia.jars.model.RoutePolyline readcom_amanladia_jars_model_RoutePolyline(android.os.Parcel parcel$$4) {
        com.amanladia.jars.model.RoutePolyline routePolyline$$0;
        routePolyline$$0 = new com.amanladia.jars.model.RoutePolyline();
        routePolyline$$0 .rawPointList = parcel$$4 .readString();
        return routePolyline$$0;
    }

    private com.amanladia.jars.model.Leg readcom_amanladia_jars_model_Leg(android.os.Parcel parcel$$5) {
        com.amanladia.jars.model.Leg leg$$0;
        leg$$0 = new com.amanladia.jars.model.Leg();
        com.amanladia.jars.model.TimeInfo timeInfo$$1;
        if (parcel$$5 .readInt() == -1) {
            timeInfo$$1 = null;
        } else {
            timeInfo$$1 = readcom_amanladia_jars_model_TimeInfo(parcel$$5);
        }
        leg$$0 .departureTime = timeInfo$$1;
        com.amanladia.jars.model.Info info$$1;
        if (parcel$$5 .readInt() == -1) {
            info$$1 = null;
        } else {
            info$$1 = readcom_amanladia_jars_model_Info(parcel$$5);
        }
        leg$$0 .duration = info$$1;
        com.amanladia.jars.model.Info info$$2;
        if (parcel$$5 .readInt() == -1) {
            info$$2 = null;
        } else {
            info$$2 = readcom_amanladia_jars_model_Info(parcel$$5);
        }
        leg$$0 .durationInTraffic = info$$2;
        com.amanladia.jars.model.Info info$$3;
        if (parcel$$5 .readInt() == -1) {
            info$$3 = null;
        } else {
            info$$3 = readcom_amanladia_jars_model_Info(parcel$$5);
        }
        leg$$0 .distance = info$$3;
        com.amanladia.jars.model.Coordination coordination$$1;
        if (parcel$$5 .readInt() == -1) {
            coordination$$1 = null;
        } else {
            coordination$$1 = readcom_amanladia_jars_model_Coordination(parcel$$5);
        }
        leg$$0 .startLocation = coordination$$1;
        com.amanladia.jars.model.TimeInfo timeInfo$$2;
        if (parcel$$5 .readInt() == -1) {
            timeInfo$$2 = null;
        } else {
            timeInfo$$2 = readcom_amanladia_jars_model_TimeInfo(parcel$$5);
        }
        leg$$0 .arrivalTime = timeInfo$$2;
        leg$$0 .startAddress = parcel$$5 .readString();
        int int$$2 = parcel$$5 .readInt();
        ArrayList<com.amanladia.jars.model.Waypoint> list$$1;
        if (int$$2 < 0) {
            list$$1 = null;
        } else {
            list$$1 = new ArrayList<com.amanladia.jars.model.Waypoint>();
            for (int int$$3 = 0; (int$$3 <int$$2); int$$3 ++) {
                com.amanladia.jars.model.Waypoint waypoint$$1;
                if (parcel$$5 .readInt() == -1) {
                    waypoint$$1 = null;
                } else {
                    waypoint$$1 = readcom_amanladia_jars_model_Waypoint(parcel$$5);
                }
                list$$1 .add(waypoint$$1);
            }
        }
        leg$$0 .viaWaypointList = list$$1;
        int int$$4 = parcel$$5 .readInt();
        ArrayList<com.amanladia.jars.model.Step> list$$2;
        if (int$$4 < 0) {
            list$$2 = null;
        } else {
            list$$2 = new ArrayList<com.amanladia.jars.model.Step>();
            for (int int$$5 = 0; (int$$5 <int$$4); int$$5 ++) {
                com.amanladia.jars.model.Step step$$2;
                if (parcel$$5 .readInt() == -1) {
                    step$$2 = null;
                } else {
                    step$$2 = readcom_amanladia_jars_model_Step(parcel$$5);
                }
                list$$2 .add(step$$2);
            }
        }
        leg$$0 .stepList = list$$2;
        leg$$0 .endAddress = parcel$$5 .readString();
        com.amanladia.jars.model.Coordination coordination$$6;
        if (parcel$$5 .readInt() == -1) {
            coordination$$6 = null;
        } else {
            coordination$$6 = readcom_amanladia_jars_model_Coordination(parcel$$5);
        }
        leg$$0 .endLocation = coordination$$6;
        return leg$$0;
    }

    private com.amanladia.jars.model.TimeInfo readcom_amanladia_jars_model_TimeInfo(android.os.Parcel parcel$$6) {
        com.amanladia.jars.model.TimeInfo timeInfo$$0;
        timeInfo$$0 = new com.amanladia.jars.model.TimeInfo();
        timeInfo$$0 .timeZone = parcel$$6 .readString();
        timeInfo$$0 .text = parcel$$6 .readString();
        timeInfo$$0 .value = parcel$$6 .readString();
        return timeInfo$$0;
    }

    private com.amanladia.jars.model.Info readcom_amanladia_jars_model_Info(android.os.Parcel parcel$$7) {
        com.amanladia.jars.model.Info info$$0;
        info$$0 = new com.amanladia.jars.model.Info();
        info$$0 .text = parcel$$7 .readString();
        info$$0 .value = parcel$$7 .readString();
        return info$$0;
    }

    private com.amanladia.jars.model.Coordination readcom_amanladia_jars_model_Coordination(android.os.Parcel parcel$$8) {
        com.amanladia.jars.model.Coordination coordination$$0;
        coordination$$0 = new com.amanladia.jars.model.Coordination();
        coordination$$0 .latitude = parcel$$8 .readDouble();
        coordination$$0 .longitude = parcel$$8 .readDouble();
        return coordination$$0;
    }

    private com.amanladia.jars.model.Waypoint readcom_amanladia_jars_model_Waypoint(android.os.Parcel parcel$$9) {
        com.amanladia.jars.model.Waypoint waypoint$$0;
        waypoint$$0 = new com.amanladia.jars.model.Waypoint();
        waypoint$$0 .interpolation = parcel$$9 .readDouble();
        waypoint$$0 .index = parcel$$9 .readInt();
        com.amanladia.jars.model.Coordination coordination$$2;
        if (parcel$$9 .readInt() == -1) {
            coordination$$2 = null;
        } else {
            coordination$$2 = readcom_amanladia_jars_model_Coordination(parcel$$9);
        }
        waypoint$$0 .location = coordination$$2;
        return waypoint$$0;
    }

    private com.amanladia.jars.model.Step readcom_amanladia_jars_model_Step(android.os.Parcel parcel$$10) {
        com.amanladia.jars.model.Step step$$0;
        step$$0 = new com.amanladia.jars.model.Step();
        com.amanladia.jars.model.Info info$$4;
        if (parcel$$10 .readInt() == -1) {
            info$$4 = null;
        } else {
            info$$4 = readcom_amanladia_jars_model_Info(parcel$$10);
        }
        step$$0 .duration = info$$4;
        step$$0 .htmlInstruction = parcel$$10 .readString();
        com.amanladia.jars.model.Info info$$5;
        if (parcel$$10 .readInt() == -1) {
            info$$5 = null;
        } else {
            info$$5 = readcom_amanladia_jars_model_Info(parcel$$10);
        }
        step$$0 .distance = info$$5;
        com.amanladia.jars.model.Coordination coordination$$3;
        if (parcel$$10 .readInt() == -1) {
            coordination$$3 = null;
        } else {
            coordination$$3 = readcom_amanladia_jars_model_Coordination(parcel$$10);
        }
        step$$0 .startLocation = coordination$$3;
        com.amanladia.jars.model.TransitDetail transitDetail$$1;
        if (parcel$$10 .readInt() == -1) {
            transitDetail$$1 = null;
        } else {
            transitDetail$$1 = readcom_amanladia_jars_model_TransitDetail(parcel$$10);
        }
        step$$0 .transitDetail = transitDetail$$1;
        int int$$8 = parcel$$10 .readInt();
        ArrayList<com.amanladia.jars.model.Step> list$$4;
        if (int$$8 < 0) {
            list$$4 = null;
        } else {
            list$$4 = new ArrayList<com.amanladia.jars.model.Step>();
            for (int int$$9 = 0; (int$$9 <int$$8); int$$9 ++) {
                com.amanladia.jars.model.Step step$$1;
                if (parcel$$10 .readInt() == -1) {
                    step$$1 = null;
                } else {
                    step$$1 = readcom_amanladia_jars_model_Step(parcel$$10);
                }
                list$$4 .add(step$$1);
            }
        }
        step$$0 .stepList = list$$4;
        com.amanladia.jars.model.Coordination coordination$$5;
        if (parcel$$10 .readInt() == -1) {
            coordination$$5 = null;
        } else {
            coordination$$5 = readcom_amanladia_jars_model_Coordination(parcel$$10);
        }
        step$$0 .endLocation = coordination$$5;
        step$$0 .maneuver = parcel$$10 .readString();
        com.amanladia.jars.model.RoutePolyline routePolyline$$2;
        if (parcel$$10 .readInt() == -1) {
            routePolyline$$2 = null;
        } else {
            routePolyline$$2 = readcom_amanladia_jars_model_RoutePolyline(parcel$$10);
        }
        step$$0 .polyline = routePolyline$$2;
        step$$0 .travelMode = parcel$$10 .readString();
        return step$$0;
    }

    private com.amanladia.jars.model.TransitDetail readcom_amanladia_jars_model_TransitDetail(android.os.Parcel parcel$$11) {
        com.amanladia.jars.model.TransitDetail transitDetail$$0;
        transitDetail$$0 = new com.amanladia.jars.model.TransitDetail();
        com.amanladia.jars.model.TimeInfo timeInfo$$3;
        if (parcel$$11 .readInt() == -1) {
            timeInfo$$3 = null;
        } else {
            timeInfo$$3 = readcom_amanladia_jars_model_TimeInfo(parcel$$11);
        }
        transitDetail$$0 .departureTime = timeInfo$$3;
        transitDetail$$0 .headsign = parcel$$11 .readString();
        transitDetail$$0 .stopNumber = parcel$$11 .readString();
        com.amanladia.jars.model.StopPoint stopPoint$$1;
        if (parcel$$11 .readInt() == -1) {
            stopPoint$$1 = null;
        } else {
            stopPoint$$1 = readcom_amanladia_jars_model_StopPoint(parcel$$11);
        }
        transitDetail$$0 .arrivalStopPoint = stopPoint$$1;
        com.amanladia.jars.model.StopPoint stopPoint$$2;
        if (parcel$$11 .readInt() == -1) {
            stopPoint$$2 = null;
        } else {
            stopPoint$$2 = readcom_amanladia_jars_model_StopPoint(parcel$$11);
        }
        transitDetail$$0 .departureStopPoint = stopPoint$$2;
        com.amanladia.jars.model.TimeInfo timeInfo$$4;
        if (parcel$$11 .readInt() == -1) {
            timeInfo$$4 = null;
        } else {
            timeInfo$$4 = readcom_amanladia_jars_model_TimeInfo(parcel$$11);
        }
        transitDetail$$0 .arrivalTime = timeInfo$$4;
        com.amanladia.jars.model.Line line$$1;
        if (parcel$$11 .readInt() == -1) {
            line$$1 = null;
        } else {
            line$$1 = readcom_amanladia_jars_model_Line(parcel$$11);
        }
        transitDetail$$0 .line = line$$1;
        return transitDetail$$0;
    }

    private com.amanladia.jars.model.StopPoint readcom_amanladia_jars_model_StopPoint(android.os.Parcel parcel$$12) {
        com.amanladia.jars.model.StopPoint stopPoint$$0;
        stopPoint$$0 = new com.amanladia.jars.model.StopPoint();
        stopPoint$$0 .name = parcel$$12 .readString();
        com.amanladia.jars.model.Coordination coordination$$4;
        if (parcel$$12 .readInt() == -1) {
            coordination$$4 = null;
        } else {
            coordination$$4 = readcom_amanladia_jars_model_Coordination(parcel$$12);
        }
        stopPoint$$0 .location = coordination$$4;
        return stopPoint$$0;
    }

    private com.amanladia.jars.model.Line readcom_amanladia_jars_model_Line(android.os.Parcel parcel$$13) {
        com.amanladia.jars.model.Line line$$0;
        line$$0 = new com.amanladia.jars.model.Line();
        line$$0 .color = parcel$$13 .readString();
        line$$0 .name = parcel$$13 .readString();
        line$$0 .shortName = parcel$$13 .readString();
        line$$0 .textColor = parcel$$13 .readString();
        int int$$6 = parcel$$13 .readInt();
        ArrayList<com.amanladia.jars.model.Agency> list$$3;
        if (int$$6 < 0) {
            list$$3 = null;
        } else {
            list$$3 = new ArrayList<com.amanladia.jars.model.Agency>();
            for (int int$$7 = 0; (int$$7 <int$$6); int$$7 ++) {
                com.amanladia.jars.model.Agency agency$$1;
                if (parcel$$13 .readInt() == -1) {
                    agency$$1 = null;
                } else {
                    agency$$1 = readcom_amanladia_jars_model_Agency(parcel$$13);
                }
                list$$3 .add(agency$$1);
            }
        }
        line$$0 .agencyList = list$$3;
        com.amanladia.jars.model.Vehicle vehicle$$1;
        if (parcel$$13 .readInt() == -1) {
            vehicle$$1 = null;
        } else {
            vehicle$$1 = readcom_amanladia_jars_model_Vehicle(parcel$$13);
        }
        line$$0 .vehicle = vehicle$$1;
        return line$$0;
    }

    private com.amanladia.jars.model.Agency readcom_amanladia_jars_model_Agency(android.os.Parcel parcel$$14) {
        com.amanladia.jars.model.Agency agency$$0;
        agency$$0 = new com.amanladia.jars.model.Agency();
        agency$$0 .name = parcel$$14 .readString();
        agency$$0 .url = parcel$$14 .readString();
        return agency$$0;
    }

    private com.amanladia.jars.model.Vehicle readcom_amanladia_jars_model_Vehicle(android.os.Parcel parcel$$15) {
        com.amanladia.jars.model.Vehicle vehicle$$0;
        vehicle$$0 = new com.amanladia.jars.model.Vehicle();
        vehicle$$0 .name = parcel$$15 .readString();
        vehicle$$0 .iconUrl = parcel$$15 .readString();
        vehicle$$0 .type = parcel$$15 .readString();
        return vehicle$$0;
    }

    private com.amanladia.jars.model.Bound readcom_amanladia_jars_model_Bound(android.os.Parcel parcel$$16) {
        com.amanladia.jars.model.Bound bound$$0;
        bound$$0 = new com.amanladia.jars.model.Bound();
        com.amanladia.jars.model.Coordination coordination$$7;
        if (parcel$$16 .readInt() == -1) {
            coordination$$7 = null;
        } else {
            coordination$$7 = readcom_amanladia_jars_model_Coordination(parcel$$16);
        }
        bound$$0 .southwest = coordination$$7;
        com.amanladia.jars.model.Coordination coordination$$8;
        if (parcel$$16 .readInt() == -1) {
            coordination$$8 = null;
        } else {
            coordination$$8 = readcom_amanladia_jars_model_Coordination(parcel$$16);
        }
        bound$$0 .northeast = coordination$$8;
        return bound$$0;
    }

    private void writecom_amanladia_jars_model_Route(com.amanladia.jars.model.Route route$$3, android.os.Parcel parcel$$17, int flags$$0) {
        parcel$$17 .writeString(route$$3 .summary);
        if (route$$3 .fare == null) {
            parcel$$17 .writeInt(-1);
        } else {
            parcel$$17 .writeInt(1);
            writecom_amanladia_jars_model_Fare(route$$3 .fare, parcel$$17, flags$$0);
        }
        if (route$$3 .overviewPolyline == null) {
            parcel$$17 .writeInt(-1);
        } else {
            parcel$$17 .writeInt(1);
            writecom_amanladia_jars_model_RoutePolyline(route$$3 .overviewPolyline, parcel$$17, flags$$0);
        }
        parcel$$17 .writeString(route$$3 .copyrights);
        if (route$$3 .legList == null) {
            parcel$$17 .writeInt(-1);
        } else {
            parcel$$17 .writeInt(route$$3 .legList.size());
            for (com.amanladia.jars.model.Leg leg$$2 : ((java.util.List<com.amanladia.jars.model.Leg> ) route$$3 .legList)) {
                if (leg$$2 == null) {
                    parcel$$17 .writeInt(-1);
                } else {
                    parcel$$17 .writeInt(1);
                    writecom_amanladia_jars_model_Leg(leg$$2, parcel$$17, flags$$0);
                }
            }
        }
        if (route$$3 .bound == null) {
            parcel$$17 .writeInt(-1);
        } else {
            parcel$$17 .writeInt(1);
            writecom_amanladia_jars_model_Bound(route$$3 .bound, parcel$$17, flags$$0);
        }
        if (route$$3 .warningList == null) {
            parcel$$17 .writeInt(-1);
        } else {
            parcel$$17 .writeInt(route$$3 .warningList.size());
            for (java.lang.String string$$0 : ((java.util.List<java.lang.String> ) route$$3 .warningList)) {
                parcel$$17 .writeString(string$$0);
            }
        }
    }

    private void writecom_amanladia_jars_model_Fare(com.amanladia.jars.model.Fare fare$$2, android.os.Parcel parcel$$18, int flags$$1) {
        parcel$$18 .writeString(fare$$2 .currency);
        parcel$$18 .writeString(fare$$2 .text);
        parcel$$18 .writeString(fare$$2 .value);
    }

    private void writecom_amanladia_jars_model_RoutePolyline(com.amanladia.jars.model.RoutePolyline routePolyline$$3, android.os.Parcel parcel$$19, int flags$$2) {
        parcel$$19 .writeString(routePolyline$$3 .rawPointList);
    }

    private void writecom_amanladia_jars_model_Leg(com.amanladia.jars.model.Leg leg$$3, android.os.Parcel parcel$$20, int flags$$3) {
        if (leg$$3 .departureTime == null) {
            parcel$$20 .writeInt(-1);
        } else {
            parcel$$20 .writeInt(1);
            writecom_amanladia_jars_model_TimeInfo(leg$$3 .departureTime, parcel$$20, flags$$3);
        }
        if (leg$$3 .duration == null) {
            parcel$$20 .writeInt(-1);
        } else {
            parcel$$20 .writeInt(1);
            writecom_amanladia_jars_model_Info(leg$$3 .duration, parcel$$20, flags$$3);
        }
        if (leg$$3 .durationInTraffic == null) {
            parcel$$20 .writeInt(-1);
        } else {
            parcel$$20 .writeInt(1);
            writecom_amanladia_jars_model_Info(leg$$3 .durationInTraffic, parcel$$20, flags$$3);
        }
        if (leg$$3 .distance == null) {
            parcel$$20 .writeInt(-1);
        } else {
            parcel$$20 .writeInt(1);
            writecom_amanladia_jars_model_Info(leg$$3 .distance, parcel$$20, flags$$3);
        }
        if (leg$$3 .startLocation == null) {
            parcel$$20 .writeInt(-1);
        } else {
            parcel$$20 .writeInt(1);
            writecom_amanladia_jars_model_Coordination(leg$$3 .startLocation, parcel$$20, flags$$3);
        }
        if (leg$$3 .arrivalTime == null) {
            parcel$$20 .writeInt(-1);
        } else {
            parcel$$20 .writeInt(1);
            writecom_amanladia_jars_model_TimeInfo(leg$$3 .arrivalTime, parcel$$20, flags$$3);
        }
        parcel$$20 .writeString(leg$$3 .startAddress);
        if (leg$$3 .viaWaypointList == null) {
            parcel$$20 .writeInt(-1);
        } else {
            parcel$$20 .writeInt(leg$$3 .viaWaypointList.size());
            for (com.amanladia.jars.model.Waypoint waypoint$$2 : ((java.util.List<com.amanladia.jars.model.Waypoint> ) leg$$3 .viaWaypointList)) {
                if (waypoint$$2 == null) {
                    parcel$$20 .writeInt(-1);
                } else {
                    parcel$$20 .writeInt(1);
                    writecom_amanladia_jars_model_Waypoint(waypoint$$2, parcel$$20, flags$$3);
                }
            }
        }
        if (leg$$3 .stepList == null) {
            parcel$$20 .writeInt(-1);
        } else {
            parcel$$20 .writeInt(leg$$3 .stepList.size());
            for (com.amanladia.jars.model.Step step$$3 : ((java.util.List<com.amanladia.jars.model.Step> ) leg$$3 .stepList)) {
                if (step$$3 == null) {
                    parcel$$20 .writeInt(-1);
                } else {
                    parcel$$20 .writeInt(1);
                    writecom_amanladia_jars_model_Step(step$$3, parcel$$20, flags$$3);
                }
            }
        }
        parcel$$20 .writeString(leg$$3 .endAddress);
        if (leg$$3 .endLocation == null) {
            parcel$$20 .writeInt(-1);
        } else {
            parcel$$20 .writeInt(1);
            writecom_amanladia_jars_model_Coordination(leg$$3 .endLocation, parcel$$20, flags$$3);
        }
    }

    private void writecom_amanladia_jars_model_TimeInfo(com.amanladia.jars.model.TimeInfo timeInfo$$5, android.os.Parcel parcel$$21, int flags$$4) {
        parcel$$21 .writeString(timeInfo$$5 .timeZone);
        parcel$$21 .writeString(timeInfo$$5 .text);
        parcel$$21 .writeString(timeInfo$$5 .value);
    }

    private void writecom_amanladia_jars_model_Info(com.amanladia.jars.model.Info info$$6, android.os.Parcel parcel$$22, int flags$$5) {
        parcel$$22 .writeString(info$$6 .text);
        parcel$$22 .writeString(info$$6 .value);
    }

    private void writecom_amanladia_jars_model_Coordination(com.amanladia.jars.model.Coordination coordination$$9, android.os.Parcel parcel$$23, int flags$$6) {
        parcel$$23 .writeDouble(coordination$$9 .latitude);
        parcel$$23 .writeDouble(coordination$$9 .longitude);
    }

    private void writecom_amanladia_jars_model_Waypoint(com.amanladia.jars.model.Waypoint waypoint$$3, android.os.Parcel parcel$$24, int flags$$7) {
        parcel$$24 .writeDouble(waypoint$$3 .interpolation);
        parcel$$24 .writeInt(waypoint$$3 .index);
        if (waypoint$$3 .location == null) {
            parcel$$24 .writeInt(-1);
        } else {
            parcel$$24 .writeInt(1);
            writecom_amanladia_jars_model_Coordination(waypoint$$3 .location, parcel$$24, flags$$7);
        }
    }

    private void writecom_amanladia_jars_model_Step(com.amanladia.jars.model.Step step$$4, android.os.Parcel parcel$$25, int flags$$8) {
        if (step$$4 .duration == null) {
            parcel$$25 .writeInt(-1);
        } else {
            parcel$$25 .writeInt(1);
            writecom_amanladia_jars_model_Info(step$$4 .duration, parcel$$25, flags$$8);
        }
        parcel$$25 .writeString(step$$4 .htmlInstruction);
        if (step$$4 .distance == null) {
            parcel$$25 .writeInt(-1);
        } else {
            parcel$$25 .writeInt(1);
            writecom_amanladia_jars_model_Info(step$$4 .distance, parcel$$25, flags$$8);
        }
        if (step$$4 .startLocation == null) {
            parcel$$25 .writeInt(-1);
        } else {
            parcel$$25 .writeInt(1);
            writecom_amanladia_jars_model_Coordination(step$$4 .startLocation, parcel$$25, flags$$8);
        }
        if (step$$4 .transitDetail == null) {
            parcel$$25 .writeInt(-1);
        } else {
            parcel$$25 .writeInt(1);
            writecom_amanladia_jars_model_TransitDetail(step$$4 .transitDetail, parcel$$25, flags$$8);
        }
        if (step$$4 .stepList == null) {
            parcel$$25 .writeInt(-1);
        } else {
            parcel$$25 .writeInt(step$$4 .stepList.size());
            for (com.amanladia.jars.model.Step step$$5 : ((java.util.List<com.amanladia.jars.model.Step> ) step$$4 .stepList)) {
                if (step$$5 == null) {
                    parcel$$25 .writeInt(-1);
                } else {
                    parcel$$25 .writeInt(1);
                    writecom_amanladia_jars_model_Step(step$$5, parcel$$25, flags$$8);
                }
            }
        }
        if (step$$4 .endLocation == null) {
            parcel$$25 .writeInt(-1);
        } else {
            parcel$$25 .writeInt(1);
            writecom_amanladia_jars_model_Coordination(step$$4 .endLocation, parcel$$25, flags$$8);
        }
        parcel$$25 .writeString(step$$4 .maneuver);
        if (step$$4 .polyline == null) {
            parcel$$25 .writeInt(-1);
        } else {
            parcel$$25 .writeInt(1);
            writecom_amanladia_jars_model_RoutePolyline(step$$4 .polyline, parcel$$25, flags$$8);
        }
        parcel$$25 .writeString(step$$4 .travelMode);
    }

    private void writecom_amanladia_jars_model_TransitDetail(com.amanladia.jars.model.TransitDetail transitDetail$$2, android.os.Parcel parcel$$26, int flags$$9) {
        if (transitDetail$$2 .departureTime == null) {
            parcel$$26 .writeInt(-1);
        } else {
            parcel$$26 .writeInt(1);
            writecom_amanladia_jars_model_TimeInfo(transitDetail$$2 .departureTime, parcel$$26, flags$$9);
        }
        parcel$$26 .writeString(transitDetail$$2 .headsign);
        parcel$$26 .writeString(transitDetail$$2 .stopNumber);
        if (transitDetail$$2 .arrivalStopPoint == null) {
            parcel$$26 .writeInt(-1);
        } else {
            parcel$$26 .writeInt(1);
            writecom_amanladia_jars_model_StopPoint(transitDetail$$2 .arrivalStopPoint, parcel$$26, flags$$9);
        }
        if (transitDetail$$2 .departureStopPoint == null) {
            parcel$$26 .writeInt(-1);
        } else {
            parcel$$26 .writeInt(1);
            writecom_amanladia_jars_model_StopPoint(transitDetail$$2 .departureStopPoint, parcel$$26, flags$$9);
        }
        if (transitDetail$$2 .arrivalTime == null) {
            parcel$$26 .writeInt(-1);
        } else {
            parcel$$26 .writeInt(1);
            writecom_amanladia_jars_model_TimeInfo(transitDetail$$2 .arrivalTime, parcel$$26, flags$$9);
        }
        if (transitDetail$$2 .line == null) {
            parcel$$26 .writeInt(-1);
        } else {
            parcel$$26 .writeInt(1);
            writecom_amanladia_jars_model_Line(transitDetail$$2 .line, parcel$$26, flags$$9);
        }
    }

    private void writecom_amanladia_jars_model_StopPoint(com.amanladia.jars.model.StopPoint stopPoint$$3, android.os.Parcel parcel$$27, int flags$$10) {
        parcel$$27 .writeString(stopPoint$$3 .name);
        if (stopPoint$$3 .location == null) {
            parcel$$27 .writeInt(-1);
        } else {
            parcel$$27 .writeInt(1);
            writecom_amanladia_jars_model_Coordination(stopPoint$$3 .location, parcel$$27, flags$$10);
        }
    }

    private void writecom_amanladia_jars_model_Line(com.amanladia.jars.model.Line line$$2, android.os.Parcel parcel$$28, int flags$$11) {
        parcel$$28 .writeString(line$$2 .color);
        parcel$$28 .writeString(line$$2 .name);
        parcel$$28 .writeString(line$$2 .shortName);
        parcel$$28 .writeString(line$$2 .textColor);
        if (line$$2 .agencyList == null) {
            parcel$$28 .writeInt(-1);
        } else {
            parcel$$28 .writeInt(line$$2 .agencyList.size());
            for (com.amanladia.jars.model.Agency agency$$2 : ((java.util.List<com.amanladia.jars.model.Agency> ) line$$2 .agencyList)) {
                if (agency$$2 == null) {
                    parcel$$28 .writeInt(-1);
                } else {
                    parcel$$28 .writeInt(1);
                    writecom_amanladia_jars_model_Agency(agency$$2, parcel$$28, flags$$11);
                }
            }
        }
        if (line$$2 .vehicle == null) {
            parcel$$28 .writeInt(-1);
        } else {
            parcel$$28 .writeInt(1);
            writecom_amanladia_jars_model_Vehicle(line$$2 .vehicle, parcel$$28, flags$$11);
        }
    }

    private void writecom_amanladia_jars_model_Agency(com.amanladia.jars.model.Agency agency$$3, android.os.Parcel parcel$$29, int flags$$12) {
        parcel$$29 .writeString(agency$$3 .name);
        parcel$$29 .writeString(agency$$3 .url);
    }

    private void writecom_amanladia_jars_model_Vehicle(com.amanladia.jars.model.Vehicle vehicle$$2, android.os.Parcel parcel$$30, int flags$$13) {
        parcel$$30 .writeString(vehicle$$2 .name);
        parcel$$30 .writeString(vehicle$$2 .iconUrl);
        parcel$$30 .writeString(vehicle$$2 .type);
    }

    private void writecom_amanladia_jars_model_Bound(com.amanladia.jars.model.Bound bound$$2, android.os.Parcel parcel$$31, int flags$$14) {
        if (bound$$2 .southwest == null) {
            parcel$$31 .writeInt(-1);
        } else {
            parcel$$31 .writeInt(1);
            writecom_amanladia_jars_model_Coordination(bound$$2 .southwest, parcel$$31, flags$$14);
        }
        if (bound$$2 .northeast == null) {
            parcel$$31 .writeInt(-1);
        } else {
            parcel$$31 .writeInt(1);
            writecom_amanladia_jars_model_Coordination(bound$$2 .northeast, parcel$$31, flags$$14);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.amanladia.jars.model.Route getParcel() {
        return route$$0;
    }

    public final static class Creator$$5
        implements Creator<Route$$Parcelable>
    {


        @Override
        public Route$$Parcelable createFromParcel(android.os.Parcel parcel$$32) {
            return new Route$$Parcelable(parcel$$32);
        }

        @Override
        public Route$$Parcelable[] newArray(int size) {
            return new Route$$Parcelable[size] ;
        }

    }

}
