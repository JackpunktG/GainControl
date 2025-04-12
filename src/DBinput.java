import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class DBinput
{
    String url = "jdbc:sqlite:GainControldb.db";
    String sql = "INSERT INTO WORKOUT(DATE, TYPE, DISTANCE, TIME, SPEED, PACE, AVG_HR, AVG_WORKING_HR, MAX_HR, WEATHER, WORKOUT_GOAL, WEIGHT, REPS, SETS, COMMENT) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public void insertWorkout_Ride(Cycling ride_new) throws SQLException
    {
        try (var conn = DriverManager.getConnection(url);
             var pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, ride_new.date);
            pstmt.setString(2, "Cycle");
            pstmt.setDouble(3, ride_new.distance);
            pstmt.setDouble(4, ride_new.time);
            pstmt.setDouble(5, ride_new.speed);
            pstmt.setNull(6, Types.REAL);
            pstmt.setInt(7, ride_new.HR_AVG);
            pstmt.setInt(8, ride_new.HR_Working);
            pstmt.setInt(9, ride_new.HR_MAX);
            pstmt.setString(10, ride_new.weather);
            pstmt.setString(11, ride_new.workOutGoal);
            pstmt.setNull(12, Types.REAL);
            pstmt.setNull(13, Types.REAL);
            pstmt.setNull(14, Types.REAL);
            pstmt.setString(15, ride_new.comment);

            pstmt.executeUpdate();
        }
    }
    public void insertWorkout_Run(Running run_new) throws SQLException
    {
        try (var conn = DriverManager.getConnection(url);
             var pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, run_new.date);
            pstmt.setString(2, "Run");
            pstmt.setDouble(3, run_new.distance);
            pstmt.setDouble(4, run_new.time);
            pstmt.setNull(5, Types.REAL);
            pstmt.setDouble(6, run_new.pace);
            pstmt.setInt(7, run_new.HR_AVG);
            pstmt.setInt(8, run_new.HR_Working);
            pstmt.setInt(9, run_new.HR_MAX);
            pstmt.setString(10, run_new.weather);
            pstmt.setString(11, run_new.workOutGoal);
            pstmt.setNull(12, Types.REAL);
            pstmt.setNull(13, Types.REAL);
            pstmt.setNull(14, Types.REAL);
            pstmt.setString(15, run_new.comment);

            pstmt.executeUpdate();
        }
    }
    public void insertWorkout_Str(Strength strength_new) throws SQLException
    {
        try (var conn = DriverManager.getConnection(url);
             var pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, strength_new.date);
            pstmt.setString(2, "Strength");
            pstmt.setNull(3, Types.REAL);
            pstmt.setNull(4, Types.REAL);
            pstmt.setNull(5, Types.REAL);
            pstmt.setNull(6, Types.REAL);
            pstmt.setNull(7, Types.REAL);
            pstmt.setNull(8, Types.REAL);
            pstmt.setNull(9, Types.REAL);
            pstmt.setString(10, "N.A");
            pstmt.setString(11, strength_new.workOutGoal);
            pstmt.setNull(12, strength_new.weight);
            pstmt.setNull(13, strength_new.reps);
            pstmt.setNull(14, strength_new.sets);
            pstmt.setString(15, strength_new.comment);

            pstmt.executeUpdate();
        }
    }
}

