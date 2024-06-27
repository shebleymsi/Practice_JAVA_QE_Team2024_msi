package MidTerm.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseConnectDirectly {

    public static void main(String[] args) throws SQLException {
        // Direct Approach to Connect with Database/DB

        // JDBC Connection
        // URL Syntax
        // protocol//[hosts:][port][/database][?properties]
        String url = "jdbc:mysql://localhost:3306/shebley?serverTimezone=UTC";
        String user = "root";
        String password = "123456789As";

        Connection connection = null;
        Statement statement = null;

        Movie titanic = new Movie(5, "Titanic", 1997, "Romance", "PG-14");
        Movie catchMeIfYouCan = new Movie(7, "catchMeIfYouCan", 2018, "Action", "PG-10");
        Movie fastAndFurious = new Movie(8, "fastAndFurious", 2015, "Action", "PG-12");
        Movie kabhiKhusiKabiGum = new Movie(6, "kabhiKhusiKabiGum", 2003, "Family", "PG-5");
        Movie fugitive = new Movie(4, "fugitive", 2000, "Action", "PG-8");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(titanic);
        movies.add(catchMeIfYouCan);
        movies.add(fastAndFurious);
        movies.add(kabhiKhusiKabiGum);
        movies.add(fugitive);

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            for (Movie mv : movies) {
                String query = "insert into movie(id,title,release_year,genre,mpaRating)"
                        + "values("+mv.getId()+",'"+mv.getTitle()+"',"+mv.getReleaseYear()+" ,'"+mv.getGenre()+"','"+mv.getMpaRating()+"')";
                statement.execute(query);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("");
        } finally {
            statement.close();
            connection.close();
        }

        // Stimulus
        DatabaseConnectDirectly.getStimulus();

    }

    public static void getStimulus() throws SQLException {
        String url="jdbc:mysql://localhost:3306/shebley?serverTimezone=UTC";
        String userName="root";
        String password="123456789As";

        Connection connection=null;
        Statement statement=null;

        Stimulus_info joe=new Stimulus_info(19,"Joe","NY",12,"dsp@gmail.com");
        Stimulus_info bin=new Stimulus_info(121,"bin","ca",48,"ppp@hotmail.com");
        Stimulus_info din=new Stimulus_info(113,"din","my",23,"sba@aol.com");

        ArrayList<Stimulus_info> st =new ArrayList<>();
        st.add(joe);
        st.add(bin);
        st.add(din);
        try {
            connection= DriverManager.getConnection(url,userName,password);
            statement=connection.createStatement();
            for (Stimulus_info stIn:st) {
                String pass=  "insert into stimulus (checkNumber,peopleName,homeAddress,moneyOrder,emailAddress)"+
                        "values( "+stIn.getCheckNumber()+", '"+stIn.getPeopleName()+"', '"+stIn.getHomeAddress()+"', "+stIn.getMoneyOrder()+", '"+stIn.getEmailAddress()+"')";

                statement.execute(pass);
            }


        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("");
        }
        finally {
            connection.close();
            statement.close();
        }
    }




}
