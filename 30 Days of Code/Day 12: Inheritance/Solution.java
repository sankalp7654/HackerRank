/**  
* @author SANKALP SAXENA  
*/

class Student extends Person{
	private int[] testScores;
    private int average;
    
    Student(String firstName, String lastName, int id, int [] testScores) {
        super(firstName, lastName, id);
        this.testScores = new int[testScores.length];
        
        for(int i = 0; i < testScores.length; i++) {
            this.testScores[i] = testScores[i];
            average += testScores[i];
        } 
    }
    
    public char calculate() {
        average = average/testScores.length;
        
        if(average >= 90 && average <= 100)
            return 'O';
        else if(average >= 80 && average < 90)
            return 'E';
        else if(average >= 70 && average < 80)
            return 'A';
        else if(average >= 55 && average < 70)
            return 'P';
        else if(average >= 40 && average < 55)
            return 'D';
        else if(average < 40)
            return 'T';
        return ' ';
    }
}