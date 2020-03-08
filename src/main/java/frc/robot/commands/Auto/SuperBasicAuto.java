/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Auto;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.commands.Auto.DrivetrainAuto.DrivetrainAuto;
import frc.robot.commands.Auto.IntakeAuto.BeltAuto;
import frc.robot.commands.Auto.IntakeAuto.IntakeAuto;
import frc.robot.commands.Auto.IntakeAuto.IntakeRotAuto;
import frc.robot.commands.Intake.Intake;
import frc.robot.subsystems.Belt;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeRotSub;
import frc.robot.subsystems.IntakeSub;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class SuperBasicAuto extends SequentialCommandGroup {
  /**
   * Creates a new BasicAuto.
   */
  public SuperBasicAuto(DriveSubsystem m_drive) {
   // Most of these numbers are guesses, change accordinly - might want to start lower than I am. Otherwise comment out this top part and uncomment the addCommand function
  addCommands( 
   new SequentialCommandGroup( 
      new DrivetrainAuto(m_drive, -.60, 0).withTimeout(1.37)

    
     ));
  
  /*  addCommands(
      new DrivetrainAuto(m_drive, -.65, 0)*+.withTimeout(1.37),
      new WaitCommand(1));
   */  
    
  
  }
   
   
}   
