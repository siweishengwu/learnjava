package Mid_Level.JDBC.HelloJDBC;

public class Step2 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("success");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
