package enumsExamples;

public class Basic {
    //enum constant
    //default public static and final
    //you can't create child enums
    //type here is Week
    //All Enum extend java.lang class
    //enum can't be super class
    //enum can't extend classes
    //enum can extend interface
    enum Week  implements  A{
        Monday , Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday;


        //This is not public or protected
        //Only private or default
        //Otherwise it will allow object creation for all rather than 1

        Week() {
            System.out.println("Constructor called for "+ this);
        }

        @Override
        public void hello() {
            System.out.println("How are you");
        }
        //internally : public static final Week Monday = new Week();
    }


    public static void main(String[] args) {
        Week week;

        week = Week.Monday;
        week.hello();

        System.out.println(Week.valueOf("Monday"));

        for(Week day: Week.values()){
            System.out.println(day);
        }

        System.out.println(week);
        //Position of enum declaration
        System.out.println(week.ordinal());
    }
}
