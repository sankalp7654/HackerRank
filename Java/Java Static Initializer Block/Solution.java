/**  
* @author SANKALP SAXENA  
*/

private static boolean flag = true;
private static int B, H;
static {
    Scanner sc = new Scanner(System.in);
    B = sc.nextInt();
    H = sc.nextInt();
    if(B <= 0 || H <= 0) {
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
   }
    
}