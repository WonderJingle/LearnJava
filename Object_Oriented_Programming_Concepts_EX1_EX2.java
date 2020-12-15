// Reference document https://docs.oracle.com/javase/tutorial/java/concepts/class.html
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
     