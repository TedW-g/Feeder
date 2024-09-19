public class Main
{
    public static void main(String[] args)
    {
        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood());
        double random = (int) (Math.random() * 41 + 10);
        System.out.println(random);
        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());
    }

}