// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
//import frc.robot.subsystems.hornSubsystem;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.CvSink;
import edu.wpi.first.cscore.CvSource;

/** This is a demo program showing how to use Mecanum control with the MecanumDrive class. */
public class Robot extends TimedRobot {
  public static RobotContainer m_robotContainer;
  //public static hornSubsystem m_horn;



  CvSink cvSink;
  CvSource outputStream;
  
  private static final int kFrontLeftChannel = 2;
  private static final int kRearLeftChannel = 4;
  private static final int kFrontRightChannel = 1;
  private static final int kRearRightChannel = 3;


  private DifferentialDrive m_robotDrive;
  private Joystick m_stick;


  @Override
  public void robotInit() {
    CameraServer.startAutomaticCapture();
    cvSink = CameraServer.getVideo();
    outputStream = CameraServer.putVideo("Camera", 640, 480);
    outputStream.setFPS(20);

    m_robotContainer = new RobotContainer();


    

    PWMSparkMax frontLeft = new PWMSparkMax(kFrontLeftChannel);
    PWMSparkMax rearLeft = new PWMSparkMax(kRearLeftChannel);
    MotorControllerGroup m_left = new MotorControllerGroup(frontLeft, rearLeft);


    PWMSparkMax frontRight = new PWMSparkMax(kFrontRightChannel);
    PWMSparkMax rearRight = new PWMSparkMax(kRearRightChannel);
    MotorControllerGroup m_right = new MotorControllerGroup(frontRight, rearRight);


    

    // Invert the right side motors.
    // You may need to change or remove this to match your robot.
    frontRight.setInverted(true);
    rearRight.setInverted(true);

    m_robotDrive = new DifferentialDrive(m_left, m_right);

    m_stick = new Joystick(Constants.xboxController);
    


  }

  @Override
  public void teleopPeriodic() {
    // Use the joystick X axis for lateral movement, Y axis for forward
    // movement, and Z axis for rotation.
    m_robotDrive.arcadeDrive(-m_stick.getY() * 0.75, m_stick.getX() * 0.75);
    //m_horn = new hornSubsystem();

  }
}
