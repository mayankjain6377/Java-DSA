package java_oops.Enums;

public class Basic {
  enum Week {
      Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
      //these are enum constants
      //public static and final
      //we cann't create child enums of this


      public static void main(String[] args) {
          Week week;
          week=Week.Monday;
          

      }
  }
}
