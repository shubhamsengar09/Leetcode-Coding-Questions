/**
 * @param {number[]} days
 * @param {number[]} costs
 * @return {number}
 */
var mincostTickets = function(days, costs) {
        const n = days.length;
        const ap = new Array(366);
        ap[0] = 0;
        let j=0;
        for(let i=1;i<366;i++){
            if(j==n) break;
            if(days[j] != i) ap[i] = ap[i-1];
            else{
                let one = ap[i-1] + costs[0];
                let seven = ap[Math.max(0,i-7)] + costs[1];
                let thirty = ap[Math.max(0,i-30)] + costs[2];
                ap[i] = Math.min(one, Math.min(seven, thirty));
                j++;
            }
        }
        return ap[days[n-1]];
};