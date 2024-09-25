public class Main
{
    public static void main(String[] args)
    {
        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood());
        double random = (int) (Math.random() * 41 + 10);
        System.out.println(random);
        g.simulateOneDay(0);
        System.out.println(g.getCurrentFood());
        Feeder j = new Feeder(2400);
        System.out.println(j.simulateManyDays(10,5));
        System.out.println(j.getCurrentFood());
        Feeder i = new Feeder(100);
        i.simulateOneDay(1);
        System.out.println(i);
    }

}