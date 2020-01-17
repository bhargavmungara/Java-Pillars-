

public abstract class Path {
        public void fun() {          // is implemented
           // body of the method
 
			 System.out.println("Base fun() called"); 

        }

        public abstract void b();  // not implemented
    }


abstract class X implements Y {
  // implements all but one method of Y
}

class XX extends X {
  // implements the remaining method in Y
}

