public class HigesAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    //https://leetcode.com/problems/find-the-highest-altitude/
    static int largestAltitude(int[] gain) {
        int roadTrip = gain.length;
        int[] altitude = new int[roadTrip + 1];
        altitude[0] = 0;

        for (int i = 0; i < roadTrip; i++) {
            altitude[i + 1] = altitude[i] + gain[i];
        }
        int max = 0;
        for (int i = 0; i < altitude.length; i++) {
            if (altitude[i] > max) {
                max = altitude[i];
            }
        }
        return max;
    }
}
