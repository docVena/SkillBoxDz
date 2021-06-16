public class Arithmetic {
    private static int a =1;
    private static int b = 2;
    public static int sum =a + b;
    public static int raz = a - b;
    public static int proiz = a*b;
    public static int sredn = (a + b)/2;
    public static int max = Math.max(a,b) ;
    public static int min  = Math.min(a,b);
    public Arithmetic (int a,int b) {

    }


    public static void main(String[] args) {
        int GetSum = sum;
        System.out.println("Сумма"+" = " + GetSum);
        int GetRaz = raz;
        System.out.println("Разность" +"=" + GetRaz);
        int GetProiz = proiz;
        System.out.println("Произведение "+"=" + GetProiz);
        int GetSredn = sredn;
        System.out.println("Средние значение "+"="  +GetSredn);
        int GetMax  = max;
        System.out.println("Максимальное значение"+"=" + GetMax);
        int GetMin =  min;
        System.out.println("Минимальное значени"+ "="+GetMin);



    }
    public int GetSum (){
        return sum;
    }
    public int GetRaz (){
        return raz;
    }
    public int GetProiz(){
        return proiz;
    }
    public int GetSredn (){
        return sredn;
    }
    public int getMax (){
        return max;
    }
    public int GetMin (){
        return min;
    }




}










