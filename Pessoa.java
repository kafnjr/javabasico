public class Pessoa {
    public static void main (String[] args){
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = p2;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}