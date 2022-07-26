/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    if(n==0) return 0;
    const ap = new Array(n+1);
    ap[0] = 0;
    ap[1] = 1;
    for(let i=2;i<=n;i++) ap[i] = ap[i-1] + ap[i-2];
    return ap[n];
        
};