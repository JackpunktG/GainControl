class Workout {
    String date, comment, workOutGoal;

}

class Cycling extends Workout
{
    double distance, time, speed;
    int HR_Working, HR_MAX, HR_AVG;
    String weather;

    Cycling()
    {
        HR_AVG = HR_MAX = HR_Working = -1;
        distance = time = -1;
    }

    double calc_speed()
    {
        double speed;

        if (distance == -1 || time == -1) {
            return -1;
        }
        speed = distance / (time / 60);
        speed = Math.round(speed * 100.0) / 100.0;
        return speed;
    }
}

class Running extends Workout
{
    double distance, time, pace;
    int HR_Working, HR_MAX, HR_AVG;
    String weather;

    Running()
    {
        HR_AVG = HR_MAX = HR_Working = -1;
        distance = time = -1;
    }

    double calc_pace()
    {
        double pace;

        if (distance == -1 || time == -1) {
            return -1;
        }
        pace = time/distance;
        pace = Math.round(pace * 100.0) / 100.0;
        return pace;
    }
}

class Strength extends Workout
{

  int weight, reps, sets;

  Strength()
  {
      weight = reps = sets = -1;
  }
}