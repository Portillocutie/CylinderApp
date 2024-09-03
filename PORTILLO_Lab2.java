public class CylinderApp {
    public static void main(String[] args) {
        CylinderVol cyl = new CylinderVol();
        cyl.input(9, 18); 
        cyl.area();
        cyl.volume();
    }
}

class Cylinder {
    double radius;
    double height;
    double area;

    void input(double r, double h) {
        radius = r;
        height = h;
    }

    void area() {
        area = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
        System.out.println("Area of the cylinder: " + area);
    }
}

class CylinderVol extends Cylinder {
    double volume;

    void volume() {
        volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}
