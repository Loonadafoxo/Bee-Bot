// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsControlModule;
// import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SSolenoid extends SubsystemBase {
  // private DoubleSolenoid Dsolenoid;
  private Solenoid Ssolenoid;
  private PneumaticsControlModule hub;
  /** Creates a new SSolenoid. */
  public SSolenoid(PneumaticsControlModule hub) {
    // Dsolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1);
    // Solenoid Ssolenoid = new Solenoid(PneumaticsModuleType.CTREPCM, 1);
    this.setHub(hub);
    // Ssolenoid = hub.makeSolenoid(6);
    
  }

  public PneumaticsControlModule getHub() {
    return hub;
  }

  private void setHub(PneumaticsControlModule hub) {
    this.hub = hub;
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void actuateSolenoid(){
    Ssolenoid.set(true);
  }

  public void retractSolenoid(){
    Ssolenoid.set(false);
  }
}
