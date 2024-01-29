package com.company3;

public class JavaInheritance {
    public static void main(String[] args) {

        FourWheelers FW= new FourWheelers();
        ElectricCar EC=new ElectricCar();
        TeslaX T1=new TeslaX();
        TeslaX T2=new TeslaX();

//        T1.drivingSide='R';
//        T1.passanger_seat=4;
//        T1.mileagePerFulCharge=350;
//        T1.fullChargeTime=6;
//        T1.price=5000000;

        T1.setDrivingSide('L');
        T1.setPassanger_seat(5);
        T1.setMileagePerFulCharge(351);
        T1.setFullChargeTime(7);
        T1.setPrice(5000001);

        T2.setRunBy("Both Electricity and gas");

        FW.setDrivingSide('M');



        System.out.println("Properties of TeslaX T1"+ T1.runBy+T1.getDrivingSide()+ T1.getPassanger_seat()+
                T1.getMileagePerFulCharge()+ T1.getFullChargeTime()+ T1.getPrice());

        System.out.println("TeslaX T2 run by: "+  T2.getRunBy());

        System.out.println(" FourWheelers have driving side"+ FW.getDrivingSide());
    }
}

class FourWheelers{

   private  char drivingSide; // left-L; right -R
    int passanger_seat;

    public char getDrivingSide() {
        return drivingSide;
    }

    public void setDrivingSide(char drivingSide) {
        this.drivingSide = drivingSide;
    }

    public int getPassanger_seat() {
        return passanger_seat;
    }

    public void setPassanger_seat(int passanger_seat) {
        this.passanger_seat = passanger_seat;
    }


}
class ElectricCar extends FourWheelers{
    int mileagePerFulCharge;
    int fullChargeTime;
    String runBy="Stored Electricity";

    public String getRunBy() {
        return runBy;
    }

    public void setRunBy(String runBy) {
        this.runBy = runBy;
    }

    public int getMileagePerFulCharge() {
        return mileagePerFulCharge;
    }

    public void setMileagePerFulCharge(int mileagePerFulCharge) {
        this.mileagePerFulCharge = mileagePerFulCharge;
    }

    public int getFullChargeTime() {
        return fullChargeTime;
    }

    public void setFullChargeTime(int fullChargeTime) {
        this.fullChargeTime = fullChargeTime;
    }
}
class DieselCar extends FourWheelers{

}
class TeslaX extends ElectricCar{
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
