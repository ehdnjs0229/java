package com.kh.client.tcp;

/*
* 클라이언트용 TCP 소켓 프로그래밍 작업 순서
*
* 1) 연결을 하고자하는 서버의 IP 주소와 서버가 정한 포트번호를 매개변수로 하여 소켓 객체 생성.
* 2) 서버와의 입출력 스트림 오픈
2_2) 성능개선
*
 */
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public void clientStart() {
        // 0) 변수 셋팅
        int port = 30027;
        String str = null;
        String serverIp = null; // 192.168.130.8
        Socket socket = null;
        try {
            // 1) 연결을 하고자하는 서버의 IP 주소와 서버가 정한 포트번호를 매개변수로 하여 소켓 객체 생성.
            serverIp = InetAddress.getLocalHost().getHostAddress(); // 192.168.130.8
            socket = new Socket(serverIp, port); // 잘못된 ip주소나 잘못된 port번호 제시시 null값 반환.
            // 2)서버와의 입출력 스트림 오픈
            if (socket != null) {
                // 2) 서버와의 입출력 스트림 오픈
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                // 2_2) 성능개선
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                PrintWriter pw = new PrintWriter(os, true);
                // 3) 스트림을 통한 읽고 쓰기
                Scanner sc = new Scanner(System.in);
                do {
                    System.out.print("서버에 보낼 내용 : ");
                    str = sc.nextLine();
                    pw.println(str);
                    if (str == null || "exit".equals(str)) {
                        System.out.println("접속 종료합니다.");
                        break;
                    }
                    String message = br.readLine(); // 응답성공 메세지
                    System.out.println("받은 메시지 : " + message);
                }while (true);
                // 5) 자원반납
                pw.close();
                br.close();
                socket.close();
            } else {
                System.out.println("연결하고자 하는 서버가 존재하지 않습니다.");
            } 
            catch (UnknownHostException e) {
            e.printStackTrace();
        	}catch (IOException e) {
            e.printStackTrace();
        	}
        }
    }

}