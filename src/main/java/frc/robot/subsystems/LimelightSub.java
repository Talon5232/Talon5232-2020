/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.SupplyCurrentLimitConfiguration;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

public class LimelightSub extends SubsystemBase {

    private final NetworkTable m_Table = NetworkTableInstance.getDefault().getTable("limelight");

    public void limelightDefault() {

        NetworkTableEntry tx = m_Table.getEntry("tx");
        NetworkTableEntry ty = m_Table.getEntry("ty");
        NetworkTableEntry ta = m_Table.getEntry("ta");
        
        double x = tx.getDouble(0.0);
        double y = ty.getDouble(0.0);
        double a = ta.getDouble(0.0);

    }

    public LimelightSub() {
    
  }
 /* public void OneWay(){
    m_Belt.set(ControlMode.PercentOutput, 1.0);

  }
  public void BeltOtherWay(){
    m_Belt.set(ControlMode.PercentOutput, -1.0);
  }
  public void BeltIdle(){
    m_Belt.set(ControlMode.PercentOutput, 0);
  }
  public void BeltAuto(double speed){
    m_Belt.set(ControlMode.PercentOutput, speed);
  }
  */
}
