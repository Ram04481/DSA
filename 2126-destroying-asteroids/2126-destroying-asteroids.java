class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long curMass = mass;
        for(int i = 0; i < asteroids.length; i++) {
            if(curMass < asteroids[i]) {
                return false;
            }

            curMass += asteroids[i]; 
        }
        return true;
    }
}