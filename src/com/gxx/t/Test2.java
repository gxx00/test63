package com.gxx.t;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        File file=new File("d:/gxx/t1/t2/tttt.txt");
        
        FileWriter fw=new FileWriter(file,true);
        
        String text="��������������ʴ�ۣ�ָ��ȥ����ȡ��������ɽˮ�����������ʥ����հ���\r\n˧�ĵ�����";
        fw.write(text);
        fw.flush();
        fw.close();
        
        
        
	}

}
