
/*
.
	We can  extend the Point class to represent a 3-dim Point which includes z-coordinate. 


	For example (2,-3,5) denotes a point in 3D Euclidean space.

*/



public class Point3D extends Point {
    protected int z;      // z-coordinate

    public void setZ(int zCoord) {
      this.z = zCoord;
    }

    public int getZ() {
      return this.z;
    }
  }


//Driver Class

Point3D p = new Point3D();

  p3.setX(2);      // Calling method from parent class
  p3.setY(-3);     //              -do-
  p3.setZ(4);      // Calling method from this class

  System.out.println( "(" + p3.getX() + "," + p3.getY() + "," + p3.getZ() + ")" );




/*

We can add new features by defining new attributes and methods - just like how we added z, getZ() and setZ().


We can use the existing features as if they belong to the extended class, provided they are declared protected or public - just like how we accessed getX() and getY().


We can override any feature of the superclass by defining another method with the same name and same signature. .*/
