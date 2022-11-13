public class minimumJumps {
    static int minJumps(int[] arr) {
        // your code here
        int jumpMade = 0;
        int i = 0;
        int len = arr.length - 1;
        while (i < len) {
            // get element
            int jumpto = arr[i];
            if (jumpto == 0)
                return jumpMade;
            i += jumpto;
            jumpMade++;
        }
        return jumpMade == 0 ? -1 : jumpMade;
    }

    public static void main(String[] args) {
        System.out.println(minJumps(new int[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 }));
        System.out.println(minJumps(new int[] { 1, 4, 3, 2, 6, 7 }));
        System.out.println(minJumps(new int[] { 2, 3, 1, 1, 2, 4, 2, 0, 1, 1 }));
    }
}
