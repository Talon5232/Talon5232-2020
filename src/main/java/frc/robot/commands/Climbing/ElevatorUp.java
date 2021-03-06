/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Climbing;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ElevatorSub;

public class ElevatorUp extends CommandBase {
  
  private final ElevatorSub m_Elevator;

  public ElevatorUp(ElevatorSub subsystem) {
    m_Elevator = subsystem;
    addRequirements(m_Elevator);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_Elevator.ElevatorUp();
  }
  public void end(boolean interrupted) {
    m_Elevator.ElevatorIdle();
  }
  @Override
  public boolean isFinished() {
    return false;
  }
}
