import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số điện thoại bạn muốn nhập:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập một số điện thoại bất kì: ");
            String str = sc.next();
            if (str.length() < 10 && str.charAt(0) == 0) {
                arr[i] = Integer.parseInt(str);
            }
        }
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i <n ; i++){
            String str1 = String.valueOf(arr[i]);
            if (str1.startsWith("095")){
                count1++;
            }else if(str1.startsWith("092")){
                count2++;
            }else{
                count3++;
            }
        }
        System.out.println("Viettel: "+ count1);
        System.out.println("Vina:" + count2);
        System.out.println("VNPT: " +    count3);
    }
}