package Basic.Array.Enhanced;

public class Enhanced_For {
    public static void main(String[] args) {
        int values [] = new int []{18,62,68,82,65,9,};
        for (int each : values) {
            System.out.print(each+" ");
        }
        System.out.println("");
        int max = -1;
        for (int each: values) {
            if (max < each)
                max = each;

        }

        System.out.println(max);
    }
}
