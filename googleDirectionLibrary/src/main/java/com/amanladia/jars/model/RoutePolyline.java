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

import com.amanladia.jars.util.DirectionConverter;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by Akexorcist on 11/29/15 AD.
 */

@Parcel(parcelsIndex = false)
public class RoutePolyline {
    @SerializedName("points")
    String rawPointList;

    public String getRawPointList() {
        return rawPointList;
    }

    public List<LatLng> getPointList() {
        return DirectionConverter.decodePoly(rawPointList);
    }
}
