package com.ooczc.spammess;

import android.util.Log;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import static com.ooczc.spammess.R.string.mess;

public class NetClient {
    String ServerIP = "111.206.66.244";
    String reply = "8";
    String messStr;
    String messStr2;

    public  String isSpamMess(String mess) throws IOException {
        //1.建立客户端socket连接，指定服务器位置及端口
        messStr = mess;
        Log.i("aven","---------NetClient   isSpamMess *****1 mess ="+messStr);
        new MyThread().start();
        Log.i("aven","---------NetClient   isSpamMess *****2 mess ="+mess);
        return reply;
//        while(true){
//            Log.i("zzc", "---------NetClient  循环 1");
//            int i=0;int j=0;
//            if(reply != "8") {
//                return reply;
////                Log.i("aven", "---------NetClient  循环");
//            }
//            else{
//                i++;
//                if(i % 10000 == 0)
//                    Log.i("aven","---------NetClient  循环 2");
//            }
//        }
//        Log.i("aven","---------NetClient   isSpamMess 222");
//        return "error";
    }
    public void addMess(String mess) throws IOException{
//        messStr = mess;
        messStr2 = mess;
        Log.i("aven","---------NetClient   addMess *****1 mess ="+messStr2);
        new MyTread2().start();
        Log.i("aven","---------NetClient   addMess *****2 mess ="+messStr2);
//        while(true){
//            Log.i("zzc", "---------NetClient  循环 1");
//            int i=0;int j=0;
//            if(reply != "8") {
//                return reply;
////                Log.i("aven", "---------NetClient  循环");
//            }
//            else{
//                i++;
//                if(i % 10000 == 0)
//                    Log.i("aven","---------NetClient  循环 2");
//            }
//        }
    }
/*
        Log.i("aven","NetClient ********"+mess+"*****"+mess.length());
        Log.i("aven","---------NetClient   1");
        Socket socket =new Socket(ServerIP,6464);
        Log.i("aven","---------NetClient   2");
//        System.out.println("111");
        //2.得到socket读写流  
        OutputStream os=socket.getOutputStream();
        Log.i("aven","---------NetClient   3");
        PrintWriter pw=new PrintWriter(os);
        Log.i("aven","---------NetClient   4");
//        System.out.println("222");
        Log.i("aven","---------NetClient   5");
        //输入流  
        InputStream is=socket.getInputStream();
        Log.i("aven","---------NetClient   6");
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
//        System.out.println("333");
        Log.i("aven","---------NetClient   7");
        //3.利用流按照一定的操作，对socket进行读写操作  
//        String info="用户名：Tom,用户密码：123456";  
//        String reply=br.readLine();
//        System.out.println(reply);
        pw.write(mess);
        Log.i("aven","---------NetClient   8");
        pw.flush();
        Log.i("aven","---------NetClient   9");
//        System.out.println("444");
        Log.i("aven","---------NetClient   10");
//        socket.shutdownOutput();  
        String reply=br.readLine();
        Log.i("aven","---------NetClient   11");
        System.out.println(reply);
        Log.i("aven","---------NetClient   12");
        return reply;
        //接收服务器的相应
         */


//        String reply=null;  
//        while(!((reply=br.readLine())==null)){  
//            System.out.println("接收服务器的信息："+reply);  
//        }  
        
    	/*
    	Socket s=new Socket(ServerIP,6464); 
    	System.out.println("111");
    	
    	DataInputStream in = new DataInputStream(s.getInputStream());
//    	in.read(b);
    	System.out.println("222");
    	String str = new String();
//    	str = in.readUTF();
    	str = in.readLine();
    	System.out.println("333");
    	System.out.println("get: "+str);
    	DataOutputStream out = new DataOutputStream(s.getOutputStream());
    	System.out.println("444");
    	out.write(mess.getBytes());
    	out.flush();
    	str = in.readUTF();
    	System.out.println("555");
    	System.out.println("get: "+str);
    	out.close();
    	in.close();
    	s.close();
    	return str;
    	*/
        class MyTread2 extends Thread{
            String ServerIP = "123.206.66.244";
            @Override
            public void run(){
                Log.i("aven", "---------MyTread2   0");
                try {
                    Log.i("aven", "---------MyTread2   1");
                    Socket socket = new Socket(ServerIP, 6464);
                    Log.i("aven", "---------MyTread2   2");
//        System.out.println("111");
                    //2.得到socket读写流
                    OutputStream os = socket.getOutputStream();
                    Log.i("aven", "---------MyTread2   3");
                    PrintWriter pw = new PrintWriter(os);
                    Log.i("aven", "---------MyTread2   4");
//        System.out.println("222");
                    Log.i("aven", "---------MyTread2   5");
                    //输入流
                    InputStream is = socket.getInputStream();
                    Log.i("aven", "---------MyTread2   6");
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
//        System.out.println("333");
                    Log.i("aven", "---------MyTread2   7");
                    //3.利用流按照一定的操作，对socket进行读写操作
//        String info="用户名：Tom,用户密码：123456";
//        String reply=br.readLine();
//        System.out.println(reply);
                    Log.i("aven","---------MyTread2   messStr ="+messStr);
                    pw.write(messStr2);
                    Log.i("aven", "---------MyTread2   8");
                    pw.flush();
                    Log.i("aven", "---------MyTread2   9");
//        System.out.println("444");
                    Log.i("aven", "---------MyTread2   10,reply init "+reply);
//        socket.shutdownOutput();
//                    reply = br.readLine();
                    Log.i("aven", "---------MyTread2   11");
//                System.out.println(reply);
                    Log.i("aven", "---------MyTread2   reply = "+reply);

                    os.close();
                    is.close();
                    pw.close();
                    br.close();

                } catch (Exception e){
                    e.printStackTrace();
                    Log.i("aven", "---------MyTread2   Exception");
                }
            }



        }


    class MyThread extends Thread{
//        public String mess;
        String ServerIP = "123.206.66.244";
//        public MyThread(String str){
//            mess = str;
//        }
        @Override
        public void run(){
            Log.i("aven", "---------MyThread   0");
            try {
                Log.i("aven", "---------MyThread   1");
                Socket socket = new Socket(ServerIP, 6463);
                Log.i("aven", "---------MyThread   2");
//        System.out.println("111");
                //2.得到socket读写流
                OutputStream os = socket.getOutputStream();
                Log.i("aven", "---------MyThread   3");
                PrintWriter pw = new PrintWriter(os);
                Log.i("aven", "---------MyThread   4");
//        System.out.println("222");
                Log.i("aven", "---------MyThread   5");
                //输入流
                InputStream is = socket.getInputStream();
                Log.i("aven", "---------MyThread   6");
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
//        System.out.println("333");
                Log.i("aven", "---------MyThread   7");
                //3.利用流按照一定的操作，对socket进行读写操作
//        String info="用户名：Tom,用户密码：123456";
//        String reply=br.readLine();
//        System.out.println(reply);
                Log.i("aven","---------MyThread   messStr ="+messStr);
                pw.write(messStr);
                Log.i("aven", "---------MyThread   8");
                pw.flush();
                Log.i("aven", "---------MyThread   9");
//        System.out.println("444");
                Log.i("aven", "---------MyThread   10,reply init "+reply);
//        socket.shutdownOutput();
                reply = br.readLine();
                Log.i("aven", "---------MyThread   11");
//                System.out.println(reply);
                Log.i("aven", "---------MyThread   reply = "+reply);

                os.close();
                is.close();
                pw.close();
                br.close();

            } catch (Exception e){
                e.printStackTrace();
                Log.i("aven", "---------MyThread   Exception");
            } finally {

            }
//            return reply;
        }
    }


    /*
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = new String("");
        //两次价值xxx元王牌项目；可充值xxx元店内项目卡一张；
//        可以参与V动好生活百分百抽奖机会一次！预约电话：xxxxxxxxxxx
        try{
            System.out.println("start~");
            NetClient.isSpamMess(str);
            System.out.println("over~");
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    */

}
