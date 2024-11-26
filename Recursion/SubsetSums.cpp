#include<bits/stdc++.h> 
using namespace std;
class Solution {
  public:
    vector<int> subsetSums(vector<int>& arr) {
        // code here
        vector<int> res;
        int n = arr.size();
        subsumcal(arr,0,0,res);
        return res;
    }
    void subsumcal(vector<int>&arr,int ind,int cursum, vector<int>&res){
        if(ind==arr.size()){
            res.push_back(cursum);
            return;
        }
        subsumcal(arr,ind+1,cursum+arr[ind],res);
        subsumcal(arr,ind+1,cursum,res);
    }
};