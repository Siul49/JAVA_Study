package ch4_practice;

public class Cube {
    int x, y, z;

    Cube(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    private  int getVolume(){
        return x * y * z;
    }

    private void increase(int dx, int dy, int dz){
        x+=dx;
        y+=dy;
        z+=dz;
    }

    private boolean isZero(){
        return x==0 || y==0 || z==0;
    }

    public static void main(String[] args) {
        Cube cube = new Cube(1, 2, 3);
        System.out.println("큐브의 부피는 " + cube.getVolume());
        cube.increase(1, 2, 3);
        System.out.println("큐브의 부피는 " + cube.getVolume());
        if (cube.isZero()){
            System.out.println("큐브의 부피는 0");
        }
        else {
            System.out.println("큐브의 부피는 0이 아님");
        }
    }
}

