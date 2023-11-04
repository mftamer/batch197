package day20_oopconcept04;

public class C16CarRunner {


    public static void main(String[] args) {
      /*
        You cannot create an object from Interface
        C10Engine myEngine = new C10Engine() {
            @Override
            public void start() {
            }
            @Override
            public void stop() {
            }
        }
       */
        C13Honda myHonda = new C13Honda();
        myHonda.price(); //price() is a default concrete method in interface. To access default concrete methods we need
                            //object.
        C10Engine.accelerate(); // accelerate() is a concrete method in interface. It is "Static Concrete Method" to
                                // access static concrete method we use only class name.

        System.out.println("C10Engine.ENGINE_NAME = " + C10Engine.ENGINE_NAME);
        //C10Engine.ENGINE_NAME = C10Engine.ENGINE_NAME + "!"; // WE CANNOT UPDATE THE FINAL VARIABLE


    }
}
