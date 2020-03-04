/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {                                                                                                                                                                                                                                            
    public static final class DriveConstants {
      public static final int kLeftMotor1Port = 5;
      public static final int kLeftMotor2Port = 12;
      public static final int kLeftMotor3Port = 10;

      public static final int kRightMotor1Port = 2;
      public static final int kRightMotor2Port = 8;
      public static final int kRightMotor3Port = 9;

    }

    public static final class IntakeConstants{
        public static final int kIntakeMotor = 3;
        public static final int kBeltMotor = 4;
        public static final int kRotateMotor = 7; 
    }
    
    public static final class ClimbingConstants{
        public static final int kElevatorMotor = 1;
        public static final int kWinchMotor = 0;

    }
    public static final class SpikeRelayConstants{
        public static final int kElevatorLatch = 0;
        public static final int kIntakeSwitch = 1;

    }
    public static final class WheelOfFortune{
        public static final int kWheelofFortune = 6;
		public static int kWheelofFortuneSpinner = 11;

    }
    public static final class AutoConstants {

    }
  
    public static final class OIConstants {
        public static final int kDriverControllerPort = 0;
	    public static final int kButtons = 0;
        public static final int kBlueButtons = 1;
      
    }
  }
  