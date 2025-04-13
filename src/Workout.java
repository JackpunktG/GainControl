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
        if (distance == -1 || time == -1) {
            return -1;
        }
        return distance / (time / 60);
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
        if (distance == -1 || time == -1) {
            return -1;
        }
        return time / distance;
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