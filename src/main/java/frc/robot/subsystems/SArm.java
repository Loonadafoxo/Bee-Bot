// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class SArm extends SubsystemBase {
  private VictorSPX arm;
  /** Creates a new SArm. */
  public SArm() {
    arm = new VictorSPX(5);
    arm.setInverted(true);

    arm = new VictorSPX(6);
    arm.setInverted(false);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void powerSArm(double power){
    arm.set(VictorSPXControlMode.PercentOutput, power);
  }
}
