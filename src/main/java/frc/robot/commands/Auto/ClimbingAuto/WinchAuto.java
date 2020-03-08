/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Auto.ClimbingAuto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Winch;

public class WinchAuto extends CommandBase {
  private final Winch m_Winch;
  double m_speed;
  /**
   * Creates a new WinchAuto.
   */
  public WinchAuto(Winch subsystem, double speed) {
    m_Winch = subsystem;
    m_speed = speed;

    addRequirements(m_Winch);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Winch.WinchAuto(m_speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
