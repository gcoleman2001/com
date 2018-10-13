public class Tester {
    public static void main(String[] args){
        Tester test = new Tester();
        System.out.println("This is the main area");
        test.multiple(1,2);
    }
    public int multiple(int a, int b){
        int c = a + b;
        System.out.println("Value of c:" + c);
        return c;
    }

}
