public class Oops {
        public static void main(String[] args) {
            Pen p1=new Pen();
            p1.setcolor("Blue");
            System.err.println(p1.color);
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