package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.*;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.*;
//import frc.robot.subsystems.ReloadSubsystem;
//import edu.wpi.first.wpilibj2.command.button.*;

public class RobotContainer {




    public final Joystick leftJoy = new Joystick(Constants.leftJoyPort);
    public final Joystick xboxController = new Joystick(Constants.xboxController);
    public final static Joystick mechJoy = new Joystick(Constants.mechJoyPort);

    //Pneumatics Subsystems and Commands
    PneumaticsSubsystem pneumaticsSubsystem = new PneumaticsSubsystem();
    //ReloadSubsystem reloadSubsystem = new ReloadSubsystem();

    //PneumaticsExtendPistonCommand pneumaticsExtendPistonCommand = new PneumaticsExtendPistonCommand(pneumaticsSubsystem);
    //PneumaticsRetractPistonCommand pneumaticsRetractPistonCommand = new PneumaticsRetractPistonCommand(pneumaticsSubsystem);

    //ReloadRetractPistonCommand reloadRetractPistonCommand = new ReloadRetractPistonCommand(reloadSubsystem);
    //ReloadExtendPistonCommand reloadExtendPistonCommand = new ReloadExtendPistonCommand(reloadSubsystem);



    public JoystickButton leftTrigger = new JoystickButton(leftJoy, 1), leftButton2 = new JoystickButton(leftJoy, 2),
            leftButton3 = new JoystickButton(leftJoy, 3), leftButton4 = new JoystickButton(leftJoy, 4),
            leftButton5 = new JoystickButton(leftJoy, 5), leftButton6 = new JoystickButton(leftJoy, 6),
            leftButton7 = new JoystickButton(leftJoy, 7), leftButton8 = new JoystickButton(leftJoy, 8),
            leftButton9 = new JoystickButton(leftJoy, 9), leftButton10 = new JoystickButton(leftJoy, 10),
            leftButton11 = new JoystickButton(leftJoy, 11), leftButton12 = new JoystickButton(leftJoy, 12);

    public double getLeftJoyX() {
        return leftJoy.getRawAxis(0);
    }

    public double getLeftJoyY() {
        return leftJoy.getRawAxis(1);
    }

    public double getLeftJoyThrottle() {
        return leftJoy.getRawAxis(2);
    }

    public JoystickButton rightTrigger = new JoystickButton(xboxController, 1),
            rightButton2 = new JoystickButton(xboxController, 2), rightButton3 = new JoystickButton(xboxController, 3),
            rightButton4 = new JoystickButton(xboxController, 4), rightButton5 = new JoystickButton(xboxController, 5),
            rightButton6 = new JoystickButton(xboxController, 6), rightButton7 = new JoystickButton(xboxController, 7),
            rightButton8 = new JoystickButton(xboxController, 8), rightButton9 = new JoystickButton(xboxController, 9),
            rightButton10 = new JoystickButton(xboxController, 10), rightButton11 = new JoystickButton(xboxController, 11),
            rightButton12 = new JoystickButton(xboxController, 12);

    public double getRightJoyX() {
        return xboxController.getRawAxis(0);
    }

    public double getRightJoyY() {
        return xboxController.getRawAxis(1);
    }

    public double getRightJoyThrottle() {
        return xboxController.getRawAxis(2);
    }

    public JoystickButton mechTrigger = new JoystickButton(mechJoy, 1), mechButton2 = new JoystickButton(mechJoy, 2),
            mechButton3 = new JoystickButton(mechJoy, 3), mechButton4 = new JoystickButton(mechJoy, 4),
            mechButton5 = new JoystickButton(mechJoy, 5), mechButton6 = new JoystickButton(mechJoy, 6),
            mechButton7 = new JoystickButton(mechJoy, 7), mechButton8 = new JoystickButton(mechJoy, 8),
            mechButton9 = new JoystickButton(mechJoy, 9), mechButton10 = new JoystickButton(mechJoy, 10),
            mechButton11 = new JoystickButton(mechJoy, 11), mechButton12 = new JoystickButton(mechJoy, 12);

    public double getMechJoyX() {
        return mechJoy.getRawAxis(0);
    }

    public double getMechJoyY() {
        return mechJoy.getRawAxis(1);
    }

    public double getMechJoyThrottle() {
        return mechJoy.getRawAxis(2);
    }




    /**
     * The container for the robot. Contains subsystems, OI devices, and commands.
     */
    public RobotContainer() {
        
        // Configure the button bindings
        configureButtonBindings();


    }

    /**
     * Use this method to define your button->command mappings. Buttons can be
     * created by instantiating a {@link GenericHID} or one of its subclasses
     * ({@link edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then
     * passing it to a {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
     */
    private void configureButtonBindings() {

        //mechTrigger.whenPressed(new turnCommand());

        //m_drivetrain.setDefaultCommand(getArcadeDriveCommand());

        //mechButton2.whenPressed(new stopTurnCommand());

        //mechButton3.whenPressed(new returnTohome());

        //mechButton7.whileHeld(pneumaticsExtendPistonCommand);
        //mechButton8.whileHeld(pneumaticsRetractPistonCommand);

        //mechButton5.whileHeld(reloadExtendPistonCommand);
        //mechButton4.whileHeld(reloadRetractPistonCommand);


        //mechButton9.whileHeld(new shootCommand());
        mechButton8.whileHeld(new hornCommand());
    }

/**
   * Use this to pass the teleop command to the main {@link Robot} class.
   *
   * @return the command to run in teleop
   */
  
}
