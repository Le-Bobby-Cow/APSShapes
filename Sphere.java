public class Sphere {

  private float radius = 0;

  Sphere(/*float radius*/) {
    /*this.radius = radius;*/
  }

  public void set (float radius) {
    this.radius = radius;
  }

  public float volume() {
    float volume;
    double intermediate = (4 * Math.PI * (Math.pow(radius, 3))) / 3;
    volume = (float) intermediate;
    return volume;
  }

  public float surfaceArea() {
    float surfaceArea;
    double intermediate = 4*Math.PI*(Math.pow(radius, 2));
    surfaceArea = (float) intermediate;
    return surfaceArea;
  }
}
