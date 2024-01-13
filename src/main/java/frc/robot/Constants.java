
package frc.robot;

import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.Subsystems.Swerve.Drivetrain;
import frc.robot.Subsystems.Swerve.Gyro;

public final class Constants {

    /* Controller Constants */
    public static final XboxController swerveController = new XboxController(0);
    public static final XboxController alternateController = new XboxController(1);

    public static final double swerveControllerLeftStickDeadband = 0.1;
    public static final double swerveControllerRightXDeadband = 0.1;


    // Slew rate limiters to make joystick inputs more gentle; 1/3 sec from 0 to 1.
    public static SlewRateLimiter m_xspeedLimiter = new SlewRateLimiter(5);
    public static SlewRateLimiter m_yspeedLimiter = new SlewRateLimiter(5);
    public static SlewRateLimiter m_rotLimiter = new SlewRateLimiter(5);




    /* - - - SWERVE DRIVE CONSTANTS - - - */

    public static final Gyro m_gyro = new Gyro(90);
    public static final Drivetrain m_swerve = new Drivetrain();

    public static final int frontLeftDriveID = 4;
    public static final int frontRightDriveID = 6;
    public static final int backLeftDriveID = 1;
    public static final int backRightDriveID = 7;

    public static final int frontLeftTurnID = 3;
    public static final int frontRightTurnID = 5;
    public static final int backLeftTurnID = 2;
    public static final int backRightTurnID = 8;

    public static final double frontLeftOffset = 0;
    public static final double frontRightOffset = 0;
    public static final double backLeftOffset = 0;
    public static final double backRightoffset = 0;

    public static final double driveEncoderVelocityConversion = (1/5.33);
    public static final double driveEncoderPositionConversion = 1;
    public static final double turnEncoderPositionConversion = 1;

    public static final double drivetrainModuleOffset = 0.2923; /* Assuming the robot is square, the X & Y offset from the center of rotation to each module */
    public static final int numberOfModules = 4;
    public static final double maxVelocityMultiplier = 6; /* Max velocity in m/s */
    public static final double radiansPerSecondMultiplier = 6; /* Max angular rate in radians/second */

    /* - - - OTHER CONSTANTS - - - */



}