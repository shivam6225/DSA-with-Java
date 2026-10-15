package binary_search.questions;

public class MedianOfTwoSortedArrays {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;
            int sum = m+n;
            if(sum%2==1){
                return solve(nums1,nums2,0,m-1,0,n-1,sum/2);
            }
            else{
                return (double)(solve(nums1,nums2,0,m-1,0,n-1,sum/2) + solve(nums1,nums2,0,m-1,0,n-1,(sum/2)-1))/2;
            }


        }

        public int solve(int[] a , int[] b,int as,int ae,int bs,int be,int k){
            if(be<bs) return a[k-bs];

            if(ae<as) return b[k-as];

            int am = as + (ae-as)/2;
            int bm = bs+ (be-bs)/2;
            int amv = a[am];
            int bmv = b[bm];

            if(am+bm<k){
                if(amv>bmv){
                    return solve(a,b,as,ae,bs+1,be,k);
                }
                else{
                    return solve(a,b,as+1,ae,bs,be,k);
                }
            }
            else{
                if(amv>bmv){
                    return solve(a,b,as,ae-1,bs,be,k);
                }
                else{
                    return solve(a,b,as,ae,bs,be-1,k);
                }
            }
        }
    }

    public double findMedianSortedArrays(int[] A, int[] B) {

        if(A.length > B.length){
            return findMedianSortedArrays(B,A);
        }

        int m = A.length;
        int n = B.length;

        int left =0;
        int right = m;

        while(left<=right){
            int partA = (left+right)/2;
            int partB = (m+n+1)/2 - partA;

            int mLa = (partA>=1)? A[partA-1] : Integer.MIN_VALUE;
            int mLb = (partB>=1)? B[partB-1] : Integer.MIN_VALUE;
            int mRa = (partA<m)? A[partA] : Integer.MAX_VALUE;
            int mRb = (partB<n)? B[partB] : Integer.MAX_VALUE;

            if(mLa<=mRb && mLb<=mRa){
                if((m+n)%2==0) {
                    return (
                            ((Math.max(mLa,mLb)) + (Math.min(mRa,mRb)))/2.0
                    );
                }
                else {
                    return Math.max(mLa,mLb);
                }
            }
            else if ( mLa > mRb ) right = partA - 1;
            else left = partA + 1;
        }

        return 0.0;

    }


}
