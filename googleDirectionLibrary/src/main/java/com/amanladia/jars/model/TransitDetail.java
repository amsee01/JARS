/*

Copyright 2015 Akexorcist

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/

package com.amanladia.jars.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by Akexorcist on 11/29/15 AD.
 */

@Parcel(parcelsIndex = false)
public class TransitDetail {
    @SerializedName("arrival_stop")
    StopPoint arrivalStopPoint;
    @SerializedName("arrival_time")
    TimeInfo arrivalTime;
    @SerializedName("departure_stop")
    StopPoint departureStopPoint;
    @SerializedName("departure_time")
    TimeInfo departureTime;
    Line line;
    String headsign;
    @SerializedName("num_stops")
    String stopNumber;

    public StopPoint getArrivalStopPoint() {
        return arrivalStopPoint;
    }

    public TimeInfo getArrivalTime() {
        return arrivalTime;
    }

    public StopPoint getDepartureStopPoint() {
        return departureStopPoint;
    }

    public TimeInfo getDepartureTime() {
        return departureTime;
    }

    public Line getLine() {
        return line;
    }

    public String getHeadsign() {
        return headsign;
    }

    public String getStopNumber() {
        return stopNumber;
    }
}
