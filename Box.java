public class Box {

  private float length, width, height = 0;

  Box(/*float length, float width, float height*/) {
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
    double intermediate = length * width * height;
    volume = (float) intermediate;
    return volume;
  }

  public float surfaceArea() {
    float surfaceArea;
    double intermediate = (2 * (length * width)) + (2 * (width * height)) + (2 * (length * height));
    surfaceArea = (float) intermediate;
    return surfaceArea;
  }
}
