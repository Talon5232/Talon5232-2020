/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;



import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SpikeRelayConstants;

public class IntakeSwitch extends SubsystemBase {

  private final Relay m_IntakeSwitch =
    new Relay(SpikeRelayConstants.kIntakeSwitch);


public void SwitchOn(){
  m_IntakeSwitch.set(Relay.Value.kForward);
}

public void SwitchOff(){
  m_IntakeSwitch.set(Relay.Value.kReverse);
}

}
