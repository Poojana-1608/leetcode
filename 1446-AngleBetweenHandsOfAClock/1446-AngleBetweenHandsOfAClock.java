// Last updated: 8/11/2026, 11:30:47 AM
class Solution {
    public double angleClock(int hour, int minutes) {
        double a=(hour%12)*30+minutes*0.5;
        double b=minutes*6;
        double angle=Math.abs(a-b);
        return Math.min(angle,360-angle);

    }
}