// Reference document https://docs.oracle.com/javase/tutorial/java/concepts/class.html
// https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
// https://docs.oracle.com/javase/tutorial/java/concepts/QandE/questions.html
// Exercises1:Create new classes for each real-world object that you observed at the beginning of this trail. Refer to the Bicycle class if you forget the required syntax.
class dog {

    int happy = 0;
    int hungry = 0;

    void timeonplaying(int newValue) {
         happy = happy+newValue;
    }

    void weightoneating(int newValue) {
         hungry = hungry+newValue;
    }

    void printStates() {
         System.out.println("happy:" + happy + " hungry:" + hungry); 
    }
}

//Exercises2:For each new class that you've created above, create an interface that defines its behavior, then require your class to implement it. Omit one or two methods and try compiling. What does the error look like?
interface dog {
    
     void timeonplaying(int newValue);
      
     void weightoneating(int newValue);
}

class MYdog implements dog {
     
     int happy = 0;
     int hugry = 0;
     
     void timeonplaying(int newValue) {
              happy = happy + newValue;
     }

     void weightoneating(int newValue) {
              hugry = hungry + newValue;
     }

     void printStates() {
         System.out.println("happy:" + happy + " hungry:" + hungry); 
     }

}
     
