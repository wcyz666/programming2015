import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {  

        Scanner in = new Scanner(System.in);
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        int N = in.nextInt();
        in.nextLine();
        String a[] = new String[N * 2];
        for (int i = 0; i < N * 2; i++)
        	a[i] = in.nextLine();
        	
        in.close();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);
        int year1, year2, month1, month2, day1, day2;
        for (int i = 0; i < N; i++){
        	String[] strings1 = a[i*2].split(", | ");
        	year1 = Integer.parseInt(strings1[2]);
        	month1 = map.get(strings1[0]);
        	day1 = Integer.parseInt(strings1[1]);
        	
        	strings1 = a[i*2+1].split(", | ");
        	year2 = Integer.parseInt(strings1[2]);
        	month2 = map.get(strings1[0]);
        	day2 = Integer.parseInt(strings1[1]);
        	

        	int tmp = year1 - 1;
            int beforeYear1 = (tmp / 4) - (tmp / 100) + (tmp / 400);
        	
        	int tmp2 = year2 - 1;
            int beforeYear2 = (tmp2 / 4) - (tmp2 / 100) + (tmp2 / 400);
            
            int ans = beforeYear2 - beforeYear1;
            
            if (month1 >= 3 && ((year1 % 4 == 0) && (year1 % 100 != 0) || (year1 % 400 == 0)))
            	ans--;
            
            if ((month2 >= 3 || (month2 == 2) && (day2 == 29)) && ((year2 % 4 == 0) && (year2 % 100 != 0) || (year2 % 400 == 0)))
            	ans++;
            
            System.out.println("Case #" + (i + 1) + ": " + ans);
        }
    }
}