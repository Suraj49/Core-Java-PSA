package Day_52_oct_05.com.webapp.model;

public interface DAOSarvice {

        public void connectDB();

        public boolean verifyCredentials(String email, String password);

        public void saveRegistration(String name, String city, String email, String mobile);



}
