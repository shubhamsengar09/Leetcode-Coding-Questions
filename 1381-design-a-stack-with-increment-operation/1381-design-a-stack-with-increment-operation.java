class CustomStack {
    int max,size;
    Stack<Integer> st;
    public CustomStack(int maxSize) {
        max = maxSize;
        st = new Stack<>();
        
    }
    
    public void push(int x) {
        if(size<max){
            st.push(x);
            size++;
        }
        
    }
    
    public int pop() {
        if(size==0) 
            return -1;
        else {
            size--;
            return st.pop();
        }
    }
    
    public void increment(int k, int val) {
       for(int i =0;i<Math.min(size,k);i++){
           st.set(i,st.get(i)+ val);
       } 
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */