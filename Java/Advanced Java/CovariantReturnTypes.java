import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Super Class
class Flower {
    String name = "I have many names and types.";
    public String whatsYourName() {
        return name;
    }
}

//Subclass of Flower
class Jasmine extends Flower {
    String name = "Jasmine";

    @Override
    public String whatsYourName() {
        return name;
    }
}

//Subclass of Flower
class Lily extends Flower {
    String name = "Lily";
    
    @Override
    public String whatsYourName() {
        return name;
    }
}

//Super Class
class Region {
    Flower flower = new Flower();
    public Flower yourNationalFlower() {
        return flower;
    }
}

//Subclass of Region
class WestBengal extends Region {
    Jasmine jasmine = new Jasmine();
    
    @Override
    public Jasmine yourNationalFlower() {
        return jasmine;
    }
}

//Subclass of Flower
class AndhraPradesh extends Region {
    Lily lily = new Lily();

    @Override
    public Lily yourNationalFlower() {
        return lily;
    }
}

public class Solution {

  public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine().trim();
      Region region = null;
      switch (s) {
        case "WestBengal":
          region = new WestBengal();
          break;
        case "AndhraPradesh":
          region = new AndhraPradesh();
          break;
      }
      Flower flower = region.yourNationalFlower();
      System.out.println(flower.whatsYourName());
    }
}
