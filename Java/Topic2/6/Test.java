import music.string.Veena;
import music.wind.Saxophone;
import music.Playable;

public class Test {
  public static void main(String[ ] args) {
      try {
        Playable p1 = new Veena();
        p1.play();
        Playable p2 = new Saxophone();
        p2.play();
      }
      catch (Exception e) {
       System.out.println(e);
      }

    }
}
		  
