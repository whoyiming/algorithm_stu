package com.hym.italgorithmdata2nd;

public class HanoiProblem {
    public static void printHanoiTower(int n,String original,String target,String help){

        if(n==1){
            System.out.println("把 "+n+" 从 "+original+" 挪到 "+target);
            return;
        }

        printHanoiTower(n-1,original,help,target); // 先把n-1个盘子挪到辅助空间(C)上

        // n挪到目标空间(B)上或1摞在大的盘子上面
        System.out.println("把 "+n+" 从 "+original+" 挪到 "+target);
        printHanoiTower(n-1,help,target,original); // 让n-1从辅助空间(C)挪到目标空间(B)上
    }
    
    public static void main(String[] args){
        printHanoiTower(4,"A","B","C");
    }
}
