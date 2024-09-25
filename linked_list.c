#include<stdio.h>
#include<stdlib.h>

void beginsert();
void lastinsert();
void begdelete();
void lastdelete();
void randomdelete();
void display();
void search();


struct node{
	int data;
	struct node*next;
};
struct node *head;

void main()
{
	int choice=0;
	while(choice!=9)
	{
		printf("\nEnter the choice:\n1 for begin insert\n2 for last insert\n3 for begin delete\n4 for last delete\n5 for random delete:\n6 for display\n7 for search\n");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
				beginsert();
				break;
			case 2:
				lastinsert();
				break;
			case 3:
				begdelete();
				break;
			case 4:
				lastdelete();
				break;
			case 5:
				randomdelete();
				break;
			case 6:
				display();
				break;
			case 7:
				search();
				break;
			case 9:
				return 0;
		}
	}
}
void beginsert()
{
	struct node *ptr;
	int item;
	ptr=(struct node*)malloc(sizeof(struct node*));
	printf("Enter data");
	scanf("%d",&item);
	if (ptr==NULL)
	{
		printf("\nOver flow");
	}
	if (head==NULL)
	{
		head=ptr;
		ptr->data=item;
		ptr->next=NULL;
		printf("\nNode is inserted");
	}
	else
	{
		ptr->data=item;
		ptr->next=head;
		head=ptr;
		printf("\nNode is inserted");
	}
}

void lastinsert()
{
	struct node*ptr,*temp;
	int item;
	printf("Enter the data:");
	scanf("%d",&item);
	ptr=(struct node*)malloc(sizeof(struct node*));
	temp=head;
	if (ptr==NULL)
	{
		printf("\nOver flow");
	}
	if (head==NULL)
	{
		head=ptr;
		ptr->data=item;
		ptr->next=NULL;
		printf("\nNode is inserted");
	}
	else
	{
		while(temp->next!=NULL)
		{
			temp=temp->next;
			if (temp==NULL)
			{
				printf("Cannot insert");
			}
		}
		ptr->data=item;
		ptr->next=NULL;
		temp->next=ptr;
		printf("\nNode is inserted");
	}
}
void begdelete()
{
	struct node*ptr;
	if (head==NULL)
	{
		printf("\ncannot delete");
	}
	else
	{
	ptr=head;
	head=ptr->next;
	free(ptr);	
	printf("\nNode is deleted");
	}
}

void lastdelete()
{
	struct node*ptr,*ptr1;
	ptr=head;
	if(head==NULL)
	{
		printf("\ncannot delete");
	}
	if (head->next==NULL)
	{
		head=NULL;
		free(ptr);
		printf("\nNode is deleted");
	}
	else
	{
		ptr=head;
		while(ptr->next!=NULL)
		{
			ptr1=ptr;
			ptr=ptr->next;
		}
		free(ptr);
		ptr1->next=NULL;
		printf("\nNode is deleted");
		
	}
}
void randomdelete()
{
	struct node*ptr,*ptr1;
	int loc,i;
	ptr=head;
	printf("Enter after which element you want to delete:");
	scanf("%d",&loc);
	for (i=0;i<loc;i++)
	{
		ptr1=ptr;
		ptr=ptr->next;
		if (ptr==NULL)
		{
			printf("\nCannot delete");
		}
		ptr1->next=ptr->next;
		free(ptr);
		printf("\nNode is deleted");
	}
}
void display()
{
	struct node*ptr;
	ptr=head;
	if(ptr==NULL)
	{
		printf("\n No element to display");
	}
	else
	{
		while(ptr!=NULL)
		{
			printf(" %d ",ptr->data);
			ptr=ptr->next;
		}
	}
}
void search()
{
	int item,flag=0;
	struct node*ptr;
	ptr=head;
	if (head==NULL)
	{
		printf("\nNo data to search");
	}
	else{
	printf("Enter the data you want to search:");
	scanf("%d",&item);
	while(ptr!=NULL)
	{
		if (ptr->data==item)
		{
			printf("Element is found");
			break;
		}
		else
		{
			flag=1;
		}
	}
	if (flag==1)
	{
		printf("Element is not present in the list:");
	}  
   }
}
