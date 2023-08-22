package edu.eci.arsw.threads;

import java.util.LinkedList;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

public class theThread extends Thread {

    private String ipAddres;
    private int start;
    private int end;
    private LinkedList<Integer> blackListCounts;
    private int counter;
    private HostBlacklistsDataSourceFacade skds;
    public theThread(String ipAddres, int start, int end, LinkedList<Integer> blackListCounts,int counter, HostBlacklistsDataSourceFacade skds){
        this.ipAddres = ipAddres;
        this.start = start;
        this.end = end;
        this.counter = counter;
        this.blackListCounts = blackListCounts;
        this.skds = skds;
    }

    public void run(){
        for(int i= this.start; i < this.end; i++){
            if(skds.isInBlackListServer(i, ipAddres)){
                this.blackListCounts.add(i);
                this.counter++;
            }
        }
    }
}
