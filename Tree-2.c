// Opeartions on BST (Insertion,Deletion,Traversal)

#include<stdio.h>
#include<stdlib.h>

struct node
{
	int data;
	struct node *left;
	struct node *right;
	
};struct node *root=NULL;

struct node *deleteNode(struct node *root,int value);
void insert(int item);
void add();
void deletion();
void Inorder(struct node *root);
void Preorder(struct node *root);
void Postorder(struct node *root);
void main()
{
	printf("\n*** Operations ***\n");
	printf("\n1.Insertion\n2.Deletion\n3.Preorder traversal\n4.Inorder traversal\n5.Postorder traversal\n6.Exit\n");
	int choice=0;
	while(choice!=6)
	{
		printf("\nEnter your choice:");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:add();break;
			case 2:deletion();break;
			case 3:
				printf("\nPreorder : ");
				Preorder(root);break;
			case 4:
				printf("\nInorder : ");
				Inorder(root);break;
			case 5:
				printf("\nPostorder : ");
				Postorder(root);break;
			case 6:exit(0);
			default:printf("\nYou entered wrong key");
		}
	}
}

void add()
{
	int item;
	printf("\nEnter the item:");
	scanf("%d",&item);
	insert(item);
	printf("\nNode is inserted");
}

void insert(int item)
{
	struct node *ptr,*parent,*current;
	ptr = (struct node *)malloc(sizeof(struct node));
	ptr->data=item;
	ptr->left=NULL;
	ptr->right=NULL;
	if(root==NULL)
	{
		root=ptr;
	}
	else
	{
		current=root;
		parent=NULL;
		while(1)
		{
			parent=current;
			if(item<parent->data)
			{
				current=current->left;
				if(current==NULL)
				{
					parent->left=ptr;
					return;
				}
			}
			else
			{
				current=current->right;
				if(current==NULL)
				{
					parent->right=ptr;
					return;
				}
			}
		}
	}
}

void Preorder(struct node *root)
{
	if(root==NULL)
	return;
	else
	{
		printf("%d ",root->data);
		Preorder(root->left);
		Preorder(root->right);
	}
}

void Inorder(struct node *root)
{
	if(root==NULL)
	return;
	else
	{
		Inorder(root->left);
		printf("%d ",root->data);
		Inorder(root->right);
	}
}

void Postorder(struct node *root)
{
	if(root==NULL)
	return;
	else
	{
		Postorder(root->left);
		Postorder(root->right);
		printf("%d ",root->data);
	}
}
void deletion()
{
	int value;
	printf("\nEnter the value to be deleted:");
	scanf("%d",&value);
	deleteNode(root,value);
	printf("\nNode is deleted");
}
struct node *inorderPredecessor(struct node *root)
{
	root = root->left;
	while(root->right!=NULL)
	{
		root=root->right;
	}
	return root;
}

struct node *deleteNode(struct node *root,int value)
{
	struct node *iPre;
	if(root==NULL)
	return NULL;
	if(root->left==NULL && root->right==NULL && root->data==value)
	{
		free(root);
		return NULL;
	}
	if(value < root->data)
	{
		root->left = deleteNode(root->left,value);
	}
	else if(value > root->data)
	{
		root->right = deleteNode(root->right,value);
	}
	else
	{
		iPre = inorderPredecessor(root);
		root->data = iPre->data;
		root->left = deleteNode(root->left,iPre->data);
	}
	return root;
}

/* Output:

*** Operations ***

1.Insertion
2.Deletion
3.Preorder traversal
4.Inorder traversal
5.Postorder traversal
6.Exit

Enter your choice:1

Enter the item:5

Node is inserted
Enter your choice:1

Enter the item:3

Node is inserted
Enter your choice:1

Enter the item:4

Node is inserted
Enter your choice:1

Enter the item:1

Node is inserted
Enter your choice:1

Enter the item:6

Node is inserted
Enter your choice:4

Inorder : 1 3 4 5 6
Enter your choice:2

Enter the value to be deleted:4

Node is deleted
Enter your choice:4

Inorder : 1 3 5 6
Enter your choice:2

Enter the value to be deleted:5

Node is deleted
Enter your choice:4

Inorder : 1 3 6
Enter your choice:6

--------------------------------   */
