class Workout {
    String date, comment, workOutGoal;

}

class Cycling extends Workout
{
    double distance, time, speed;
    int HR_Working, HR_MAX, HR_AVG;
    String weather;

    double calc_speed()
    {
        return distance / (time / 60);
    }
}

class Running extends Workout
{
    double distance, time, pace;
    int HR_Working, HR_MAX, HR_AVG;
    String weather;

    double calc_pace()
    {
        return time / distance;
    }
}

class Strength extends Workout
{

  int weight, reps, sets;

}