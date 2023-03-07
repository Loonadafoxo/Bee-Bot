// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Auton;

import com.ctre.phoenix.motorcontrol.InvertType;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SDrivetrain;

public class AutonDrive extends CommandBase {
  private final SDrivetrain drivetrain;
  private Timer autonTimer;
  /** Creates a new AutonDrive. */
  public AutonDrive(SDrivetrain drivetrain) {
    this.drivetrain = drivetrain;
    addRequirements(this.drivetrain);
    autonTimer = new Timer();
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    autonTimer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(autonTimer.get() > 0){
      drivetrain.drive(.35, .35);
    }

    if (autonTimer.get() > 2){
      drivetrain.drive(0, 0);
    }

    if(autonTimer.get() > 3){
      drivetrain.drive(-0.35, -0.35);
    }

    if (autonTimer.get() > 5){
      drivetrain.drive(0, 0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
