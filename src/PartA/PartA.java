package PartA;

public class PartA {
 
    abstract class MotorVehicle {
    
        public abstract void TurnOn();
    
        public abstract void turnOff();
    

    }

    abstract class Car extends MotorVehicle{
        @Override
        public void TurnOn(){
            System.out.println("Car is starting");
        }
    
        public void TurnOff(){
            System.out.println("Car is stopping");
        }
    
}
    
    
    
    
    
}
