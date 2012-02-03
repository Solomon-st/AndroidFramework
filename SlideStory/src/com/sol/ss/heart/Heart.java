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
    
    public static final int mainMenu = 0;
    public static final int setting  = 1;
    public static final int help     = 2;
    public static final int gameOver = 3;
    public static final int ongoing  = 4;
}
