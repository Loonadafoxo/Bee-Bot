// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class SDrivetrain extends SubsystemBase {
  private VictorSPX left0;
  private VictorSPX left1;
  // private VictorSPX left2;
  private VictorSPX right0;
  private VictorSPX right1;
  // private VictorSPX right2;
  /** Creates a new SDrivetrain. */
  public SDrivetrain() {
    left0 = new VictorSPX(1);
    left0.setInverted(true);

    left1 = new VictorSPX(2);
    left1.setInverted(true);

    // left2 = new VictorSPX(null);
    // left2.setInverted(true);

    right0 = new VictorSPX(3);
    right0.setInverted(false);

    right1 = new VictorSPX(4);
    right1.setInverted(false);

    // right2 = new VictorSPX(null);
    // right2.setInverted(true);

  }

  @Override
  public void periodic() {}
  
  public void drive(double leftPower, double rightPower){
    left0.set(VictorSPXControlMode.PercentOutput, leftPower);
    left1.set(VictorSPXControlMode.PercentOutput, leftPower);
    // left2.set(VictorSPXControlMode.PercentOutput, leftPower);   
    right0.set(VictorSPXControlMode.PercentOutput, rightPower);
    right1.set(VictorSPXControlMode.PercentOutput, rightPower);
    // right2.set(VictorSPXControlMode.PercentOutput, rightPower);  
  }
}
