/**  
* @author SANKALP SAXENA  
*/


template <class T> class AddElements {
    public:
        T element;
        AddElements(T i) {element = i;}
        T add(T i) {return element+i;}
    private:
        
};
template <> class AddElements <string> {
    public:
        string element;
        AddElements(string i) {element = i;}
        string concatenate(string element2) {return element+element2;}
    private:
        
};
/*Write the class AddElements here*/

