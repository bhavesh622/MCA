import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class CollegeSearchServer {
    public static void main(String[] args) {
        try{
            RMICollege rmiCollege = new StudentSearchQuery();
            LocateRegistry.createRegistry(1900);
            Naming.rebind("rmi://127.0.0.1:1900" + "/BVICAM", rmiCollege);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

