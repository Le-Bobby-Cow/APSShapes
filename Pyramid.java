public class Pyramid {

  private float length, width, height = 0;

  Pyramid(/*float length, float width, float height*/) {
    /*this.length = length;
    this.width = width;
    this.height = height;*/
  }

  public void set (float length, float width, float height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public float volume() {
    float volume;
    double intermediate = (float) (length * width * height) / 3;
    volume = (float) intermediate;
    return volume;
  }

  public float surfaceArea() {
    float surfaceArea;
    double intermediate = (length * width) + (length * (Math.sqrt((Math.pow((width/2), 2) + Math.pow(height, 2))))) + (width * (Math.sqrt((Math.pow((length/2), 2) + Math.pow(height, 2)))));
    surfaceArea = (float) intermediate;
    return surfaceArea;
  }
}
