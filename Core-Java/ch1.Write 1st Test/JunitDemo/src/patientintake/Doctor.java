package patientintake;

public enum Doctor {
   patil("aman Patil"),
   rathi("Hemraj Rathi"),
   gaikwad("Sanjay Gaikwad");

   private String name;

   Doctor(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }
}
