public class Printer {
    private static int textCount;
    private static int numberCount;
    private static int pagesCount;
    private static   String queue = "";
    public static void main(String[] args) {
        appened("Корова","Cупер Пупер",132);
        print("Cписок документов на печать:");
        clear();
        print("Cписок документов на печать:");

    }
    public static  void  appened (String name,String text,int number) {
        queue = queue + "\n" + name + "-" + text + "-" + number;

    }
    public static void clear (){
        queue = "";

    }
    public static int getPagesCount(){
        return pagesCount;
    }
    public static int getNumberCount (){
        return numberCount;
    }
    public static int getTextCount () {
        return textCount;
    }
    public static void print (String title) {
        System.out.println(title);
        if (queue.isEmpty()) {
            System.out.println("Корзина Пуста");
        } else {
            System.out.println(queue);
        }
    }


}
