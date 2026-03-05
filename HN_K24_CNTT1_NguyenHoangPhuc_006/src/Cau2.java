import java.util.*;

public class Cau2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out .println("Nhập số lượng tài liệu: ");
        int n = sc.nextInt();
        List<String> taiLieu = new ArrayList<>();
        Set<String> trungLap = new HashSet<>();
        if(n<=0){
            System.out.println("Số lượng tài liệu không hợp lệ");
        }else{
            for(int i = 0; i < n; i++){
                System.out.println("Nhập tên tài liệu: ");
                String str = sc.next();
                taiLieu.add(str);
            }
        }


        System.out.println("Danh sách ban đầu: " + taiLieu);

    }
}
