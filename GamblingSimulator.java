/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bridgelab.gamblingsimulator;

public class GamblingSimulator 
{

        public static final int STAKE = 100;
        public static final int BET= 1;
        public static double winOrLoose()
        {
                double outcome=Math.random()%2;
                if (outcome==1)
                {
                        System.out.println("WIN");
                        return outcome;
                }
                else
                {
                         System.out.println("LOOSE");
                         return outcome;

                }

        }
        
   
    public static double calcuateWinorLossPercentage()
    {
            int cash=STAKE;
            int LooseNumber = 0;
            int WinNumber=0;
            while (LooseNumber<(0.50*cash) && WinNumber<(0.50*cash))
            {
                double winOrLoose = winOrLoose();
                if(winOrLoose==1)
                {
                   WinNumber= WinNumber+BET;
                }
                else{
                    LooseNumber=LooseNumber+BET;
                }
            }
            return 0;
            
        }

    public static void main(String[] args) {
            GamblingSimulator gamblerObject;
            gamblerObject = new GamblingSimulator();
            double OutputOfToss = GamblingSimulator.winOrLoose();
            System.out.println(OutputOfToss);

    }
    
}
