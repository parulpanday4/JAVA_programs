public class method3
    {
        public static void main(String[]args)
        {
            RankPoints(100);
        }
        public static void RankPoints(double points)
        {
            if(points>=80)
            {
                System.out.println("Rank:A1");
            }
            else if(points>=50)
            {
                System.out.println("Rank:A2");
            }
            else
            {
                System.out.println("Rank:A3");
            }
        }
    }

