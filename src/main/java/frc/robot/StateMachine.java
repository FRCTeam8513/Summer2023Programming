package frc.robot;

public class StateMachine {
    boolean isButton1Pressed = false;
    boolean isButton4Pressed = false;
    boolean isButton5Pressed = false;
    boolean isButton6Pressed = false;

    boolean doesUpperSensorSeeBall = false;
    boolean doesLowerSensorSeeBall = false;

    boolean isLowerIntakeOn = false;
    boolean isUpperIntakeOn = false;
    boolean isShooterOn = false;

    int state = 1;

    //public method which returns nothing and take in no paramters called updateState

    public void updateState(){
        if(state == 1){
            if(isButton1Pressed){
                state = 3;
            }
            if(isButton5Pressed){
                state = 5;
            }
            isLowerIntakeOn = false;
            isUpperIntakeOn = false;
            isShooterOn = false;
        }
        if(state == 2){
            if(isButton5Pressed != true){
                state = 1;
            }
            isLowerIntakeOn = true;
            isUpperIntakeOn = true;
            isShooterOn = true;
        }
        if(state == 3){
            if(doesUpperSensorSeeBall){
                state = 4;
            } 
            if(isButton4Pressed){
                state = 1;
            }
            isLowerIntakeOn = true;
            isUpperIntakeOn = true;
            isShooterOn = false;
        } 
        if(state == 5){
            if(isButton5Pressed == false){
                state = 1;
            }

            isLowerIntakeOn = true;
            isUpperIntakeOn = true;
            isShooterOn = false;
        }


        if(state == 4){
            if(isButton4Pressed){
                state = 1;
            }
            if(doesLowerSensorSeeBall){
                state = 1;
            }
            if(isButton4Pressed){
                state = 2;
            }
            isLowerIntakeOn = true;
            isUpperIntakeOn = true;
            isShooterOn = false;
        }
    }
}
