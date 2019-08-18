/**  
* @author SANKALP SAXENA  
*/

#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n,u,v,flag=0,k,i,j,count=0,r,c,rob[20],cob[20]; 

    scanf("%d %d",&n,&k);
    scanf("%d %d",&r,&c);
    
    for (i=0;i<k;i++)
        scanf("%d% %d",&rob[i],&cob[i]);
    
    count=count+ (n-1)*2;
    /*
        for(i=r+1;i<=n;i++)         //+ve x axis
        {
            for(u=0;u<k;u++)
            {
                if((i!=rob[u])&&((rob[u]>r)&&(rob[u]<=n)))
                    count=count+1;
                else
                    flag=1;
            }
            if(flag==1)
                break;
        }
    
   
           flag=0;                      //-ve x axis
       for(i=r-1;i>=1;i--)
        {
            for(u=0;u<k;u++)
            {
                if((i!=rob[u])&&((rob[u]>=1)&&(rob[u]<r)))
                    count=count+1;
                else
                    flag=1;
            }
        }
       
       flag=0;                      //+ve y axis
       for(i=c+1;i<=n;i++)
        {
            for(u=0;u<k;u++)
            {
                if(i!=cob[u]&&(cob[u]>c)&&(cob[u]<=n))
                    count=count+1;
                else
                    flag=1;
            }
        }
    
       flag=0;                      //-ve y axis
       for(i=c-1;i>=1;i--)
        {
            for(u=0;u<k;u++)
            {
                if(i!=cob[u])
                    count=count+1;
                else
                    flag=1;
            }
            if(flag==1)
                break;
        }
    
    */
    
    
    
        //if n is odd
    
    
    
        j=c;
        for(i=r+1;i<=n;i++)
            {
                j++;
                if(((j<=n)&&(i<=n)))
                {
                    if(k==0)
                            count=count+1;
                    else{
                        
                            for(u=0;u<k;u++)
                             {
                              if((i!=rob[u])&&(j!=cob[u]))
                                count=count+1; 
                              else 
                                {
                                  flag=1;
                                  break;
                              }
                            }
                            if(flag==1)
                            { 
                                count=count-1;
                                break;
                            }   
                       } 
                }
        }
        //

        
        
        j=c;
        for(i=r+1;i<=n;i++)
            {
                j--;
                if((i<=n)&&(j>=1))
                {
                    if(k==0)
                            count=count+1;
                    else{
                        
                            for(u=0;u<k;u++)
                             {
                              if((i!=rob[u])&&(j!=cob[u]))
                                count=count+1; 
                              else 
                                {
                                  flag=1;
                                  break;
                              }
                            }
                            if(flag==1)
                            { 
                                count=count-1;
                                break;
                            }   
                       } 
                }
        }
        
        ////
        j=c;
        for(i=r-1;i>=1;i--)
            {
                j--;
                if(((i>=1)&&(j>=1)))
               {
                    if(k==0)
                            count=count+1;
                    else{
                        
                            for(u=0;u<k;u++)
                             {
                              if((i!=rob[u])&&(j!=cob[u]))
                                count=count+1; 
                              else 
                                {
                                  flag=1;
                                  break;
                              }
                            }
                            if(flag==1)
                            { 
                                count=count-1;
                                break;
                            }   
                       } 
                    
                }         
        }
        
        ///
        j=c;
        for(i=r-1;i>=1;i--)
            {
                j++;
                if((j<=n)&&(i>=1))
                {
                    if(k==0)
                            count=count+1;
                    else{
                        
                            for(u=0;u<k;u++)
                             {
                              if((i!=rob[u])&&(j!=cob[u]))
                                count=count+1; 
                              else 
                                {
                                  flag=1;
                                  break;
                              }
                            }
                            if(flag==1)
                            { 
                                count=count-1;
                                break;
                            }   
                       } 
                }
        }
    

        
        printf("%d",count);
    
    return 0;
}