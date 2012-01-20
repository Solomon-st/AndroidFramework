package com.sol.ss.heart;

public class Beat extends Thread {
    long  pulse = 1000 / 60;
    Heart heart;
    
    public Beat(Heart heart) {
        this.heart = heart;
    }
    
    @Override
    public void run() {
        super.run();
        try {
            sendUpdateMessage();
            Thread.sleep(pulse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void sendUpdateMessage() {
        
    }
}
