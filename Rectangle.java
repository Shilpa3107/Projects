public class Rectangle {
    double height,width;
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public void seWidth(double width){
        this.width = width;
    }
    public double getArea(){
        return height*width;
    }
}

