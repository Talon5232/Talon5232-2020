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
public class BasicAuto extends SequentialCommandGroup {
  /**
   * Creates a new BasicAuto.
   */
  public BasicAuto(DriveSubsystem m_drive, Belt m_Belt, IntakeSub m_Intake, IntakeRotSub m_Rotate) {
   // Most of these numbers are guesses, change accordinly - might want to start lower than I am. Otherwise comment out this top part and uncomment the addCommand function
  addCommands( 
   new SequentialCommandGroup( 
      new DrivetrainAuto(m_drive, -.65, 0).withTimeout(1.55),
     new WaitCommand(1),
      new IntakeRotAuto(m_Rotate, .15).withTimeout(.1),
      new WaitCommand(3),
    new ParallelCommandGroup(
      new BeltAuto(m_Belt, 1).withTimeout(4),
       new IntakeAuto(m_Intake, -1).withTimeout(4),
      new WaitCommand(3),
       new SequentialCommandGroup(
       new IntakeRotAuto(m_Rotate, .25).withTimeout(.25),
       new DrivetrainAuto(m_drive, .6, .0).withTimeout(1.37),
       new DrivetrainAuto(m_drive, 0, .75).withTimeout(1),
       new DrivetrainAuto(m_drive, .6, 0).withTimeout(.75)    
     ))));
  
  /*  addCommands(
      new DrivetrainAuto(m_drive, -.65, 0).withTimeout(1.37),
      new WaitCommand(1));
   */  
    
  
  }
   
   
}   
