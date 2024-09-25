#include<stdio.h>
void main()
{
	int a[20],i,j,n,temp;
	printf("enter no of elements to be inserted:");
	scanf("%d",&n);
	printf("enter the array elements:\n");
	for(i=0;i<n;i++)
	{
		printf("enter a[%d] element:",i);
		scanf("%d",&a[i]);
	}
	printf("The array elements are:\n");
	for(i=0;i<n;i++)
	{
	   printf("a[%d]=%d\n",i,a[i]);
	}
	printf("sorting the array elements:\n");
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	printf("After sorting the array elements:\n");
	for(i=0;i<n;i++)
	{
	   printf("a[%d]=%d\n",i,a[i]);
    }
    printf("Maximum element in an array is %d\n",a[n-1]);
    printf("Minimum element in an array is %d\n",a[0]);
	
}
