{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.*;\
public class Main\
\{\
	public static void main(String[] args) \{\
		 Scanner sc = new Scanner(System.in);\
        \
        int n = sc.nextInt();\
        int[] nums = new int[n];\
    \
        System.out.println("Enter Lenghth :" + n);\
        \
        for(int i=0; i < nums.length ; i++)\{\
            nums[i] = sc.nextInt();\
        \}\
        \
        //sum logic\
        int sum = 0;\
        for(int i=0; i < nums.length ; i++)\{\
         sum += nums[i];   \
        \}\
        \
        System.out.println("The sume of all elements " + sum);\
	\}\
\}\
}