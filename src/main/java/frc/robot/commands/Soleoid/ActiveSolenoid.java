// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Soleoid;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SSolenoid;


public class ActiveSolenoid extends CommandBase {
  private final SSolenoid sSolenoid;
  /** Creates a new Solenoid. */
  public ActiveSolenoid(SSolenoid sSolenoid) {
    this.sSolenoid = sSolenoid;
    addRequirements(this.sSolenoid);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
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

  public static void toggle() {
  }

}
