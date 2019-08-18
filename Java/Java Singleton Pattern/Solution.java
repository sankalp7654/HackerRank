/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    public String str;
	private Singleton() {
        str = "Hello I am a singleton! Let me say hello world to you";
    }
    
    private static final Singleton INSTANCE = new Singleton();
    
    public static Singleton getSingleInstance() {
    	return INSTANCE;
    }
}