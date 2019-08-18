/**  
* @author SANKALP SAXENA  
*/

    static class TestDataEmptyArray {
        public static int[] get_array() {
            // complete this function
            int [] arr = {};
            return arr;
        }
    }

    static class TestDataUniqueValues {
        
        static public int [] array = new int[10];

        public static int[] get_array() {
            // complete this function
            for(int i = 0; i < array.length; i++)
                array[i] = i;
            return array;
        }

        public static int get_expected_result() {
            // complete this function
            // int min = array[0];
            // for(int i : array){
            //     if(min > i)
            //         min = i;
            // }
            return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        
        static public int [] array = new int[100];
        
        public static int[] get_array() {
            
            for(int i = 0; i < array.length; i++) {
                array[i] = i;
            }
            array[1] = 0;
            return array;
            // complete this function
        }

        public static int get_expected_result() {
            // complete this function
            return 0;
        }
    }