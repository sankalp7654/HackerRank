/**  
* @author SANKALP SAXENA  
*/

//Write your code here

class MyRegex {
    
    public String pattern = "[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}";

    public Pattern pattern() {
        Pattern p = Pattern.compile(pattern);
        return p;
    }
}