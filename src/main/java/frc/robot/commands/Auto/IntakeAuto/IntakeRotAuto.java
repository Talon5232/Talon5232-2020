/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Auto.IntakeAuto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeRotSub;

public class IntakeRotAuto extends CommandBase {
  private final IntakeRotSub m_Rotate;
  double m_speed;
  /**
   * Creates a new IntakeRotAuto.
   */
  public IntakeRotAuto(IntakeRotSub subsystem, double speed) {
    m_Rotate = subsystem;
    m_speed = speed;

    addRequirements(m_Rotate);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Rotate.setRotSpeed(m_speed);
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
