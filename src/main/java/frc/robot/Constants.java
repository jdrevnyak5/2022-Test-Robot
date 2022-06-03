package frc.robot;

public class Constants {
         //Talon
  public static final int compressor = 0;
  public static final int talonTurn1 = 1; //Motor that turns cannon
  public static final int talonShoot = 6; //Controller that activates the shot
  public static final int talonHorn = 7; //Controller that activates the horn

  

      //Joysticks
  public static final int leftJoyPort = 2;
  public static final int xboxController = 0;
  public static final int mechJoyPort = 1;


  
  	/**
	 * Which PID slot to pull gains from. Starting 2018, you can choose from
	 * 0,1,2 or 3. Only the first two (0,1) are visible in web-based
	 * configuration.
	 */
	public static final int kSlotIdx = 0;

	/**
	 * Talon SRX/ Victor SPX will supported multiple (cascaded) PID loops. For
	 * now we just want the primary one.
	 */
	public static final int kPIDLoopIdx = 0;

	/**
	 * Set to zero to skip waiting for confirmation, set to nonzero to wait and
	 * report to DS if action fails.
	 */
	public static final int kTimeoutMs = 30;
	
	/* Choose so that Talon does not report sensor out of phase */
	public static boolean kSensorPhase = false;

	/**
	 * Choose based on what direction you want to be positive,
	 * this does not affect motor invert. 
	 */
	public static boolean kMotorInvert = true;

	/**
	 * Gains used in Positon Closed Loop, to be adjusted accordingly
     * Gains(kp, ki, kd, kf, izone, peak output);
     */
  public static final Gains kGains = new Gains(.8, 0.0002, 75.0, 0.0, 0, 0.4);
    
    
}
