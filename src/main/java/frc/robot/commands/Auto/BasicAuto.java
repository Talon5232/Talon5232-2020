/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.commands.Auto.SimpleComputer.SimpleComputerBack;
import frc.robot.commands.Auto.SimpleComputer.SimpleComputerFWD;
import frc.robot.subsystems.DriveSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class BasicAuto extends SequentialCommandGroup {
  /**
   * Creates a new BasicAuto.
   */
  public BasicAuto(DriveSubsystem m_drive) {
    addCommands(
      new SimpleComputerFWD(m_drive, -.65, 0).withTimeout(1.37),
      new WaitCommand(1));
      
  
  }
   
   
}   
