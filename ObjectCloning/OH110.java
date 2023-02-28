package ObjectCloning;

class ABC implements Cloneable {
    int i;
    int j;

    @Override
    public String toString() {
        return "ABC{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    public ABC clone() throws CloneNotSupportedException {
        return (ABC) super.clone();
    }
}

public class OH110 {
    public static void main(String[] args) throws CloneNotSupportedException {
        ABC obj = new ABC();
        obj.i = 5;
        obj.j = 6;

        // Shallow Copy
        ABC shallowCopy = obj;

        // Deep Copy
        ABC deepCopy = new ABC();
        deepCopy.i = obj.i;
        deepCopy.j = obj.j;

        // Object Cloning
        ABC cloneObj = obj.clone();
        System.out.println(cloneObj);
    }
}
