
/* I would like to get feedback for this code */

import java.util.ArrayList;

public class IntervalWorkout{
    String SeveralExercises;
     int NumberRepition = 1;
     int BreakTime;



    public void Printinterval(){

        System.out.println(SeveralExercises);

            }
    public IntervalWorkout(String SeveralExercises, int BreakTime ){
         this.NumberRepition= 1 ;
        this.SeveralExercises = SeveralExercises;
        this.BreakTime = BreakTime;

    }

    @Override
    public String toString() {
        return "IntervalWorkout{" +
                "SeveralExercises=" + SeveralExercises +
                ", NumberRepition=" + NumberRepition +
                ", BreakTime=" + BreakTime +
                '}';
    }

    public static void main(String[] args) {

          IntervalWorkout PushUp = new IntervalWorkout("PushUps",30);
          IntervalWorkout Squats = new IntervalWorkout("Squats",30);
          IntervalWorkout planks = new IntervalWorkout("Planks",30);


          ArrayList<IntervalWorkout> intervalWorkouts = new ArrayList<>();

          intervalWorkouts.add(PushUp);
          intervalWorkouts.add(Squats);
          intervalWorkouts.add(planks);
          intervalWorkouts.add(PushUp);
          intervalWorkouts.add(Squats);
          intervalWorkouts.add(planks);
          intervalWorkouts.add(PushUp);
          intervalWorkouts.add(Squats);
          intervalWorkouts.add(planks);

          intervalWorkouts.add(PushUp);
          intervalWorkouts.add(Squats);
          intervalWorkouts.add(planks);

        System.out.println("***************************");
        System.out.println("Interval Workout STARTS!!!!");
        System.out.println("***************************");
        System.out.println("===========================");

        for (IntervalWorkout elements : intervalWorkouts) {
            if (elements.SeveralExercises=="PushUps"){
                System.out.println("DO THE BREAK:" +"("+ Squats.BreakTime +"SECONDS"+")");
            }
            if(elements.SeveralExercises=="PushUps"){

                int num = 1;
                System.out.println("Round " +num);
            }
            elements.Printinterval();


        }
        System.out.println("***************************");
        System.out.println("CONGRATS - YOU ARE DONE !!!");
        System.out.println("***************************");


    }
}
