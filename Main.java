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
        System.out.println(j.simulateManyDays(10,4));
        System.out.println(j.getCurrentFood());
        //Feeder i = new Feeder(100);
        //i.simulateOneDay(1);
        //System.out.println(i);

        //10 birds, 4 days, 2400 foods

        Feeder test1 = new Feeder(2400);
        test1.simulateManyDays(10,4);
        System.out.println(test1);

        Feeder test2 = new Feeder(2400);
        test2.simulateOneDay(10);
        System.out.println(test2);

        //10 birds, 5 days, 250 foods

        Feeder test3 = new Feeder(250);
        test3.simulateManyDays(10,5);
        System.out.println(test3);

        Feeder test4 = new Feeder(250);
        test4.simulateOneDay(10);
        System.out.println(test4);

        //5 birds, 10 days, 0 food

        Feeder test5 = new Feeder(0);
        test5.simulateManyDays(5,10);
        System.out.println(test5);

        Feeder test6 = new Feeder(0);
        test6.simulateOneDay(5);
        System.out.println(test6);


    }

}