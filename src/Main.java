public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3, 0.5);
        System.out.println(matrix1);

        double[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        Matrix matrix2 = new Matrix(arr);
        System.out.println(matrix2);
    }
}

class Matrix {
    double[][] data;
    int height;
    int width;

    public Matrix(int _height, int _width, double _value) {
        height = _height;
        width = _width;
        data = new double[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                data[i][j] = _value;
            }
        }
    }
    public Matrix(double[][] _values) {
        height = _values.length;
        height = _values[0].length;
        data = _values.clone();
    }
    public String toString() {
        String answ = "";
        for (int i = 0; i < height; i++) {
            answ += "|";
            for (int j = 0; j < width; j++) {
                answ += Double.toString(data[i][j]) + (j == width - 1 ? "|\n" : ", ");
            }
        }
        return answ;
    }


}