// https://practice.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=sum-of-first-n-terms
class sumOfcubes {
    static long sum = 0;

    public static void main(String[] args) {
        System.out.print(sumOfSeries(7));
    }

    // It takes more time
    // static long sumOfSeries(long N) {
    // // code here

    // if (N == 0)
    // return 1;
    // sum += (long) Math.pow(N, 3);
    // sumOfSeries(N - 1);
    // return sum;
    // }
    // Math approach
    // ((n(n+1))/2) * (N * (N + 1)) / 2)= (N * (N + 1)) / 2)2(whole square)
    static long sumOfSeries(long N) {
        // code here
        long val = (N * (N + 1)) / 2;
        return val * val;
    }

}