package awt;

public class TestVisit {
        public static void main(String[] args) {
      Visit vis = new Visit("Raj", 31.0);
      System.out.println(vis);
  
      vis.visit("All OK", 30);
      System.out.println("After the visit has taken place");
      System.out.println(vis);
  
      String name = vis.getName();
      double price = vis.getPrice();
      String result = vis.getResult();
      int duration = vis.getDuration();
      boolean done = vis.hasTakenPlace();
      System.out.println("Information on the visit:");
      System.out.println("Name: " + name);
      System.out.println("Price: " + price);
      System.out.println("Result: " + result);
      System.out.println("Duration: " + duration);
      System.out.println("Done:  " + done);
  
      vis.visit("Ram Yadhav", 51);
      System.out.println("Doing again the visit should have no effect");
      System.out.println(vis);
  
    }
  }