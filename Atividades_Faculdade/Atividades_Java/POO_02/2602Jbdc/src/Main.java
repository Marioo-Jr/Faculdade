import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:meu_banco.sql";
        //String url = "jdbc:mysql://localhost:3306/poo";
        String usuario = "root";
        String senha = "univille";
        String sql = """
                  select id from pessoas
                  """;
        // try-with-resource
        try(Connection con = DriverManager
                .getConnection(url);

            PreparedStatement pre = con.prepareStatement(sql)){
            // Começa em 1
            pre.setString(1,"Tom Cruise");
            pre.execute();
            pre.setString(1,"Tom Hanks");
            pre.execute();
            pre.setString(1,"Tom Holand");
            pre.execute();

        }catch (SQLException e){
            System.out.println("Erro ao conectar com o banco");
            e.printStackTrace();
        }
    }
}

//while(rs.next()){
//                int id = rs.getInt("id");
//                String nome = rs.getString("nome");
//                int idade = rs.getInt("idade");
//                System.out.println(id+" "+nome+" "+idade);
//            }
//
//        }catch (SQLException e){
//            System.out.println("Erro ao conectar com o banco");
//            e.printStackTrace();
//        }
//
//        sql = """
//                    select id
//                         , nome
//                         , idade
//                      from pessoa
//                      where id = ?;
//                    """;
//        try(Connection con = DriverManager
//                .getConnection(url,usuario,senha);
//            PreparedStatement pre = con.prepareStatement(sql)){
//            pre.setInt(1,2);
//            ResultSet rs = pre.executeQuery();
//            if(rs.next()){
//                int id = rs.getInt("id");
//                String nome = rs.getString("nome");
//                int idade = rs.getInt("idade");
//                System.out.println("--------------------------------");
//                System.out.println(id+" "+nome+" "+idade);
//            }
//
//        }catch (SQLException e){
//            System.out.println("Erro ao conectar com o banco");
//            e.printStackTrace();
//        }