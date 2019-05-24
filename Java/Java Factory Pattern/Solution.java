/**  
* @author SANKALP SAXENA  
*/

        if((order.equals("pizza")) == true)
        {
            Food food = new Pizza();
            return food;
        }   

        if((order.equals("cake")) == true)
        {
            Food food = new Cake();
            return food;
        }   
    
        return null;