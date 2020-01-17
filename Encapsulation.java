



public class Point {
  private int x;
  private int y;

  public void setX(int xCoord) {
    this.x = xCoord;
  }

  public void setY(int yCoord) {
    this.y = yCoord;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }
}




public class Driver {
  public static void main(String[] args) {
      Point p = new Point();
      p.setX(2);
      p.setY(3);
      System.out.println("(" + p.getX() + "," + p.getY() + ")");      
  }
}
