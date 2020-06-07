package Mid_Level.JDBC.HelloJDBC;

public class Step2 {
    public static void main(String[] args) {

        //初始化驱动
        try {
            //驱动类com.mysql.jdbc.Driver
            //就在 mysql-connerctor-java-5.0.8.jar中
            //如果忘记了第一步骤导包，就会抛出ClassNotFoundExcepetion
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("success");

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
