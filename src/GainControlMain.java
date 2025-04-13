import java.sql.*;
import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class GainControlMain
{
    public static void main( String args[] ) throws SQLException {
        String[] choices = {"Cycling", "Running", "Strength"};

        while (true) {
            String selected = (String) JOptionPane.showInputDialog(
                    null,
                    "Pick your activity type",
                    "Workout selector",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choices,
                    choices[0]
            );
            LocalDate today = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String formatted = today.format(formatter);

            while (true) {
                if (selected == "Cycling") {
                    Cycling ride_new = new Cycling();
                    ride_new.date = formatted;
                    {
                        JTextField distanceField = new JTextField(10);
                        JTextField timeField = new JTextField(5);

                        JPanel panel = new JPanel();
                        panel.add(new JLabel("Distance (km):"));
                        panel.add(distanceField);
                        panel.add(Box.createHorizontalStrut(15)); // spacing
                        panel.add(new JLabel("Time elapsed (mins):"));
                        panel.add(timeField);

                        int result = JOptionPane.showConfirmDialog(
                                null,
                                panel,
                                "Enter your info",
                                JOptionPane.OK_CANCEL_OPTION
                        );

                        if (result == JOptionPane.OK_OPTION) {
                            ride_new.distance = Double.parseDouble(distanceField.getText());
                            ride_new.time = Double.parseDouble(timeField.getText());
                        } else {
                            break;
                        }
                    }
                    {
                        JTextField HR_MAXField = new JTextField(5);
                        JTextField HR_WORKINGField = new JTextField(5);
                        JTextField HR_AVGField = new JTextField(5);

                        JPanel panel = new JPanel();
                        panel.add(new JLabel("Max HR:"));
                        panel.add(HR_MAXField);
                        panel.add(Box.createHorizontalStrut(15)); // spacing
                        panel.add(new JLabel("Working AVG HR:"));
                        panel.add(HR_WORKINGField);
                        panel.add(Box.createHorizontalStrut(15)); // spacing
                        panel.add(new JLabel("AVG HR:"));
                        panel.add(HR_AVGField);

                        int result = JOptionPane.showConfirmDialog(
                                null,
                                panel,
                                "Enter your info",
                                JOptionPane.OK_CANCEL_OPTION
                        );

                        if (result == JOptionPane.OK_OPTION) {
                            ride_new.HR_MAX = Integer.parseInt(HR_MAXField.getText());
                            ride_new.HR_Working = Integer.parseInt(HR_WORKINGField.getText());
                            ride_new.HR_AVG = Integer.parseInt(HR_AVGField.getText());
                        }
                    }
                    {
                        JTextField workoutOutGoalField = new JTextField(50);
                        JTextField CommentField = new JTextField(50);
                        JTextField WeatherField = new JTextField(50);

                        JPanel panel = new JPanel();
                        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                        panel.add(new JLabel("Workout Goal:"));
                        panel.add(workoutOutGoalField);
                        panel.add(Box.createVerticalStrut(15)); // spacing
                        panel.add(new JLabel("Comments:"));
                        panel.add(CommentField);
                        panel.add(Box.createVerticalStrut(15)); // spacing
                        panel.add(new JLabel("Weather:"));
                        panel.add(WeatherField);

                        int result = JOptionPane.showConfirmDialog(
                                null,
                                panel,
                                "Enter your info",
                                JOptionPane.OK_CANCEL_OPTION
                        );

                        if (result == JOptionPane.OK_OPTION) {
                            ride_new.workOutGoal = workoutOutGoalField.getText();
                            ride_new.comment = CommentField.getText();
                            ride_new.weather = WeatherField.getText();
                        }
                    }
                    ride_new.speed = ride_new.calc_speed();

                    DBinput rideInput = new DBinput();
                    rideInput.insertWorkout_Ride(ride_new);
                    break;

                }
                if (selected == "Running") {
                    Running run_new = new Running();
                    run_new.date = formatted;
                    {
                        JTextField distanceField = new JTextField(10);
                        JTextField timeField = new JTextField(5);

                        JPanel panel = new JPanel();
                        panel.add(new JLabel("Distance (km):"));
                        panel.add(distanceField);
                        panel.add(Box.createHorizontalStrut(15)); // spacing
                        panel.add(new JLabel("Time elapsed (mins):"));
                        panel.add(timeField);

                        int result = JOptionPane.showConfirmDialog(
                                null,
                                panel,
                                "Enter your info",
                                JOptionPane.OK_CANCEL_OPTION
                        );

                        if (result == JOptionPane.OK_OPTION) {
                            run_new.distance = Double.parseDouble(distanceField.getText());
                            run_new.time = Double.parseDouble(timeField.getText());
                        } else {
                            break;
                        }
                    }
                    {
                        JTextField HR_MAXField = new JTextField(5);
                        JTextField HR_WORKINGField = new JTextField(5);
                        JTextField HR_AVGField = new JTextField(5);

                        JPanel panel = new JPanel();
                        panel.add(new JLabel("Max HR:"));
                        panel.add(HR_MAXField);
                        panel.add(Box.createHorizontalStrut(15)); // spacing
                        panel.add(new JLabel("Working AVG HR:"));
                        panel.add(HR_WORKINGField);
                        panel.add(Box.createHorizontalStrut(15)); // spacing
                        panel.add(new JLabel("AVG HR:"));
                        panel.add(HR_AVGField);

                        int result = JOptionPane.showConfirmDialog(
                                null,
                                panel,
                                "Enter your info",
                                JOptionPane.OK_CANCEL_OPTION
                        );

                        if (result == JOptionPane.OK_OPTION) {
                            run_new.HR_MAX = Integer.parseInt(HR_MAXField.getText());
                            run_new.HR_Working = Integer.parseInt(HR_WORKINGField.getText());
                            run_new.HR_AVG = Integer.parseInt(HR_AVGField.getText());
                        }
                    }
                    {
                        JTextField workoutOutGoalField = new JTextField(50);
                        JTextField CommentField = new JTextField(50);
                        JTextField WeatherField = new JTextField(50);

                        JPanel panel = new JPanel();
                        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                        panel.add(new JLabel("Workout Goal:"));
                        panel.add(workoutOutGoalField);
                        panel.add(Box.createVerticalStrut(15)); // spacing
                        panel.add(new JLabel("Comments:"));
                        panel.add(CommentField);
                        panel.add(Box.createVerticalStrut(15)); // spacing
                        panel.add(new JLabel("Weather:"));
                        panel.add(WeatherField);

                        int result = JOptionPane.showConfirmDialog(
                                null,
                                panel,
                                "Enter your info",
                                JOptionPane.OK_CANCEL_OPTION
                        );

                        if (result == JOptionPane.OK_OPTION) {
                            run_new.workOutGoal = workoutOutGoalField.getText();
                            run_new.comment = CommentField.getText();
                            run_new.weather = WeatherField.getText();
                        }
                    }
                    run_new.pace = run_new.calc_pace();

                    DBinput runInput = new DBinput();
                    runInput.insertWorkout_Run(run_new);
                    break;


                }
                if (selected == "Strength") {
                    Strength strength_new = new Strength();
                    strength_new.date = formatted;
                    {
                        JTextField WeightField = new JTextField(5);
                        JTextField repsField = new JTextField(5);
                        JTextField setsField = new JTextField(5);
                        JTextField goalField = new JTextField(30);
                        JTextField commentField = new JTextField(30);

                        JPanel panel = new JPanel();
                        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                        panel.add(new JLabel("Weight:"));
                        panel.add(WeightField);
                        panel.add(Box.createHorizontalStrut(15)); // spacing
                        panel.add(new JLabel("Reps:"));
                        panel.add(repsField);
                        panel.add(Box.createHorizontalStrut(15)); // spacing
                        panel.add(new JLabel("Sets:"));
                        panel.add(setsField);
                        panel.add(Box.createVerticalStrut(15)); // spacing
                        panel.add(new JLabel("Goal:"));
                        panel.add(goalField);
                        panel.add(Box.createVerticalStrut(15)); // spacing
                        panel.add(new JLabel("Comment:"));
                        panel.add(commentField);

                        int result = JOptionPane.showConfirmDialog(
                                null,
                                panel,
                                "Enter your info",
                                JOptionPane.OK_CANCEL_OPTION
                        );

                        if (result == JOptionPane.OK_OPTION) {
                            strength_new.weight = Integer.parseInt(WeightField.getText());
                            strength_new.reps = Integer.parseInt(repsField.getText());
                            strength_new.sets = Integer.parseInt(setsField.getText());
                            strength_new.workOutGoal = goalField.getText();
                            strength_new.comment = commentField.getText();
                        }
                        else {
                            break;
                        }
                    }
                    DBinput StrengthInput = new DBinput();
                    StrengthInput.insertWorkout_Str(strength_new);
                    break;
                }
            }
            JTextField inputField = new JTextField(10);
            JPanel panel = new JPanel();
            panel.add(new JLabel("Input another workout??"));
            int result = JOptionPane.showConfirmDialog(
                    null,
                    panel,
                    "Another Input",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );
            if (result == JOptionPane.YES_OPTION) {
                ;
            }
            else {
                return;
            }
        }
    }

}