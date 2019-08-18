/**  
* @author SANKALP SAXENA  
*/

    int minElement, maxElement;

    Difference(int [] arr) {
        elements = new int[arr.length];
        minElement = maxElement = arr[0];
    
        for(int i = 0; i < arr.length; i++) {
            elements[i] = arr[i];
            
            if(minElement > elements[i])
                minElement = elements[i];
            
            if(maxElement < elements[i])
                maxElement = elements[i];
        }
     
    }
    public void computeDifference(){
        maximumDifference =  (Math.abs(minElement - maxElement));
    }