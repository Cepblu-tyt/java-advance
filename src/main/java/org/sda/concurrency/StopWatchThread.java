package org.sda.concurrency;

import lombok.AllArgsConstructor;

/**
 * A Stop watch concurrent thread example
 *
 * @author Sergei Oksanen
 */
@AllArgsConstructor
public class StopWatchThread extends Thread {

    private String prefix;

   @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(prefix + ":" + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                System.out.println(e.getLocalizedMessage());
            }
        }

    }

}
