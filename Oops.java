public class Oops {
        public static void main(String[] args) {
            
        }
}
class Pen {
    String color;
    int tip;
    void setcolor(String newColor){
        color =newColor;   
     }
    void setTip(int newTip){
        tip=newTip;
       }
    
}
class Student{
    String name;
    int age;
    float percentage;
    void calcPercentage(int phy, int chem, int math){
        percentage=(phy+chem+math)/3;

    }
}