/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classmodeling;

/**
 *
 * @author Kenny
 */
public class App {
    public static void main(String[] args) {
        
//Reference : https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
        
/*==============================================================================
       
  []___
 /    /\                          House
/____/__\                            
|[][]||||        
        
==============================================================================*/        
        
        
        System.out.println("***********************************");
        System.out.println(" ");
        System.out.println("[House]");
        System.out.println(" ");

        //House GPS declare and initialize
        HouseGPSMappingSystem houseGPS = new HouseGPSMappingSystem();
        houseGPS.owner = "Bob Michael";
        houseGPS.address = "196 Woodside Circle Mobile, FL 36602 ";
        
        //Print.ln
        System.out.println(houseGPS.owner);
        System.out.println(houseGPS.address);
        
        //House3ddesign declare and initialize
        House3DDesignSystem House3Ddesign = new House3DDesignSystem();
        House3Ddesign.bathrooms = 1;
        House3Ddesign.floors = 2;
        House3Ddesign.rooms = 4;
        
        //println
        System.out.println("Bathrooms " + House3Ddesign.bathrooms);
        System.out.println("Floors " + House3Ddesign.floors);
        System.out.println("Rooms " + House3Ddesign.rooms);
        System.out.println(" ");
        System.out.println("***********************************");
        
        
/*==============================================================================
       
                                |
                          --====|====--
                                |  

                            .-"""""-. 
                          .'_________'. 
                         /_/_|__|__|_\_\
                        ;'-._       _.-';
   ,--------------------|    `-. .-'    |--------------------,
    ``""--..__    ___   ;       '       ;   ___    __..--""``
     jgs      `"-// \\.._\             /_..// \\-"`
                 \\_//    '._       _.'    \\_//                Airplane
        
==============================================================================*/ 
        
        System.out.println("***********************************");
        System.out.println(" ");
        System.out.println("[Airplane]");
        System.out.println(" ");
        
        /*https://science.howstuffworks.com/transport/flight/modern/air-traffic-control.htm*/
        //Air Traffic Control Divisions
        
        AirTrafficControlSystem AirTC = new AirTrafficControlSystem();
        AirTC.airlineName = "Super Awesome Airlines";
        AirTC.AirSpeed = 120;
        AirTC.cruisingAltitude = 39000;
        AirTC.flightNumber = 29;
        AirTC.routeOfFlight = "Florida";
        
        System.out.println("Airlines " + AirTC.airlineName);
        System.out.println("AirSpeed " + AirTC.AirSpeed);
        System.out.println("Crusing altitude " + AirTC.cruisingAltitude);
        System.out.println("Flight number " + AirTC.flightNumber);
        System.out.println("Route of flight " + AirTC.routeOfFlight);
        
        FlightSimulator FS = new FlightSimulator();
        FS.Approach = true;
        FS.Departure = false;
        FS.Descent = false;
        FS.EnRoute = true;
        FS.Landing = false;
        FS.TakeOff = true;
        FS.Preflight = true;
        
        System.out.println(" ");
        System.out.println("***********************************");
        
/*==============================================================================
                            _.--""'-----,   `"--.._
                         .-''   _/_      ; .'"----,`-,
                       .'      :___:     ; :      ;;`.`.
                      .      _.- _.-    .' :      ::  `..
                   __;..----------------' :: ___  ::   ;;           car
              .--"". '           ___.....`:=(___)-' :--'`.
            .'   .'         .--''__       :       ==:    ;
        .--/    /        .'.''     ``-,   :         :   '`-.
     ."', :    /       .'-`\\       .--.\ :         :  ,   _\
    ;   ; |   ;       /:'  ;;      /__  \\:         :  :  /_\\
    |\_/  |   |      / \__//      /"--\\ \:         :  : ;|`\|    
    : "  /\__/\____//   """      /     \\ :         :  : :|'||
  ["""""""""--------........._  /      || ;      __.:--' :|//|
   "------....______         ].'|      // |--"""'__...-'`\ \//
     `| WVE230L |__;_...--'": :  \    //  |---"""      \__\_/
       """""""""'            \ \  \_.//  /
         `---'                \ \_     _'
                               `--`---'  dp
==============================================================================*/ 

        System.out.println("***********************************");
        System.out.println(" ");
        System.out.println("[Car]");
        System.out.println(" ");

        CarInventorySystem CIS = new CarInventorySystem();
        
        CIS.carBrand = "Toyota";
        CIS.inStock = true;
        CIS.itemNo = 73987;
        CIS.price = 3000;
        
        System.out.println("Car Brand " + CIS.carBrand);
        System.out.println("In stock " + CIS.inStock);
        System.out.println("Item number " + CIS.itemNo);
        System.out.println("Price " + CIS.price);

        CarVideoGameControls controls = new CarVideoGameControls();
        controls.movement = "control stick";
        controls.gas = "action button";
        controls.breakes = "back button";
        
        System.out.println("Movement " + controls.movement);
        System.out.println("Gas " + controls.gas);
        System.out.println("Breakes " + controls.breakes);
        
        System.out.println(" ");
        System.out.println("***********************************");
        
/*==============================================================================
           ()
        .-"`'"-.
       /        \
       \        /
       /'---'--`\
      |          |
      \_.--.__.-./
      (_.__..__._)                     Ice Cream
        [=-=-=-]
         |=-=-|
         |-=-=|
    jgs  '-==-'
==============================================================================*/ 
    System.out.println("***********************************");
    System.out.println(" ");
    System.out.println("[Ice Cream]");
    System.out.println(" ");
    
    IceCreamControlSystem ICCS = new IceCreamControlSystem();
    
    ICCS.churningProcessComplete = true;
    ICCS.crushedIce = true;
    ICCS.isUnitCold = true;
    ICCS.twistCanister = true;
    
    System.out.println("Churning process complete " + ICCS.churningProcessComplete);
    System.out.println("Crushed Ice " + ICCS.crushedIce);
    System.out.println("Is unit cold " + ICCS.isUnitCold);
    System.out.println("Canister was twisted " + ICCS.twistCanister);

    IceCreamInventory invo = new IceCreamInventory();
    
    invo.brand = "Kenny's Ice Cream";
    invo.flavor = "Chocolate";
    invo.inStock = true;
    invo.productNum = 234;
    
    System.out.println("Brand " + invo.brand);
    System.out.println("Flavor " + invo.flavor);
    System.out.println("In stock " + invo.inStock);
    System.out.println("Product number " + invo.productNum);
    
    System.out.println(" ");
    System.out.println("***********************************");
    
/*==============================================================================
            /;
           / |'-,.
          /  '    `"---,.__
         /  '    ,'     ,  '"--,"|
        /  '    ,     ,'     ,"::|          Book
       /  '   ,'    ,      ,"::::|
      /  '   ,    ,'     ,"::::::L
     /  '  ,'   ,'     ,"::::::::L
    /  '  ,    ,     ,":::::::::J
    k-,._    ,'   _.":::::::::::J
     \.  `"----'"".J::::::::::::|
      \.    .-,    .L:::::::::::|
       \.  (       .J:::::::::::!
        \.  `--     .L:::::::::/
         \.   .-.   .|::::::::/
          \. (   )  .J:::::::/
           \. `-'    .L:::::/
            \.  L    .|::::/
             \. !__  .J:::/
              \.  __  .L:/
               \. L_) .|/
                `-,__,-'    kth
==============================================================================*/ 
   
    System.out.println("***********************************");
    System.out.println(" ");
    System.out.println("[Book]");
    System.out.println(" ");

    BookPublishingSystem bookpub = new BookPublishingSystem();
    
    bookpub.audioBook = false;
    bookpub.language = "english";
    bookpub.publisher = "superawesomecompany.org";
    
    System.out.println("Audio book " + bookpub.audioBook);
    System.out.println("Language " + bookpub.language);
    System.out.println("Publisher " + bookpub.publisher);
    
    BookLibraryCatalogSystem cat = new BookLibraryCatalogSystem();
    
    cat.name = "Harry Potter";
    cat.date = "2003";
    cat.ASIN = 29834;
    cat.aurthor = "J.K Rowling";
    
    System.out.println("Book Name " + cat.name);
    System.out.println("Book Date " + cat.date);
    System.out.println("Book ASIN " + cat.ASIN);
    System.out.println("Book Aurthor " + cat.aurthor);    
    
    
    
    
    System.out.println(" ");
    System.out.println("***********************************");
    
    }
}
