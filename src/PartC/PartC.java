package PartC;

public class PartC {
    
    public abstract class MotorVehicle {
        
        private String name;
        
        public abstract void TurnOn();
    
        public abstract void turnOff();
    



        public String getName(){
            
            return this.name;
        }
        
        
        public MotorVehicle(String name){
            this.name = name;
        }
        
}


    abstract class Car extends MotorVehicle{
    
    
    
    
        @Override
        public void TurnOn(){
            System.out.println("Car is starting");
        }
    
        public void TurnOff(){
            System.out.println("Car is stopping");
        }   
    
        
        public Car(String name){
            super(name);
        }
    }
    
    abstract class Convertible extends Car{
        
        private boolean topUp;
         @Override
        public void TurnOff(){
            this.putTopUp();
            super.TurnOff();
        }     
        public void putTopUp(){
            this.topUp = true;
            System.out.println("Putting top up");
        }    
        
        public Convertible(String name, boolean topUp){
            super(name);
            this.topUp = topUp;
        }
        
        
        
    }






}
