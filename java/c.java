class calc{
    public int add(int n, int n2){
        return n+n2;
    }
}

public class c {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        calc cal = new calc();
        int result = cal.add(num1, num2);
        System.out.println(result);
    }
}
