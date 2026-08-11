// Last updated: 8/11/2026, 11:28:55 AM
import java.util.*;

class Solution {

    public boolean checkPrimeFrequency(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums) {

            map.put(n, map.getOrDefault(n,0) + 1);
        }
        for(int keys : map.keySet()) {

            int freq = map.get(keys);

            if(isprime(freq)) {

                return true;
            }
        }

        return false;
    }
    public boolean isprime(int n) {

        if(n <= 1) {

            return false;
        }

        for(int i = 2; i * i <= n; i++) {

            if(n % i == 0) {

                return false;
            }
        }

        return true;
    }
}