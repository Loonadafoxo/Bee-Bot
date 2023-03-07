// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.ArmBuild.Armcommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SArm;

public class ReverseArm extends CommandBase {
  private final SArm sArm;
  /** Creates a new Arm. */
  public ReverseArm(SArm sArm) {
    this.sArm = sArm;
    addRequirements(this.sArm);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    sArm.powerSArm(-.1);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
