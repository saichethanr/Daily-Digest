#include<bits/stdc++.h> 
using namespace std;
class Solution {
public:
    double myPow(double x, int n) {
        double res=1.0;
        if(n==0){
            return 1.0;
        }
        if(n<0){
            x=1/x;
            n = abs(n);
        }
        while(n>0){
            if(n%2!=0){
                res*=x;
            }
            x*=x;
            n/=2;
        }
        
        return res;
    }
};