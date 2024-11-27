class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        List<Node> list = new ArrayList<>();
        for(int i=0; i<start.length; i++){
            list.add(new Node(start[i], end[i]));
        }
        
        Collections.sort(list, (a, b) -> Integer.compare(a.end, b.end));
        
        int begin = list.get(0).start;
        int close = list.get(0).end;
        int count =1;
        
        for(int i=1; i<list.size(); i++){
            if(list.get(i).start>close){
                count++;
                begin =list.get(i).start;
                close = list.get(i).end;
            }
        }return count;

        
    }
    
    class Node{
        int start;
        int end;
        
        public Node(int start, int end){
            this.start = start;
            this.end = end;
            
        }
    }
}