# JARS - Jacket Automation for Riders' Safety

- [Abstract](#abstract)
  * [Introducing JARS powered by Google:  ***" A Rider’s Safety Jacket"***](#introducing-jars-powered-by-google--------a-rider-s-safety-jacket----)
      - [*(A smart perspective in Road Safety Automation)*](#--a-smart-perspective-in-road-safety-automation--)
      - [*SAFE ROADS, HAPPY FAMILIES*](#-safe-roads--happy-families-)
    + [Origin of the thought-­‐ Snapshot of my Research](#origin-of-the-thought----snapshot-of-my-research)
  * [My RTI Query and Reply](#my-rti-query-and-reply)
  * [Why did I think of making a safety wearable for bikers?](#why-did-i-think-of-making-a-safety-wearable-for-bikers-)
  * [A Survey done in UAE](#a-survey-done-in-uae)
  * [State of safety automation for 2 wheelers](#state-of-safety-automation-for-2-wheelers)
  * [Purpose of my automation for 2 wheelers](#purpose-of-my-automation-for-2-wheelers)
  * [Statement of purpose](#statement-of-purpose)
  * [What is JARS?](#what-is-jars-)
  * [What are the features of JARS?](#what-are-the-features-of-jars-)
  * [How do the indicators toggle automatically?](#how-do-the-indicators-toggle-automatically-)
  * [How does JARS do this?](#how-does-jars-do-this-)
  * [The Mobile App](#the-mobile-app)
  * [The Arduino Lilypad Jacket](#the-arduino-lilypad-jacket)
  * [Technical Specifications of the Arduino Lilypad](#technical-specifications-of-the-arduino-lilypad)
  * [Choice of Platform](#choice-of-platform)
  * [E-­‐Textiles](#e---textiles)
    + [What are e-­‐textiles?](#what-are-e---textiles-)
    + [How do e-­‐textiles work?](#how-do-e---textiles-work-)
      - [What are conductive threads?](#what-are-conductive-threads-)
    + [Are e-­‐textiles safe?](#are-e---textiles-safe-)
  * [Programming Code](#programming-code)
      - [Android](#android)
  * [But  how  does  JARS  know  whether  it  is  a  left  or  a  right?](#but--how--does--jars--know--whether--it--is--a--left--or--a--right-)
  * [Shifting  to  the  next  turn  once  the  current  one  is  crossed](#shifting--to--the--next--turn--once--the--current--one--is--crossed)
  * [Electrical circuit schematic](#electrical-circuit-schematic)
  * [Sourcing of parts](#sourcing-of-parts)
  * [Part list](#part-list)
  * [Costing](#costing)
  * [Discussions-­‐ Questions and Answers](#discussions----questions-and-answers)
    + [Comparison with existing products](#comparison-with-existing-products)
  * [Safety Aspect of Jars](#safety-aspect-of-jars)
    + [Can JARS be washed?](#can-jars-be-washed-)
      - [Current Limitations and Possibilities of Error](#current-limitations-and-possibilities-of-error)
      - [Upgradation /Improvements (Work in Progress)](#upgradation--improvements--work-in-progress-)
        * [How can cost of JARS automation be reduced at industrial level?](#how-can-cost-of-jars-automation-be-reduced-at-industrial-level-)
  * [Trial RUNS](#trial-runs)
  * [Conclusion](#conclusion)
  * [Reference list](#reference-list)
  * [Attachments](#attachments)


#  Abstract

## Introducing JARS powered by Google:  ***" A Rider’s Safety Jacket"***

#### *(A smart perspective in Road Safety Automation)*

#### *SAFE ROADS, HAPPY FAMILIES*

JARS is a smart jacket developed with the intention of tremendously improving road safety while improving visibility of a two wheeler rider on the road with a wearable that is both fashionable and affordable. The jacket looks much like any windcheater, but inside it is a powerful AVR core that provides the user with a plethora of extra functionality. These functions improve safety of motorcyclists in several aspects:

-   Enhanced visibility and attention on the road from the co drivers
-   Human tendency to forget to turn on and off the indicators
-   Over speeding
-   Auto navigation and many more possibilities

Powered by Atmel ATMega 32U4, an SMT microprocessor, the prototype jacket had been developed using the Arduino Lilypad Wearable Platform, and is equipped with a mobile app makes use of Google Maps Application program interfaces (APIs) for control of its advanced functionality.

JARS  **Auto Indicators function**  allows it to automatically toggle indicator lights mounted strategically on the back of jacket to attract attention of busy co drivers on the road. The mobile app ensures that indicators turn on 60m before a turn approaches and automatically switch off once turn completed, eliminating the human error in switching on and off the indicators manually. Turn indicators’ status also flash on driver’s arm ensuring that he knows which indicator is on. A manual button is provided on each of the gloves for manual control as and when required.

JARS also includes  **Over speed warning lights**  on the right arm. It warns the rider whenever his/her speed crosses the safe speed limits by continuously flashing a row of LEDS so that he/she can slow down before the situation goes out of hand.

JARS also provides a safe and easy way for a biker to navigate to an unknown destination without the hassle of handling a phone and risking an accident.

All the components in JARS except the detachable Bluetooth module and battery are washable! Components have been stitched to the Jacket using wearable, washable conductive threadCosting about 13 00 INR at prototype stage, this safety model can be sewed on all sort of fabrics and clothing, making it a flexible option to sew it to your T shirts/shirts/ pull overs and hence customize your needsFurther work is underway to include an alcohol sensor under the jacket collar so that person is warned that they are not sober enough to drink, and thus can arrange for an alternate means of transport. I am also working on consolidating over speeding/Drunk driving data through Mobile App to create a log of activities for the Rider.

**Life doesn’t have reset button. Drive safe with JARS (A JACKET AUTOMATION FOR RIDER’s  SAFETY)**
### Origin of the thought-­‐ Snapshot of my Research
![Imgur](https://i.imgur.com/Jr0OZhW.jpg)

## My RTI Query and Reply

**From:**  RTI-Online  [rticall-dopt@nic.in](mailto:rticall-dopt@nic.in)  
**Subject: RTI-Online Request filed successfully.  
Date:**  18 July 2016 at 1:01:23 PM IST  
**To:**  Aman Ladia  [amanladia1@gmail.com](mailto:amanladia1@gmail.com)  
**Reply-To:**  RTI-Online  [rticall-dopt@nic.in](mailto:rticall-dopt@nic.in)

**Dear Sir/Madam,**

Your RTI Request has been filed successfully on RTI Online Portal. The following  
are the details:-  
**Registration Number**  : MORTH/R/2016/  
**Name**  : Aman Ladia  
**Date of Filing**  : 18/07/  
**Request filed with**  : Ministry of Road Transport & Highways  
**Contact Details:-  
Telephone Number**  : 23739250  
**Email Id**  : geeva.sk@nic.in  
**Payment Details:-  
RTI Fee Received**  : 10

**Payment Mode**  : Credit or Debit Card / RuPay Card  
**Payment Reference number**  : 116071828034201  
**Transaction Status**  : Transaction Successful  
**Query: Application under the Right to Information Act, 2005**

I wish to apply for the following information, under the Right to Information Act 2005  
**I am building a device to improve road safety. For that purpose, I need some  
data and statistics as mentioned below:**

1.  How many injuries/deaths are caused nation wide due to negligence in using turn  
    indicators by motorcyclists
2.  Is it mandatory to use turn indicators
3.  How many injuries/deaths are caused nation wide due to over speeding by  
    motorcyclists
4.  How do bicyclists indicate whether they are going to turn left or right
5.  How many metres before the traffic signal must the turn indicators be turned on

If you are in the view that the above requested information does not pertain to your  
department, please follow the provision of Section 6(3) in The Right To Information  
Act, 2005.

Please send the requested information as fast as possible.  
Regards,  
Aman Ladia

![Letter](https://i.imgur.com/irctRi6.jpg)

## Why did I think of making a safety wearable for bikers?

 - ***Biker dies after falling from flyover in Bengaluru***

*A 27-year-old youth was killed on the spot after he lost control over his bike due to over speeding
and slipped from the 25 feet high flyover after ramming his bike into the parapet wall in KR
Puram in the early hours of Sunday.*

These are headlines that we get to read every day regarding motorcyclists and bicyclists losing their lives or being critically injured thanks to accidents and collisions. At that given time we may not relate to the incident deeply thinking that it can never happen to us, but the truth of the matter is that over speeding, lack of use of turn indicators, drunk driving etc. can take a toll on anyone’s life. We don’t realise how grave the situation is until we are in their shoes.
I noticed that while crossing the Rajiv Gandhi Sea Link, time seems to slow down, and I didn’t know I was moving at 120 km/h until I actually looked at the speedometer. As thrilling as speed may be, travelling within a city at high speeds may prove dangerous not only for the rider by also for the vehicles behind him/her. It is not uncommon to see bikes crashing into barriers as the rider loses control of the steering. In suchscenarios, the biker is usually not consciously aware of his/her speed, because of which action cannot be taken in time. Something had to be done to make riders more aware of how they are headed towards a potential accident.

 - ***Biker seriously injured as car rams into bike on turn***

Another common sight is a car bumping into a bike as they cross each other’s path during a turn. The main reason to this, as I observed, was that most of the times, biker’s forget to switch on turn indicators. It is sometimes irritating to see how bikes cross between lanes of cars, squeezing their way through, and during this time, accidents are prone to happen. Many a times, during turns, bikes stand on the incorrect lane and then wiggle their way to the turn. This is where our safety system collapses. We need something to help bikers, something convenient which can help them out of this situation

## A Survey done in UAE

Sixteen per cent of those polled by UAE Govt felt not indicating was a sign of an experienced  
driver;  **9 per cent said signalling was a sign of weakness; 11 per cent said indicating was  
not normal in their home countries; 23 per cent did not signal because they were  
“distracted by traffic"; and 16 per cent said they did not indicate out of habit.**  
The findings did not come as a surprise to road safety experts.

“These are just excuses," said Dr Salaheddine Bendak, associate professor at the  
department of industrial engineering at the University of Sharjah. “Drivers underestimate  
the importance of using indicators."

Continued awareness is needed to remind motorists that not only is not using indicators a  
traffic offence, it is also considered “impolite, inconsiderate and dangerous", said Thomas  
Edelmann, founder of Road Safety UAE.

The penalty if caught not using your indicator is a Dh200 fine and four black points.

“When you use your indicator, you are not only telling other drivers and road users of your  
intentions," said Dr Bendak. “You’re also minimising the risk of crashes and helping secure a  
safe environment for yourself and other road users.

## State of safety automation for 2 wheelers

What are the current innovations in respect to motorcycles? These mostly include  
entertainment systems that clasp onto your handlebar or special locks that hold onto bike  brakes, but nothing that truly addresses safety.

The only bike gadget that has anything to do with rider’s safety is a helmet. Although it  
definitely improves safety, it provides safety  **after** the accident has already occurred.  
Moreover, a helmet’s protection capability has been disputed at about 65-­‐75%, which  
although represents a majority, still represents a large risk of permanent damage to  
sensitive organs like the brain. So, there is a need to do something that  **prevents**  accidents  from taking place in the first place.

When it comes to bicycles, how do bicyclists signal whether they are turning left or right? Only by raising their arms? However, this involves cutting bicycle control to 50% as you let go of the handle bar. This can be particularly difficult when a right hand person has to raise their right hand and vice-­‐versa. This only increases risk of accidents, especially in countries  like India, where bicycle paths are non-­‐existent.

In both scenarios, use of auto-­‐indicator function to prevent mishaps from happening. In  
bicycles, the advantage is doubled as the bicyclist now has turn indicators to express which side he is turning. This is not only useful for the bicyclist but for the vehicles behind too!



![3](https://i.imgur.com/g6mPfn6.jpg)

## Purpose of my automation for 2 wheelers

![4](https://i.imgur.com/ytcuwYF.jpg)
-   **Devise**‐ *an option of auto-­‐indicator function for ease and safety*
-   **Alarm**‐*speed limits if crossed for safe driving*
-   **Consider**‐ *Auto Navigation as an aid for 2 wheeler drivers*
-   **Highlight**-­ *turn indicators for better visibility with co drivers*
-   **Discourage**-­ *drunk driving*

## Statement of purpose

![Imgur](https://i.imgur.com/OkujycC.jpg)



> **To create a safety device for 2 wheeler drivers, which will not only
> equip them with better safety on the roads but will also enhance their
> visibility on the road for the other co drivers.**

## What is JARS?

JARS is a smart jacket developed with the intention of tremendously improving road safety  while providing the user with a wearable that is both fashionable and affordable. The jacket  looks much like any other windcheater, but inside it is a powerful AVR core that provides  the user with a plethora of extra functionality. These functions improve safety of  motorcyclists in several aspects: over speeding, the human tendency to forget to turn on  indicators while turning, and much more. The jacket is a prototype developed using the  Arduino Lilypad Wearable platform, and is equipped with a mobile app for control of its  advanced functionality.

This prototype is protected under the Creative Commons Attribution-­Non Commercial-Share Alike 4.0 International, which means it is free to develop by all developers.

## What are the features of JARS?



1. A recent study conducted by the Society of Automotive Engineers has revealed that failure to use turn signals results in more than twice the number of accidents that are caused by distracted driving. To address this issue, JARS provides a solution by which indicators are automatically turned on before the next turn approaches. This ensures that indicators are always on at the right time to warn the vehicles behind of the approaching turn, thus reducing risk of an accident.
2. Slow ! Your family is waiting for you Another major issue with motorbike riding is the danger of high speeds, which can turn out to be fatal in a worst case scenario. Riders often fail to realize their excessive speed until it’s too late. JARS warns the rider as his speed exceeds the safe limits so that he/she can slow down before the situation goes out of hand.
3. Don’t use mobile phones  while driving Navigation using Google Maps is very difficult on a bike as the biker’s eyes should always be on the road. JARS provides a safe and easy way for a biker to navigate to an unknown destination without the hassle of handling a phone and risking an accident.
 4. Allow life to thrive, don’t drink and drive Consequences of drunk driving are clear in everyone’s mind until they are actually drunk. JARS will soon feature an alcohol breath analyser so that the person is warned that they are not sober enough to drive, and can arrange for an alternate means of transport.

 ## How do the indicators toggle automatically?

JARS is equipped with a mobile app that makes use of Google Maps APIs. When the user  opens the app, he can feed in his destination. After crunching some numbers (which doesn’t  take more than a second) the app returns the user with several routes to the destinations. The user can select the one he wants, and start the automatic indicator (from the app itself). That’s it! He/she can start driving and the indicators will be on 60 meters before a turn approaches. Automatically. All the time.

## How does JARS do this?

JARS has two phases to it – the mobile app and the physical smart jacket. The mobile app does most of the computational tasks required and pushes the data to the Arduino Lilypad via Bluetooth. The Arduino acts as an executer that executes the physical actions associated with the commands sent by the app. Below is the breakup of functionality of the app and the jacket-­

## The Mobile App

Currently the mobile app developed works on android devices, but will be expanded soon to work on iOS and windows phones. Since mobile phones are connected to the internet and can triangulate the user’s location using GPS, the app performs all the resource intensive tasks required for the full functioning of the jacket. This involves setting the route to the user’s destinations, calculating current speed, finding whether the next turn is left or right, how far it is, and so on. The complete list is attached underneath.

-   Using Geocoding to transform the entered destination into co-­‐ordinates the google  
    server can understand.
-   Sending this data to Google and fetching various routes to the destination.
-   Drawing these routes using polylines on a map and choosing the one the user clicks  
    on.
-   Calculating the current location, checking how far the next turn is, and automatically  
    sending the command for the indicator to turn on.
-   Finding whether the next turn is a left or a right.
-   At the same time, constantly updating the user’s location and speed.
-   Sending speed warning to the shirt.
-   Maintaining the Bluetooth connection.
-   Checking for run time errors and handling them.

This involves running several threads at the same time, updating every millisecond and  
ensuring that the command reaches the jacket.

## The Arduino Lilypad Jacket

Despite all its computational power, a mobile phone cannot turn indicators on, issue  
physical warnings and measure alcohol in breath. For this, a powerful Arduino Lilypad  
processes commands sent serially (Byte by byte) and performs actions accordingly. While it doesn’t handle simultaneous threads, it does refresh Bluetooth connections at the rate of 1  billion Hz, so it is no way idle.

The two phases work together to provide JARS its complete pallet of functionality, which in its essence proves how close machine and code can get.

## Technical Specifications of the Arduino Lilypad

| **Microcontroller**  | ***ATmega32u***  |
|-- | --|
| **Operating Voltage** | ***3.3V***    |
| **Input Voltage** | ***3.8V-­‐5V***   |
|**Digital I/O Pins**|***9***|
| **PWM Channels** |  ***4***|
|**Analog Input Channels**| ***4*** |
|**DC Current per I/O Pin**| ***40 mA*** |
| **Flash Memory** |  ***32 KB of which 4 KB used by bootloader***   |
| **SRAM** | ***2.5 KB***  |
|**EEPROM** |***1 KB***  |
| **Clock Speed** |***8 MHz***  |





## Choice of Platform

Among all prototyping platforms, Arduino Lilypad was the one that was specifically designed for wearables and had support for sew able components and conductive thread. Imagine what it would be like to have an Arduino with metal pins and wires running all across your  body! One would look more like a prototype robot than a safe rider!

There were other Lilypad based platforms like the Adafruit Fona, but these were from third party manufacturers and did not have as good documentation as the official Lilypad. So, very early in the project, Lilypad was chosen as the best platform to bring my project to life.

## E-­‐Textiles

### What are e-­‐textiles?

Electronic textiles (e-­‐textiles) are innovative textile materials, (fabrics, yarns and threads), that incorporate conductive fibers or elements directly into the textile itself. These materials eliminate wires and hard electronics, so all you feel is the textile itself!

### How do e-­‐textiles work?

Electronic textiles incorporate conductive materials directly into the textile itself. There are many kinds of conductive textile materials available, from yarns to woven and coated  
fabrics. Most electronic textiles are passive circuits, which means that they are resistive or conductive elements.

#### What are conductive threads?

Conductive thread can carry current the same way that wires can, which means it can be  
used to create a circuit. This allows the user to sew a circuit together, creating flexible  
circuits that require no soldering.
Conductive threads are manufactured for anti-­‐static, electromagnetic shielding, intelligent textiles, wearable technology, data transfer and heating purposes. Most threads are metalized with an alloy of various metals, which can include silver, copper, tin and nickel. The core is normally cotton or polyester.

### Are e-­‐textiles safe?

Yes, conductive material sewn into cloth is completely safe and has no harmful effect on the human body. The maximum current delivered by the Lilypad is barely 200mA, at 3.3V, so there is no risk of injury due to electric current.

## Programming Code

#### Android

The android code consists of two activities –  
a. The user interface for basic setting of destination and beginning the navigation  
b. A Google Maps activity to fetch routes and allow the user to select the one he/ she  
wants on a map

The app uses various APIs, including the Google Maps APIs with Geocoding, Directions and Distance. Additionally, the code also uses a custom library built by akexorcist, which allows  us to fetch turn by turn navigation, something that is yet not available in the default Google APIs.

Below is the explanation of the code arranged chronologically, on basis of the steps taken by the user to start the auto indicators:

 1. ***Geocoding***: The first step the user has to take is to set his/her destination. This  
involves feeding the Address in a text box, and clicking the “Set Destination” button. It is important to note that Google can only find directions between two sets of co-­‐  ordinates, not an address. For this purpose, the address entered by the user has to  be converted into a Lat-­‐Long format, through a process called Geocoding. This is  done by sending the address to google, which in turn returns the geo co-­‐ordinates of  the address in the form of a java list. The code then reads the object present on the  first index of the List, and assigns it to 2 variables.

```java
 @Override
    public void onClick(View v) {
        Context context = this;
        EditText input = (EditText) findViewById(R.id.editText);
        String str = input.getText().toString();
        Geocoder gc = new Geocoder(context);
        cood = (TextView) this.findViewById(R.id.textView);
        if (v == btnClick) {
            try {
                if (gc.isPresent()) {

                    List<Address> list = null;
                    try {
                        list = gc.getFromLocationName(str, 1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    Address address = list.get(0);

                    lat = address.getLatitude();
                    lng = address.getLongitude();
                    //String strlat= Double.toString(lat);
                    //String strlong= Double.toString(lng);

                }
            }catch(Exception ex)
            {
                Toast.makeText(this,"Destination not found! Please Recheck!",Toast.LENGTH_SHORT).show();
            }

        }
```

2. ***Fetching all possible routes to the destination :*** When the user presses the button to select the route to the destination, a Google Maps Server and API Key help determine all the routes to the destination. In addition to this, a custom library helps fetch the routes in the form of a list object, which is then read. To do this, this activity uses the geocoded destination retrieved earlier and the user’s current location based on GPS, and sends this data to Google. The routes that are received are displayed using polylines on a map, with different colours indicating different routes. These polylines have their ID stored in a list, for later use.


```java var s = "JavaScript syntax highlighting"; alert(s);
@Override
public void onDirectionSuccess(Direction direction, String rawBody) {
Snackbar. make ( btnRequestDirection , "Success with status : " + direction.getStatus(),
Snackbar. LENGTH_SHORT ).show();
if (direction.isOK()) {
googleMap .addMarker( new MarkerOptions().position( origin ));
googleMap .addMarker( new MarkerOptions().position( destination ));
storePolId .clear();
for ( int i = 0 ; i < direction.getRouteList().size(); i++) {
Route route = direction.getRouteList().get(i);
sRoute .add(i,route);
String color = colors [i % colors. length ];
ArrayList<LatLng> directionPositionList =
route.getLegList().get( 0 ).getDirectionPoint();
PolylineOptions opt = new PolylineOptions();
opt = DirectionConverter. createPolyline ( this , directionPositionList, 5 ,
Color. parseColor (color));
poly .add(i, googleMap .addPolyline(opt));
poly .get(i).setClickable( true );
storePolId .add(i, poly .get(i).getId();
}
btnRequestDirection .setVisibility(View. GONE );
}
}
```
3.  ***Identifying which route is selected:*** I used the  
    setOnPolylineClickListener() to register a tap on a polyline. The ID of the  
    clicked polyline is stored in a variable. At the same time, the selected polyline turns a     thick dark blue colour to indicate that this route has been selected.
```java var s = "JavaScript syntax highlighting"; alert(s);
googleMap.setOnPolylineClickListener( new GoogleMap.OnPolylineClickListener()
{
@Override
public void onPolylineClick(Polyline poly)
{
Toast. makeText (AlternativeDirectionActivity. this ,poly.getId(),Toast. LENGTH_SHORT ).show();
polyIndex = poly.getId();
poly.setWidth( 10 );
poly.setColor( blueCol );
Snackbar. make ( btnRequestDirection , "Route Successfully Selected" ,
Snackbar. LENGTH_SHORT ).show();
}
});
```
4.  ***Setting the Route selected by the user:*** Once the route is selected on the  
    map, the user returns to the main screen. An enhanced for loop cycles through the  
    poly line ID Array List until it finds the one the user clicked on. Once it finds it, it sets  
    the route using the same index value of the ID. Thus, my app has successfully set the  
    route that the user has selected, making the jacket ready for use.

```java var s = "JavaScript syntax highlighting"; alert(s);
try
{
for (String s:AlternativeDirectionActivity. storePolId )
{
if (s.equals(AlternativeDirectionActivity. polyIndex ))
{
int finalRouteIndex = AlternativeDirectionActivity. storePolId .indexOf(s);
SimpleDirectionActivity. leg =
AlternativeDirectionActivity. sRoute .get(finalRouteIndex).getLegList().get( 0 );
Toast. makeText (MainActivity. this , "Found at index" +
Integer. toString (finalRouteIndex),Toast. LENGTH_SHORT ).show();
}
}
} catch (Exception ex)
{

Toast. makeText (MainActivity. this , "Couldn't find index" ,Toast. LENGTH_SHORT ).show();
}
```
5.  ***Capturing the next turn as it arrives  **:***** Once this is done, the user hits the “Start Navigation” button and can now ride his bike. My app constantly refreshes the user’s  current location, and uses distance APIs to find the straight line distance to the next   turn. A radius variable holds the value ‘60’ in it, which represents how close to the    turn the indicators should turn on. If the distance returned by the distance API is less   than the radius, the indicators turn on.


## But  how  does  JARS  know  whether  it  is  a  left  or  a  right?
The   custom     library    used   has    a      maneuver   function   which      returns    whether    it     is     a      slight   left,     a      sharp      right,     a      straight   cut    etc.   For    sake   of     simplicity,    I      modified   the    maneuver constant      file   such   that   whether    it     is     a      sharp      or     a      slight     left,      the    string     returned   will always   be     “left”.    Then,  we     use    the    .equals()  string     function   to     check  whether    the   returned      string     is     a      “left”     or     a      “right”,  and    accordingly,   Bluetooth      code   is    sent  to    the jacket.

## Shifting  to  the  next  turn  once  the  current  one  is  crossed
It is important to learn how our custom directions library works. Each route is divided into legs, which is further divided into several steps. The route parameter was set once the user chose his desired route. The leg parameter has some additional functionality, which was not required in our program. So, the leg index was set to (0), because all ourroutes currently have only 1 leg. The step parameter was the one that was constantly changed during run time.
![Igur](https://i.imgur.com/OXU6VcW.jpg)

As    indicated      alongside,     each   “step”     is     nothing    but  a    small   section   of     the    overall    route.     Steps  are   stored   in     a  java   list,  which  can    be     read   using indexes.      To     begin      with,      the    step   index      is     set    to     0,   as    the    user   is     yet    to     approach   his    first      turn.      As     the  distance     drops  below  15m,   a  Boolean    called    inRadius     is     set to     true.  Then,  if     the    distance   increases  above  20m,   which  is     only  possible      if     the    rider      has    crossed    the    turn   and    is     moving     away,     and inRadius==true,   the   stepIndex      is     incremented    by     1.     The    indicators     are    also   switched   off.   InRadius   is   then      set    to     false      again.     The    process    repeats    over   and    over   again.     To     calculate      the  maneuver,     another   step   object     is     created,   with   its    index  set    to     1  more   than   the   stepIndex.    This   is     because    the    maneuver   is     always     calculated     for    the    next   step. This   is   also      incremented    with   stepIndex.

As    a      safety     measure,   to     prevent    an     index      not    found exception    from   being      thrown,  this      incremental    process    is     stalled    once   the    manIndex   (maneuver      index)     is     1      less   that the   size   of     the    step   object.    The    statement      is     surrounded     by     try-­‐catch()      to     handle     any  other     exceptions.
![l](https://i.imgur.com/4aP1zpP.jpg)

```java
    @Override
    public void onLocationChanged(Location location) {

        currentlat = location.getLatitude();
        currentlng = location.getLongitude();
        latituteField.setText(Double.toString(currentlat));
        longitudeField.setText(Double.toString(currentlng));

        if(checkInit==true) {
            a = SimpleDirectionActivity.leg.getStepList().get(SimpleDirectionActivity.stepInd);
            man = SimpleDirectionActivity.leg.getStepList().get(manInd);

            SimpleDirectionActivity.maneuver = man.getManeuver();

            getLong = a.getEndLocation().getLongitude();
            getLat = a.getEndLocation().getLatitude();
            Location.distanceBetween(getLat, getLong, currentlat, currentlng, results);
            distance=results[0];

            if(distance<15)
            {
                Toast.makeText(this,"indCheck=true",Toast.LENGTH_SHORT).show();
                indCheck=true;
            }

            if(distance>20 && indCheck)
            {
                Toast.makeText(this,"Indicator OFF",Toast.LENGTH_LONG).show();

                //sendTurnOver();
                TurnOverWrite();

                indCheck=false;
                Toast.makeText(this,"Ind: "+Integer.toString(SimpleDirectionActivity.stepInd)+"Step: "+Integer.toString(SimpleDirectionActivity.leg.getStepList().size()),Toast.LENGTH_SHORT).show();
                if(SimpleDirectionActivity.stepInd<SimpleDirectionActivity.leg.getStepList().size()) {
                    Toast.makeText(this, "updated indexes", Toast.LENGTH_SHORT).show();
                    SimpleDirectionActivity.stepInd++;

                }
                if ((manInd+1)<SimpleDirectionActivity.leg.getStepList().size())
                {
                    manInd++;
                }
                else
                {
                    Snackbar.make(longitudeField,"Route completed",Snackbar.LENGTH_LONG).show();
                    //sendTurnOver();
                    TurnOverWrite();
                }
                inRange=false;

                //update indexes result below

                a = SimpleDirectionActivity.leg.getStepList().get(SimpleDirectionActivity.stepInd);
                getLong = a.getEndLocation().getLongitude();
                getLat = a.getEndLocation().getLatitude();
                Location.distanceBetween(getLat, getLong, currentlat, currentlng, results);
                distance=results[0];

            } else if(distance>20 && !indCheck)
            {

                cood.setText(Double.toString(getLat) + " , " + Double.toString(getLong) + "\n" + SimpleDirectionActivity.maneuver + "\n Distance to next turn: " + Float.toString(distance) + "\t manIndex: " + Integer.toString(manInd) + " stepIndex: " + Integer.toString(SimpleDirectionActivity.stepInd));
            }


            if(distance<radius)
            {
                cood.setText(SimpleDirectionActivity.maneuver+"\n"+Float.toString(distance));
                for(int i =0;i<5;i++) {
                    if (SimpleDirectionActivity.maneuver.equals("turn-left")||SimpleDirectionActivity.maneuver.equals("uturn-left")) {

                        //sendLeft();
                        LeftWrite();

                    } else if (SimpleDirectionActivity.maneuver.equals("turn-right")||SimpleDirectionActivity.maneuver.equals("uturn-right")) {

                        //sendRight();
                        RightWrite();
                    }

                }
                //inRange=true;
            }
            /*else
            {
                if(inRange == true)
                {
                    Toast.makeText(this,"updated indexes",Toast.LENGTH_SHORT).show();
                    SimpleDirectionActivity.stepInd++;
                    manInd++;
                    inRange=false;
                }
                else
                {
                    cood.setText(Double.toString(getLat) + " , " + Double.toString(getLong) + "\n" + SimpleDirectionActivity.maneuver + "\n Distance to next turn: " + Float.toString(distance) + "\t manIndex: " + Integer.toString(manInd) + " stepIndex: " + Integer.toString(SimpleDirectionActivity.stepInd));

                }

            }
            */

            /*if(results[0]>100 && inRange)
            {
                SimpleDirectionActivity.stepInd++;
                manInd++;
                inRange=false;
            }
            if(results[0]>100 && !inRange)
            {
                cood.setText(Double.toString(getLat) + " , " + Double.toString(getLong) + "\n" + SimpleDirectionActivity.maneuver + "\n Distance to next turn: " + Float.toString(results[0]) + "\t manIndex: " + Integer.toString(manInd) + " stepIndex: " + Integer.toString(SimpleDirectionActivity.stepInd));

            }
            */

            //Gmaps link
            String stpLat = Double.toString(getLat);
            String stpLng = Double.toString(getLong);
            SimpleDirectionActivity.maps = "http://maps.google.com/maps?z=12&t=m&q=loc:" + stpLat + "+" + stpLng;
            //SimpleDirectionActivity.stepInd++;
            //manInd++;
        }

        //Speedometer code below

        float nCurrentSpeed = location.getSpeed();

        final Snackbar speedsnack = Snackbar.make(longitudeField,"OVER SPEED!",Snackbar.LENGTH_INDEFINITE);

        if(nCurrentSpeed<13.888) {
            speedsnack.dismiss();
            NormalSpeedWrite();
            //sendNormal();
        }

        if(nCurrentSpeed>13.888) {
            speedsnack.setAction("Dismiss", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    speedsnack.dismiss();
                }
            });
            speedsnack.show();
            //sendSpeed();
            SpeedWrite();
            Toast.makeText(this,"Overspeed sent!",Toast.LENGTH_SHORT).show();

        }

        if(nCurrentSpeed<13.888) {
            speedsnack.dismiss();
            NormalSpeedWrite();
            Log.e("Main Activity","Sent NORMAL SPEED !!!!!!!!");
            Log.e("Main Activity","Sent NORMAL SPEED !!!!!!!!");
            Log.e("Main Activity","Sent NORMAL SPEED !!!!!!!!");
            Log.e("Main Activity","Sent NORMAL SPEED !!!!!!!!");
            Log.e("Main Activity","Sent NORMAL SPEED !!!!!!!!");
            //sendNormal();
        }

    }
```
   
6.  ***Constantly monitoring speed:*** Simultaneously, the app also has to measure the     rider’s speed and check if it is over the speed limit of 50 km/h. This is done within     the onLocationChanged() function, where android has an inbuilt method to calculate     speed. The speed value is returned as a floating point integer, which is then    compared to a preset variable. If the current speed is greater than the preset, it will      send the speed warning to the jacket.      In fact, reports suggest that GPS based speedometers are much more accurate than     the stock car ones, as they are subject to wear, loss of calibration etc. The report can be found here: http://gpssystems.net/accurate-­‐gpsbased-­‐speedometer/

## Electrical circuit schematic

![Imgur](https://i.imgur.com/qMlcPLR.jpg)
## Sourcing of parts

Most parts used in JARS were bought from online retailers, as they offered the most  
competent prices and had all the components I needed. I also sourced some parts from  
Lamington Road, Mumbai. The List of websites and stores can be found below:

[protocentral](http://www.protocentral.com/)  
[mgsuperlabs](http://mgsuperlabs.co.in/)  
[ebay](http://ebay.in/)

Silikon Electronics,  
4, Lamington Road, Mumbai,  
Maharashtra -­‐ 400007
 ## Part list
 ![enter image description here](https://i.imgur.com/BUU57br.png)
 ## Costing
 The costing below is based on cheapest parts that can be obtained from [Aliexpress](Aliexpress.com) and  other wholesale websites:

|  Item| Cost per unit (INR)   |   Quantity   |Total Cost (INR)
|--|--| -- | -- |
|LilyPad Arduino | 345| 1|345
| LilyPad Red LEDs | 10|25  |250
| Conductive Thread |175 |1  |175
|LilyPad Buttons  |23 |2  |46
| HC-­05 |184 |1  |184
|  Li­‐Po Battery|150 | 1 |150
|Lilypad Protoboard  |50 |3  |150
| Final Cost of Components | --- |  ---|1300

## Discussions-­‐ Questions and Answers

### Comparison with existing products

Are there any existing products that function similar to the way JARS does?
Unfortunately, the answer to a great degree in  **No.**  What are the current innovations in  respect to motorcycles? These mostly include entertainment systems that clasp onto your  handlebar or special locks that hold onto bike brakes, but nothing that truly addresses  safety.

The only bike gadget that has anything to do with rider’s safety is a helmet. Although it  
definitely improves safety, it provides safety  **after** the accident has already occurred.  Moreover, a helmet’s protection capability has been disputed at about 65-­‐75%, which  although represents a majority, still represents a large risk of permanent damage to  sensitive organs like the brain. So, there is a need to do something that  **prevents**  accidents  from taking place in the first place. That is what sets JARS apart from any other piece of bike  safety.

When it comes to bicycles, how do bicyclists signal whether they are turning left or right?  Only by raising their arms? However, this involves cutting bicycle control to 50% as you let  go of the handle bar. This can be particularly difficult when a right hand person has to raise  their right hand and vice-­‐versa. This only increases risk of accidents, especially in countries  like India, where bicycle paths are non-­‐existent.

In both scenarios, JARS uses its auto-­‐indicator function to prevent mishaps from happening.  In bicycles, the advantage is doubled as the bicyclist now has turn indicators to express  which side he is turning. This is not only useful for the bicyclist but for the vehicles behind  too!
## Safety Aspect of Jars

JARS is powered by a 750 mAH battery that supplies 3.7V. The maximum regulated voltage  
supplied by any Arduino pin is 3.3V.

Resistance posed by dry skin is around 500,000 Ω.

Using Ohms law, the current that can pass through your body in the worst conditions if you  touch any Arduino pin will be:![5](https://i.imgur.com/hOGbzlV.png)
As it can be observed above, the maximum current passing through a person’s body is 6.6 x  10 -­‐^6 Ampere, which is extremely minimal. The minimum threshold for sensation is 0.4mA,  which is 0.4 x 10-­‐^2 Amperes. You can’t even notice it!

Even so, the conductive thread used is insulated.

### Can JARS be washed?

Yes! All the components in JARS except the Bluetooth module and Alcohol sensor are  
washable! That is the reason why the Bluetooth and Alcohol sensor can be hot swapped  
from the jacket with ease.

**Washing Instructions:** Unplug the battery before washing. Hand wash in cold water with a  
gentle detergent. Do not dry clean.

#### Current Limitations and Possibilities of Error

Although JARS does have a few limitations:

-   Before washing/cleaning the jacket, the Bluetooth transceiver and battery need to  
    be plugged out as these components are not washable. Lilypad with integrated  
    Bluetooth is being sourced so that handling of removable module is avoided, giving  
    convenience to the user
-   My turn by turn navigation software uses GPS signals to triangulate the user’s  
    current location, and determine distance to the next turn. So, in case the GPS signal  
    is interrupted, the auto-­‐indicator function will stop functioning until GPS signal is  
    received again. In such a scenario, the user will manually operate the indicators  
    using an integrated manual control system.
-   Currently, my app does not have the ability to re-­‐route to the destination in case the  
    user takes an incorrect turn or decides to go by some other route. This means that  
    the user has to restart navigation if he exits the pre decided route. However, this is  
    already being worked on in the extension phase of this project.

#### Upgradation /Improvements (Work in Progress)

-   Another major cause of road mishaps is ‘Drunk Driving’. Consequence of drunk  
    driving are clear in everyone’s mind until they are actually driving. For that purpose,  
    JARS will feature an alcohol breath analyser that will measure alcohol content in the  
    breath and indicate whether the person is just on the brink of getting drunk and  
    should stop or whether he/she is completely drunk and unfit for driving. If detected  
    drunk, a message will be sent to an emergency contact ( mother or spouse etc.) to  
    warn the driver.
-   The indicator manual buttons currently located in gloves, will communicate  
    wirelessly with the lilypad for ease of operation.
-   A gyroscope attached to central axis of bike is being planned to program to turn  
    indicators even at the time of lane shifting
-   Lilypad with integrated Bluetooth is being sourced so that handling of removable  
    module is avoided, giving convenience to the user

##### How can cost of JARS automation be reduced at industrial level?

Currently, the fundamental components of JARS, the Lilypad Arduino and sewable LED  
constitute majority of its cost. This cost can be cut easily.

The Arduino will be replaced by a single PCB with a microprocessor on it.

While LEDS are just SMD LEDs on a small board.

This means that effectively cost can be cut by 40-­‐50 percent easily just by changing the  
components.

The Bluetooth chip will be integrated into the controlled PCB, to cut costs even further.  
Lilypad proto boards are not required in industrial production.

**Overall the smart jacket automation at Industrial production level should not cost over  
INR 500.**

## Trial RUNS

JAR has been tested on routes and speed modulator software many times to tests its  
reliability. Real time Trials are also underway . Results are encouraging and bugs are being  removed in the programming.

## Conclusion

In today’s busy world, the high stress and distraction levels lead to many people forgetting  to use turn indicators, which is the principal vehicle safety feature. Speeding is another major issue which many bikers overlook as they try to wiggle through rows of cars, zooming  dangerously on roads and flyovers. Further motorists around them fail to watch turn indicators of bikers due to their distractions like talking on mobile, stress of work etc. These  form the major cause of crashes and collisions, making motorbikes increasingly unsafe.  Same is the case with bicyclists for whom there are no separate lanes to drive and they  need a safer turn indication mechanism to protect themselves.

JARS comes in as a breakthrough solution to these fatal problems, providing the user with  an easy and cheap way to convert his/her jacket into a safety vest, which tremendously  increases their safety on the road.

**Can u see fellow bikers now?**  With JARS strategically and attractively located turn indicators  on the biker’s back, approx. 2 feet higher than the stock indicators, motorist around the  rider can’t ignore them any more adding to mutual safety. JARS automatically toggle these  indicators for the biker adding to less stress and more convenient driving.

**Slow down! Your family is waiting for you!** JARS with its rapid flashing over speed lights on  Biker’s arm, will force the biker to slow down as LEDs will not shut blinking until the rider is  
riding within safe limits.

**No need to use your mobile phones for Navigation while driving**  with JARS never take your  eyes off the road as the blinking turn indicators on your arm will guide you to your next turn  towards your destination.

***Hence as proposed JARS is a safety device for 2 wheeler drivers, which not only equips them with better safety on the roads but also enhances their visibility on the road for the other co drivers.***
## Reference list

***BLE 4.0 Module-­‐DBM01 Data Sheet:*** http://dorji.com/docs/data/DBM01.pdf

***LilyPad USB:***
 http://lilypadarduino.org/?p=1494

***Effect of current on body :*** [http://www.allaboutcircuits.com/textbook/direct-current/chpt-](http://www.allaboutcircuits.com/textbook/direct-current/chpt-) 3/ohms-law-again/

***Helmets aren’t 100% safe:***
[https://www.cnet.com/news/brain-surgeon-theres-no-point-wearing-cycle-helmets/](https://www.cnet.com/news/brain-surgeon-theres-no-point-wearing-cycle-helmets/)

***Why People don’t use indicators:*** [http://www.thenational.ae/uae/uae-drivers-say-using-indicators-is-a-sign-of-weakness](http://www.thenational.ae/uae/uae-drivers-say-using-indicators-is-a-sign-of-weakness)
***Source for tutorials on E-­‐textiles:***
http://www.sparkfun.com

***My RTI request for statistics regarding bike accidents:*** https://goo.gl/JIQCC1

## Attachments

 ***Jars complete Programming code including APP-­‐ 22 pages***

***Invoices***

***RTI‐reply letter from Govt. of India***

 ***E textiles tutorials***
