#include <iostream>
#include <ctime>

using namespace std;

int main()
{   
    //clock_t timereq;
    //timereq = clock();
    long n;
    long p;
    cin>> n >>p;
    long m1=0,m2=0;
    int foo[n];
    for(int i=0;i<n;i++){
        cin>>foo[i];
        foo[i] = foo[i]-p; //Profit is calculated here
        m1 = foo[i] > foo[i] + m1 ? foo[i] : foo[i]+m1; //comparing the profit with previous profit   
        m2 = m1> m2 ? m1 : m2; //max profit so far is stored in m2
        //cout<<foo[i]<<endl;    
    }
    

    //timereq = clock() - timereq;
    cout<<m2<<endl;
    //cout<<(float)timereq/CLOCKS_PER_SEC<<endl;
   return 0;
}



