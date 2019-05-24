/**  
* @author SANKALP SAXENA  
*/


class Add {
    public void add(int ... args) {
        int sum = 0;
        for(int i = 0; i < args.length; i++)
        {
                if((args.length - 1) == i)
                    System.out.print(args[i]);
                else
                    System.out.print(args[i] + "+");
                sum += args[i];
        }
            System.out.println("=" + sum);

    }
}