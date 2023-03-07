// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class SClaw extends SubsystemBase {
  private VictorSPX claw;
  /** Creates a new SClaw. */
  public SClaw() {
    claw = new VictorSPX(22);
    claw.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void powerSClaw(double power){
    claw.set(VictorSPXControlMode.PercentOutput, power);
  }
}
