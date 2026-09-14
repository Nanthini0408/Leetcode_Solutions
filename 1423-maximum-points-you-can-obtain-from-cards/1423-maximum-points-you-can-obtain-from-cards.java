class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length,tot=0;
        int ws=n-k;
        int sum=0;
        for(int x:cardPoints)
           tot+=x;
        if(ws==0)
           return tot;
        for(int i=0;i<ws;i++){
            sum+=cardPoints[i];
        }
        int mini=sum;
        for(int i=ws;i<n;i++){
            sum+=cardPoints[i];
            sum-=cardPoints[i-ws];
            mini=Math.min(mini,sum);
        }
        return tot-mini;
    }
}