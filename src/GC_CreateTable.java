import java.sql.*;

public class GC_CreateTable {
    public static void main( String args[] ) {
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:GainControldb.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();             // Creating table
            String sql = "CREATE TABLE WORKOUT " +
                    "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                    " DATE          TEXT    NOT NULL, " +
                    " TYPE          TEXT     NOT NULL, " +
                    " DISTANCE      REAL, " +
                    " TIME         REAL, " +
                    " SPEED         REAL, " +
                    " PACE          REAL, " +
                    " AVG_HR        INT, " +
                    " AVG_WORKING_HR        INT, " +
                    " MAX_HR        INT, " +
                    " WEATHER       TEXT," +
                    " WORKOUT_GOAL  TEXT," +
                    " WEIGHT        INT, " +
                    " REPS          INT, " +
                    " SETS          INT," +
                    " Comment       TEXT)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }
}