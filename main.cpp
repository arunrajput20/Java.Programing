#include<iostream>
using namespace std;

int q[100],f=-1,r=-1,n;
void init(){
	cout<<"Enter size :"<<endl;
	cin>>n;
}
void enqueue(){
	int val;
	if((r+1)%n==f){
    	cout<<"Queue is full "<<endl;
	}
	else if(f==-1){
    	f=0;
    	r=0;
    	cout<<"Enter the elememt you want to insert: ";
    	cin>>val;
    	q[r]=val;
	}
	else{
    	r=(r+1)%n;
    	cout<<"Enter the element you want to insert: ";
    	cin>>val;
    	q[r]=val;
	}
}
void dequeue(){
	if(f==-1){
    	cout<<"Empty"<<endl;
	}
	else if(f==r){
    	f=-1;
    	r=-1;
	}
	else{
    	f=(f+1)%n;
    	cout<<endl<<"Deleted"<<endl;
	}
}
void display(){
	if(f==-1){
    	cout<<endl<<"Empty";}
	else if(r>=f){
    	for(int i=f;i<=r;i++){
        	cout<<q[i]<<" ";
    	}
	}
	else{
    	for(int i=0;i<r+1;i++){
        	cout<<q[i]<<" ";
    	}
    	for(int i=f;i<n;i++){
        	cout<<q[i]<<" ";
    	}
	}
	}

	int main(){
    	cout<<"Arun Rajput"<<endl<<"0827CI221031"<<endl;
    	init();
    	int ch;
    	do{
    	cout<<"\n1) Insert"<<endl<<"2) Delete"<<endl<<"3) Display"<<endl<<"4) Exit"<<endl;
    	cin>>ch;
    	switch(ch){
        	case 1:enqueue();
        	break;
        	case 2:dequeue();
        	break;
        	case 3:display();
        	break;
    	}
    	}while(ch!=4);
}

