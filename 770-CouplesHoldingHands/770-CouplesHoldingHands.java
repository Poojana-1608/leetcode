// Last updated: 8/11/2026, 11:32:05 AM
public class Solution {
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        int[] position = new int[n];
        for (int i = 0; i < n; i++) {
            position[row[i]] = i;
        }

        int swaps = 0;
        for (int i = 0; i < n; i += 2) {
            int first = row[i];
            int partner = first ^ 1; 
            if (row[i + 1] != partner) {
                swaps++;
                int partnerPos = position[partner];
                int temp = row[i + 1];
                row[i + 1] = partner;
                row[partnerPos] = temp;
                position[temp] = partnerPos;
                position[partner] = i + 1;
            }
        }
        
        return swaps;
    }
}
    
    

