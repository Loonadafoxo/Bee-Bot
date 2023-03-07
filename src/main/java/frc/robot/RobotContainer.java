// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.commands.ArmBuild.Armcommands.ActiveArm;
import frc.robot.commands.ArmBuild.Armcommands.IdleArm;
import frc.robot.commands.Drivetrain.Drive;
import frc.robot.commands.Soleoid.ActiveSolenoid;
import frc.robot.commands.Soleoid.IdleSolenoid;
import frc.robot.subsystems.SArm;
import frc.robot.subsystems.SDrivetrain;
import frc.robot.subsystems.SSolenoid;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  public final SDrivetrain m_drivetrain;
  private final SArm m_sArm;
  private final SSolenoid m_sSolenoid;


  public static final XboxController controller0 = new XboxController(0);
  public static final XboxController controller1 = new XboxController(1);

  // Replace with CommandPS4Controller or CommandJoystick if neededg

     

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    m_drivetrain = new SDrivetrain();
    m_sArm = new SArm();
    m_sSolenoid = new SSolenoid(null);
  
    //If no code is saying otherwise, the drivetrain will listen to the controller, arms will not move, the shooter will not move, and the climb will not climb
    m_drivetrain.setDefaultCommand(new Drive(m_drivetrain, controller0));
    m_sArm.setDefaultCommand(new IdleArm(m_sArm));
    m_sSolenoid.setDefaultCommand(new IdleSolenoid(m_sSolenoid));
    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {

    new Trigger(controller0::getAButton).whileTrue(new ActiveArm(m_sArm));

     if (controller0.getYButtonPressed()) {
   ActiveSolenoid.toggle();
}

    // new Trigger(controller0::getYButton).onTrue((Command) new Solenoid(PneumaticsModuleType.CTREPCM, 0));

    // if (controller0.getYButtonPressed()) {ActiveSolenoid.toggle();}

    // public static Trigger triggerButton (XboxController controller, XboxController.Axis axis) {
    //   return new Trigger(() -> controller.getRawAxis(axis.value) >= 0.5);

  }

}
