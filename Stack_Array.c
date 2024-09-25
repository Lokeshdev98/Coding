#include <stdio.h>
#include<stdlib.h>   
int stack[100],i,n,choice=0,top=-1;  
void push();  
void pop();  
void display();  
void main ()  
{  
      
    printf("Enter the number of elements in the stack:\n");   
    scanf("%d",&n); 
    printf("***Stack operations using array***");  
  
	printf("\n----------------------------------------------\n");  
    while(choice != 4)  
    {  
        printf("Choose your option?...\n");  
        printf("\n1.Push\n2.Pop\n3.Display\n4.Exit");  
        printf("\n Enter your choice: \n");        
        scanf("%d",&choice);  
        switch(choice)  
        {  
            case 1:
				push();  
                break;    
            case 2:  
                pop();  
                break;  
		    case 3:  
                display();  
                break;  
            case 4:    
                printf("Exiting....");
				exit(0);  
                break;   
            default:  
            {  
                printf("Please Enter valid choice ");  
            }   
        } 
    }  
}   
  
void push ()  
{  
    int val;      
    if (top == n )   
    printf("\n Overflow");   
    else   
    {  
        printf("Enter the value?");  
        scanf("%d",&val);         
        top = top +1;   
        stack[top] = val;
		printf("Item pushed");   
    }   
}   
  
void pop ()   
{   
    if(top == -1)   
    printf("Underflow");  
    else  
    top = top -1;
	printf("Item popped");   
}   
void display()  
{  
    for (i=top;i>=0;i--)  
    {  
        printf("%d\n",stack[i]);  
    }  
    if(top == -1)   
    {  
        printf("Stack is empty");  
    }  
}  
