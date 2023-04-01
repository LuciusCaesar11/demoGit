package BTTH;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class b3c {
    public static void main(String[] args) {
        try {
            // Mở tập tin input.txt để đọc dữ liệu
            BufferedReader reader = new BufferedReader(new FileReader("D:\\java vsc\\BTOOP_JAVA_OU\\bin\\BTTH\\input.txt"));

            // Mở tập tin output.txt để ghi kết quả
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\java vsc\\BTOOP_JAVA_OU\\bin\\BTTH\\output.txt"));

            // Đọc từng dòng dữ liệu trong tập tin input.txt
            String line = "";
            while ((line = reader.readLine()) != null) {

                // Thay thế tất cả các ký hiệu {file} thành chuỗi “tập tin”
                line = line.replaceAll("\\{file\\}", "tập tin");

                // Ghi dòng dữ liệu đã được thay thế vào tập tin output.txt
                writer.write(line);
                writer.newLine();
            }

            // Đóng tập tin input.txt và output.txt
            reader.close();
            writer.close();

            // Thông báo cho người dùng biết quá trình hoàn thành
            System.out.println("Đã thay thế và ghi kết quả vào tập tin output.txt thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

