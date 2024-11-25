#include<bits/stdc++.h> 
using namespace std;
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> ni;
        for(int i=0;i<intervals.size();i++){
            if(ni.empty() || intervals[i][0]>ni.back()[1]){
                ni.push_back(intervals[i]);
            }
            else{
                ni.back()[1] = max(ni.back()[1],intervals[i][1]);
            }
        }
        return ni;
    }
};