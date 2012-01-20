package com.sol.ss.heart;

public class Heart {
    
    public void heartBeat() {
        int updateResult = udpate();
        if (updateResult == 2) {
            
        }
    }
    
    private int udpate() {
        int i = 0;
        i += updateTargets();
        i += updateItems();
        return i;
    }
    
    private int updateTargets() {
        return 1;
    }
    
    private int updateItems() {
        return 1;
    }
}
