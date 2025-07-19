package interfaces.devices;

// public class SmartPhone extends Camera, MusicPlayer{
    
// }
// error ara kyuki class cannot inherit multiple classes. MULTIPLE INHERITANCE ka concept java k andar h hee ni

public class SmartPhone implements Camera, MusicPlayer, Phone{
    @Override
    public void takePhoto(){

    }

    @Override
    public void recordVideo(){

    }

    @Override
    public void playmusic(){

    }

    @Override
    public void stopmusic(){

    }

    @Override
    public void makecall(){

    }

    @Override
    public void endcall(){

    }
}
// effectively implementing multiple inheritance


/*

MAIN METHOD in interface?


difference  in abstract class and interface?
1. ABSTRACT class mai instance variables hote h. aur kyuki instance variables hain toh unko initialise krne k liye constructor bhi hota h
lekin interface mai ye sb nhi hota

2. ek class extract krti h sirf ek abstract class ko
vhi ek class multiple interfaces ko implement kr skti h
 */