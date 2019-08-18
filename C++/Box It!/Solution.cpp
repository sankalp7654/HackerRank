/**  
* @author SANKALP SAXENA  
*/


//Implement the class Box  
//l,b,h are integers representing the dimensions of the box

// The class should have the following functions : 

// Constructors: 
// Box();
// Box(int,int,int);
// Box(Box);


// int getLength(); // Return box's length
// int getBreadth (); // Return box's breadth
// int getHeight ();  //Return box's height
// long long CalculateVolume(); // Return the volume of the box

//Overload operator < as specified
//bool operator<(Box& b)

//Overload operator << as specified
//ostream& operator<<(ostream& out, Box& B)


class Box {
    private:
    int l, b, h;
    
    public:
    Box() {
        l = 0;
        b = 0;
        h = 0;
    }
    
    Box(int l ,int b ,int h) {
        this->l = l;
        this->b = b;
        this->h = h;
    }
    
    Box(Box &box) {
        this->l = box.l;
        this->b = box.b;
        this->h = box.h;
    }
    
    int getLength() {
        return this->l;
    }
    
    int getBreadth() {
        return this->b;
    }
    
    int getHeight() {
        return this->h;
    }
    
    long long CalculateVolume() {
        
    }
};